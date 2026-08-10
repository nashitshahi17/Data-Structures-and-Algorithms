import java.util.*;
class basicstlofstack{

    public static void main(String[] args) {
        Stack<String> st = new Stack<>();
        st.push("JavaScript");
        st.push("Python");
        st.push("Java");
        st.push("C#");
        st.push("React");
        System.out.println(st.size());
        System.out.println(st);
        st.pop();
        System.out.println(st+" "+ st.size());
        System.out.println(st.peek());
        System.out.println(st.pop());

    }
}