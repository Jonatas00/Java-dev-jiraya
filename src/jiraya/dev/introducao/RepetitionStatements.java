package jiraya.dev.introducao;

public class RepetitionStatements {
    public static void main(String[] args) {
        int i = 0;
        // while

        while (true) {
            System.out.println("while " + ++i);

            if (i == 3) {
                break;
            }
        }

        // do while
        int i2 = 0;

        do {
            System.out.println("do while " + i2++);
        } while (i2 < 2);

        // for
        for (int i3 = 0; i3 < 3; i3++) {
            System.out.println("for " + i3);
        }
    }
}
