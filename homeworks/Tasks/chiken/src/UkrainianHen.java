public class UkrainianHen extends Hen{
    public final String CHICKEN_BREAD = "Ukrainian Chicken";

    public UkrainianHen(String country, int number) {
        super(country, number);
    }

    @Override
    public int getCountOfEggsPerMonth() {
        return 500;
    }
}
