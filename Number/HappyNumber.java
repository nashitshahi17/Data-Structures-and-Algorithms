import java.util.Scanner;

class HappyNumber{
    private static boolean happyNumber(int n){
        int res = n;
        while(res!=1 && res!=4){
            int temp = res;
            int sum = 0;
            while(temp>0){
                int digit = temp%10;
                sum+= digit*digit;
                temp/=10;
            }
            res = sum;
        }
        if(res==1){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        if(happyNumber(n)){
            System.out.println("Happy");
        }else{
            System.out.println("Unhappy");
        }
    }
}