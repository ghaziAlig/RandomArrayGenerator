import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        Array arraycreator = new Array();

        int arr_len = random.nextInt(10);

        int[] arr = arraycreator.ArrayCreater(arr_len);

        System.out.println("\nThe randomly generated " + arr_len + " element array is:");
        for (int value : arr) {
            System.out.print(value + "\t");
        }
        System.out.println();


//      Do it again
        System.out.println("\n\nDo you want to do it again?\nEnter 'Y' if yes, any other character if no.");
        char ch = sc.next().charAt(0);
        if (ch == ('y'|'Y')) {
            main(null);
        }
    }

}
