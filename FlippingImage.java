import java.util.Arrays;

//https://leetcode.com/problems/flipping-an-image/
/*
done on leetcode
Asked in google you just need to reverse the array and while reversing simply does xor of every elements while swapping
 */
public class FlippingImage {
    public static void main(String[] args) {
        int[][] image = {{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};
        System.out.println(Arrays.toString(flipAndInvertImage(image)));
    }

    public static int[][] flipAndInvertImage(int[][] image) {
        for (int[] row : image) {
            //reverse the image array
            for (int i = 0; i < (image[0].length + 1) / 2; i++) {
                //swap with the first and last elements
                int temp = row[i] ^ 1;
                row[i] = row[image[0].length - 1 - i] ^ 1;
                row[image[0].length - 1 - i] = temp;
            }
        }
        return image;
    }
}
