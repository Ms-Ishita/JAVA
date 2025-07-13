import java.util.*;
public class infix {
 

    public static void main(String args[]){
        String str="4+5+(9+3)*4/3";
        Stack<Integer> val=new Stack<>();
        Stack<Character> oper=new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch>='0'&&ch<='9'){
                val.push(ch-'0');
            }
            else if(oper.isEmpty()||ch=='('||oper.peek()=='('){
                oper.push(ch);
            }
            else if(ch==')'){
                while(oper.peek()=='('){
                    int val2=val.pop();
                    int val1=val.pop();

                    if(oper.peek()=='+')val.push(val1+val2);
                    if(oper.peek()=='-')val.push(val1-val2);
                    if(oper.peek()=='*')val.push(val1*val2);
                    if(oper.peek()=='/')val.push(val1/val2);
                    oper.pop();
                }
                oper.pop();
            }
            else{
                if(ch=='+'||ch=='-'){
                    int val2=val.pop();
                    int val1=val.pop();
                    if(oper.peek()=='+')val.push(val1+val2);
                    if(oper.peek()=='-')val.push(val1-val2);
                    if(oper.peek()=='*')val.push(val1*val2);
                    if(oper.peek()=='/')val.push(val1/val2);
                    oper.pop();
                    oper.push(ch);
                }
                if(ch=='*'||ch=='/'){
                    if(oper.peek()=='*'||oper.peek()=='/'){
                        int val2=val.pop();
                        int val1=val.pop();
                        if(oper.peek()=='*')val.push(val1*val2);
                        if(oper.peek()=='/')val.push(val1/val2);
                        oper.pop();
                        oper.push(ch);

                    }
                    if(oper.peek()=='+'||oper.peek()=='-'){
                        oper.push(ch);
                    }
                }

            }
        }
        while(val.size()>1){
            int val2=val.pop();
            int val1=val.pop();

            if(oper.peek()=='+')val.push(val1+val2);
            else if(oper.peek()=='-')val.push(val1-val2);
            else if(oper.peek()=='*')val.push(val1*val2);
            else if(oper.peek()=='/')val.push(val1/val2);
            oper.pop();
        }
        
        System.out.println(val.peek());
    }
}

