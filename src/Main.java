import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /**
         * Demostration of the work
         */
        System.out.println("1.Calculate an expression");
        System.out.println("0.Exit");
        Scanner in = new Scanner(System.in);
        while (!in.hasNextInt()) {
            System.out.println("Error: enter the number");
            in.next();
        }
        int s = in.nextInt();
        while (s<0||s>1) {
            System.out.println("Error: number must be 0 or 1");
            s = in.nextInt();
        }
        while (s != 0)
        {

            Scanner scan = new Scanner(System.in);
            System.out.print("Enter an new expression : ");
            String str=scan.nextLine();
            String strR;
            double ans = 0;
            strR = Calculator.ToRPN(str);
            ans = Calculator.ToAnswer(strR);
            System.out.println(ans);
            System.out.println("1.Calculate an expression");
            System.out.println("0.Exit");
            while (!in.hasNextInt()) {
                System.out.println("Error: enter the number");
                in.next();
            }
            s = in.nextInt();
            while (s<0||s>1) {
                System.out.println("Error: number must be 0 or 1");
                s = in.nextInt();
            }
        }
}
}

