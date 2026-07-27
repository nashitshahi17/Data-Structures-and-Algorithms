import java.util.*;
public class setnthbit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        sc.close();
        int res = (n|(1<<k));
        System.out.println(res);
    }
    
}
// In this we have to do bitwise or of such a number that the kth number turns on means sets to 1
// For that we can shift the 1 by k bits
// Example 10 in binary 1010 and k = 2 means second bit to be turned on
// 1010 if we do or with 0100 then it will result in 1110
// In binart 1 is 0001 if we shift it by here k = 2 then the number is 0100 the required it goes with every case 
// This method of doing so is called bit masking