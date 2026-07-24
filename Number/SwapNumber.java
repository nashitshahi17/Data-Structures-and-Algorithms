import java.util.Scanner;

public class SwapNumber {
    private static void swap(int n,int m){
        n = n^m;
        m = n^m;
        n = n^m;
        System.out.println("After swap: "+n+","+m);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.close();
        System.out.println("Before swap: "+n+","+m);
        swap(n,m);
    }
}
