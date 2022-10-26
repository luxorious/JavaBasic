/**
 * Java Basic. Home work2 Level1
 * 
 * @author Volodymyr
 * @todo 12.09.2022
 * @date 16.09.2022
 */

//Напишите пожалуйста в коментариях к ДЗ на скилдеск какая у меня оценка, Спасибо
import java.util.Random;

class HomeWork3 {
    public static void main(String[] args) {
        Random random = new Random();
        int arr [] = new int [10];
        int arr2[] = new int [20];
        //int arr3[] = {2,1,4,5,1,2,4};
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
            arr2[i] = random.nextInt(2);
        }
        //Task1
        System.out.println("Task 1");
        printArray(arr);
        //Task2
        System.out.println("Task 2");
        System.out.println(getMax(arr));
        //Task3
        System.out.println("Task 3");
        printArray(invertArray(arr2));
        //Task4
        //System.out.println("Task 1")
        //printArray(sortArrey(arr3));
    }
    //Task1
    static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println("]");
    }

    //Task2
    static int getMax(int[] array) {
        int arrayMax = array[0];
        for (int i = 0; i < array.length; i++) {
            if (arrayMax < array[i]) {
                arrayMax = array[i];
            }
        }
        return arrayMax;
    }

    //Task3
    static int[] invertArray(int[] array) {
        int[] invert = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                invert[i] = 0;
            } else {
                invert[i] = 1;
            }
        }
        return invert;
    }
}