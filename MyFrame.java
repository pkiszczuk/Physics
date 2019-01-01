import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    public MyFrame(){
        super("Symulator rzutu ukosnego");
        JPanel left = new Left();
        JPanel draw = new DrawButton();
        this.add(left, BorderLayout.WEST);
        this.add(draw, BorderLayout.CENTER);
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(1200,700);
    }
}
