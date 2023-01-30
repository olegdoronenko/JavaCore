/*
6.3.12
Создайте класс Human с полями возраст (age), имя (name), фамилия (secondName) и любимый вид спорта (favoriteSport).
 */

public class HumanClass {
    public static void main(String[] args) {
        Human tom = new Human();
        Human jack = new Human((byte) 23, "Jack", "Ritter", "Footbal");
        Human elli = new Human((byte) 20, "Ellie", "Pitcher");

    }
}

class Human {
    byte age;
    String name;
    String secondName;
    String favoriteSport;

    public Human() {

    }

    public Human (byte age, String name, String secondName, String favoriteSport) {
        this.age = age;
        this.name = name;
        this.secondName = secondName;
        this.favoriteSport = favoriteSport;

    }
    public Human (byte age, String name, String secondName) {
        this.age = age;
        this.name = name;
        this.secondName = secondName;

    }

}
