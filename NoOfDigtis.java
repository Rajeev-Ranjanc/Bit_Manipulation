//by kunal no of digits in base B
//tc : O(logN)
public class NoOfDigtis {
    public static void main(String[] args) {
        int a = 122;
        int b = 2;

        //formula
        int ans = (int) (Math.log(a) / Math.log(b)) + 1;
        System.out.println(ans);
    }
}
