public class HenFactory extends Hen{
    public HenFactory(String country, int number) {
        super(country, number);
    }

    public String getHen(Object o) {
        return CHICKEN_BREAD;
    }

    @Override
    public int getCountOfEggsPerMonth() {
        return 0;
    }
}
