package seleniumgluecode;

import POM.ComicPage;
import POM.HomePage;
import org.openqa.selenium.WebDriver;

public class TestBase {

    protected WebDriver driver=Hooks.getdriver();

    protected HomePage homePage=new HomePage();
    protected ComicPage comicPage= new ComicPage();

}
