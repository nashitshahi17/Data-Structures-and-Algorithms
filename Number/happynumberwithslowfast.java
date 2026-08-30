import java.util.*;
class happynumberwithslowfast{
    private static int fun(int n){
        int sum = 0;
        while(n>0){
            int d = n%10;
            sum = sum + d*d;
            n/=10;
        }
        return sum;
    }
    public static boolean happynumber(int n){
        int slow = n, fast = n;
        while(fast!=1){
            slow = fun(slow);
            fast = fun(fast);
            fast = fun(fast);
            if(slow==fast && slow!=1){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        if(happynumber(n)){
            System.out.println("Happy Number");
        }else{
            System.out.println("Not Happy Number");
        }
    }
}