import java.util.*;
public class searchin2dmatrix {
    private static boolean search(int[][] arr,int target){
        int n = arr.length, m = arr[0].length;
        int i = 0, j = m-1;
        while(i<n && j>=0){
            if(arr[i][j]>target) j--; //go left
            else if(arr[i][j]<target) i++; // go down
            else return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] arr = new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int target = sc.nextInt();
        sc.close();
        if(search(arr,target)){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
        
    }
}
// Give rows are sorted and columns are sorted 
// 1  4  7   11  15
// 2  5  8   12  19
// 3  6  9   16  22
// 10 13 14  17  24
// 18 21 23  26  30
// target = 5 
// start from 15 first row last column 15>5 go left cause below 15 all elements are greater so not possible and in the left of 15 elements are smaller
// 11>5 go left 7>5 go left 4<5 go down 5==5 found