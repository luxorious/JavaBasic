/**
 * Java Basic. Home work#11
 *
 * @author Volodymyr
 * @date 12.10.2022
 * @todo 12.10.2022
 *
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Lesson11 extends JFrame {
    final int CANVAS_WIDTH = 600;
    final int CANVAS_HEIGHT = 500;
    final int DX = 100;
    int x, y , dx;
    ImageIcon image;
    Color color;
    List<Ball> balls;

    private Random random = new Random();
    final private Color COLORS[] = {Color.red, Color.green, Color.blue, Color.black};

    public static void main(String[] args) {
        new Lesson11();
    }

    public Lesson11() {
        Ball ball = new Ball();
        setTitle("Hello Swing");//Заголовок
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//поведінка вікна при закритті вікна, почитати детальніше

        CanvasPanel canvasPanel = new CanvasPanel();
        canvasPanel.setPreferredSize(new Dimension(CANVAS_WIDTH, CANVAS_HEIGHT));
        canvasPanel.setBackground(Color.white);

        initsBalls();
        //image = new ImageIcon("file.png");

        //прочитать о лямбда виражениях

        canvasPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent event) {
                super.mouseReleased(event);
                System.out.println(event.getX() + " : " + event.getY());
                x = event.getX();
                y = event.getY();
                canvasPanel.repaint();
                }
            });
        randomXYColor();

        Button repaint = new Button("Repaint");//change to constant
            repaint.addActionListener(e -> {//обработчик ожиданий
            System.out.println("Repaint");
            randomXYColor();
            canvasPanel.repaint();
        });

//        Button left = new Button("Left");
//        left.addActionListener(e -> {
//            x-=5;
//            canvasPanel.repaint();
//        });
//        Button right = new Button("Right");
//        right.addActionListener(e -> {
//            x+=5;
//            canvasPanel.repaint();
//        });

        Button exit = new Button("Exit");
        exit.addActionListener(e -> System.exit(0));

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(repaint);
        buttonPanel.add(exit);
//        buttonPanel.add(left);
//        buttonPanel.add(right);

        add(canvasPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);
        pack();
        setLocationRelativeTo(null); //window position
        setVisible(true);//set window visible
    }

    public boolean isInBall(){
        return true;
    }

    private void initsBalls() {
        balls = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            Color color = COLORS[random.nextInt(COLORS.length)];
            int d = random.nextInt(100);
            int x = random.nextInt(CANVAS_WIDTH - d);
            int y = random.nextInt(CANVAS_HEIGHT - d);
            balls.add(new Ball(x, y, d, color));
        }
    }

    private void randomXYColor() {
        color = COLORS[random.nextInt(COLORS.length)];
        x = random.nextInt(CANVAS_WIDTH - DX);
        y = random.nextInt(CANVAS_WIDTH - DX);
        dx = DX;
    }
    private class CanvasPanel extends JPanel {
        @Override
        public void paint(Graphics g) {
            super.paint(g);
            for (Ball ball : balls) {
                ball.paint(g);
            }
            //g.drawImage(image.getImage(), x, y, dx, dx,null);
        }
    }
}