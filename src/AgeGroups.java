/*
урок 3.1.9 - разные возрастные группы
 */
public class AgeGroups {
    public static void main(String[] args) {
        System.out.println(AgeGroups.determineGroup(56));

    }

    public static int determineGroup(int age) {
        //1 - от 7 до 13 лет 2 - от 14 до 17 лет 3 - от 18 до 65 лет
        if ((age <= 65) && (age >= 18)) {
            return 3;
        } else if ((age <= 17) && (age >= 14)) {
            return 2;
        } else if ((age <= 13) && (age >= 7)) {
            return 1;
        } else {
            return -1;
        }
    }

}
