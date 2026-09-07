import java.util.Arrays;

public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        if(nums.length==0)
            return 0;
        int j=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[j]){
                j++;
                nums[j]=nums[i];
            }
        }
        return j+1;
    }

    public static void main(String[] args) {
        int[] arr={1,1,2,2,3,4,4};
        int length=removeDuplicates(arr);
        for(int i=0;i<length;i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        // 1. Use Java 8 Arrays.stream().distinct() to remove duplicates
        Arrays.stream(arr).distinct().forEach(n -> System.out.print(n + " "));
    }
}