public class Clever extends Student {
    public Clever(String firstName, String lastName, String middleName) {
        super(firstName, lastName, middleName);
    }

    @Override
    public boolean passTheExam(int visitedLections) {
        float chanse = 0;
        if (visitedLections == NUMBER_OF_LECTION) {
            return true;
        } else if (visitedLections >= NUMBER_OF_LECTION/2) {
             chanse = (float) Math.random();
             return chanse >= 0.5;
        } else {
            return false;
        }
    }
}