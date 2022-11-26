package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePage {

    private String titleHome ="imalittletester – Testing. With Java, Selenium, TestNG, Maven, Spring, IntelliJ and friends.";
    private By titlleComicslocator= By.id("menu-item-2008");

    public String getTitleHome() {
        return  titleHome;

    }

    public By getTitlleComicslocator() {
        return titlleComicslocator;
    }
}
