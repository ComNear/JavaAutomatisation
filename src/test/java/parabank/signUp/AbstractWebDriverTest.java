package parabank.signUp;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import parabank.readProperties.ConfigProvider;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.edge.EdgeOptions;

public class AbstractWebDriverTest {

    /*public ChromeOptions chromeOptions;*/
    public EdgeOptions edgeOptions;
    public WebDriver driver;

    @BeforeEach
    public void setUp() {
/*      chromeOptions = new ChromeOptions();
        System.setProperty("webdriver.chrome.driver", ConfigProvider.CHROMEDRIVER_PATH);
        chromeOptions.setBinary(new File(ConfigProvider.BROWSER_EXE_PATH));
        driver = new ChromeDriver(chromeOptions);*/

        System.setProperty("webdriver.edge.driver", ConfigProvider.EDGEDRIVER_PATH);
        edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--remote-allow-origins=*");
        driver = new EdgeDriver(edgeOptions);
    }

    @AfterEach
    public void close() {
        driver.quit();
    }
}
