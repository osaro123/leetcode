public class searchInRange {
    public static void main(String[] args) {
        int[] arr = {12,24,36,48,60,72};
        int ans = search(arr,72,1,3);
        System.out.println(ans);
    }

    static int search(int[] arr, int target, int top, int bottom){
        if(arr.length == 0){
            return -1;
        }
        for(int i=top; i<= bottom; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}
