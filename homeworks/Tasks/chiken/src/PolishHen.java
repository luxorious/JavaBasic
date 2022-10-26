public class PolishHen extends Hen{
    public final String CHICKEN_BREAD = "Polish Chicken";

    public PolishHen(String country, int number) {
        super(country, number);
    }

    @Override
    public int getCountOfEggsPerMonth() {
        return 400;
    }
}
