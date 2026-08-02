import java.util.*;
public class spiralmatrix {
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        int r = matrix.length, c = matrix[0].length;
        int fr=0, lr = r-1;
        int fc = 0, lc = c-1;
        int count=0;
        while(count<(r*c)){
            for(int i=fr;i<=lc;i++){
                res.add(matrix[fr][i]);
                count++;
            }
            fr++;
            if(fr>lr || fc>lc) break;
            for(int i=fr;i<=lr;i++){
                res.add(matrix[i][lc]);
                count++;
            }
            lc--;
            if(fr>lr || fc>lc) break;
            for(int i=lc;i>=fc;i--){
                res.add(matrix[lr][i]);
                count++;
            }
            lr--;
            if(fr>lr || fc>lc) break;
            for(int i=lr;i>=fr;i--){
                res.add(matrix[i][fc]);
                count++;
            }
            fc++;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][]arr = new int[r][c];
        for(int i=0;i<r;i++){
            for(int j =0;j<c;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();
        List<Integer> l = spiralOrder(arr);
        System.out.println(l);
    }
}
// Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
// Output: [1,2,3,6,9,8,7,4,5]
// 1 2 3
// 4 5 6
// 7 8 9 
// 1->2->3
//       |
// 4->5->6   
// |     |
// 7<-8<-9
// Can be done by printing first row left to right then lastcolumn top to bottom then lastrow right to left then firstcolumn bottom to up and in after each printing manipulate the four variables accordingly