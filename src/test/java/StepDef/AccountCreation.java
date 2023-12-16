package StepDef;

import BusinessLogic.BusinessLogin;
import Utility.GlobalLogic;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.IOException;

import static Utility.GlobalLogic.driver;

public class AccountCreation  {
    @Given("^User launch URL$")
    public void userLaunchURL() throws IOException {

      GlobalLogic.BrowserOpen();
    }

    @And("^Provide contact information \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\",\"([^\"]*)\"$")
    public void provideContactInformation(String First_name, String Last_name, String Phone, String Email) throws Throwable {
   BusinessLogin.contactInformation(First_name,Last_name,Phone,Email);
    }

    @And("^Provide Mailing information \"([^\"]*)\", \"([^\"]*)\",\"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
    public void provideMailingInformation(String Address, String City, String State_Province, String Postal_Code, String Country) throws Throwable {
        BusinessLogin.mailinginformation(Address,City,State_Province,Postal_Code,Country);
    }


    @And("^User should \"([^\"]*)\" button$")
    public void userShouldButton(String Submit) throws Throwable {
BusinessLogin.submitPage(Submit);
    }

    @Then("^User created account successfully$")
    public void userCreatedAccountSuccessfully() throws InterruptedException {
        BusinessLogin.ackConfirmation();
    }


    @Given("^Provide User information \"([^\"]*)\", \"([^\"]*)\",\"([^\"]*)\"$")
    public void provide_User_information(String Username, String Password, String Confirmpassword) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        BusinessLogin.userInformtion(Username,Password,Confirmpassword);
    }

    private class Test extends GlobalLogic
{


}
}
