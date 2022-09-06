/*2. Take name as input and print a greeting message for that particular name.*/

import java.util.Scanner;
public class greeting_input {
    public static void main(String[] args) {
        System.out.println("Enter the Name: ");
        Scanner sc = new Scanner(System.in);
        String sen = sc.next();
        System.out.println("Welcome "+sen);
    }
}
