package pages;

import org.openqa.selenium.WebDriver;

public class SignUpPage {
    WebDriver driver;

    public SignUpPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean open(String url) {
        if (driver == null)
            return false;
        driver.get(url);
    else return true;
    }
}
