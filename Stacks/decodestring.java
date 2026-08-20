import java.util.*;
public class decodestring {
    private static String decode(String s){
        Stack<Integer> counts = new Stack<>();
        Stack<StringBuilder> sb = new Stack<>();
        StringBuilder current = new StringBuilder();
        int count = 0;
        for(char ch: s.toCharArray()){
            if(Character.isDigit(ch)){
                count = count*10 + (ch-'0');
            }else if(ch=='['){
                counts.push(count);
                sb.push(current);
                count = 0;
                current = new StringBuilder();
            }else if(ch==']'){
                int r = counts.pop();
                StringBuilder pr = sb.pop();
                for(int i=0;i<r;i++){
                    pr.append(current);
                }
                current = pr;
            }else{
                current.append(ch);
            }
        }
        return current.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
        String ans = decode(s);
        System.out.println(ans);
    }
}
