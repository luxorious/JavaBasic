import java.util.Random;

public class Main {
    private static Random random = new Random();
    public static void main(String[] args) {
        Genius ivan = new Genius("Ivan", "Sternrnko", "Petrovych");

        Student petro = new Clever("PETRO", "IVANENKO", "OLEKSIOVYCH");
        Clever mykyta = new Clever("Mykyta", "Milo","Havrylovych");
        Clever john = new Clever("John", "Kindrat", "Romanovych");
        Clever vika = new Clever("Victoria", "Dovha", "Ivanivna");

        Ordinary hrystyna = new Ordinary("Hrystyna", "Baranetska", "olehivna");
        Ordinary dima = new Ordinary("Dmytro", "Yankovski", "Hryhorovych");
        Ordinary vitalii = new Ordinary("Vitalii", "Kropyvus", "Ivanovych");
        Ordinary myhailo = new Ordinary("Myhailo", "Malyi", "Ivanovych");
        Ordinary iryna = new Ordinary("Iryna", "Kinolog", "oleksandrivna");

        Student[] group102 = {ivan,iryna, dima, myhailo, petro, john,
                hrystyna, vika, vitalii, mykyta};

        for (Student studet : group102) {
            System.out.print(studet.getFirstName() + " : ");
            System.out.println(studet.passTheExam(random.nextInt(21)));
        }
    }
}