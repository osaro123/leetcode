public class Main {
    public static void main(String[] args) {
        int arr[] = {34,82,22,16,49};
        int target = 22;
        int ans = linearSearch(arr,target);
        if(ans == -1){
            System.out.println("target not found");
        }else{
            System.out.println("target is found at index " + ans);
        }
    }

    static int linearSearch(int[] arr,int target){

        if(arr.length == 0){
            return -1;
        }

        for(int i=0; i<arr.length; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}