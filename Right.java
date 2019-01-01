
import javax.swing.*;
import java.awt.*;

public class Right extends JPanel {

    public Right() {
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Point point = new Point();
        setPreferredSize(new Dimension(900,800));
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawRect(0, 50, 800, 400);
        g2d.drawLine(30, 425, 730, 425);
        g2d.drawLine(50, 435, 50, 70);
        g2d.drawLine(50, 70, 55, 90);
        g2d.drawLine(50, 70, 45, 90);
        g2d.drawLine(730, 425, 710, 420);
        g2d.drawLine(730, 425, 710, 430);
        int a;
        int v;
        double t=0;
        a=Left.getA();
        v=Left.getV();
        while(t<point.findT(a,v)){
            g2d.fillOval(point.setX(a,v,t)+50,point.setY(a,v,t)+420,5,5);
            t=t+0.01;
        }
    }
}