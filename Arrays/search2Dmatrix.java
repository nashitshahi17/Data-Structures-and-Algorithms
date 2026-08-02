import java.util.*;
public class search2Dmatrix {
    public static boolean searchMatrix(int[][] matrix, int target) {
        int r = matrix.length;
        int c = matrix[0].length;
        int low = 0, high = (r*c)-1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(matrix[mid/c][mid%c]>target){
                high = mid - 1;
            }else if(matrix[mid/c][mid%c]<target){
                low = mid+1;
            }else{
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][]arr = new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int target = sc.nextInt();
        sc.close();
        if(searchMatrix(arr,target)){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}
// 1 3 5 7
// 10 11 16 20
// 23 30 34 60

// Its simple binary search, just in a 2d matrix.
// Here, no. of rows and cols can be found as:
// int r = matrix.size(); int c = matrix[0].size();
// And the low and high will be:
// int low = 0, high = (r*c)-1;
// The real thing that you'll get stuck in is how to do the comparison between the mid element and the target element. Its simple, you can find the row index by dividing the mid (index of the number) by number of columns, the quotient will be the row index, while the remainder will be the column index. In simple words, it'll be like:
// matrix[mid/c][mid%c]
// Now, question comes in mind, that why is this so? Why do we get row index as the quotient and col index as the remainder if we divide the index of the number by number of cols?
// Below is its explanation:
// In a 2D matrix, each element can be uniquely identified by its row index and column index. Let's say we have a matrix of size m x n (m rows and n columns) and we want to find the row and column index of an element at index i in the matrix.
// To find the row index, we can divide the index i by the number of columns n. The quotient of this division gives us the row index. This is because every n elements in the matrix belong to the same row. For example, in a matrix of size 3 x 4, the first 4 elements belong to the first row, the next 4 elements belong to the second row, and so on.
// To find the column index, we can take the remainder of the same division (i divided by n). This is because the remainder gives us the position of the element within the row. For example, if i is 5 and n is 4, then the row index is i/n = 5/4 = 1 (integer division gives us 1) and the column index is i mod n = 5 mod 4 = 1.