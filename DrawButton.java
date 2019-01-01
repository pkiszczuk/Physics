

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DrawButton extends JPanel implements ActionListener {
    private JButton draw;
    Right right = new Right();
    public DrawButton(){
       draw = new JButton("Rysuj");
       this.add(draw);
       draw.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        Object source = e.getSource();
        if(source == draw){
            this.add(right);
            right.revalidate();
            right.repaint();
        }
    }
}
