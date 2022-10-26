public class Cat extends Animal{
    public final int RUN = 200;

    public Cat(String name) {
        super(name);
    }

    @Override
    public void run(int objectDistanceRun) {
        if (objectDistanceRun > RUN) {
            super.run(objectDistanceRun);
        } else {
            System.out.println(name + " successfully ran distance - "
                    + objectDistanceRun + "m.");        }
    }

    @Override
    public void swim(int objectDistanceSwim) {
        System.out.println(name + " can not swim");
    }
}
