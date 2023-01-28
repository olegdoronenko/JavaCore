/*
урок 4.1.12
Напишите метод printOddNumbers, который принимает массив и выводит в консоль только нечетные числа из него,
через запятую. Конец вывода должен перевести курсор на новую строку.
 */

import java.sql.SQLOutput;
import java.util.Arrays;

public class RepackArray {
    public static void main(String[] args) {
        printOddNumbers(new int[]{-1, 3, 5, 23, 2, 4});
    }
    public static void printArray(int[] numbers) {
        System.out.println(Arrays.toString(numbers));
    }


    public static void printOddNumbers(int[] arr) {
        printArray(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[arr.length - 1] % 2 != 0) {
                if (arr[i] % 2 != 0) {
                    if (i != arr.length - 1) {
                        System.out.print(arr[i] + ",");
                    } else {
                        System.out.println(arr[i]);
                    }
                }
            } else {
                if (arr[i] % 2 != 0) {
                    System.out.print(arr[i]);
                    for (int j = i + 1; j < arr.length; j++) {
                        if (arr[j] % 2 != 0) {
                            System.out.print(","+arr[j]);
                        }
                    }
                    System.out.println();
                    break;
                }
                //System.out.println();
                //break;
            }





        }

    }
}

