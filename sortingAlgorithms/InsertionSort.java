import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void insertionSort(int[] arr){
        for(int i=1; i<arr.length; i++){
            int currentValue = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] > currentValue){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = currentValue;
        }
    }
}
