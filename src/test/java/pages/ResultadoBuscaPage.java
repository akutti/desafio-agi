package pages;

import core.BasePage;
import org.openqa.selenium.By;

import static core.DriverFactory.getDriver;

public class ResultadoBuscaPage extends BasePage {

    public String acessarResultadoBusca() {
        return getText(By.className("archive-header"));
    }

    public String nenhumResultado() {
        return getText(By.className("entry-title"));
    }

    public String tenteNovamente() {
        return getText(By.className("entry-content"));
    }

    public String retornaUrlBusca() {
        return getDriver().getCurrentUrl();
    }
}
