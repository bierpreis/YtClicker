package gui;

import javax.swing.*;

public class TimeInputField extends JTextField {

    private String initTimeInSeconds = "005";

    public TimeInputField(){
        setText(initTimeInSeconds);
    }
}
