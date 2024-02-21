/**
 * @author Politowicz Jakub S26211
 */

package UTP5;

import UTP5.models.Model1;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class Controller {
    private final String modelName;
    private final Map<String, double[]> data = new HashMap<>();
    private final Map<String, double[]> results = new HashMap<>();

    public Controller(String modelName) {
        this.modelName = modelName;
    }

    public Controller readDataFrom(String fname) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fname))) {
            String line;
            String[] years = null; // Initialize years array to store the column headers

            while ((line = reader.readLine()) != null) {
                if (line.startsWith("LATA")) {
                    years = line.split("\\s+"); // Extract column headers
                    int LL = years.length - 1;
                    data.put("LL", new double[]{LL});
                } else {
                    String[] parts = line.split("\\s+");
                    String varName = parts[0];
                    double[] values = new double[parts.length - 1];

                    for (int i = 1; i < parts.length; i++) {
                        values[i - 1] = Double.parseDouble(parts[i]);
                    }

                    // Adjust the length of values array to match the length of years array
                    if (values.length < years.length - 1) {
                        double[] newValues = new double[years.length - 1];
                        System.arraycopy(values, 0, newValues, 0, values.length);
                        values = newValues;
                    }

                    data.put(varName, values);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return this;
    }

    private Object getField(Model1 model, String fieldName) {
        try {
            Field field = Model1.class.getDeclaredField(fieldName);
            field.setAccessible(true);
            return field.get(model);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
            return null;
        }
    }

    private void setModelField(Model1 model, String fieldName, double[] values) {
        try {
            Field field = Model1.class.getDeclaredField(fieldName);
            field.setAccessible(true);

            if ("twKI".equals(fieldName)) {
                // If the field is "twKI", set the length (LL) accordingly
                Integer LLObject = values.length;
                field.set(model, LLObject);
            } else {
                // For other fields, proceed with the regular logic
                Integer LLObject = (Integer) field.get(model);
                int LL = LLObject != null ? LLObject.intValue() : 0;

                if (values.length != LL) {
                    // Print an error message and throw an exception
                    System.err.println("Error: Invalid data length for " + fieldName +
                            ". Expected length: " + LL + ", Actual length: " + values.length);
                    throw new IllegalArgumentException("Invalid data length for " + fieldName);
                }
            }

            field.set(model, values);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    public Controller runModel() {
        try {
            Model1 model = new Model1(); // Upewnij się, że Model1 ma konstruktor domyślny

            // Set LL field
            Field llField = Model1.class.getDeclaredField("LL");
            llField.setAccessible(true);
            llField.set(model, (int) data.get("LL")[0]);

            // Set other fields
            String[] fieldNames = {"twKI", "twKS", "twINW", "twEKS", "twIMP",
                    "KI", "KS", "INW", "EKS", "IMP"};
            for (String fieldName : fieldNames) {
                double[] fieldData = data.get(fieldName);

                // Validate data length
                if (fieldName.equals("twKI")) {
                    int expectedLength = (int) llField.get(model);
                    if (fieldData.length != expectedLength) {
                        System.err.println("Error: Invalid data length for " + fieldName +
                                ". Expected length: " + expectedLength + ", Actual length: " + fieldData.length);
                        throw new IllegalArgumentException("Invalid data length for " + fieldName);
                    }
                }

                setModelField(model, fieldName, fieldData);
            }

            model.run();

            // Retrieve results
            String[] resultNames = {"LATA", "twKI", "twKS", "twINW", "twEKS", "twIMP",
                    "KI", "KS", "INW", "EKS", "IMP", "PKB"};
            for (String resultName : resultNames) {
                results.put(resultName, (double[]) getField(model, resultName));
            }

        } catch (NoSuchFieldException | IllegalAccessException | IllegalArgumentException e) {
            e.printStackTrace();
        }

        return this;
    }

    public Controller runScriptFromFile(String fname) {
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("groovy");

        try (FileReader reader = new FileReader(fname)) {
            engine.eval(reader);

            Invocable invocable = (Invocable) engine;
            Map<String, double[]> scriptResults = (Map<String, double[]>) invocable.invokeFunction("runScript", data);

            // Merge results from the script with existing results
            results.putAll(scriptResults);

        } catch (ScriptException | NoSuchMethodException | IOException e) {
            e.printStackTrace();
        }

        return this;
    }

    public String getResultsAsTsv() {
        StringBuilder resultStringBuilder = new StringBuilder();
        for (Map.Entry<String, double[]> entry : results.entrySet()) {
            resultStringBuilder.append(entry.getKey()).append("\t");
            for (double value : entry.getValue()) {
                resultStringBuilder.append(value).append("\t");
            }
            resultStringBuilder.append("\n");
        }
        return resultStringBuilder.toString();
    }
}