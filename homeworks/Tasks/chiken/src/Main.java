import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Hen ge = new GermanyHen("Germany", random.nextInt(500));
        Hen mo = new MoldovanHen("Moldova", random.nextInt(500));
        Hen po = new PolishHen("Polish", random.nextInt(500));
        Hen ua = new UkrainianHen("Ukraine", random.nextInt(500));

        Hen[] chickens = {ge, mo, po, ua};
        for (Hen chicken: chickens) {
            System.out.println(chicken.getDescription());
        }
    }
}