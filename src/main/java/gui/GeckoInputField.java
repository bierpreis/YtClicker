package gui;

import javax.swing.*;

public class GeckoInputField extends JTextField {

    public GeckoInputField(){
        setText("/home/bierpreis/geckodriver");
    }

    public String getPath(){
        return getText();
    }
}
