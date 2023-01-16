import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {


    private JLabel label;
    private JPanel panel1;



    public Window(String text){
        super(text);

        setSize(350, 550);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

        panel1 = new JPanel();
        panel1.setLayout(new FlowLayout(FlowLayout.RIGHT));
        label = new JLabel("0");
        label.setMinimumSize(new Dimension(this.getWidth() - 100,100));
        label.setPreferredSize(new Dimension(this.getWidth() - 100,100));
        panel1.add(label);
        label.setHorizontalAlignment(SwingConstants.LEFT);
        add(BorderLayout.NORTH, panel1);
        add(BorderLayout.CENTER, new PanelPrzyciski(label));
    }


}
