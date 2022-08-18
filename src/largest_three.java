import java.util.Scanner;
public class largest_three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1st number : ");
        int srushti = sc.nextInt();
        System.out.println(" enter 2nd number : ");
        int poonam = sc.nextInt();
        System.out.println("enter 3rd number : ");
        int pallavi = sc.nextInt();
        if(srushti >= poonam && srushti>=pallavi)
            System.out.println(srushti + " greater");
        else if (poonam >= srushti && poonam >= pallavi)
            System.out.println(poonam + " greater");
        else if (pallavi >=srushti && pallavi >= poonam)
            System.out.println(pallavi + " greater");
    }
}
