package ru.geekbrains.animals;

import java.util.Random;

public class Animal {
    private String name;
    Random random = new Random();
    private int runLenght = (500 + (int) (500 * (float) random.nextInt(10) / 100));
    private int swimLenght = (50 + (int) (50 * (float) random.nextInt(20) / 100));
    private static int count = 0;
    private static int countDog = 0;
    private static int countCat = 0;

    public Animal(String name) {
        this.name = name;
        this.count++;
    }

    public void run(int lenght) {
        if (lenght <= this.runLenght) {
            System.out.printf("%s бежит %d метров\n", this.name, lenght);
        } else {
            System.out.printf("%s не может пробежать столько метров\n", this.name);
        }
    }

    public void swim(int lenght) {
        if (lenght <= this.swimLenght) {
            System.out.printf("%s плывет %d метров\n", this.name, lenght);
        } else {
            System.out.printf("%s не может проплыть столько метров\n", this.name);
        }
    }

    public void infoCount() {
        System.out.printf("У нас создано %d животных, из них %d котов и %d собак", count, countCat, countDog);
    }

    public void setRunLenght(int runLenght) {
        this.runLenght = runLenght;
    }

    public static void addCountDog() {
        Animal.countDog++;
    }

    public static void addCountCat() {
        Animal.countCat++;
    }

    public void setSwimLenght(int swimLenght) {
        this.swimLenght = swimLenght;
    }

}
