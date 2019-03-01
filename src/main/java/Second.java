import gui.MainWindow;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import javax.swing.*;

public class Second {

    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver", "src/test/resources/geckodriver");

        MainWindow mainWindow = new MainWindow();

    }


}

