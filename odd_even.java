// 1. Write a program to print whether a number is even or odd, also take
// input from the user.


import java.util.*;
public class odd_even {
    public static void main(String[] args) {
        System.out.println("Enter the value: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num % 2==0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    }
}
