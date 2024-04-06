//TC : O(n)
public class Power {
    public static void main(String[] args) {

        int base = 2;
        int power = 6;
        int ans = 1;

        while (power > 0) {

            if ((power & 1) == 1) {//checking the last bit is it zero

                ans *= base;

            }

            base *= base; //it needs to be done every time whenever a loop calls

            power = power >> 1; //right shift


        }

        System.out.println(ans);

    }

}
