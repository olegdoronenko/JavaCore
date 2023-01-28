import java.util.Arrays;

public class MergeArraysTwo {
    public static void main(String[] args) {

        printArray(mergeAndSort(new int[] {1, 3, 7, 5}, new int[] {8, 4, 2, 4}));
    }
    public static int[] mergeAndSort(int[] firstArray, int[] secondArray) {
        int[] result = Arrays.copyOf(firstArray, firstArray.length + secondArray.length);
        System.arraycopy(secondArray, 0, result, firstArray.length, secondArray.length);
        Arrays.sort(result);
        return result;

    }

    public static void printArray(int[] numbers) {
        System.out.println(Arrays.toString(numbers));
    }
}
