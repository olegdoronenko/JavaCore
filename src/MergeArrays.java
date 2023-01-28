/*
урок 4.1.7 объединение двух произвольных массивов
не используем Arrays
на выходе должны получить отсортированный массив
Фактически пузырьковая сортировка получилась
 */

public class MergeArrays {
    public static void main(String[] args) {printArray(mergeAndSort(new int[] {1}, new int[] {1, 3}));
    }
    public static int[] mergeAndSort(int[] firstArray, int[] secondArray) {
        int[] mergedAr = new int[firstArray.length + secondArray.length];
        int[] sortedAr = new int[mergedAr.length];
        int adress = 0;
        for (int i: firstArray) {
            mergedAr[adress] = i;
            adress++;
        }
        for (int i: secondArray) {
            mergedAr[adress] = i;
            adress++;
        }

        for (int i = 0; i < mergedAr.length; i++) {
            for (int j = 1; j < mergedAr.length; j++) {
                int first = mergedAr[j - 1];
                int second = mergedAr[j];
                if (mergedAr[j] < mergedAr[j - 1]) {
                    mergedAr[j] = first;
                    mergedAr[j - 1] = second;
                }
            }
        }

        return mergedAr;
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
