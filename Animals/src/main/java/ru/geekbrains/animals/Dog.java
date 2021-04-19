package ru.geekbrains.animals;

public class Dog extends Animal {
    private String name = "Собака";
    private int runLenght = 500;
    private int swimLenght = 10;

    public Dog(String name) {
        super(name);
        this.name = name;
        super.setRunLenght(this.runLenght);
        super.setSwimLenght(this.swimLenght);
        Animal.addCountDog();
    }

}

