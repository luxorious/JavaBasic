/**
 * Java Basic. Home work#6
 *
 * @author Volodymyr
 * @date 21.9.2022
 * @todo 4.10.2022
 *
 * закомментированный код – я оставил для себя на будущее, 
 * если захочу что-то изменить или улучшить, 
 * чтобы не писать это все заново.
 */

import java.lang.Thread;
import java.util.*;

class guessTheWords {
    static String[] table = new String[16];
    static String[] guessArray = new String[16];
    static Random random = new Random();
    static Scanner scanner = new Scanner(System.in);
    static String[] words = {"bear", "fork", "wall", "cat", 
    "turkey", "chicken", "pig", "rabit", "egg", "duck", "onion", 
    "flower", "rose", "car", "bike", "point", "lion", "wolf", 
    "pony", "horse", "ant", "bug", "java", "python", "c++", 
    "C#", "rubby", "js", "css", "html", "security", "safe", "agent",
    "agenda", "dor", "pork", "elf", "age", "milk", "case", "pick", "dwarf",
    "Morgot", "flash", "power", "cleen", "rocket", "kefir", "anaconda",
    "Sauron", "ring", "tower", "film", "pork", "meat", "meel", "link",
    "poni", "rain", "snow", "water", "wether", "tree", "pion", "spring",
    "train", "winter", "fall", "summer", "regbie", "polo", "football"};

    public static void main(String[] args) {
        create();
        randomArr();
        while(true) {
            //forTest();
            //System.out.println("___________________");
            showTable();
            turn();
            if (isTableFull()) {
                System.out.println("Сongratulations, you found all the words");
                showTable();
                break;
            }
        }
    }

    static void create() {
        for (int row = 0; row < guessArray.length; row++) {
            guessArray[row] = "     *     ";
            table[row] = "     *     ";
        }
    }

/**    static void forTest() {
        for (int row = 0; row < guessArray.length; row++) {
                System.out.print(guessArray[row] + " ");
                if (row == 3 || row == 7 || row == 11 || row == 15) {
                    System.out.println();
            }
        }
    }
*/

    static void turn() {
        int indexWord1, indexWword2;
        do {
            int counter = 0;
            System.out.print("Enter number of first word - 1-16\n");
            indexWord1 = scanner.nextInt() - 1;
            System.out.print("Enter number of second word - 1 - 16\n");
            indexWword2 = scanner.nextInt() - 1;
            System.out.println("first word " + table[indexWord1]);
            System.out.println("second word" + table[indexWword2]);
            transformation(indexWord1, indexWword2);
        } while (isValid(indexWord1, indexWword2));
    }

    static boolean isValid(int x, int y) {
        if (x < 0 || y < 0 || x > 16 || y > 16) {
            return false;
        } else {
            return true;
        }
    }

    static void transformation(int indexWord1, int indexWword2) {
        String word1 = guessArray[indexWord1];
        String word2 = guessArray[indexWword2];
        for (int i = 0; i < table.length; i++) {
            if (word1 == table[i] || word2 == table[i]) {
                System.out.println("You already guessed the word - " + table[i]);
                return;
            }
        }
        if (word1.equals(word2)) {
            table[indexWord1] = word1;
            table[indexWword2] = word2;
        } else {
            table[indexWord1] = guessArray[indexWord1];
            table[indexWword2] = guessArray[indexWword2];
            showTable();
            try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                      Thread.currentThread().interrupt();
                }

            table[indexWord1] = "     *     ";
            table[indexWword2] = "     *     ";
            for (int i = 0; i < 100; i++) {
                System.out.println();
            }
            showTable();
        }
    }

    static void showTable() {
        System.out.println("Gess 2 words, just enter the number of cell");
        for (int row = 0; row < table.length; row++) {
                System.out.print(table[row] + " ");
                if (row == 3 || row == 7 || row == 11 || row == 15) {
                    System.out.println();
            }
        }
    }

    static void randomArr() {
        int a = 0;
        int row = 0;
        do {
            int wordIndex = random.nextInt(words.length);
            String word = words[wordIndex];
            if (checkWord(word)) {
                //System.out.println("oops..");
                continue;
            } 
            if (guessArray[row].equals("     *     ")) {
                guessArray[row] = word;
                guessArray[row + 1] = word;
                //System.out.println("position " + row + word);
                a += 1;
            //} else {
                //System.out.println("alredy added");
            }
            row +=1;
        } while(a < 8);
        mixArr(guessArray);
    }

    static void mixArr(String[] array) {
        Collections.shuffle(Arrays.asList(array));
    }

    static boolean isTableFull() {
        for (int i = 0; i < 16; i++) {
            if (table[i].equals("     *     ")) {
                return false;
            }
        }
        return true;
    }

    static boolean checkWord(String word) {
        for (int i = 0; i < guessArray.length; i++) {
            if (guessArray[i].equals(word)) {
                return true;
            }
        }
        return false;
    }
}