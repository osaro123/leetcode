public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] arr ={1,3,5,7,9,11,13,15};
        int ans = orderAgnosticBinarySearch(arr,11);
        System.out.println(ans);
    }

    static int orderAgnosticBinarySearch(int[] arr, int target){
        int start = 0,end = arr.length -1;
        int mid = start + (end - start)/2;

        boolean isAsc = arr[start] < arr[end];
        while(start <= end){

            if(arr[mid] == target){
                return mid;
            }
            if(isAsc){
                if(target < arr[mid]){
                    end = mid-1;
                }
                else{
                    start = mid + 1;
                }
            }
            else {
                if(target > arr[mid]){
                    end = mid-1;
                }
                else {
                    start = mid + 1;
                }
            }

        }
        return -1;
    }
}
