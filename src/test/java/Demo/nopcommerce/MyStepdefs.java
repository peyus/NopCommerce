package Demo.nopcommerce;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by Piyush on 13/09/2016.
 */
public class MyStepdefs extends BaseMain {

    HomePage homepage=new HomePage();
    RegistrationPage registrationpage=new RegistrationPage();
    LoginPage loginpage=new LoginPage();

    @Before
    public void meth_setup()
    {
        System.out.println("I M ON Before");
        meth_openbrowser();
    }
    @After
    public void meth_teardown()
    {
        System.out.println("I M ON After");
        meth_quitbrowser();
    }


    @Given("^User on Nopcomerce Home page$")
    public void userOnNopcomerceHomePage() throws Throwable {
            homepage.meth_onhomepage();
    }

    @When("^User goto the registration page$")
    public void userGotoTheRegistrationPage() throws Throwable {
            homepage.meth_goto_RegisterPage();
    }

    @And("^user fill all  details like \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
    public void userFillAllDetailsLike(String gender, String firstname, String lastname, String day, String month, String year, String email, String companyname, String password, String conformpassword) throws Throwable {
        registrationpage.meth_todoRegister( gender,  firstname,  lastname,  day,  month,  year,  email,  companyname,  password,  conformpassword);
    }

    @Then("^user should see the message \"([^\"]*)\"$")
    public void userShouldSeeTheMessage(String reg_message) throws Throwable {
        registrationpage.meth_check_content(reg_message);
    }

    @Then("^user should be unsuccessfully registered$")
    public void userShouldBeUnsuccessfullyRegistered() throws Throwable {

    }

    @Given("^i on Nopcomerce Home page$")
    public void iOnNopcomerceHomePage() throws Throwable {
            homepage.meth_onhomepage();
    }

    @When("^user enters \"([^\"]*)\" , \"([^\"]*)\" on login page and do login$")
    public void userEntersOnLoginPageAndDoLogin(String email, String password) throws Throwable {
        loginpage.meth_todoLogin(email,password);
    }

    @Then("^user should be log in sucessfully$")
    public void userShouldBeLogInSucessfully() throws Throwable {

        loginpage.meth_gotoHomepage();
    }

    @Then("^user should see unsucessfully message$")
    public void userShouldSeeUnsucessfullyMessage() throws Throwable {

    }


}
