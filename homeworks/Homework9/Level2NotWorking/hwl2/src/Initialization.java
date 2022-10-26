/**
 * Java Basic. Home work#9
 *
 * @author Volodymyr
 * @date 5.10.2022
 * @todo 10.10.2022
 *
 * можно ли как то подсчитать количество кошек и собак?
 */

import java.util.Random;

public class Initialization {
    public static void main(String[] args) {
        int animalsQuantity = 0;
        Random randomBarrierRun = new Random();
        Random randomBarrierSwim = new Random();
        Animal baks = new Cat("Baks");
        Animal pushok = new Cat("Pushok");
        Animal ryzhyk = new Cat("Ryzhyk");

        Animal bobik = new Dog("Bobik");
        Animal palkan = new Dog("Palkan");
        Animal sharik = new Dog("Sharik");

        Animal [] animals = {baks, bobik, pushok, ryzhyk, palkan, sharik};
        for (Animal animal: animals) {
            animal.swim(randomBarrierSwim.nextInt(600));
            animal.run(randomBarrierRun.nextInt(15));
            animalsQuantity ++;
        }
        System.out.println("the numbers of animals - " + animalsQuantity);
    }
}