public class MaxRating {
    //    public static int solution(int[] ratings) {
//        int maxRating = Integer.MIN_VALUE; // Initialize to the smallest possible integer
//
//        for (int rating : ratings) {
//            if (rating > maxRating) {
//                maxRating = rating; // Update maxRating if current rating is greater
//            }
//        }
//        return maxRating; // Return the maximum rating found
//    }
//
//    // Main method to test the solution
//    public static void main(String[] args) {
//        int[] ratings1 = {3, 5, 2, 8, 6};
//        System.out.println(solution(ratings1)); // Output: 8
//
//        int[] ratings2 = {10, 20, 15, 30, 25};
//        System.out.println(solution(ratings2)); // Output: 30
//
//        int[] ratings3 = {-5, -10, -3, -8};
//        System.out.println(solution(ratings3)); // Output: -3
//    }
    public static int[] maxAndCurrentRating(int[] diff) {
        int current = 1500;
        int max = 1500;

        for (int diffs : diff) {
            current += diffs;
            if (current > max) {
                max = current;
            }
        }
        return new int[]{max, current};
    }

    public static void main(String[] args) {
        int[] diff = {100, -200, 350, 100, 600};
        int[] result = maxAndCurrentRating(diff);
        System.out.println(result[1]);
    }
}
