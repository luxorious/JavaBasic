/**
 * Java Basic. Home work#1
 * 
 * @author Volodymyr
 * @version 5.9.2022
 * 
 */

class Methods {
    public static void main(String[] args) {
    	printHello();
    	printHelloName("World");
    	//add(3, 5)
    	System.out.println(add(5,10));
    }
    static void printHello() {
    	System.out.println("Hello");
    }
    static void printHelloName(String name) {
    	System.out.printf("Hello, " + name);
    }

    static int add(int a, int b) { // method can return int, float, string
    	int c = a + b;
    	return c;
    }
}
