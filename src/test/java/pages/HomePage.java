package pages;

import core.BasePage;
import org.openqa.selenium.By;


public class HomePage extends BasePage {

    public void acessarSearchOpen() {
        clickButton(By.id("search-open"));
    }

    public void digitarSearch(String textoPesquisa) {
        sendText(By.className("search-field"), textoPesquisa);
    }

    public void clicarBotaoSearchSubmit() {
        clickButton(By.className("search-submit"));
    }
}
