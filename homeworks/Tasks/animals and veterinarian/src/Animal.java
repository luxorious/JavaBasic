public class Animal {
    private String name;
    private int age;
    private String food;
    private String location;

    public Animal(String name, int age, String food, String location) {
        this.name = name;
        this.age = age;
        this.food = food;
        this.location = location;
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    public boolean sleep() {
        return true;
    }

    public String makeNoise() {
        return getName() + " спит";
    }

    public String location() {
        return getLocation();
    }

    public String eat() {
        return getName() + "have eat";
    }

    public String getLocation() {
        return location;
    }

    public String getFood() {
        return food;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
