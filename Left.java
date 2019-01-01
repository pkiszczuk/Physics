import javax.swing.*;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;



public class Left extends JPanel {
    public static JTextField alpha;
    public static JTextField velocity;

    public  Left(){
        super();
        GridBagLayout gridBag = new GridBagLayout();
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.CENTER;
        gridBag.setConstraints(this, constraints);
        setLayout(gridBag);
        createComponents();
    }

    public void createComponents(){
        JLabel alphaLabel = new JLabel("Kat (1-89)");
        JLabel velocityLabel = new JLabel("Predkosc (max 80)");
        alpha = new JTextField();
        velocity = new JTextField();
        JPanel input = new JPanel();
        input.setLayout(new GridLayout(5,1));
        input.add(alphaLabel);
        input.add(alpha);
        input.add(velocityLabel);
        input.add(velocity);
        this.add(input);
    }

    public static int getA(){
        String as;
        as = Left.alpha.getText();
        int a=0;
        try{
            a=Integer.parseInt(as);
        } catch (Exception exp){
        }
        return a;
    }
    public static int getV(){
        String vs;
        vs = Left.velocity.getText();
        int v = 0;
        try{
            v=Integer.parseInt(vs);
        }catch (Exception exp){
        }
        return v;
    }
}
