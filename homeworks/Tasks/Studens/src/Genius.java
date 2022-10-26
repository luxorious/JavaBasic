public class Genius extends Student {

    public Genius(String firstName, String lastName, String middleName) {
        super(firstName, lastName, middleName);
    }

    @Override
    public boolean passTheExam(int visitedLections) {
        return visitedLections >= 1;
    }
}