import java.util.Scanner;
public class quoient_reminder {
    public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
        System.out.println("enter divdend : ");
        int dividend= sc.nextInt();
        System.out.println("enter divisor : ");
        int divisor=sc.nextInt();
            int quotient = dividend / divisor;
            int remainder = dividend % divisor;

            System.out.println("Quotient = " + quotient);
            System.out.println("Remainder = " + remainder);
        }
    }
