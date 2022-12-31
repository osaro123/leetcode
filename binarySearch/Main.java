public class Main {
    public static void main(String[] args) {
        int[] arr ={1,3,5,7,9,11,13,15};
        int ans = binarySearch(arr,11);
        System.out.println(ans);
    }

    static int binarySearch(int[] arr, int target){
        int start = 0,end = arr.length -1;
        int mid = start + (end - start)/2;
        while(start <= end){
            if(target < arr[mid]){
                end = mid-1;
            }
            else if (target > arr[mid]) {
                start = mid + 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}