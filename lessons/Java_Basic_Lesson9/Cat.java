public class Cat extends Animal implements IAnimal {
    public Cat(String name, String color, int age) {
        super (name, color, age);
    }


    public void setName(String name) {
        if (name != null) {
            this.name = name;
        }
    }

    @Override
    public String voice() {
        return "meow";
    }
}
