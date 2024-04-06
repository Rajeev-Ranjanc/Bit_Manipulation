/*
Last bit of odd digit is always 1, so we checked that number if that number is 1 then complete number is Odd otherwise Even
 */
import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isOdd(n));
    }

    public static boolean isOdd(int n) {
        return (n & 1) == 1;
    }
}
