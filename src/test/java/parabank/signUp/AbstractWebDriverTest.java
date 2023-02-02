package parabank.signUp;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import parabank.readProperties.ConfigProvider;

import java.io.File;

public class AbstractWebDriverTest {

    public ChromeOptions chromeOptions;
    public WebDriver driver;

    @BeforeEach
    public void setUp() {
        chromeOptions = new ChromeOptions();
        System.setProperty("webdriver.chrome.driver", ConfigProvider.CHROMEDRIVER_PATH);
        chromeOptions.setBinary(new File(ConfigProvider.BROWSER_EXE_PATH));
        driver = new ChromeDriver(chromeOptions);
    }

    @AfterEach
    public void close() {
        driver.quit();
    }
}
