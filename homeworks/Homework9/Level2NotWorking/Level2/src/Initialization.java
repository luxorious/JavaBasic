public class Initialization {
    public static void main(String[] args) {
        Man man = new Man(100, 10);
        Cat cat = new Cat();
        Robot robot = new Robot();
        Wall wall = new Wall(10);
        //RunningTrack runningTrack = new RunningTrack(101);

        //System.out.println("Man" + runningTrack.run(man.getDistance()));
        System.out.println("Man" + wall.jump(man.getHeigt()));

    }
}
