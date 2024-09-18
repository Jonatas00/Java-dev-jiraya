package jiraya.dev.introducao;

public class PrimitiveTypes {
	public static void main(String[] args) {
		int age = 21;
		long bigNum = 100000;
		double height = (int) 1.78;
		float salary = 1000.00F;
		byte ageByte = 127;
		short ageShort = (short) 213333333;
		boolean ehtrue = true;
		boolean ehfalse = false;
		char ypsulum = '\u0059';

		System.out.println(ypsulum);
		System.out.println(height);
		System.out.println(ageShort);

		String name = "Jonatas";

		System.out.println(name);

		System.out.println(age + bigNum + salary + ageByte);
		System.out.println(ehfalse == ehtrue);
	}
}
