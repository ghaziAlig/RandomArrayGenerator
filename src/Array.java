import java.util.Random;
import java.util.InputMismatchException;

public class Array {
    public int[] ArrayCreater(int arr_len) {
        Random random = new Random();
        int[] arr = new int[arr_len];

        for (int i=0; i<arr_len;i++) {
            try {
                arr[i] = random.nextInt(100);
            }
            catch (InputMismatchException e) {
                System.out.println("\nWrong Input!!  Try again.");
                random.nextInt(100);
            }
        }
        return arr;
    }
}
