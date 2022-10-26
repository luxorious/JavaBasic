import java.util.Random;

public class Main {
    public static final String NEFORMAL = "Неформал";
    public static final String FORMAL= "Формалист";
    public static final String REALIST = "Реалист";

    public static void main(String[] args) {
        Random random = new Random();
        String[] names = {"Александр", "Андрей", "Анастасия", "Ирина",
                        "Наталья", "Павел", "Роман", "Светлана"};
        String[] typeOfHumans = {NEFORMAL, FORMAL, REALIST};

        Person name1 = new Person(typeOfHumans[random.nextInt(typeOfHumans.length)],
                names[random.nextInt(names.length)]);
        Person name2 = new Person(typeOfHumans[random.nextInt(typeOfHumans.length)],
                names[random.nextInt(names.length)]);
        Person name3 = new Person(typeOfHumans[random.nextInt(typeOfHumans.length)],
                names[random.nextInt(names.length)]);
        Person name4 = new Person(typeOfHumans[random.nextInt(typeOfHumans.length)],
                names[random.nextInt(names.length)]);
        Person name5 = new Person(typeOfHumans[random.nextInt(typeOfHumans.length)],
                names[random.nextInt(names.length)]);

        Person[] people = {name1, name2, name3, name4, name5};

        for (int i = 0; i < people.length; i++) {
        System.out.println(people[i].aboutMySelf());
            for (int p = 1; p < people.length; p++) {
                if (i == p) {
                    continue;
                } else if (i > p) {
                    continue;
                } else {
                    System.out.println(people[i].helloAll(people[p]));
                    System.out.println(people[p].helloAll(people[i]));
                    System.out.println();
                }
            }


            //System.out.println(people[i].aboutMySelf());
        }
    }
}