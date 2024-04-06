//https://leetcode.com/problems/xor-operation-in-an-array/
//done on leetcode
/*
In this problem I just need to do xor till n as per the conditions only and done
 */
public class XorInArray {
    public static void main(String[] args) {
        int n = 5;
        int start = 0;
        System.out.println(xorOperation(n, start));
    }

    public static int xorOperation(int n, int start) {
        int ans = 0;
        int i = 0;

        while (n-- > 0) {
            ans ^= start + 2 * i;
            i++;
        }
        return ans;
    }
}
