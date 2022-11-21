package influential.signUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class HomePage {

    private final WebDriver driver;

    WebDriverWait wait;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    @FindBy(xpath = "//a[text() = 'Register']")
    private WebElement registration;

    public void open(){
        driver.get("https://parabank.parasoft.com/parabank/index.htm");
    }

    public void getStarted(){
        registration.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class = 'form2']")));
    }

}
