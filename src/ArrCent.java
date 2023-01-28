/*
урок 4.1.5
Дан массив произвольной длины. Необходимо вернуть центральную часть массива, при чем, если массив четной длины,
то вернуть массив из двух элементов, если нечетной, то вернуть массив из одного элемента.
 */


public class ArrCent {

    public static void main(String[] args) {
        printArray(getArrayMiddle(new int[] {5, 7}));
    }

    public static int[] getArrayMiddle(int[] numbers) {
        if (numbers.length == 0) {
            return numbers;
        }
        if (numbers.length % 2 == 0) {
            int[] ans = new int[2];
            ans[0] = numbers[numbers.length / 2 - 1];
            ans[1] = numbers[numbers.length / 2];
            return ans;
        } else {
            int[] ans = new int[1];
            ans[0] = numbers[numbers.length / 2];

            return ans;
        }

    }


    public static void printArray(int[] numbers) {
        int i = 0;
        if (numbers.length > 1) {
            System.out.print("[");
            while (i < numbers.length - 1) {
                System.out.print(numbers[i] + ", ");
                i++;
            }
            System.out.print(numbers[numbers.length - 1]);
            System.out.print("]");
        } else if (numbers.length == 1) {
            System.out.print("[" + numbers[i] + "]");
        } else {
            System.out.print("[]");
        }
    }
}
