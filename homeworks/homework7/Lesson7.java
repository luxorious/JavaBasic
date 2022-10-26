/**
 * Java Basic. Home work#7
 * 
 * @author Volodymyr
 * @date 26.9.2022
 * @todo 26.9.2022
 * 
 */

//import sun.awt.geom.AreaOp; - почему intelig idea  
//импортирует етот класс? он же нигде не испольщуеться?

import java.util.*;

public class Lesson7 {
    public static void main(String[] args) {
        //part of lottery Game
        List<Integer> lottery = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            lottery.add(i + 1);
        }
        //shuffle
        Collections.shuffle(lottery);
        System.out.println(lottery.subList(0,10));

        System.out.println("Generate Array");
        generateArray(10);
        System.out.println("showCollections");
        showCollections();
        System.out.println("show Arrays");
        showArrays();
        System.out.println("show array List");
        showArrayList();
        System.out.println("show map");
        showMap();
    }
    static int[] generateArray(int length) {
        int[] result = new int[length];
        for (int i = 0; i < result.length; i++) {
            result[i] = (int) (Math.random() * 20);
        }
        return result;
    }
    static void showCollections() {
        List<Integer> aarayList= new ArrayList<>();
        aarayList.addAll(Arrays.asList(6, 8, 5, 4, 3, 1, 2));
        System.out.println(aarayList);
        Collections.sort(aarayList);
        System.out.println(aarayList);
        System.out.println(Collections.max(aarayList));
        System.out.println(Collections.min(aarayList));

        System.out.println();
    }

    static void showArrays() {
        System.out.println("Hello");
        int[] arr = generateArray(25);
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int found = Arrays.binarySearch(arr, 8);
        System.out.println(found + ": " + arr[found]);

    }
    static void showArrayList(){
        int p = 100;
        Integer pp = p;
        Integer i = 50;
        List<Integer> aarayList= new ArrayList<>();
        aarayList.add(5);
        aarayList.add(8);
        aarayList.addAll(Arrays.asList(4,3,2,1));
        System.out.println(aarayList);
        System.out.println(aarayList.get(1));//recive element vith index 1
        aarayList.add(2,Integer.valueOf(12));
        System.out.println(aarayList);
        aarayList.remove(4);
        System.out.println((aarayList));
        for (Integer a : aarayList) {
            System.out.println(a);
        }
    }
    static void showMap() {
        Map<Integer, String> daysMap = new HashMap<>();
        daysMap.put(1, "Monday");
        daysMap.put(2, "Tuesday");
        System.out.println(daysMap);
        System.out.println(daysMap.get(1));
    }
}
