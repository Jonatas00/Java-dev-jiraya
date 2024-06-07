package jiraya.dev.introducao;

import java.util.Arrays;

public class MultidimensionalArrays {
    public static void main(String[] args) {
        int[][] days = new int[3][3];

        /*
        days[0][0] = 28;
        days[0][1] = 29;
        days[0][2] = 30;

        days[1][0] = 29;
        days[1][1] = 30;
        days[1][2] = 31;

        days[2][0] = 1;
        days[2][1] = 2;
        days[2][2] = 3;
        */

        System.out.println("-----");

        for (int i = 0; i < days.length; i++) {
            for (int j = 0; j < days[i].length; j++) {
                System.out.println(j);
            }
        }
        System.out.println("-----");

        for (int[] i : days) {
            System.out.println(Arrays.toString(i));
            for (int day : i) {
                System.out.println(day);
            }
        }
        System.out.println("-----");


        String[][] baseArray = new String[2][];

        baseArray[0] = new String[]{"a", "b", "c"};

        String[] arrayTest = {"t", "e", "s", "t"};
        baseArray[1] = arrayTest;

        for (String[] arrayy : baseArray) {
            for (String r : arrayy) {
                System.out.printf("%s ", r);
            }
            System.out.println("\n");
        }

        int[][] baseArray2 = {{0, 1, 2}, {3, 4, 5}, {6, 7, 8}};

        for (int[] array : baseArray2) {
            for (int n : array) {
                System.out.print(n);
            }
            System.out.println();
        }
    }
}
