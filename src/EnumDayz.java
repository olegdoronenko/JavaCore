public class EnumDayz {
    public static void main(String[] args) {
        System.out.println(Day.SATURDAY);
        System.out.println(Day.FRIDAY.getRusName());
        System.out.println(Day.SATURDAY.isWeekend());
        //System.out.println(d.getRusName());
    }

    public enum Day {
        MONDAY("Понедельник"),
        TUESDAY("Вторник"),
        WEDNESDAY("Среда"),
        THURSDAY("Четверг"),
        FRIDAY("Пятница"),
        SATURDAY("Суббота"),
        SUNDAY("Воскресенье");

        String translating;
        Day(String translating) {
            this.translating = translating;
        }

        public String getRusName() {
            return translating;
        }

        public boolean isWeekend() {
            return SATURDAY.equals(this) || SUNDAY.equals(this);
        }
           }
        }





