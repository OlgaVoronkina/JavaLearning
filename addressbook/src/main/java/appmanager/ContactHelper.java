package appmanager;

import model.ContactData;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ContactHelper extends HelperBase{

    public ContactHelper(FirefoxDriver wd) {
        super(wd);
    }

    public void fillContactForm(ContactData contactData) {
        type(By.name("firstname"), contactData.getFirstname());
        type(By.name("lastname"), contactData.getLastname());
    }

    public void submitContact(){
        click(By.name("submit"));
    }

    public void returnHomePage() {
        click(By.linkText("HOME"));
    }
}
