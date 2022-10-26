/**
 * Java Basic. Home work1 Task2
 * 
 * @author Volodymyr
 * @version 6.9.2022
 * 
 */

class Task2 {
	public static void main(String[] args) {
    int a, b;
  	a = 5;
  	b = 3;
    int add = a + b;
    int sub = a - b;
    int mult= a * b;
    float div = (float)a/b; // I don't know if it's ok? please tell about float more on the next lesson. THANK'S 
  	System.out.printf("The result of operations on numbers a = %d, b = %d" 
                        +'\n', a, b);
  	System.out.printf("additin - %d," + '\n' +
    "subtraction - %d" + '\n' + "multiplicaton - %d," + 
                      '\n' + "devide - %f" +'\n', 
                      add, sub, mult, div);
    System.out.println("Goodbye, have a nice day");
  	}
}