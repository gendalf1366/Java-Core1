package ru.geekbrains.animals;


public class Cat extends Animal {
    private String name = "Кот";
    private int runLenght = 200;
    private int swimLenght = 0;


    public Cat(String name) {
        super(name);
        this.name = name;
        super.setRunLenght(this.runLenght);
        super.setSwimLenght(this.swimLenght);
        Animal.addCountCat();
    }

    @Override
    public void swim(int lenght) {
        System.out.printf("%s не может плавать :( \n", name);
    }

}
