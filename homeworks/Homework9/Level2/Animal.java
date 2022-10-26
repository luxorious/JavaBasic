public class Animal {
    protected String name;
    public Animal(String name) {
        this.name = name;
    }

    public void run(int objectDistanceRun) {
        System.out.println(name + " can not run " +
                objectDistanceRun + "m. too big distance...");
    }

    public void swim(int objectDistanceSwim) {
        if (objectDistanceSwim <= 0) {
            System.out.println("wrong distance");
        } else {
            System.out.println(objectDistanceSwim + "" +
                    "m. The distance is too longer " + name + " drowned :( ");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
