public class NoofSetBits {
    public static void main(String[] args) {
        int n = 23456;
        System.out.println(Integer.toBinaryString(n));

        System.out.println(setBits(n));
    }

    private static int setBits(int n) {
        int count = 0;

        //counting the number of set bits
//        while (n > 0) {
//            count++;
//            n -= (n & -n); // n &-n gives the first set bit
//
//        }

        //counting the number of set bits
        while (n > 0) {
            count++;
            n = n & n - 1;
        }
        return count;
    }
}
