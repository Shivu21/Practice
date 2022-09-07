// 6. Input currency in rupees and output in USD.
import java.util.Scanner;
public class currency_convrt {
    public static void main(String[] args) {
        System.out.println("Enter the INR:");
        Scanner sc = new Scanner(System.in);
        double INR = sc.nextInt();
        double USDT = INR*0.013;
        System.out.println("USDT of INR is:"+USDT);
    }
}
