import java.util.Stack;

/**
 * Main class
 */

public class Calculator {
    /**
     * FUnction that checks the validity of an expression
     * @param str - expression
     * @return 1 if valid and 0 if invalid
     */
    public static int check(String str)
    {
        int i=0;
        while(((str.charAt(i)==')'||str.charAt(i)=='('||str.charAt(i)=='+'||str.charAt(i)=='-'||str.charAt(i)=='*'||str.charAt(i)=='/')&& (str.charAt(i+1)<='9'&& str.charAt(i+1)>='0')) && i!=str.length()-2 )i++;
        if(i==str.length()-2) return 1;
        else return 0;
    }

    /**
     * Function that rewrite expression using Reverse Polish notation.
     * @param value - an expression entered by the user
     * @return - same expression in RPN
     */
    public static String ToRPN(String value) {

            String s="";
        Stack<Character> stack =new Stack<>();
        int priority;
        for(int i=0; i<value.length(); i++)
        {
            priority=getpriority(value.charAt(i));
            if(priority==0) s+=value.charAt(i);
            if(priority==2) stack.push(value.charAt(i));
            if(priority>2){
                s+=' ';
                while(!stack.empty()){
                    if(getpriority(stack.peek())>=priority) s+=stack.pop();
                    else break;
                }
                stack.push(value.charAt(i));
            }
            if(priority==1){
                s+=' ';
                while(getpriority(stack.peek())!=2) s+=stack.pop();
                stack.pop();
            }
        }
        while(!stack.empty()) s+=stack.pop();
        return s;

    }
    /**
     * Function that calculate value of expression using its RPN-version
     * @param rvalue - expression in RPN-version
     * @return - double-type answer
     */
    public static double ToAnswer(String rvalue){
        String s=new String();
        Stack<Double> stack = new Stack<>();
        for(int i=0; i<rvalue.length(); i++){
            if(rvalue.charAt(i)==' ') continue;
            if(getpriority(rvalue.charAt(i))==0){
                while(rvalue.charAt(i)!=' ' && getpriority(rvalue.charAt(i))==0){
                    s+=rvalue.charAt(i++);
                    if(i==rvalue.length()) break;
                }
                stack.push(Double.parseDouble(s));
                s=new String();
            }
            if(getpriority(rvalue.charAt(i))>1){
                double a=stack.pop(), b=stack.pop();
                if(rvalue.charAt(i)=='+') stack.push(b+a);
                if(rvalue.charAt(i)=='-') stack.push(b-a);
                if(rvalue.charAt(i)=='*') stack.push(b*a);
                if(rvalue.charAt(i)=='/') stack.push(b/a);
            }
        }
        return stack.pop();
    }

    /**
     * Function that determines the priority of arithmetic operation
     * @param symbol - arithmetic operation met in expression
     * @return - conditional priority (1-4)
     */
    public static int getpriority(char symbol) {
        if(symbol=='*' || symbol=='/') return 4;
        else if(symbol=='+' || symbol=='-') return 3;
        else if(symbol=='(') return 2;
        else if(symbol==')') return 1;
        else return 0;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
