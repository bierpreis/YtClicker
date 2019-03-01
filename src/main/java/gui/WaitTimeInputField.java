package gui;

import javax.swing.*;

public class WaitTimeInputField  extends JTextField {

    public WaitTimeInputField(){
        setText("005");
    }

    public int getWaitTime(){
        return Integer.parseInt(getText());
    }
}
