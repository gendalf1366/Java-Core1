package ru.geekbrains.lesson1;

public class MainApp {
    public static void main(String[] args) {
        byte a = 127;
        short b = 32767;
        int c = 2147483647;
        long d = 9223372036854775807L;
        float e = 20.30f;
        double f = 122.154;
        char g = '@';
        boolean h = true;

        System.out.println(calculate(3, 4, 5, 6));
        System.out.println(amountLimits(1,9));
        positiveNegative(5);
        System.out.println(negative(-15));
        name("Павел");
        leapYear(2020);
    }

    public static int calculate(int a, int b, int c, int d) {
        int result = a * (b + (c / d));
        return result;
    }

    public static boolean amountLimits(int a, int b) {
        int c = a + b;
        if (c >= 10 || c >= 20) {
            return true;
        }
        return false;
    }

    public static void positiveNegative(int x) {
        if (x >= 0) {
            System.out.println("Положительное");
        } else {
            System.out.println("Отрицательное");
        }
    }

    public static boolean negative(int a) {
        if (a < 0) {
            return true;
        }
        return false;
    }

    public static void name(String name) {
        System.out.println("Привет, " + name);
    }

    public static void leapYear(int a) {
        if (a % 100 == 0 && a % 400 == 0) {
            System.out.println("Год високосный.");
        } else if (a % 4 == 0 && a % 100 > 0) {
            System.out.println("Год високосный.");
        } else if (a % 100 == 0){
            System.out.println("Год не високосный.");
        }else{
            System.out.println("Год не високосный.");
        }
    }

}
