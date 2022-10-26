/**
 * Java Basic. Home work#5
 * 
 * @author Volodymyr
 * @date 19.9.2022
 * @todo 19.9.2022
 * 
 */

import java.util.Random;
import java.util.Scanner;

class Game {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        String[] words = {"wood", "bear", "beer", "food", "foot", "boot", "root"};
        String word = words[random.nextInt(words.length)];
        //String word = "door";
        char[] mask = {'*', '*', '*', '*'};
        int counter = 0;
        int letterCounter = 0;
        System.out.print("Gess the mask:\n" + new String(mask));

        do {
            counter++;
            char letter = scanner.next().charAt(0);
            for (int i = 0; i < word.length(); i++) {
                if (letter == word.charAt(i)) {
                    mask[i] = letter;
                    letterCounter++;
                    System.out.println(mask);
                }
            }
        } while (letterCounter < word.length()); 

        System.out.println("You gess the word [" + word + "], attempts: " + counter);
    }
}