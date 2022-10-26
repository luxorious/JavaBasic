/**
 * Java Basic. Home work#6
 *
 * @author Volodymyr
 * @date 10.10.2022
 * @todo 10.10.2022
 *
 */

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Lesson10 extends JFrame {
    private Random random = new Random();
    final private Color COLORS[] = {Color.red, Color.green, Color.blue, Color.black};
    public static void main(String[] args) {
        new Lesson10();
    }

    public Lesson10() {
        setTitle("Hello Swing");//Заголовок
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//поведінка вікна при закритті вікна, почитати детальніше
        setSize(600, 500);

        CanvasPanel canvasPanel = new CanvasPanel();
        canvasPanel.setBackground(Color.white);

        Button button = new Button("Repaint");
        //прочитать о лямбда виражениях
        button.addActionListener(new ActionListener() {//обработчик ожиданий
            @Override
            public void actionPerformed(ActionEvent e) {
                canvasPanel.repaint();
            }
        });

        add(canvasPanel, BorderLayout.CENTER);
        add(button, BorderLayout.SOUTH);
        setLocationRelativeTo(null); //window position
        setVisible(true);//set window visible


    }
    private class CanvasPanel extends JPanel {
        @Override
        public void paint(Graphics g) {
            super.paint(g);
            //рисуем что хотим
            for (int i = 0; i < 200; i++) {
                g.setColor(COLORS[random.nextInt(COLORS.length)]);
                int x = random.nextInt(500);
                int y = random.nextInt(400);
                int dx = random.nextInt(100);
                int dy = random.nextInt(100);
                if (random.nextBoolean()) {
                    g.fillRect(x, y, dx, dy);
                } else {
                    g.fillOval(x, y, dx, dy);
                }
            }
        }
    }
}