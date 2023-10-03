package steps;


import io.cucumber.java.After;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pages.HomePage;
import pages.ResultadoBuscaPage;

import static core.DriverFactory.finalizaBrowser;
import static core.DriverFactory.inicializaBrowser;
import static org.junit.Assert.assertEquals;

public class PesquisarPagePrincipal {
    HomePage home = new HomePage();
    ResultadoBuscaPage resultado = new ResultadoBuscaPage();

    @Dado("que estou na tela de Home")
    public void queEstouNaTelaDeHome() {

        inicializaBrowser("https://blogdoagi.com.br/");
    }

    @E("clico na lupa pesquisar")
    public void clicoNaLupaPesquisar() {
        home.acessarSearchOpen();
    }

    @E("informo um dado valido para pesquisa {string}")
    public void informoUmDadoValidoParaPesquisa(String texto) {
        home.digitarSearch(texto);
    }

    @Quando("clico no botao pesquisar")
    public void clicoNoBotaoPesquisar() {
        home.clicarBotaoSearchSubmit();
    }

    @Entao("dereciona para a tela de resultado {string}")
    public void derecionaParaATelaDeResultado(String urlEsperado) {
        assertEquals(urlEsperado, resultado.retornaUrlBusca());
    }

    @E("apresenta o texto {string}")
    public void apresentaOTexto(String resultadoEsperado) {
        assertEquals(resultadoEsperado, resultado.acessarResultadoBusca());
    }

    @E("apresenta o texto informando que {string}")
    public void apresentaOTextoInformandoQue(String resultadoEsperado) {
        assertEquals(resultadoEsperado, resultado.nenhumResultado());
    }

    @E("apresenta orientacao para tentar novamente {string}")
    public void apresentaOrientacaoParaTentarNovamente(String resultadoEsperado) {
        assertEquals(resultadoEsperado, resultado.tenteNovamente());
    }

    @After
    public void finalizaAplicacao() {
        finalizaBrowser();
    }
}
