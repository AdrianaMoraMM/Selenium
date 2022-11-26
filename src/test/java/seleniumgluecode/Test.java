package seleniumgluecode;



import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class Test extends TestBase{



    @Given("^El usuario  se encuentra en la pantalla de home de imallitertease$")
    public void el_usuario_se_encuentra_en_la_pantalla_de_home_de_imallitertease() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertEquals(homePage.getTitleHome(),driver.getTitle());
    }

    @When("^Hace click sobre el boton The little tester comics$")
    public void hace_click_sobre_el_boton_The_little_tester_comics() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        WebElement  titlleComicslocator= driver.findElement(homePage.getTitlleComicslocator());
        titlleComicslocator.click();
    }

    @Then("^Se debe redirigir a la pantalla de comics$")
    public void se_debe_redirigir_a_la_pantalla_de_comics() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

        WebElement pageTitleLocator= driver.findElement(comicPage.getPageTitleLocator());
        Assert.assertTrue("No se redirecciono correctamente a la pagina de comics", pageTitleLocator.isDisplayed());
        Assert.assertEquals(comicPage.getTitlePage(), pageTitleLocator.getText());

    }

    @Then("^debe ver todos los comics que se encuentran$")
    public void debe_ver_todos_los_comics_que_se_encuentran() throws Throwable {
        // Write code here that turns the phrase above into concrete actions


    }


}
