package ru.geekbrains.lesson2;

import java.util.Arrays;


public class LessonTwo {
    public static void main(String[] args) {
        byteArray();
        multipleArray();
        changeArray();
        crossArray();
        minMax();
        System.out.println(checkArray(new int[]{1, 1, 1, 2, 1})); // true
        System.out.println(checkArray(new int[]{2, 1, 1, 2, 1})); // false
        System.out.println(checkArray(new int[]{10, 10})); //true
        displaceArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, -2);
    }

    public static void byteArray() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void multipleArray() {
        int[] arr = new int[8];
        arr[0] = 0;
        for (int i = 1; i < arr.length; i++) {
            arr[i] = i * 3;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void changeArray() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6)
                arr[i] = arr[i] * 2;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void crossArray() {
        int[][] arr = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == j) {
                    arr[i][j] = 1;
                }
            }
        }
        System.out.println(Arrays.deepToString(arr));
    }

    public static void minMax() {
        int[] arr = {2, 3, 8, 9, 15, 6};
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            } else if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(min + " " + max);
    }

    public static boolean checkArray(int[] arr) {
        int leftSum = 0;
        for (int i = 0; i < arr.length; i++) {
            leftSum += arr[i];
            int rightSum = 0;
            for (int j = 0; j < arr.length; j++) {
                rightSum += (j > i) ? arr[j] : 0;
            }
            if (leftSum == rightSum) {
                return true;
            }
        }
        return false;
    }

    public static void displaceArray(int[] arr, int n) {
        if (n > 0) {
            for (int i = 0; i < n; i++) {
                int tmp = arr[arr.length - 1];
                for (int j = arr.length - 1; j > 0; j--) {
                    arr[j] = arr[j - 1];
                }
                arr[0] = tmp;
            }
        } else if (n < 0) {
            for (int i = 0; i < n * (-1); i++) {
                int tmp = arr[0];
                for (int j = 0; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                arr[arr.length - 1] = tmp;
            }
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}


