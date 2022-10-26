/**
 * Java Basic. Home work#1
 * 
 * @author Volodymyr
 * @version 5.9.2022
 * 
 */

class Masive {
    public static void main(String[] args) {
		//integer types, byte, short, long
		//int b,c,d,e;
		int a = 10;
		System.out.println("a = " + a);
		//non integer types: float, double
		float b = 5 / 2f;
		System.out.println(b);
		// symbols types: characters
		char c = 'q';
		System.out.println(c);
		//boolean type: boolean
		boolean f = true;
		System.out.println(f);
		// arrays is references type
		int [] array = new int[24];
		array[0] = 11;
		System.out.println(array[0]);
		float x = a * 3 + b;
		System.out.println(array[0]);
		System.out.println(Math.PI);
		f = a > 10;
		System.out.println(f);
		System.out.printf("a = %d, b = %f, f = %s, s = %s", a, b, f, "JAVA"); //%d - zmina na chyslo d
	}             
}
