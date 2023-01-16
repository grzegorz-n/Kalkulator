import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Kliki implements ActionListener {
    PanelPrzyciski pP;
    JLabel labelResult;
    double result = 0;
    double tempNumber = 0;
    String operation;
    boolean dot = false;
    int dotIndex = 10;

    public Kliki(PanelPrzyciski pP, JLabel labelResult) {
        this.pP = pP;
        this.labelResult = labelResult;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("1")) {
            if (dot) {
                tempNumber = tempNumber + (1.0 / dotIndex);
                dotIndex = dotIndex * 10;
                labelResult.setText(String.valueOf(tempNumber));
            } else {
                tempNumber = (tempNumber) * 10 + 1;
                labelResult.setText(String.valueOf(tempNumber));
            }
        } else if (e.getActionCommand().equals("2")) {
            if (dot) {
                tempNumber = tempNumber + (2.0 / dotIndex);
                dotIndex = dotIndex * 10;
                labelResult.setText(String.valueOf(tempNumber));
            } else {
                tempNumber = (tempNumber) * 10 + 2;
                labelResult.setText(String.valueOf(tempNumber));
            }
        } else if (e.getActionCommand().equals("3")) {
            if (dot) {
                tempNumber = tempNumber + (3.0 / dotIndex);
                dotIndex = dotIndex * 10;
                labelResult.setText(String.valueOf(tempNumber));
            } else {
                tempNumber = (tempNumber) * 10 + 3;
                labelResult.setText(String.valueOf(tempNumber));
            }
        } else if (e.getActionCommand().equals("4")) {
            if (dot) {
                tempNumber = tempNumber + (4.0 / dotIndex);
                dotIndex = dotIndex * 10;
                labelResult.setText(String.valueOf(tempNumber));
            } else {
                tempNumber = (tempNumber) * 10 + 4;
                labelResult.setText(String.valueOf(tempNumber));
            }
        } else if (e.getActionCommand().equals("5")) {
            if (dot) {
                tempNumber = tempNumber + (5.0 / dotIndex);
                dotIndex = dotIndex * 10;
                labelResult.setText(String.valueOf(tempNumber));
            } else {
                tempNumber = (tempNumber) * 10 + 5;
                labelResult.setText(String.valueOf(tempNumber));
            }
        } else if (e.getActionCommand().equals("6")) {
            if (dot) {
                tempNumber = tempNumber + (6.0 / dotIndex);
                dotIndex = dotIndex * 10;
                labelResult.setText(String.valueOf(tempNumber));
            } else {
                tempNumber = (tempNumber) * 10 + 6;
                labelResult.setText(String.valueOf(tempNumber));
            }
        } else if (e.getActionCommand().equals("7")) {
            if (dot) {
                tempNumber = tempNumber + (7.0 / dotIndex);
                dotIndex = dotIndex * 10;
                labelResult.setText(String.valueOf(tempNumber));
            } else {
                tempNumber = (tempNumber) * 10 + 7;
                labelResult.setText(String.valueOf(tempNumber));
            }
        } else if (e.getActionCommand().equals("8")) {
            if (dot) {
                tempNumber = tempNumber + (8.0 / dotIndex);
                dotIndex = dotIndex * 10;
                labelResult.setText(String.valueOf(tempNumber));
            } else {
                tempNumber = (tempNumber) * 10 + 8;
                labelResult.setText(String.valueOf(tempNumber));
            }
        } else if (e.getActionCommand().equals("9")) {
            if (dot) {
                tempNumber = tempNumber + (9.0 / dotIndex);
                dotIndex = dotIndex * 10;
                labelResult.setText(String.valueOf(tempNumber));
            } else {
                tempNumber = (tempNumber) * 10 + 9;
                labelResult.setText(String.valueOf(tempNumber));
            }
        } else if (e.getActionCommand().equals("0")) {
            tempNumber = (tempNumber) * 10 + 0;
            labelResult.setText(String.valueOf(tempNumber));
        } else if (e.getActionCommand().equals("CE")) {
            result = 0;
            tempNumber = 0;
            dot = false;
            dotIndex = 10;
            labelResult.setText(String.valueOf(tempNumber));
        } else if (e.getActionCommand().equals("C")) {
            result = 0;
            dot = false;
            dotIndex = 10;
            tempNumber = 0;
            labelResult.setText(String.valueOf(tempNumber));
        } else if (e.getActionCommand().equals("+")) {
            operation = "+";
            result = result + tempNumber;
            tempNumber = 0;
            dot = false;
            dotIndex = 10;
            labelResult.setText(String.valueOf(tempNumber));
        } else if (e.getActionCommand().equals("-")) {
            if(tempNumber == 0) {
                operation = "-";
            } else {
                operation = "-";
                result = tempNumber;
                tempNumber = 0;
                dot = false;
                dotIndex = 10;
            }
        } else if (e.getActionCommand().equals("/")) {
            if(tempNumber == 0) {
                operation = "/";
            } else {
                operation = "/";
                result = tempNumber;
                tempNumber = 0;
            }
        } else if (e.getActionCommand().equals("x")) {
            if(tempNumber == 0) {
                operation = "x";
            } else {
                operation = "x";
                result = tempNumber;
                tempNumber = 0;
            }
        } else if (e.getActionCommand().equals("=")) {
            try {
                result = calculate(result, tempNumber, operation);
                tempNumber = 0;
                dot = false;
                dotIndex = 10;
                labelResult.setText(String.valueOf(result));
            } catch (ZeroDivision zD) {
                result = 0;
                tempNumber = 0;
                dot = false;
                dotIndex = 10;
                labelResult.setText("Nie dzielimy przez zero");
            }

        } else if (e.getActionCommand().equals(".")) {
            dot = true;
        }  else if (e.getActionCommand().equals("1/x")) {
            if(tempNumber == 0) {
                result = 1 / result;
                labelResult.setText(String.valueOf(result));
            } else {
                result = 1 / tempNumber;
                labelResult.setText(String.valueOf(result));
            }

        } else if (e.getActionCommand().equals("^2")) {
            if(tempNumber == 0) {
                result = Math.pow(result, 2);
                labelResult.setText(String.valueOf(result));
            } else {
                result = Math.pow(tempNumber, 2);
                labelResult.setText(String.valueOf(result));
                tempNumber = 0;
                dot = false;
                dotIndex = 10;
            }
        } else if (e.getActionCommand().equals("^(1/2)")) {
            if(tempNumber == 0) {
                result = Math.sqrt(result);
                labelResult.setText(String.valueOf(result));
            } else {
                result = Math.sqrt(tempNumber);
                labelResult.setText(String.valueOf(result));
                tempNumber = 0;
                dot = false;
                dotIndex = 10;
            }
        } else if (e.getActionCommand().equals("B")) {
            if(!dot) {
                if((tempNumber != 0) &&(tempNumber >= 10 || tempNumber <= -10)) {
                    tempNumber = (tempNumber / 10) - ((tempNumber % 10)/10);
                    labelResult.setText(String.valueOf(tempNumber));
                }
            } else {
                if (dotIndex > 10) {
                    double temp = tempNumber * (dotIndex / 10);
                    temp = temp % 10;
                    temp = temp / (dotIndex / 10);
                    tempNumber = tempNumber - temp;
                    dotIndex = dotIndex / 10;
                    labelResult.setText(String.valueOf(tempNumber));
                } else {
                    double temp = tempNumber * (dotIndex / 10);
                    temp = temp % 10;
                    temp = temp / (dotIndex / 10);
                    tempNumber = tempNumber - temp;
                    dot = false;
                    labelResult.setText(String.valueOf(tempNumber));
                }
            }

        } else if (e.getActionCommand().equals("+/-")) {
            if(tempNumber == 0) {
                result = result * (-1);
                labelResult.setText(String.valueOf(result));
            } else {
                result = tempNumber * (-1);
                labelResult.setText(String.valueOf(result));
                tempNumber = 0;
                dot = false;
                dotIndex = 10;
            }
        }

    }
    private double calculate(Double firstNumber, Double secondNumber, String operation) throws ZeroDivision{
        if (operation.equals("+")){
            return firstNumber + secondNumber;
        } else if (operation.equals("-")) {
            return firstNumber - secondNumber;
        } else if (operation.equals("/")) {
            if (secondNumber == 0) {
                throw new ZeroDivision();
            } else {
                return firstNumber / secondNumber;
            }
        } else if (operation.equals("x")) {
            return firstNumber * secondNumber;
        }
        return 1;
    }
}
