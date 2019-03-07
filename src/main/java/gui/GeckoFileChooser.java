package gui;

import javax.swing.*;

public class GeckoFileChooser extends JFileChooser {

    public GeckoFileChooser(){
        setDialogTitle("Choose the GeckoDriver file");
        setSize(500, 500);
        setVisible(true);
    }
}
