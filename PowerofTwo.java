//Power of two kunal
public class PowerofTwo {
    public static void main(String[] args) {
        int n = 0;
        if(n==0){
            System.out.println(false);
            return;
        }
        boolean result = (n & (n - 1)) == 0;
        System.out.println(result);

    }
}
