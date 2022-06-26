package tests;

import model.ContactData;
import org.testng.annotations.Test;

public class ContactCreationTest extends TestBase{

    @Test
    public void testContactCreationTests() {
        app.getNavigationHelper().goToContactPage();
        app.getContactHelper().fillContactForm(new ContactData("test1","test2"));
        app.getContactHelper().submitContact();
        app.getContactHelper().returnHomePage();
    }
}
