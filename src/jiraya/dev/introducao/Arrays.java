package jiraya.dev.introducao;

public class Arrays {
    public static void main(String[] args) {
        // byte, shor, int, long, float e double = 0
        // char '\u0000' = ' '
        // boolean = false
        // String null

        String[] names = new String[3];
        names[0] = "Clio";
        names[1] = "Filo";
        names[2] = "Naofumi";

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        //int[] numbers = new int[]{1, 2, 3, 4, 5};
        int[] numbers = {1, 2, 3, 4, 5};


        // foreach

        for (int n : numbers) {
            System.out.println(n);
        }
    }
}
