import java.util.Scanner;

// 5. Take 2 numbers as input and print the largest number.

public class largest_num {
    public static void main(String[] args) {
        System.out.println("Enter the num1: ");
        Scanner sc =new Scanner(System.in);
        int n1=sc.nextInt();
        System.out.println("Enter the num2: ");
        int n2=sc.nextInt();
        if(n1>n2){
            System.out.println("largest num is: "+n1);
        }
        else{
            System.out.println("largest num is: "+n2);
        }
    }
}
