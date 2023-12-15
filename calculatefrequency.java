 import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class calculatefrequency {
    public static void main(String[] args) {
        String input = "takeuforward";

        // Create a HashMap to store character frequencies
        Map<Character, Integer> frequencyMap = new HashMap<>();

        // Iterate through the characters in the input string
        for (char c : input.toCharArray()) {
            // If the character is already in the map, increment its count
            if (frequencyMap.containsKey(c)) {
                frequencyMap.put(c, frequencyMap.get(c) + 1);
            } else {
                // If the character is not in the map, add it with a count of 1
                frequencyMap.put(c, 1);
            }
        }

        // Create a TreeMap to sort the frequencies by character
        Map<Character, Integer> sortedFrequencyMap = new TreeMap<>(frequencyMap);

        // Print the character frequencies in ascending order
        for (Map.Entry<Character, Integer> entry : sortedFrequencyMap.entrySet()) {
            System.out.print(entry.getKey() + "" + entry.getValue() + " ");
        }
    }
}
