import java.util.Arrays;

public class Main {
    public int[] task1(int[] arr) {
        for (int i = arr.length -1; i >= 0 ; i--) {
            if (arr[i] == 4) {
                return Arrays.copyOfRange(arr, i+1, arr.length);
            }
        }
        throw new RuntimeException("Invalid array");
    }

    public boolean task2(int[] arr) {
        boolean contains1 = false;
        boolean contains4 = false;

        for (int num : arr) {
            if (num == 1) {
                contains1 = true;
            } else if (num == 4) {
                contains4 = true;
            } else {
                return false;
            }
        }

        return contains1 && contains4;
    }
}
