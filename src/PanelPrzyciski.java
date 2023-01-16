import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelPrzyciski extends JPanel {


    private JButton buttonModulo;
    private JButton buttonCE;
    private JButton buttonC;
    private JButton buttonBack;

    private JButton buttonOver;
    private JButton buttonPow;
    private JButton buttonSq;
    private JButton buttonDiv;

    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JButton buttonX;

    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton buttonMin;

    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton buttonPlus;

    private JButton buttonSign;
    private JButton button0;
    private JButton buttonDot;
    private JButton buttonEqu;

    public PanelPrzyciski(JLabel labelResult) {
        setLayout(new GridLayout(6, 4));
        createButtons();
        Kliki kliki = new Kliki(this, labelResult);
        addAction(kliki);
        addButtons();
        addActionComand();

    }

    private void createButtons() {
        buttonModulo = new JButton("%");
        buttonCE = new JButton("CE");
        buttonC = new JButton("C");
        buttonBack = new JButton("Back");

        buttonOver = new JButton("1/x");
        buttonPow = new JButton("Pow");
        buttonSq = new JButton("Sq");
        buttonDiv = new JButton("/");

        button7 = new JButton("7");
        button8 = new JButton("8");
        button9 = new JButton("9");
        buttonX = new JButton("x");

        button4 = new JButton("4");
        button5 = new JButton("5");
        button6 = new JButton("6");
        buttonMin = new JButton("-");

        button1 = new JButton("1");
        button2 = new JButton("2");
        button3 = new JButton("3");
        buttonPlus = new JButton("+");

        buttonSign = new JButton("+/-");
        button0 = new JButton("0");
        buttonDot = new JButton(",");
        buttonEqu = new JButton("=");
    }
    private void addAction(Kliki kliki) {
        buttonModulo.addActionListener(kliki);
        buttonCE.addActionListener(kliki);
        buttonC.addActionListener(kliki);
        buttonBack.addActionListener(kliki);

        buttonOver.addActionListener(kliki);
        buttonPow.addActionListener(kliki);
        buttonSq.addActionListener(kliki);
        buttonDiv.addActionListener(kliki);

        button7.addActionListener(kliki);
        button8.addActionListener(kliki);
        button9.addActionListener(kliki);
        buttonX.addActionListener(kliki);

        button4.addActionListener(kliki);
        button5.addActionListener(kliki);
        button6.addActionListener(kliki);
        buttonMin.addActionListener(kliki);

        button1.addActionListener(kliki);
        button2.addActionListener(kliki);
        button3.addActionListener(kliki);
        buttonPlus.addActionListener(kliki);

        buttonSign.addActionListener(kliki);
        button0.addActionListener(kliki);
        buttonDot.addActionListener(kliki);
        buttonEqu.addActionListener(kliki);
    }
    private void addButtons() {
        add(buttonModulo);
        add(buttonCE);
        add(buttonC);
        add(buttonBack);

        add(buttonOver);
        add(buttonPow);
        add(buttonSq);
        add(buttonDiv);

        add(button7);
        add(button8);
        add(button9);
        add(buttonX);

        add(button4);
        add(button5);
        add(button6);
        add(buttonMin);

        add(button1);
        add(button2);
        add(button3);
        add(buttonPlus);

        add(buttonSign);
        add(button0);
        add(buttonDot);
        add(buttonEqu);
    }
    private void addActionComand() {
        buttonModulo.setActionCommand("%");
        buttonCE.setActionCommand("CE");
        buttonC.setActionCommand("C");
        buttonBack.setActionCommand("B");

        buttonOver.setActionCommand("1/x");
        buttonPow.setActionCommand("^2");
        buttonSq.setActionCommand("^(1/2)");
        buttonDiv.setActionCommand("/");

        button7.setActionCommand("7");
        button8.setActionCommand("8");
        button9.setActionCommand("9");
        buttonX.setActionCommand("x");

        button4.setActionCommand("4");
        button5.setActionCommand("5");
        button6.setActionCommand("6");
        buttonMin.setActionCommand("-");

        button1.setActionCommand("1");
        button2.setActionCommand("2");
        button3.setActionCommand("3");
        buttonPlus.setActionCommand("+");

        buttonSign.setActionCommand("+/-");
        button0.setActionCommand("0");
        buttonDot.setActionCommand(".");
        buttonEqu.setActionCommand("=");
    }

}
