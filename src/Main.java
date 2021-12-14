
import Calculator.Calculator;
import java.util.Scanner;

/**
 * Main: demonstration of work.
 * You can try new expression while input word "stop".
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the expression in the prefix entry: ");
        Scanner in = new Scanner(System.in);
        String variable = in.nextLine();

        while(!variable.equals("stop")){
            try {
                Calculator calc = new Calculator();
                variable = calc.toPostfix(variable);
                double result = calc.calculate(variable);
                System.out.println("Result: " + result);
                System.out.println("For stop enter 'stop' ");
                System.out.println("Else enter the new expression: ");
                variable = in.nextLine();
            }
            catch (Exception e) {
                System.out.println("ERROR!\nPossible errors: division by zero or incorrect data entry ");
                e.printStackTrace();
                variable = "stop";
            }
        }
    }
}
