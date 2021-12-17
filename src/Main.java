import java.io.*;
import java.util.Scanner;
import java.util.NoSuchElementException;
public class Main
{
    public static void main(String[] args) throws Exception
    {
        System.out.println("1.Enter new expression.");
        System.out.println("0.Exit.");
        System.out.print(">");
        Scanner in = new Scanner(System.in);
        while (!in.hasNextInt()) {
            System.out.println("Error! Enter the number.");
            in.next();
        }
        int quit = in.nextInt();
        while (quit<0||quit>1) {
            System.out.println("Error! Enter 0 or 1.");
            quit = in.nextInt();
        }
        while (quit != 0)
        {

            Scanner scan = new Scanner(System.in);
            System.out.print(">");
            String example=scan.nextLine();
            new Calculator(example);
            System.out.print("Result:");
            System.out.println(Calculator.getting_a_solution());
            System.out.println("1.Enter new expression.");
            System.out.println("0.Exit.");
            System.out.print(">");
            while (!in.hasNextInt())
            {
                System.out.println("Error! Enter the number.");
                in.next();
            }
            quit = in.nextInt();
            while (quit<0||quit>1)
            {
                System.out.println("Error! Enter 0 or 1.");
                quit = in.nextInt();
            }
        }
    }
}