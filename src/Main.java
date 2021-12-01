import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /**
         * Demostration of the work
         */
        Scanner input = new Scanner(System.in);
        int check=1;
        while(check!=0)
        {
            String str;
            System.out.print("Enter an new expression : ");
            str = input.nextLine();
            int i=0;
            while(((str.charAt(i)==')'||str.charAt(i)=='('||str.charAt(i)=='+'||str.charAt(i)=='-'||str.charAt(i)=='*'||str.charAt(i)=='/')&& (str.charAt(i+1)<='9'&& str.charAt(i+1)>='0')) && i!=str.length()-2 )i++;
            System.out.println(str.length());
            System.out.println(i);
            if(i==str.length()-2) {
            String strR;
            double ans = 0;
            strR = Calculator.ToRPN(str);
            ans = Calculator.ToAnswer(strR);
            System.out.println(ans);}
            else System.out.println("Error");}
    }
}

