import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FormPage;
import pages.ConfirmationPage;

public class FormTest {

    @Test(groups = {"sample"})
    public void submitFormTest() {

        System.setProperty("webdriver.chrome.driver", "/Users/jobj/Downloads/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/form");

        FormPage formPage = new FormPage();
        formPage.fillAndSubmitForm(driver);

        ConfirmationPage confirmationPage = new ConfirmationPage();
        confirmationPage.waitForAlertBanner(driver);

        Assert.assertEquals("The form was successfully submitted!", confirmationPage.getAlertBannerText(driver));

        driver.quit();
    }
}
