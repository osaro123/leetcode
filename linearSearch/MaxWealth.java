public class MaxWealth {
    public static void main(String[] args) {
        int[][] arr = {{2,4},{1,6}};
        System.out.println(maxWealth(arr));


    }

    static int maxWealth(int[][] arr){
        int ans = Integer.MIN_VALUE;
        for(int i=0; i< arr.length; i++){
            int sum = 0;
            for(int j=0; j<arr[i].length; j++){
                sum+=arr[i][j];
            }
            if(sum > ans){
                ans = sum;
            }
        }
        return ans;
    }
}
