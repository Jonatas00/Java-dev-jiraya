package jiraya.dev.javacore.Hkeyboardinput.test;

import java.util.Scanner;

public class KeyboardExercise {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("The great predictive clarevident");
    System.out.println("I'll predict your question and respond with yes our no");

    String pergunta = input.nextLine();

    if (pergunta.charAt(0) == ' ') {
      System.out.println("SIM");
    } else {
      System.out.println("Não");
    }

    input.close();
  }
}
