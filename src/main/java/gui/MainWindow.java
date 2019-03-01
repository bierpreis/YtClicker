package gui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import javax.swing.*;
import java.util.Random;

public class MainWindow extends JFrame {

    private boolean shouldStart = false;

    LinkInputField linkInputField;
    CounterInputField counterInputField;
    WaitTimeInputField waitTimeInputField;

    public MainWindow() {
        setTitle("N1 YT Clicker");
        setLayout(new BoxLayout(getContentPane(), BoxLayout.PAGE_AXIS));

        JPanel startPanel = new JPanel();
        JPanel linkDescriptionPanel = new JPanel();
        JPanel linkInputPanel = new JPanel();
        JPanel counterPanel = new JPanel();
        JPanel timeInputPanel = new JPanel();
        JPanel waitTimeImputPanel = new JPanel();

        JLabel linkInputLabel = new JLabel("put link here:");
        JLabel counterLabel = new JLabel("iterations");
        JLabel timeInputLabel = new JLabel("time in seconds");
        JLabel waitTimeInputLabel = new JLabel("max random wait time");


        counterPanel.add(counterLabel);
        counterPanel.add(counterInputField = new CounterInputField());

        waitTimeImputPanel.add(waitTimeInputLabel);
        waitTimeImputPanel.add(waitTimeInputField = new WaitTimeInputField());

        timeInputPanel.add(timeInputLabel);
        timeInputPanel.add(new TimeInputField());

        linkDescriptionPanel.add(linkInputLabel);
        startPanel.add(new StartButton(this));
        linkInputPanel.add(linkInputField = new LinkInputField());


        add(startPanel);
        add(counterPanel);
        add(timeInputPanel);
        add(waitTimeImputPanel);
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

    public void startClicking() {
        new ClickIteration(counterInputField.getIterations(), waitTimeInputField.getWaitTime(), linkInputField.getText());
    }

    public class ClickIteration {


        public ClickIteration(int requesdedIterations, int maxWaitTime, String link) {
            for (int iterationCounter = 0; iterationCounter < requesdedIterations; iterationCounter++) {
                System.out.println("iteration: " + iterationCounter);
                WebDriver driver = new FirefoxDriver();
                driver.get(link);
                try {
                    Thread.sleep(getRandomTime(maxWaitTime*1000));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                driver.close();
                System.out.println("iteration finished");
            }


        }

        private int getRandomTime(int maxTimeInSeconds) {
            Random random = new Random();
            return (int) (maxTimeInSeconds * random.nextFloat());
        }


    }


}
