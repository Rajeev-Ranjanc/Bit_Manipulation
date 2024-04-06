//https://www.geeksforgeeks.org/problems/set-kth-bit3724/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=bottom_sticky_on_article
public class SetKthBit {
    public static void main(String[] args) {
        int n = 7;
        int k = 2;
        System.out.println();
//        System.out.println(setKthBit(n, k));
//        System.out.println(setKthBit(n));
    }

    //    static int setKthBit(int N, int K) {
    static int setKthBit(int N) {
        // code here
        //setKthBit
//        return (N | (1<<K));

        //this question is of set every bit
        if ((N | ~N) == N) {
            return 1;
        }
        return 0;

    }
}
