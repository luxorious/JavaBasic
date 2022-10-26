/**
 * Java Basic. Home work2 Level1
 * 
 * @author Volodymyr
 * @todo 08.09.2022 // коли задано ДЗ
 * @date 11.09.2022
 * @edited 11.09.2022
 */

//Напишите пожалуйста в коментариях к ДЗ на скилдеск какая у меня оценка, Спасибо

class Level1And2 {
    public static void main(String[] args) {
        //Task1 
        checkWeather(-15);
        checkWeather(11);
        checkWeather(22);
        checkWeather(31);
        //Task2
        canWalk(true, true);
        canWalk(false, true);
        canWalk(true, false);
        //Task3
        add(2,8);
        sub(30,9);
        mult(12,10);
        div(15.54,5);
        add(11,5);
        //Task4
        dayOfWeek(11);
        dayOfWeek(3);
        dayOfWeek(7);
        //Task5
        canBuyFood(true, false);
        canBuyFood(false,false);
        canBuyFood(false, true);
        canBuyFood(true,true);
        //Task6
        quadraticEquation(0, 11, 22);
        quadraticEquation(4, -3, 1);
        quadraticEquation(1, 3, 1);
        //task2andre
        canWalk2(true, false);
        canWalk2(false, true);
        canWalk2(true, true);
    }

    //Task 1
    static String checkWeather(int t) {
        String text;
        if (t < 0) {
            text = "%d - it's frost\n";
        } else if (t <= 18) {
            text = "%d - it's cold\n";
        } else if (t <= 28) {
            text = "%d - It's warm\n";
        }else {
            text = "%d - it's hot\n";
        }
        System.out.printf(text, t);
        return text;

    }
    //Task2
    static boolean canWalk(boolean isWeekend, boolean isRain) {
        boolean iCanWalk =  false;
        if (isWeekend && isRain) {
            //я Читал в JCC что такой код допустим, но до конца не уверен, 
            //что я все верно понял, можно так оставить,
            //или лучше вировнять перенос по System.out.print? 
            //спасибо за коментарий
            System.out.print("You can not walk, because the wether is not " +
                            "good even if today weekend\n");
            iCanWalk =  false;
        } else if (isWeekend & isRain == false) {
            System.out.print("You can walk, because the wether is fine" +
            " and today weekend\n");
            iCanWalk =  true;
        } else {
            System.out.print("You can not wolk\n");
            iCanWalk =  false;
        }
        return iCanWalk;
    }
    //Task2andre
    static boolean canWalk2(boolean isWeekend2, boolean isRain2) {
        System.out.println(isWeekend2 & isRain2 == false? "You can walk" : "You can not walk");
        return true;//How to return true or false????
    }
    //Task3
    static int add(int a, int b) {
        int c = a + b;
        return c;
    }
    static int sub(int a, int b) {
        int c = a - b;
                return c;
    }
    static int mult(int a, int b) {
        int c = a * b;
        return c;
    }
    static double div(double a, double b) {
        double c = a / b;
        return c;
    }
    //Taskr4
    static String dayOfWeek(int day) {
        String dayOfWeek;
        switch (day) {
            case 1:
                dayOfWeek = "Monday";
                break;
            case 2:
                dayOfWeek = "Tuesday";
                break;
            case 3:
                dayOfWeek = "Wednesday";
                break;
            case 4:
                dayOfWeek = "Thursday";
                break;
            case 5:
                dayOfWeek = "Friday";
                break;
            case 6:
                dayOfWeek = "Saturday";
                break;
            case 7:
                dayOfWeek = "Sunday";
                break;
            default:
                dayOfWeek = "The week has only 7 days!";
        }
        System.out.println(dayOfWeek);
        return dayOfWeek;
    }
    //Task5
    static boolean canBuyFood(boolean isLidlOpen,boolean isTescoOpen) {
        boolean isOpen = true;
        if (isLidlOpen && isTescoOpen) {
            System.out.print("I can buy food in Lidl or Tesco\n");
        } else if (isLidlOpen) {
            System.out.println("I can buy food in Lidl");
        } else if (isTescoOpen){
            System.out.print("I can buy food in Tesco\n");
        } else {
            System.out.println("I can’t buy food");
            isOpen = false;
        }
        return isOpen;
    }
    //Task6
    static void quadraticEquation(int a, int b, int c) {
        if (a == 0) {
            System.out.println("Error! in quadratic Equation a!=0!");
        } else {
            int d;
            double x1, x2;
            d = b * b - 4 * a * c;
            x1 = (-b + Math.sqrt(d)) / (2 *a);
            x2 = (-b - Math.sqrt(d)) / (2 *a);
            if (d > 0) {
                System.out.printf("the equation has 2 different roots:" + 
                "\nx1 = %.3f, \nx2 = %.3f\n",x1, x2);
            } else if (d == 0) {
                System.out.printf("the equation has two equal roots:\n" + 
                "x1 = x2 = %.3f\n", x1);
            } else {
                System.out.printf("D = %d - the equation has no real roots\n", d);
            }
        }
    }
}
