// 1886. Determine Whether Matrix Can Be Obtained By Rotation
// Input: mat = [[0,1],[1,0]], target = [[1,0],[0,1]]
// Output: true
// Explanation: We can rotate mat 90 degrees clockwise to make mat equal target.

import java.util.*;

public class checkrotationsby90 {
    private static void rotate90(int[][]arr){
        for(int i=1;i<arr.length;i++){
            for(int j=0;j<i;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        for(int i=0;i<arr.length;i++){
            int left = 0, right = arr.length-1;
            while(left<right){
                int temp = arr[i][left];
                arr[i][left] = arr[i][right];
                arr[i][right] = temp;
                left++;
                right--;
            }
        }
    }
    private static boolean check(int[][]arr,int[][]target){
        for(int i = 0;i<4;i++){
            if(Arrays.deepEquals(arr, target)){
                return true;
            }
            rotate90(arr);
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int[][] target = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                target[i][j] = sc.nextInt();
            }
        }
        sc.close();
        if(check(arr,target)){
            System.out.println("True");
        }else{
            System.out.println("False");
        }  

    }
}
