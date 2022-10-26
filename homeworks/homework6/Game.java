/**
 * Java Basic. Home work#6
 * 
 * @author Volodymyr
 * @date 21.9.2022
 * @todo .9.2022
 * 
 */

import java.util.Arrays;
import java.lang.Thread;
import java.util.Random;
import java.util.Scanner;

class Game {
    static String[] [] table = new String[4] [4];
    static String[] [] guessArray = new String[4] [4];
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
        //showTable();
        while(true) {
            turn();
            if (win()) {
                System.out.println("You opened all words");
                break;
            }
        }
    }

    static void create() {
        for (int row = 0; row < 4; row++) {
            for (int column = 0; column < 4; column++) {
                table[row] [column] = " * ";
                guessArray[row] [column] = " * ";
            }
        }
    }

    static void turn() {
        int x, y, x1, y1;
        do {
            int counter = 0;
            System.out.print("Enter coordinates first word x and y - 1-4");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
            System.out.print("Enter coordinates second word x and y - 1-4");
            x1 = scanner.nextInt() - 1;
            y1 = scanner.nextInt() - 1;
            System.out.println("first word " + table[y] [x]);
            System.out.println("second word" + table[y1] [x1]);

            if (table[y] [x].equals(table[y1] [x1])) {
                changeWord();
                showTable();

            } else {
                //wait 5 sec. and clear display, because user can see position all words
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                      Thread.currentThread().interrupt();
                }
                while (counter < 10) {
                    System.out.println("");
                    counter += 1;
                }
            }
        } while (!fieldFill(x, y, x1, y1));
    }

    static boolean fieldFill(int x, int y, int x1, int y1) {
        if (x < 0 || y < 0 || x > 3 || y > 3 || x1 < 0 || y1 < 0 || x1 > 3 || y1 > 3) {
            return false;
        } else {
            return true;
        }
    }
    static void showTable() {
        for (int row = 0; row < table.length; row++) {
            for (int column = 0; column < table[row].length; column++ ){
                //System.out.print(table[row][column] + " ");
                System.out.print(guessArray[row] [column] + " ");
            }
            System.out.println();
        }
    }

    static void changeWord() {

    }

    static void randomArr() {
        int a = 0;
        int l = 0;
        do {
            int wordIndex = random.nextInt(words.length);
            int row = random.nextInt(4);
            int column = random.nextInt(4);
            //int row1 = random.nextInt(4);
            //int column1 = random.nextInt(4);
            String word = words[wordIndex];
            if (checkWord(word)) {//(Arrays.asList(guessArray).contains(word)) {
                System.out.println("oops..");
                //l+=1;
                //if (lastWord()) {

                //}
                
            } 
            if (guessArray[column] [row].equals(" * ")){
                //System.out.println(word + "123");
                guessArray[column] [row] = word;
                System.out.println("row " + row + column);
                a += 1;
            } else {
                //System.out.println("alredy added");
                continue;
            }
        } while(a < 8);
        showTable();
        dublicatWord();
        System.out.println("__________");
        showTable();
    }
    static void dublicatWord() {
        String wordForChange = "";
        for (int row = 0; row < guessArray.length; row++) {
            for (int column = 0; column < guessArray[row].length; column++ ){

                if (!guessArray[row] [column].equals(" * ")) {
                    if (!checkWord(wordForChange)) {
                        guessArray[row] [column] = wordForChange;
                        continue;
                    }
                    wordForChange = guessArray[row] [column];
                    continue;
                } else {
                    if (checkWord(wordForChange)) {
                        guessArray[row] [column] = wordForChange;
                        continue;
                    }

                }
                //wordForChange = guessArray[row] [column];
            }
        }
    }

    static void lastWord() {
        int counter = guessArray.length;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++ ){
                if (table[i] [j].equals(" * ")) {
                    counter -= 2;
                }
            }
        }
    }
    static boolean checkWord(String word) {
        for (int i = 0; i < guessArray.length; i++) {
            for (int j = 0; j < guessArray[i].length; j++){
                if (guessArray[i] [j].equals(word)) {
                    return true;
                }
            }
        }
        return false;
    }

    static boolean isTableFull() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++ ){
                if (table[i] [j].equals(" * ")) {
                    return false;
                }
            }
        }
        return false;
    }

    static boolean win() {
        return true;
    }
}