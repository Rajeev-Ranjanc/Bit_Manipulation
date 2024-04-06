//https://www.geeksforgeeks.org/problems/check-whether-k-th-bit-is-set-or-not-1587115620/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=bottom_sticky_on_article
//done on gfg
public class CheckKthBit {
    public static void main(String[] args) {
        int n = 4;
        int k = 0;
        System.out.println(checkKthBit(n, k));
    }

    static boolean checkKthBit(int n, int k) {
        // Your code here
        if ((n & (1 << k)) != 0) {
            return true;
        }
        return false;
    }
}
