/**
 * Java Basic. Home work#1
 * 
 * @author Volodymyr
 * @version 5.9.2022
 * 
 */

import java.util.Random;
import java.util.Scanner;

class Lesson5 {
    public static void main(String[] args) {
        String s = "Hello";
        //String str = new Srting("Hello");
        String str1 = " Java";
        System.out.println(s.concat(str1));
        System.out.println(s.contains(str1));
        System.out.println(s.indexOf("H"));
        System.out.println(s.equalsIgnoreCase("hELLO"));
        System.out.println(s.substring(1,3));
        //toLowerCase, toUpperCase, compareTo
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
        }
    }
}