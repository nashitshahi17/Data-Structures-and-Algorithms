import java.util.*;
class transpose{
    public static void print(int[][]arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] arr = new int[r][c];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();
        int[][] res = new int[arr[0].length][arr.length];
        for(int j=0;j<arr[0].length;j++){
            for(int i=0;i<arr.length;i++){
                res[j][i] = arr[i][j];
            }
        }
        print(res);
    }
}