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
            System.out.print("Enter an expression : ");
            str = input.nextLine();
            String strR;
            double ans = 0;
            strR = Calculator.ToRPN(str);
            ans=Calculator.ToAnswer(strR);
        }
    }
}

