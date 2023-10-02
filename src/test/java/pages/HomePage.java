package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

    @FindBy(id= "search-open")
    private WebElement searchOpen;

    public void acessarSearchOpen(){
        searchOpen.isDisplayed();
        searchOpen.click();
    }
}
