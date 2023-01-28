/*
урок 3.1.10 - на метод switch - проверяем является ли день недели выходным
 */
public class Weekend {
    public static void main(String[] args) {
        System.out.println(isWeekend("Saturday"));

    }

    public static boolean isWeekend(String weekday) {
        //"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"
        switch (weekday) {
            case "Sunday", "Saturday" -> {
                return true;
            }
            default -> {
                return false;
            }
        }
    /*
    public static String checkWeekend(String weekday) {
    //Тернарный ретурн
    return (weekday == "Sunday" || weekday == "Saturday") ? "Ура, выходной!" : "Надо еще поработать";
    }
     */

    }

}
