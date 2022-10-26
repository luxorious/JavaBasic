public class Dog extends Animal{
    final String MAMMALS = "Dog";
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public String makeNoise() {
        return super.makeNoise();
    }

    public Dog(String name, int age, String food, String location) {
        super(name, age, food, location);
    }

    @Override
    public String eat() {
        return super.eat();
    }
}
