package jiraya.dev.introducao;

public class Operators {
	public static void main(String[] args) {
		// + - / *

		int num1 = 10;
		int num2 = 20;

		System.out.println(num1 + num2);
		System.out.println(num1 - num2);
		System.out.println(num1 * num2);
		System.out.println(num1 / (double) num2);

		System.out.println("Valor:" + (num1 + num2));

		// %

		int module = 51 % 2;

		System.out.println(module);

		// < > <= >= !=

		boolean is10m20 = 10 < 20;

		System.out.println(is10m20);

		// AND (&&) or (||)

		String gender = "M";
		int age = 8;

		if (gender == "M" && age >= 18) {
			System.out.printf("He is %s %d", gender, age);
		} else if (gender == "F" || age <= 18) {
			System.out.printf("She is %s %d", gender, age);
		}

		// += *=

		int i = 1;
		i++;
		i--;
		++i;
		System.out.println(i);
	}
}
