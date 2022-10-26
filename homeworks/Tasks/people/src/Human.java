import java.util.Random;

public class Human implements I3Aclass {
    private String typeHuman;
    private String name;
    private int age;
    private Random random = new Random();

    public String getName() {
        return name;
    }

    public String getTypeHuman() {
        return typeHuman;
    }

    public int getAge() {
        return age;
    }

    public Human(String typeHuman, String name) {
        this.typeHuman = typeHuman;
        this.name = name;
        age = random.nextInt(20, 40);
    }
    @Override
    public String helloAll(Person person) {
        int dif = getAge() - person.getAge();
        int dif1 = person.getAge() - getAge();
        switch (getTypeHuman()) {
            case "Неформал":
                return getName() + ": Привет, " + person.getName();
            case "Формалист":
                return getName() + ": Здравствуй, " + person.getName();
            case "Реалист":
                if (dif >= 0 && dif <= 5 || dif1 >= 0 && dif1 <= 5) {
                    return getName() + ": Привет " + person.getName();
                } else {
                    return getName() + ": Здравствуй " + person.getName();
                }
        }
        return name;
    }

    @Override
    public String aboutMySelf() {
        if (age == 21 || age == 31) {
            return "Меня зовут " + name + " мой возраст " + age +
                    " год, и Я - " + typeHuman;
        } else if (age == 22 || age == 23 || age == 24 ||
                   age == 32 || age == 33 || age == 34) {
            return "Меня зовут " + name + " мой возраст " + age +
                    " года, и Я - " + typeHuman;
        }else {
            return "Меня зовут " + name + " мой возраст " + age +
                    " лет, и Я - " + typeHuman;
        }
    }
}