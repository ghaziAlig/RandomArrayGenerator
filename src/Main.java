import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Array arraycreator = new Array();

        int arr_len = random.nextInt(10);

        int[] arr = arraycreator.ArrayCreater(arr_len);

        System.out.println("\nThe randomly generated " + arr_len + " element array is:");
        for (int value : arr) {
            System.out.print(value + "\t");
        }
        System.out.println();
    }
}
