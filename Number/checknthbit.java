import java.util.Scanner;

public class checknthbit {
    private static boolean check(int n,int k ){
        return ((n>>k)%2==1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        sc.close();
        boolean res = check(n,k);
        if(res){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}
// This checks if the given bit k is set or not 
// set means 1 not set means 0 
// example n = 4 k = 2
// in binary 4 = 100 and the 2nd bit is 1 that means yes it's true bits are like this 2,1,0
// when we do n>>k it right shifts the bit and after doing so 100 => 1 and to check last bit we do n%2 if it equals 1 that means set if it's zero means not set 