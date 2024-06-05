package jiraya.dev.introducao;

public class ConditionalStatements {
    public static void main(String[] args) {
        int n = 52;
        if (n > 52) {
            System.out.println("Its greater than!!");
        } else if (n == 52) {
            System.out.println("Its Equal");
        } else {
            System.out.println("Its");
        }

        // Ternary operator

        float salary = 5000.00F;
        String messageDonate = "I'm going to donate $500";
        String messageNoDonate = "I don't have money to donate :c";
        // (condition) ? true : false;
        String result = salary > 5000 ? messageDonate : messageNoDonate;

        System.out.println(result);

        int age = 19;
        String category = age <= 15 ? "C": age <= 17 ? "B" : age < 20 ? "A" : "No qualified";

        System.out.println(category);
    }
}
