import java.util.Scanner;
public class power_of_2 {
    public static void main (String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number : ");
        int base = sc.nextInt();
        int x=3;
        System.out.println ("Required Power is " + power (base, x));
    }
    static int power (int base, int x)
    {
        if (x == 0)     //Base Condition
            return 1;
        return (base * power (base, x - 1));
    }
}


