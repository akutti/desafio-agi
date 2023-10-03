package core;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {

    private static WebDriver driver;

    private DriverFactory() {}

    public static WebDriver getDriver(){
        if(driver == null) {
            switch (Propriedades.browser) {
                case FIREFOX -> driver = new FirefoxDriver();
                case CHROME -> driver = new ChromeDriver();
                case EDGE -> driver = new EdgeDriver();
            }
            driver.manage().window().setSize(new Dimension(1200, 765));
        }
        return driver;
    }

    public static void finalizaBrowser(){
        if(driver != null) {
            driver.quit();
            driver = null;
        }
    }

    public static void inicializaBrowser(String URL) {
        getDriver().get(URL);
    }

}
