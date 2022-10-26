/**
 * Java Basic. Home work#1
 * 
 * @author Volodymyr
 * @version 5.9.2022
 * 
 */

class Lesson3For {
    public static void main(String[] args) {
        int [] arr = new int[7];
        System.out.print("[");
        for(int i = 0; i < arr.length; i++) { //or i+=2 крок в 2 символи або і -=2 і ++ те саме що і = і + 1
            arr[i] = (int) (Math.random() * 10);
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        //call arreyMethod
        int[] arr = {11,22,33,44,55};
        int min = arr[0];
        for (int i = 0; i <arr.length; i++) {
            if (arr [i] < min) {
                min = arr[i];
                break;
            }
        }
        System.out.println(index > -1? "Found" : "Not found");
    }
    static void sorting(String[] args) {
        int[] arr = {22, 1, 3,12, 54, 53, 2};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
    }

    static void printArray(int[] array) {
        System.out.print("[");
        for(int i = 0; i < array.length; i++) { 
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
    }
}