public class FaithFulNumber {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(nthFaithfulNum(n));

    }

    static Long nthFaithfulNum(int N) {
        // code here
        long ans = 0l;
        int base = 7;
        int i = 0;

        while (N > 0) {
            int lastdigit = N & 1;
            ans += ((long) Math.pow(base, i)) * lastdigit;
            i++;
            N = N >> 1;
        }
        return ans;
    }
}
