import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Man man = new Man("Vasya", 100, 10);
        Cat cat = new Cat("Barsik", 50, 15);
        Robot robot = new Robot("Android", 500, 22);
        Wall wall = new Wall(10);
        RaceTrack raceTrack = new RaceTrack(99);
        ArrayList<Barriers> barrierList = new ArrayList<>();
        ArrayList<Members> membersList = new ArrayList<>();
        membersList.add(man);
        membersList.add(cat);
        membersList.add(robot);


    }

    public static void cross(ArrayList<Members> membersArrayList, ArrayList<Barriers> barriersArrayList) {
        for (int i = 0; i < membersArrayList.size(); i++) {
            for (int i1 = 0; i1 < barriersArrayList.size(); i1++) {
                barriersArrayList.get(i1).

            }
        }
    }
}