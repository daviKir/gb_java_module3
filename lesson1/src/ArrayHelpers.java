import java.util.ArrayList;
import java.util.Arrays;

public class ArrayHelpers {
    public static <T> void swap(T[] array, int index1, int index2) {
        if (array == null) {
            throw new ArrayIsRequiredError("Array is required");
        } else if (index1 > array.length || index2 > array.length) {
            throw new OutOfBoundsError("indexes out of bounds");
        } else if (index1 == index2) {
            return;
        }

        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static <T> ArrayList<T> transformToArrayList(T[] arr) {
        return new ArrayList<>(Arrays.asList(arr));
    }
}
