package gui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import javax.swing.*;

public class MainWindow extends JFrame {

    private boolean shouldStart = false;

    LinkInputField linkInputField;
    CounterInputField counterInputField;

    public MainWindow() {
        setTitle("N1 YT Clicker");
        setLayout(new BoxLayout(getContentPane(), BoxLayout.PAGE_AXIS));

        JPanel startPanel = new JPanel();
        JPanel linkDescriptionPanel = new JPanel();
        JPanel linkInputPanel = new JPanel();
        JPanel counterPanel = new JPanel();

        JLabel linkInputLabel = new JLabel("put link here:");
        JLabel counterLabel = new JLabel("iterations");


        counterPanel.add(counterLabel);
        counterPanel.add(counterInputField = new CounterInputField());
        linkDescriptionPanel.add(linkInputLabel);
        startPanel.add(new StartButton(this));
        linkInputPanel.add(linkInputField = new LinkInputField());

        add(startPanel);
        add(counterPanel);
        add(linkDescriptionPanel);
        add(linkInputPanel);


        pack();

        setVisible(true);
    }

    public boolean askIfStart() {
        return shouldStart;
    }

    public String getLink() {
        return linkInputField.getText();
    }

    public int getCounter() {
        System.out.println("iterations returned");
        return counterInputField.getIterations();
    }

    public void startClicking(){
         new ClickIteration( counterInputField.getIterations(),linkInputField.getText());
    }

    public class ClickIteration {




        public ClickIteration(int requesdedIterations, String link){
            for (int iterationCounter = 0; iterationCounter < requesdedIterations; iterationCounter++) {
                System.out.println("iteration: " + iterationCounter);
                WebDriver driver = new FirefoxDriver();
                driver.get(link);

                driver.close();
                System.out.println("iteration finidhed");
            }
        }
    }

}
