/**
 * @author Politowicz Jakub S26211
 */

package UTP2.zad1;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Consumer;

class Calc {

    private static final Map<String, BiFunction<BigDecimal, BigDecimal, BigDecimal>> OPERATIONS = new HashMap<>();

    static {
        OPERATIONS.put("+", BigDecimal::add);
        OPERATIONS.put("-", BigDecimal::subtract);
        OPERATIONS.put("*", BigDecimal::multiply);
        OPERATIONS.put("/", BigDecimal::divide);
    }

    public String doCalc(String cmd) {
        String[] elements = cmd.split("\\s+");

        Consumer<String> invalidCommand = (s) -> System.out.println("Invalid command to calc");

        BiFunction<BigDecimal, BigDecimal, BigDecimal> resultFunction = OPERATIONS.getOrDefault(elements[1],
                (a, b) -> {
                    invalidCommand.accept(cmd);
                    return null;
                });

        BigDecimal result = resultFunction.apply(new BigDecimal(elements[0]), new BigDecimal(elements[2]));

        return result != null ? result.toPlainString() : "Invalid command to calc";
    }
}

