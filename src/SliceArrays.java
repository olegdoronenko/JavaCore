/*
урок 4.1.4
Дан массив возрастающих чисел. Даны два числа. Задача - написать метод, который из данного массива достанет ту часть,
которая лежит между данными числами (включительно)
Решать без импортов классов Arrays, ArrayList6 List и т.д.
 */

public class SliceArrays {
    public static void main(String[] args) {
        printArray(getSubArrayBetween(new int[]{1, 3, 5, 6, 9, 11, 24}, 4, 10));
    }


    public static int[] getSubArrayBetween(int[] numbers, int start, int end) {
        //найдем длину конечного массива
        int ansLen = 0;
        int place = 0;
        for (int i : numbers) {
            if (i >= start && i <= end) ansLen++;
        }
        //System.out.println(ansLen);

        int[] ansArray = new int[ansLen];
        for (int i : numbers) {
            if (i >= start && i <= end) {
                ansArray[place] = i;
                place++;
            }

        }
        return ansArray;
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
