package springSample;

import base.BaseTest;
import org.testng.annotations.Test;


public class KiwiSaver extends BaseTest {
    String baseUrl = "https://www.westpac.co.nz/";

    @Test
    public void test1sample() {
        driver.navigate().to(baseUrl);
    }
    @Test
    public void test1samplePamodh() {
        driver.navigate().to(baseUrl);
    }
}
