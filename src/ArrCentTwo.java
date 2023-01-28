import java.util.Arrays;

public class ArrCentTwo {
    public static void main(String[] args) {
        printArray(getArrayMiddle(new int[] {1, 5, 7, 6, 8}));
    }

    public static int[] getArrayMiddle(int[] numbers) {
        if (numbers.length == 0) {
            return numbers;
        }
        if (numbers.length % 2 == 0) {
            return Arrays.copyOfRange(numbers, numbers.length / 2 - 1, numbers.length / 2 + 1);
        } else {
            return Arrays.copyOfRange(numbers, numbers.length / 2, numbers.length / 2 + 1);
        }
        //return numbers;



    }

    public static void printArray(int[] numbers) {
        System.out.println(Arrays.toString(numbers));
    }
}



