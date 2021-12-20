import java.util.*;
import java.util.Scanner;
public class Main {
    /**
     * Main class.
     * @param args
     */
    public static void main(String[] args){
            ArrayList<Integer> arrayList = new ArrayList<>();
            LinkedList<Integer> linkedList = new LinkedList<>();
            LinkedList<Integer> size = new LinkedList<>();
            Scanner in = new Scanner(System.in);
            int n=1;
            int newsize=1;
        /**
         * Input number of comparisons and count of their iterations
         */
        System.out.println("Enter a count of comparisons : ");
        while(true) {
            String k= in.next();
            if (isDigit(k)){
                if(Integer.parseInt(k)<=0) System.out.println("Incorrect input!");
                else{n=Integer.parseInt(k);
                    break;}
            }
            else System.out.println("Incorrect type!");
        }
        for (int j = 0;j < n; j++) {
            System.out.println("Enter new size for comparison: ");
            while(true) {
                String k= in.next();
                if (isDigit(k)){
                    if(Integer.parseInt(k)<=0) System.out.println("Incorrect input!");
                    else{newsize=Integer.parseInt(k);
                        break;}
                }
                else System.out.println("Incorrect type!");
            }
            size.add(newsize);
        }
        /**
         * Input of table with results of comparison
         */
        for(int i = 0; i < n; i++) {
                System.out.println("Number of elements : " + size.get(i));
            System.out.println("-----------------------------------");
                System.out.println("| Method | ArrayList | LinkedList  ");
                System.out.println("----------------------------------");
                System.out.println("| Add    | "+ new Comparison().checkAdd(arrayList, size.get(i)) + "         |" + new Comparison().checkAdd(linkedList, size.get(i)));
            System.out.println("----------------------------------");
                System.out.println("| Get    | "+ new Comparison().checkGet(arrayList, size.get(i)) + "         |" + new Comparison().checkGet(linkedList, size.get(i)));
            System.out.println("----------------------------------");
                System.out.println("| Delete | "+ new Comparison().checkDelete(arrayList, size.get(i)) + "         |" + new Comparison().checkDelete(linkedList, size.get(i)));
            System.out.println("----------------------------------");
            }
    }

    /**
     * Function that check, what symbol was entered: number or not.
     * @param s
     * @return boolean type: number=true; not number=false;
     * @throws NumberFormatException
     */
    private static boolean isDigit(String s) throws NumberFormatException {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}