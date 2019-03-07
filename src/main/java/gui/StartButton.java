package gui;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StartButton extends JButton {
    private MainWindow mainWindow;

    public StartButton(MainWindow mainWindow) {
        this.mainWindow = mainWindow;
        setText("Start");
        setVisible(true);
        addActionListener(new ButtonActionListener());
    }

    @Override
    public void addActionListener(ActionListener actionListener) {
        super.addActionListener(actionListener);
    }

    private class ButtonActionListener implements ActionListener {

        public void actionPerformed(ActionEvent actionEvent) {
            mainWindow.startClicking();
        }
    }
}
