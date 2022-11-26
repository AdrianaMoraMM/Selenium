package runner.browser_manage;

import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManagerFactory {

    public static DriverManager getManager(DriverType type){
        DriverManager drivermanager =null;
        switch (type){
            case CHROME:
                drivermanager =new ChromeDriverManager();
                break;

            case FIREFOX:
                drivermanager =new FirefoxDriverManager();
                break;
            default:
                System.out.println("Invalid Browser selected");
        }

    return drivermanager;
    }
}
