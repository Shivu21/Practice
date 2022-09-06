import java.io.InputStream;
import java.util.Scanner;

// 3. Write a program to input principal, time, and rate (P, T, R) from the user and
// find Simple Interest.

public class simple_intrst {
    public static void main(String[] args) {
       double p,t,r,si;
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the Principal: ");
       p =sc.nextDouble();
       System.out.println("Enter the Time: ");
       t = sc.nextDouble();
       System.out.println("Enter the Rate: ");
       r=sc.nextDouble();
       si=p*t*r/100;
       System.out.println("simple interest is: "+si); 
    }
}
