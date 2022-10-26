/**
 * Java Basic. Home work4 Level1
 * 
 * @author Volodymyr
 * @todo 14.09.2022
 * @date 17.09.2022
 */

import java.util.Random;
import java.util.Scanner;

//Укажите пожалуйста оценку за дз
class HomeWork4 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int input = -1;
        String repeat = "";

        do {
            int seecretNumber = random.nextInt(10);
            for (int i = 0; i < 3; i++) {
                System.out.println("enter your number");
                input = scanner.nextInt();
                scanner.nextLine();
                if (input == seecretNumber) {
                    System.out.println("congratulate you WINN");
                    break;
                } else if (input > seecretNumber) {
                    System.out.println("My nnumber is less");
                } else if (input < seecretNumber) {
                    System.out.println("My number is bigger");
                }
            }
            if (input != seecretNumber) {
                System.out.printf("You lose, my number was %d \n", seecretNumber);
            }
            System.out.println("Repet the game? yes or no? ");
            
            repeat = scanner.nextLine();
        } while (repeat.equals("yes") || repeat.equals("y"));
        scanner.close(); //Для чего нужно закривать сканер после завершения цикла?
                        //просто нашел на форуме пример, и там после завершения цикла закривают сканер.
                        //но не поясняеться для чего
    }
}