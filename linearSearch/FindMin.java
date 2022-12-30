public class FindMin {
    public static void main(String[] args) {
        int[] arr = {12,9,45,3,68};
        System.out.println(search(arr));

    }

    static int search(int[] arr){
        if(arr.length == 0){
            return -1;
        }

        int min = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
}
