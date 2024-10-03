package jiraya.dev.javacore.Hkeyboardinput.test;

import java.util.Scanner;

public class KeyboardInput {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.print("Digite algo: ");
    String next = input.nextLine();

    System.out.printf("Você digitou %s \n", next);

    input.close();

    Scanner input2 = new Scanner(System.in);
    System.out.print("Digite um número: ");
    int number1 = input2.nextInt();
    System.out.print("Digite outro número: ");
    int number2 = input2.nextInt();

    int sum = number1 + number2;

    System.out.println("Soma = " + sum);

    input2.close();

  }
}
