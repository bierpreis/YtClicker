package gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GeckoWarningWindow extends JDialog {

    public GeckoWarningWindow() {
        setTitle("Error");
        setSize(180, 110);

        setLayout(new BoxLayout(getContentPane(), BoxLayout.PAGE_AXIS));

        JPanel warningPanel = new JPanel();
        warningPanel.add(new JLabel("GeckoDriver not found!"));
        add(warningPanel);

        JPanel okButtonPanel = new JPanel();
        JButton okButton = new JButton("k");
        okButton.addActionListener(new OkButtonListener(this));
        okButtonPanel.add(okButton);
        add(okButtonPanel);

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);


        setAlwaysOnTop(true);
        setVisible(true);
    }

    private class OkButtonListener implements ActionListener {
        JDialog waringFrame;

        public OkButtonListener(JDialog warningFrame) {
            this.waringFrame = warningFrame;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            waringFrame.dispose();
        }

    }
}
