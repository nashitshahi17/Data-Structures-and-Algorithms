import java.util.Scanner;

public class clearkthbit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        sc.close();
        int res = n & (~(1<<k));
        System.out.println(res);
    }
}
