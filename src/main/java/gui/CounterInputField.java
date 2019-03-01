package gui;

import javax.swing.*;

public class CounterInputField extends JTextField {

    int iterations = 1;

    public CounterInputField(){
        setColumns(3);
        setText(Integer.toString(iterations));
        setVisible(true);
    }

    public int getIterations(){
        return Integer.parseInt(getText());
    }
}
