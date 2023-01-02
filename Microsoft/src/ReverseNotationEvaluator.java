import java.util.Stack;

public class ReverseNotationEvaluator {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st= new Stack<>();
        int i=0;
        while(i<tokens.length){
            if(tokens[i].equals("+") || tokens[i].equals("-") || tokens[i].equals("*") || tokens[i].equals("/")){
                int a=st.pop();
                int b=st.pop();
                if(tokens[i].equals("+"))
                    st.push(a+b);
                else if(tokens[i].equals("-"))
                    st.push(b-a);
                else if(tokens[i].equals("*"))
                    st.push(b*a);
                else if(tokens[i].equals("/"))
                    st.push(b/a);
            }else{
                st.push(Integer.parseInt(tokens[i]));
            }
            i++;
        }

        return st.peek();
    }
}
