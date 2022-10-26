public abstract class Hen {
    public final String CHICKEN_BREAD = null;

    private String country;
    private int number;

    public Hen(String country, int number) {
        this.country = country;
        this.number = number;
    }

    public abstract int getCountOfEggsPerMonth();


    public String getDescription() {
        return " Моя страна - " + country +". Я несу " + number + "яиц в месяц.";
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
