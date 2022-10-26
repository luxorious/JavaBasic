/**
 * Домашнее задание:
Написать и вызвать метод checkWeather() с int параметром temperature. Метод возвращает строку с текстом “It’s frost” если температура воздуха ниже нуля, “It’s cold”, если температура от 0 до 18 градусов, “It’s warm” при температуре от 19 до 28 и “It’s hot” при температуре выше 29 градусов.
Написать и вызвать метод canWalk() c двумя boolean параметрами: isWeekend и isRain. Метод возвращает true, если можно гулять. Гулять можно в выходной и если нет дождя.
Написать и вызвать четыре метода с двумя int параметрами. Методы должны возвращать результат сложения, вычитания, умножения и деления этих двух параметров.
* Написать и вызвать метод dayOfWeek() c одним int параметром – номером дня недели. Метод должен вернуть наименование этого дня недели (на английском языке).
* Написать и вызвать метод canBuyFood() c двумя boolean параметрами isLidlOpen и isTescoOpen. Метод возвращает true, если открыт хотя бы один магазин. Кроме того, метод выводит текст “I can buy food in …”, где вместо многоточия подставляется название открытого магазина. Если оба магазина закрыты метод выводит текст “I can’t buy food”.
* Написать и вызвать метод, решающий квадратное уравнение (quadratic equation). Формулу для его решения можно найти в википедии.
*/

class New {
    public static void main(String[] args) {
    	int t = 15;
		if (t < 0) {
			System.out.println("It's zero");
		} else {
			System.out.println("it's no Frost");
		}
		//System.out.println(t < 0? "It's frost" : "It's NO Zero") //This method change if elseits work just when 2 variant
		int m = 1;
		if (m == 12 || m == 1 || m == 2) {
			System.out.println("winter");
		} else if (m == 3 || m == 4 || m == 5) {
			System.out.println("summer");
		} else if (m == 9 || m == 10 || m == 11) {
			System.out.println("Fall");
		}else {
			System.out.println("Error");
		}
		boolean isWeekend = true;
		boolean isIAmFree = true;
		if (isWeekend 'enen' isIAmFree) { //znak enen - and ! - not
			System.out.println("Yes i can");
		} else {
			System.out.println("I can not");
		}
		switch (m) {
			case 12: 
			case 1:
			case 2:
				System.out.println("Winter");
				break; //experiment without break
			case 3:
			case 4:
			case 5:
				System.out.println("Spring");
				break;
			default:
				System.out.println("Error");
				break;
		}
		
	}
}
