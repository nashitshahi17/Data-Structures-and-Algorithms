import java.util.*;
class removeadjacentduplicates{
    private static String removeDuplicates(String s){
        Stack<Character> st = new Stack<>();
        for(char ch: s.toCharArray()){
            if(!st.isEmpty() && st.peek()==ch){
                st.pop();
            }else{
                st.push(ch);
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
        String ans = removeDuplicates(s);
        System.out.println(ans);
    }
}