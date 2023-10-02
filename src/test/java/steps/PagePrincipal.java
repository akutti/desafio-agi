package steps;

import core.DriverFactory;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import pages.HomePage;

public class PagePrincipal extends HomePage {
    @Dado("que estou na tela de Home")
    public void queEstouNaTelaDeHome() {
        DriverFactory.getDriver().get("https://blogdoagi.com.br/");
    }

    @E("clico na lupa pesquisar")
    public void clicoNaLupaPesquisar() {
        acessarSearchOpen();
    }

    @E("informo um dado valido para pesquisa")
    public void informoUmDadoValidoParaPesquisa() {
        System.out.println("imprime");
    }
}
