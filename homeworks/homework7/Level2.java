/**
 * Java Basic. Home work#7
 * 
 * @author Volodymyr
 * @date 26.9.2022
 * @todo 27.9.2022
 * 
 */

//Напишите пожалуйста вкоментариях к домашке мою оценку. Спасибо.
import java.util.Arrays;
import java.util.Random;

public class Level2 {
    
    public static void main(String[] args) {
        Random random = new Random();
        int number = 50000;
        long startTime = System.currentTimeMillis();
        int[] arr = new int[500_000_00];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == number) {
            }
        }
        System.out.printf("I have found number - %d, millis - " + (System.currentTimeMillis() - startTime), number);
        Arrays.sort(arr);
        long binaryFoundTime = System.currentTimeMillis();
        long binTime = System.currentTimeMillis() - binaryFoundTime;
        System.out.printf("\nbinary found was - %d millis", binTime);
    }
    
}
