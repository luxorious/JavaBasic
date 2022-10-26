/**
 * Java Basic. Home work1 Task4
 * 
 * @author Volodymyr
 * @version 6.9.2022
 * 
 */

class Task4 {
	public static void main(String[] args) {
		int d = 32;
		float r = 32 / 2f;
		double s = Math.PI * Math.pow(r, 2);
		double calories = s * 40; //how count calories in integer, or how transfer double to int?
		System.out.printf(
			"A pizza with a diameter of %d cm has %f calories",d, calories);
	}
}