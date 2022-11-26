package POM;

import org.openqa.selenium.By;


public class ComicPage {
   private By pageTitleLocator= By.className("page-title");
   private String titlePage = "Category: comics";


    public By getPageTitleLocator() {
        return pageTitleLocator;
    }

    public String getTitlePage() {
        return titlePage;
    }
}
