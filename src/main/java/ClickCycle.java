import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ClickCycle {

    public ClickCycle(int requesdedIterations, String link){
        for (int iterationCounter = 0; iterationCounter < requesdedIterations; iterationCounter++) {
            WebDriver driver = new FirefoxDriver();
            driver.get(link);

            driver.close();

        }
    }
}
