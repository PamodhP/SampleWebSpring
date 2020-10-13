package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest {


    protected WebDriver driver;

    @BeforeClass
    public void setupDriver(){
        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver");
        driver = new ChromeDriver();

    }


    public void setupDockerDriver() throws MalformedURLException {
         ChromeOptions c = new ChromeOptions();
         URL url = new URL("http:localhost:4444/wd/hub");
         driver = new RemoteWebDriver(url, c);
    }


    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
