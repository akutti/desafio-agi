package core;


import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static core.DriverFactory.getDriver;

public class BasePage {

    WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(5));

    public void clickButton(By by) {
        wait.until(ExpectedConditions.elementToBeClickable(by)).click();
    }

    public String getText(By by) {
        return wait.until(ExpectedConditions.presenceOfElementLocated(by)).getText();
    }

    public void sendText(By by, String string) {
        wait.until(ExpectedConditions.elementToBeClickable(by)).sendKeys(string);
    }
}
