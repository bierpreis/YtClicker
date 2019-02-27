import gui.MainWindow;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import javax.swing.*;

public class Second {

    public static void main(String[] args) {

        MainWindow mainWindow = new MainWindow();

        while (!mainWindow.askIfStart())
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        String ytLink = mainWindow.getLink();

        int requestedCounter = mainWindow.getCounter();


        System.setProperty("webdriver.gecko.driver", "src/test/resources/geckodriver");


        for (int iterationCounter = 0; iterationCounter < requestedCounter; iterationCounter++) {
            WebDriver driver = new FirefoxDriver();
            driver.get(ytLink);

            driver.close();

        }
    }


}

