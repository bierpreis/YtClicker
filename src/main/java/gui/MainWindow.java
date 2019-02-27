package gui;

import javax.swing.*;

public class MainWindow extends JFrame {

    public MainWindow(){
        setTitle("N1 YT Clicker");
        setLayout(new BoxLayout(getContentPane(), BoxLayout.PAGE_AXIS));

        JPanel startPanel = new JPanel();
        JPanel linkDescriptionPanel = new JPanel();
        JPanel linkInputPanel = new JPanel();
        JPanel counterPanel = new JPanel();

        JLabel linkInputLabel = new JLabel("put link here:");
        JLabel counterLabel = new JLabel("iterations");




        counterPanel.add(counterLabel);
        counterPanel.add(new CounterInputField());
        linkDescriptionPanel.add(linkInputLabel);
        startPanel.add(new StartButton());
        linkInputPanel.add(new LinkInputField());

        add(startPanel);
        add(counterPanel);
        add(linkDescriptionPanel);
        add(linkInputPanel);


        pack();

        setVisible(true);
    }
}
