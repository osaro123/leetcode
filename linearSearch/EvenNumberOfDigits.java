public class EvenNumberOfDigits {
    public static void main(String[] args) {
        int[] arr = {34, 1234, 493, 21, 234};
        System.out.println(findNumbers(arr));

    }

    static int findNumbers(int[] nums) {
        int count = 0;
        for(int i : nums){
            if(even(i)){
                count++;
            }
        }
        return count;
    }

    static boolean even(int num){
        int numberOfDigits = digits(num);
        if(numberOfDigits % 2 == 0){
            return true;
        }
        return false;
    }

    static int digits(int num){
        int count = 0;
        while(num > 0){
            num/=10;
            count++;
        }
        return count;
    }


}