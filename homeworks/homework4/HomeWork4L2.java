/**
 * Java Basic. Home work4 Level2
 * 
 * @author Volodymyr
 * @todo 14.09.2022
 * @date 18.09.2022
 */

import java.util.Random;
import java.util.Scanner;

//Укажите пожалуйста оценку за дз
class HomeWork4L2 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int points = random.nextInt(20);
        String repeat = "";
        do {
            int line1 = random.nextInt(10);
            int line2 = random.nextInt(10);
            int line3 = random.nextInt(10);
            int line4 = random.nextInt(10);
            int line5 = random.nextInt(10);
            int line6 = random.nextInt(10);
            int line7 = random.nextInt(10);
            int line8 = random.nextInt(10);
            int line9 = random.nextInt(10);
            System.out.printf("%d %d %d\n", line1, line2, line3);
            System.out.printf("%d %d %d\n", line4, line5, line6);
            System.out.printf("%d %d %d\n", line7, line8, line9);
            if (line1 == line2 && line2 == line3) {
                points += 10;
                System.out.printf("You win 1-st line, your points - %d", points);
            } else if (line4 == line5 && line5 == line6) {
                points += 50;
                System.out.printf("You win middle line, your points - %d", points);
            } else if (line7 == line8 && line8 == line9) {
                points += 10;
                System.out.printf("You win 3-rd line, your points - %d", points);
            } else if (line1 == line5 && line5 == line9) {
                points += 20;
                System.out.printf("You win by diagonale, your points - %d", points);
            } else if (line3 == line5 && line5 == line7) {
                points += 20;
                System.out.printf("You win by diagoale line, your points - %d", points);
            } else {
                points -= 5;
                System.out.printf("You lose, your points - %d\n", points);
            }
            if (points >= 5) {
                System.out.println("Repet the game? yes or no? ");
            } else {
                System.out.printf("You don't have enough points - %d ", points);
                break;
            }
            repeat = scanner.nextLine();
        } while (repeat.equals("yes") || repeat.equals("y"));
        scanner.close();
    }
}