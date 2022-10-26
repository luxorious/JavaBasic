/**
 * Java Basic. Home work#9
 *
 * @author Volodymyr
 * @date 5.10.2022
 * @todo 10.10.2022
 *
 */

import java.util.Random;

public class Initialization {
    public static void main(String[] args) {
        int animalsQuantity = 0;
        int catsQuantity = 0;
        int dogsQuantity = 0;

        Random randomBarrierRun = new Random();
        Random randomBarrierSwim = new Random();
        Animal baks = new Cat("Baks");
        Animal pushok = new Cat("Pushok");
        Animal ryzhyk = new Cat("Ryzhyk");
        Animal markiz = new Cat("Markiz");

        Animal bobik = new Dog("Bobik");
        Animal palkan = new Dog("Palkan");
        Animal sharik = new Dog("Sharik");

        Animal [] animals = {baks, bobik, pushok, ryzhyk,
                palkan, sharik, markiz};
        for (Animal animal: animals) {
            animal.swim(randomBarrierSwim.nextInt(15));
            animal.run(randomBarrierRun.nextInt(600));
            if (animal instanceof Cat) {
                catsQuantity++;
            } else {
                dogsQuantity +=1;
            }
            animalsQuantity ++;
        }

        System.out.println("the numbers of animals - " + animalsQuantity);
        System.out.println("the numbers of cats - " + catsQuantity);
        System.out.println("the numbers of dogs - " + dogsQuantity);
    }
}