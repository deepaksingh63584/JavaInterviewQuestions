import java.util.*;

public class OccurrenceCount {
    public static int[] solve(int[] A) {
        // Step 1: Count frequencies
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : A) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        // Step 2: Sort the keys
        List<Integer> keys = new ArrayList<>(freqMap.keySet());
        Collections.sort(keys);
        // Step 3: Prepare result
        int[] result = new int[keys.size()];
        int index = 0;
        for (int key : keys) {
            result[index++] = freqMap.get(key);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 1, 2, 3, 1};
        Map<Integer, Integer> occurrenceMap = new HashMap<>();

        for (int num : arr) {
            occurrenceMap.put(num, occurrenceMap.getOrDefault(num, 0) + 1);
        }

        System.out.println("Occurrence count of each element:");
        for (Map.Entry<Integer, Integer> entry : occurrenceMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue()); //
        }

        int[] A1 = {1, 2, 3};
        System.out.println(Arrays.toString(solve(A1))); // [1, 1, 1]

        int[] A2 = {4, 3, 3};
        System.out.println(Arrays.toString(solve(A2))); // [2, 1]
    }
}
