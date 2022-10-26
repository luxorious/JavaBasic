import java.awt.*;

public class Ball {
    private int x;
    private int y;
    private int d;

    private Color color;

    public Ball() {
    }

    public Ball(int x, int y, int d, Color color) {
        this.x = x;
        this.y = y;
        this.d = d;
        this.color = color;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getD() {
        return d;
    }

    public Color getColor() {
        return color;
    }

    public boolean isInBall(int x, int y) {
        int centx = this.x + d/2;
        int centy = this.y + d/2;
        int distance =(int) Math.sqrt(Math.pow(centx - x, 2) + Math.pow(centy - y, 2));
        return distance <= d/2;
    }

    public void paint(Graphics g) {
        g.setColor(color);
        g.fillOval(x, y, d, d);
        g.setColor(Color.black);
        g.drawOval(x, y, d, d);
    }
}