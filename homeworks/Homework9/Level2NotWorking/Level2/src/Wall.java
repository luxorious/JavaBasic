public class Wall {
    int wallHeight;

    public Wall(int wallHeight) {
        this.wallHeight = wallHeight;
    }

    public boolean jump(int height) {
        if (height <= wallHeight) {
            System.out.println(" перепригнул стену!");
            return true;
        } else {
            System.out.println("стена слишком високая - не смог перепригнуть!");
            return false;
        }
    }
}
