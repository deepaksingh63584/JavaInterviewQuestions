import java.util.Arrays;

public class SecondLargestNumArr {
    public static void main(String[] args) {
        System.out.println("Start small. Ship something.");
        int[] arr = {1, 2, 3, 5, 7, 8, 6, 13};

        int largest = Integer.MIN_VALUE;
        int secLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secLargest = largest;
                largest = num;
            } else if (num > secLargest && num != largest) {
                secLargest = num;
            }
        }
        System.out.println("second laegest Numebr: " + secLargest);

        //usning java 8 stream
        int seclargest = Arrays.stream(arr).distinct().boxed().sorted((a, b) -> b - a).skip(1).findFirst().orElseThrow();
        System.out.println("second laegest Numebr: " + seclargest);
    }
}