package ru.geekbrains.animals;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Мурзик");
        cat.run(100);
        cat.swim(200);
        Dog dog = new Dog("Тузик");
        dog.run(200);
        dog.swim(4);

        cat.infoCount();
    }
}
