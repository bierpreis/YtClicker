import gui.MainWindow;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import javax.swing.*;

public class Second {

    public static void main(String[] args){

        JFrame mainWindow = new MainWindow();
        System.setProperty("webdriver.gecko.driver", "src/test/resources/geckodriver");

        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.youtube.com/watch?v=JGHWVAN_yQg");

    }
}
