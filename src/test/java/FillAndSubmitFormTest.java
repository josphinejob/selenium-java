import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ConfirmationPage;
import pages.FormPage;

public class FillAndSubmitFormTest {
    @Test(groups = {"sanity"})
    public void fillAndSubmitFormTest() {
        WebDriver driver = new ChromeDriver();
        FormPage formPage = new FormPage();
        ConfirmationPage confirmationPage = new ConfirmationPage();

        // set chromedriver
        System.setProperty("webdriver.chrome.driver", "/Users/jobj/Downloads/chromedriver");

        // visit page
        driver.get("https://formy-project.herokuapp.com/form");

        // Actions in formPage.fillAndSubmitForm(driver) in separate steps for a readable test
        formPage.typeFirstName(driver);
        formPage.typeLastName(driver);
        formPage.typeJobTitle(driver);
        formPage.clickRadioButton(driver);
        formPage.clickCheckbox(driver);
        formPage.typeDate(driver, "05/28/2019");
        formPage.clickSubmitButton(driver);

        //confirm the submission success
        confirmationPage.waitForAlertBanner(driver);
        Assert.assertEquals("The form was successfully submitted!", confirmationPage.getAlertBannerText(driver));

        //close browser
        driver.quit();
    }
}
