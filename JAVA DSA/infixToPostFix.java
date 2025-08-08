import java.util.Stack;

public class infixToPostFix {
    public static int precedence(char ch){
        if(ch =='^')return 3;
        else if (ch == '*' || ch == '/')return 2;
        else if (ch == '+' || ch == '-')return 1;
        else return -1;

    }
    public static String infixtoPost(String exp){
        StringBuilder finalExp = new StringBuilder();
        Stack<Character> st = new Stack<>();
        for(int i =0; i<exp.length(); i++){
            char ch = exp.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                finalExp.append(ch);
            }
            else if(ch == '('){
                st.push(ch);
            }
            else if(ch ==')'){
                while(!st.isEmpty() && st.peek()!='('){
                    finalExp.append(st.pop());
                    
                } 
                st.pop();
            }
            else {
                while(!st.isEmpty() && precedence(ch)<=precedence(st.peek())){
                    finalExp.append(st.pop());
                }
                st.push(ch);
            }
        

        } 
        while(!st.isEmpty()){
            finalExp.append(st.pop());
        }

        return finalExp.toString();
    }

    
    public static void main(String[] args){
        String exp = "(3+2)*5";
        System.out.println("Postfix expression: " + infixtoPost(exp));

    }
}

