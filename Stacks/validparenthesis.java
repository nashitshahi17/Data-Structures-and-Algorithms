import java.util.*;
class validparenthesis{
    private static boolean isValid(String s){
        Stack<Character> st = new Stack<>();
        if(s.length()%2!=0) return false;
        for(char ch: s.toCharArray()){
            if(ch=='{' || ch=='(' || ch=='['){
                st.push(ch);
            }else{
                if(st.isEmpty()) return false;
                char top = st.peek();
                if((top=='(' && ch==')') || (top=='{' && ch=='}') || (top=='[' && ch==']')){
                    st.pop();
                }else{
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
        if(isValid(s)){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}