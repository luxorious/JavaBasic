public class Cat extends Animal{
    public final int RUN = 200;

    public Cat(String name) {
        super(name);
    }

    @Override
    public void run(int objectDistanceRun) {
        if (objectDistanceRun > RUN) {
            System.out.println("too big distance for " + name);
        } else {
            super.run(objectDistanceRun);
        }
    }

    @Override
    public void swim(int objectDistanceSwim) {
        System.out.println(name + " can not swim");
    }
}
