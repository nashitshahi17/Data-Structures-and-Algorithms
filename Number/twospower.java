import java.util.Scanner;

public class twospower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.println(1<<n);
    }
}
// It means 2^n
