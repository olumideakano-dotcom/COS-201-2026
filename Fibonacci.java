import java.util.Scanner;
import java.math.BigInteger;

public class Fibonacci {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = input.nextInt();

        BigInteger first = BigInteger.ZERO;
        BigInteger second = BigInteger.ONE;

        for (int i = 1; i <= n; i++) {

            System.out.print(first + " ");

            BigInteger next = first.add(second);
            first = second;
            second = next;
        }

        input.close();
    }
}