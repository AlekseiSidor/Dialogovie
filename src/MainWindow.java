import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MainWindow extends JFrame {
    class MyKeylistener implements KeyListener {

        @Override
        public void keyTyped(KeyEvent e) {

        }

        @Override
        public void keyPressed(KeyEvent e) {

        }

        @Override
        public void keyReleased(KeyEvent e) {
            JOptionPane.showMessageDialog(MainWindow.this, "Леша");
        }
    }

    public MainWindow() {
        super();
        setBounds(200,200,800,600);
        setTitle("Dialog");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setFocusable(true);
        addKeyListener(new MyKeylistener());
    }

    public void run(){
        setVisible(true);
    }
}

