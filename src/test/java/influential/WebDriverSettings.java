package influential;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;

public class WebDriverSettings {

    public ChromeOptions chromeOptions;
    public WebDriver driver;

    @Before
    public void setUp(){
        chromeOptions = new ChromeOptions();
        System.setProperty("webdriver.chrome.driver", "C:/java_projects/tools/chromedriver.exe");
        chromeOptions.setBinary(new File("C:/Program Files/Vivaldi/Application/vivaldi.exe"));
        driver = new ChromeDriver(chromeOptions);
    }

    @After
    public void close(){
        //driver.quit();
    }
}
