public class Dog extends Animal implements IAnimal{
    public Dog(String name, String color, int age) {
        super (name, color, age);
    }

    public void setName(String name) {
        if (name != null) {
            this.name = name;
        }
    }

    @Override
    public String voice() {
        return "gaf-gaf";
    }
}
