public class MoldovanHen extends Hen{
    public final String CHICKEN_BREAD =  "Moldova Chicken";
    public MoldovanHen(String country, int number) {
        super(country, number);
    }

    @Override
    public int getCountOfEggsPerMonth() {
        return getNumber();
    }
}
