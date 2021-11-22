package uittests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.CreditCardPage;

public class CreditCardTest extends TestBase {
    WebDriver driver;

    public void navigateCreditCardOverviewPage() {
        CreditCardPage creditCard = new CreditCardPage();
        creditCard.enterData();



    }

    //first attempt
}
