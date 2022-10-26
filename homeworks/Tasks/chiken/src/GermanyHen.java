public class GermanyHen extends Hen{
    public final String CHICKEN_BREAD =  "Germany Chicken";

    public GermanyHen(String country, int number) {
        super(country, number);
    }

    @Override
    public int getCountOfEggsPerMonth(){
        return getNumber();
    }
}
