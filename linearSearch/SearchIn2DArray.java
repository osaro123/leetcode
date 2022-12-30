import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {{2,4,6},
                        {1,3,7},
                        {9,12,15}
                        };
        int[] ans = search(arr,9);
        System.out.println(Arrays.toString(ans));
    }

    static int[] search(int[][] arr,int target){

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                if(arr[i][j] == target){
                    return new int[] {i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
