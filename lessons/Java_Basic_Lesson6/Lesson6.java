/**
 * Java Basic. Home work#1
 * 
 * @author Volodymyr
 * @version 5.9.2022
 * 
 */
import java.lang.Thread;
import java.util.Random;
import java.util.Scanner;

class Lesson6 {
    public static void main(String[] args) {
        int [] [] matrix = {{1,2,3}, {4,5,6}, {7,8,9}};//or new int[3][3]
        String[] [] arr = {{"iva", "ilo"}, {"iva", "io", "olo"}};
        for (int i = 0; i < matrix.length; i++) {
            //int[] row = matrix[i];
            for (int j = 0; j < matrix[i].length; j++ ){
                try {
                      Thread.sleep(1000);
                    } catch (InterruptedException e) {
                      Thread.currentThread().interrupt();
                    }
                System.out.print(matrix[i][j] + " ");
            }

            System.out.println();
        }
    //System.out.println(matrix[1] [1]);
        if (arr[0][0].equals(arr[1][0])) {
            System.out.println("holaa");
        }
    }
}