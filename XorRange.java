public class XorRange {
    public static void main(String[] args) {
        int a = 3;
        int b = 9;

        //xor of a to b  will be xor from 0 to b xor 0 to a-1

        int ans = Xor(b) ^ Xor(a - 1);

        System.out.println(ans);

        //just for check purpose will give time limit exceed in coding
        int ans2 = 0;
        for (int i = a; i <= b; i++) {
            ans2 ^= i;
        }
        System.out.println(ans2);
    }

    //this function gives the xor range from 0 to n
    public static int Xor(int n) {
        if (n % 4 == 0) {
            return n;
        }
        if (n % 4 == 1) {
            return 1;
        }
        if (n % 4 == 2) {
            return n + 1;
        }
//        if (n % 4 == 3) {
//            return 0;
//        }
        return 0;
    }

}
