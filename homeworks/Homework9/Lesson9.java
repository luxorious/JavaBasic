/**
 * Java Basic. Home work#9
 *
 * @author Volodymyr
 * @date 5.10.2022
 * @todo 5.10.2022
 *
 */


public class Lesson9 {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", "red", 2);
        Dog dog = new Dog("pes", "white", 1);
        IAnimal[] animals = {cat, dog};

        for (IAnimal animal: animals ) {
            System.out.println(animal);
            System.out.println(animal.voice());
        }
        //cat.name = null;
        //cat.setName(null);
        //System.out.println(cat);
        //System.out.println(cat.voice());
        //cat.name = null;
        //cat.setName(null);
        //System.out.println(cat);
        //System.out.println(cat.voice());
    }
}
