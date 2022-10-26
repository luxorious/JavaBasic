public class Dog extends Animal {
    public final int DOG_RUN = 500;
    public final int DOG_SWIM = 10;

    public Dog(String name) {
        super(name);
    }

    @Override
    public void run(int objectDistanceRun) {
        if (objectDistanceRun <= DOG_RUN) {
            System.out.println(name + " successfully ran distance - "
                    + objectDistanceRun + "m.");
        } else {
            super.run(objectDistanceRun);
        }
    }

    @Override
    public void swim(int objectDistanceSwim) {
        if (objectDistanceSwim <= DOG_SWIM) {
            System.out.println(name + " successfully swam distance - "
                    + objectDistanceSwim  + "m.");
        } else {
            super.swim(objectDistanceSwim);
        }
    }
}
