/**
 *
 *  @author Politowicz Jakub S26211
 *
 */

package UTP1.zad3;
import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Anagrams {
    private Map<String, List<String>> anagramsMap;

    public Anagrams(String allWordsFile) {
        anagramsMap = new HashMap<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(allWordsFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+");
                for (String word : words) {
                    String sortedWord = sortWord(word);
                    anagramsMap.computeIfAbsent(sortedWord, k -> new ArrayList<>()).add(word);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<List<String>> getSortedByAnQty() {
        return anagramsMap.values()
                .stream()
                .sorted((list1, list2) -> {
                    if (list1.size() == list2.size()) {
                        return list1.get(0).compareTo(list2.get(0));
                    }
                    return Integer.compare(list2.size(), list1.size());
                })
                .collect(Collectors.toList());
    }

    public String getAnagramsFor(String word) {
        String sortedWord = sortWord(word);
        List<String> anagrams = anagramsMap.get(sortedWord);
        if (anagrams == null) {
            return word + ": []";
        } else {
            return word + ": " + anagrams.toString();
        }
    }

    private String sortWord(String word) {
        char[] chars = word.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}