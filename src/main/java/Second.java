import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Second {

    public static void main(String[] args){
        System.setProperty("webdriver.gecko.driver", "src/test/resources/geckodriver");

        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.youtube.com/watch?v=JGHWVAN_yQg");

    }
}
