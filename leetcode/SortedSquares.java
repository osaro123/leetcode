import java.util.Arrays;

public class SortedSquares {
    public static void main(String[] args) {
        int[] nums = {-4,-1,0,3,10};
        int[] square = squareNumbers(nums);
        sortedSquares(square);
        System.out.println(Arrays.toString(square));

    }

    static int[] squareNumbers(int[] nums){
        for(int i=0; i< nums.length; i++){
            nums[i]*=nums[i];
        }
        return nums;
    }

    static int[] sortedSquares(int[] nums){
        for(int i=0; i<nums.length-1; i++){
            boolean swapped = true;
            while(swapped){
                swapped = false;
                if(nums[i] > nums[i+1]){
                    swapped = true;
                    int temp = nums[i];
                    nums[i] = nums[i+1];
                    nums[i+1] = temp;
                }
            }
        }
        return nums;
    }
}
