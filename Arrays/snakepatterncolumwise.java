import java.util.*;
public class snakepatterncolumwise {
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
        for(int j=0;j<arr[0].length;j++){
            if(j%2==0){
                for(int i=0;i<arr.length;i++){
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }else{
                for(int i=arr.length-1;i>=0;i--){
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
        }
    }
}
