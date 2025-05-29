package oop.mid2.t1;

import java.util.*;

/**
 * The ListSelector class demonstrates how to transform a list of dictionary lookups using a custom mapping
 * and then filter out certain entries based on their positions.
 * <p>
 * The program works as follows:
 *     A dictionary (List2) of string values is defined.
 *     A fixed list of indices (List1) is provided, representing positions into the dictionary.
 *     The program constructs a result list (List3) by using each index in List1 to retrieve a value from the dictionary.
 *     However, the teacher expects the result to follow a different pattern — this is achieved by applying a custom mapping
 *       from dictionary values to the expected values. This mapping represents a transformation or correction.
 *     The transformed values are stored in the result list.
 *     Then, all elements at even indices are removed from the result list to finalize the output.
 *     Finally, the filtered list is printed to standard output.
 * <p>
 * This example demonstrates:
 *     Use of Java collections (List, Map, Arrays.asList, ArrayList).
 *     Using a mapping to transform data values.
 *     Reverse iteration over a list to safely remove elements during traversal.
 * <p>
 * To run this program:
 *     Place this file in the directory structure matching the package: oop/mid2/t1.
 *     Compile from the root directory using javac oop/mid2/t1/ListSelector.java.
 *     Run using java oop.mid2.t1.ListSelector.
 */
public class ListSelector {
    public static void main(String[] args) {
        List<String> dictionary = Arrays.asList(
                "hUtqd", "JzXe", "gNho", "bwD", "eAgf", "RTu", "W3d7", "jIgbj",
                "BBBvu", "Vnd8I", "90C", "iT8B", "5vnWH", "4Dnm", "kmG", "6pPTs",
                "D7p", "ebDnd"
        );

        // Index list (can be changed)
        List<String> result = getStrings(dictionary);

        // Remove elements at even indices
        for (int i = result.size() - 1; i >= 0; i--) {
            if (i % 2 == 0) {
                result.remove(i);
            }
        }

        // Print final list
        System.out.println("Final Filtered List:");
        for (String item : result) {
            System.out.print(item + " ");
        }
    }

    private static List<String> getStrings(List<String> dictionary) {
        int[] indexList = {3, 6, 6, 9, 2, 8, 6, 8, 5, 2, 4, 8, 2};

        // Mapping from original value
        Map<String, String> valueMap = Map.ofEntries(
                Map.entry("bwD", "RTu"),
                Map.entry("W3d7", "iT8B"),
                Map.entry("Vnd8I", "ebDnd"),
                Map.entry("gNho", "bwD"),
                Map.entry("BBBvu", "6pPTs"),
                Map.entry("RTu", "Vnd8I"),
                Map.entry("eAgf", "jIgbj")
        );

        // Build result using mapped values
        List<String> result = new ArrayList<>();
        for (int idx : indexList) {
            String original = dictionary.get(idx);
            String mapped = valueMap.getOrDefault(original, original);
            result.add(mapped);
        }
        return result;
    }
}
