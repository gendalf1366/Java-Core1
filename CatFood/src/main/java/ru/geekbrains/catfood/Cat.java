package ru.geekbrains.catfood;

public class Cat {
    private String name;
    private int appetite;
    private int saturationFood;
    private int catFullness;
    private boolean fullness;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.saturationFood = 0;
        this.fullness = false;
        this.catFullness = this.appetite * 4;
    }

    public int getSaturationFood() {
        return saturationFood;
    }

    public int getCatFullness() {
        return catFullness;
    }

    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }

    public boolean isFullness() {
        return fullness;
    }

    public void eat(Plate p) {
        if (this.fullness) {
            return;
        }
        if (p.decreaseFood(this.appetite)) {
            System.out.printf("%s съел %d единиц еды\n", this.name, this.appetite);
            this.saturationFood += this.appetite;
            if (this.saturationFood == this.catFullness) {
                this.fullness = true;
            }
        }
    }
}
