package seleniumgluecode;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import runner.browser_manage.DriverManager;
import runner.browser_manage.DriverManagerFactory;
import runner.browser_manage.DriverType;

public class Hooks {

    private static WebDriver driver;
    private static int numberOfCase =0 ;
    private DriverManager driverManager;
    @Before
    public void setUp() {
        numberOfCase ++;
        System.out.println("Se esta ejecutando el escenario número "+ numberOfCase);
        driverManager = DriverManagerFactory.getManager (DriverType.FIREFOX);
        driver= driverManager.getDriver();
        driver.get("https://imalittletester.com/");
        driver.manage().window().maximize();
    }

    @After
    public void tearDown(){
        System.out.println("El escenario nro: "+ numberOfCase+" se ha completado ");
        driverManager.quitDriver();

    }


    public static WebDriver getdriver(){
        return driver;
    }
}
