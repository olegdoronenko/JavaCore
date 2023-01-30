/*
6.3.11
Создайте класс Cat и класс Dog. В классе Cat должен быть метод sayHello(), который выводит в консоль "Мяу!",
аналогично с собакой, но выводит "Гав!". Так же, у собаки должен быть метод catchCat (поймать кошку),
который принимает кошку и дальше делает следующее:
 */

public class CatAndDog {
    public static void main(String[] args) {
        Cat murka = new Cat();

        Dog polkan = new Dog();
        polkan.catchCat(murka);



    }
}

class Cat {
    public void sayHello() {
        System.out.println("Мяу!");
    }
}

class Dog {
    public void sayHello() {
        System.out.println("Гав!");
    }

    public void catchCat(Cat cat) {
        System.out.println("Кошка поймана");
        this.sayHello();
        cat.sayHello();


    }
}