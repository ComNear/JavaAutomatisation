package parabank.signUp.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import parabank.readProperties.ConfigProvider;

import java.time.Duration;

public class HomePage {

    private final WebDriver driver;

    private final WebDriverWait wait;

    @FindBy(xpath = "//a[text() = 'Register']")
    private WebElement registration;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    public void open() {
        driver.get(ConfigProvider.TEST_SITE_URL);
    }

    public void getStarted() {
        registration.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class = 'form2']")));
    }

}
