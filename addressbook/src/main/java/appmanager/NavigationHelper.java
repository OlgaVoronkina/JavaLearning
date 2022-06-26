package appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigationHelper extends HelperBase{
    public NavigationHelper(FirefoxDriver wd) {super(wd);}

    public void goToGroupPage() {
        click(By.linkText("GROUPS"));
    }

    public void goToContactPage() {
        click(By.linkText("ADD_NEW"));
    }
}
