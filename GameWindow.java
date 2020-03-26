import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static javax.swing.plaf.basic.BasicGraphicsUtils.drawString;

public class GameWindow extends JFrame{

    public static void main(String[] args) {
        new MyFrame();
    }

    public GameWindow() {
        setTitle("Snake");
        setBounds(320, 345, 400, 400 );
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        add(new GameField());
        setVisible(true);
    }

    public static class MyFrame extends JFrame implements ActionListener {
        private JButton button;

        public MyFrame() {
            setTitle("Snake");
            setBounds(320, 345, 400, 400 );
            setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            button = new JButton("Play");
            button.setForeground(Color.pink);
            button.addActionListener(this);
            getContentPane().add(button);
            setVisible(true);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            setVisible(false);
            GameWindow window = new GameWindow();
        }

    }
}

