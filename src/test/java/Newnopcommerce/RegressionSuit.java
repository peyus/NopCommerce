package Newnopcommerce;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by peyus on 16/09/2016.
 */
public class RegressionSuit extends BaseMain
{
        Homepage homepage=new Homepage();
        Loginpage loginpage=new Loginpage();
        Registerpage registerpage=new Registerpage();
        Searchpage searchpage= new Searchpage();
        AddToCardpage add_t_card=new AddToCardpage();
        Categorypage category=new Categorypage();
    
    @Before
    public void setup()
    {
        System.out.printf("i m on setup");
        meth_open_browser();
    }

    @After
    public void teardown()
    {
        System.out.printf("i m on close browser");
        meth_close_browser();
    }

    @Given("^User on nopcommerce home page$")
    public void userOnNopcommerceHomePage() throws Throwable {
        homepage.meth_onhomepage();

    }

    @Then("^User should sucessfully login$")
    public void userShouldSucessfullyLogin() throws Throwable {

    }


    @When("^User Enter correct \"([^\"]*)\" and \"([^\"]*)\"$")
    public void userEnterCorrectAnd(String arg0, String arg1) throws Throwable {
        homepage.meth_goto_login();
        loginpage.meth_todo_login(arg0,arg1);
    }

    @Given("^User on Nopcomerce Home page$")
    public void userOnNopcomerceHomePage() throws Throwable {
        homepage.meth_onhomepage();
    }

    @When("^User goto the registration page$")
    public void userGotoTheRegistrationPage() throws Throwable {
        homepage.meth_goto_registerpage();

    }

    @And("^user fill all  details like \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
    public void userFillAllDetailsLike(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7, String arg8, String arg9) throws Throwable {
         registerpage.meth_todoRegister(arg0, arg1, arg2, arg3, arg4, arg5, arg6,arg7, arg8, arg9);
    }

    @Then("^user should see the message \"([^\"]*)\"$")
    public void userShouldSeeTheMessage(String arg0) throws Throwable {
         registerpage.meth_check_content("Your registration completed");
    }

    @And("^do logout$")
    public void doLogout() throws Throwable {
        registerpage.meth_todo_logout();
    }

    @When("^user goto \"([^\"]*)\"$")
    public void userGoto(String arg0) throws Throwable {

    }

    @Then("^user should be unsuccessfully registered$")
    public void userShouldBeUnsuccessfullyRegistered() throws Throwable {

    }

    @When("^user enter search item\"([^\"]*)\"$")
    public void userEnterSearchItem(String productname) throws Throwable {
         searchpage.meth_todosearch(productname);
    }

     

    @And("^no result fount with message \"([^\"]*)\"$")
    public void noResultFountWithMessage(String message) throws Throwable {
       searchpage.meth_checkForMsg(message);
    }


    @Then("^user should see item (\\d+) total$")
    public void userShouldSeeItemCountTotal(int expectedCount) throws Throwable {
        searchpage.meth_check_result(expectedCount);
    }


    @Then("^user should see the \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
    public void userShouldSeeThe(String item1, String item2, String item3) throws Throwable {


    category.meth_checkcategories(item1,item2,item3,3);


    }

    @And("^Toatal iteam shouls be '(\\d+)'$")
    public void toatalIteamShoulsBe(int number) throws Throwable {
    category.meth_todo_counttotal_item(number,3);
    }

    @Then("^user add product in card$")
    public void userAddProductInCard() throws Throwable {
    add_t_card.meth_todo_addcard();
    }


    @When("^user goto \"([^\"]*)\" and subcategory (\\d+)$")
    public void userGotoAndSubcategory(String cate, int cat_item) throws Throwable {
        category.meth_gotocategorypage(cate);
        if(cate=="Computers")
        {
            System.out.println("category====="+cate);
            category.meth_checkcategories("Desktops","Notebooks","Software",cat_item);
        }
        else if(cate=="Electronics")
        {
            System.out.println("category====="+cate);
            category.meth_checkcategories("Camera & photo","","",cat_item);
        }
        else if(cate=="Apparel")
        {
            System.out.println("category====="+cate);
            category.meth_checkcategories("","","",cat_item);
        }
        else if(cate=="Digital downloads")
        {
            System.out.println("category====="+cate);
            category.meth_checkcategories("","","",cat_item);
        }
        else if(cate=="Books")
        {
            System.out.println("category====="+cate);
            category.meth_checkcategories("","","",cat_item);
        }
        else if(cate=="Jewelry")
        {
            System.out.println("category====="+cate);
            category.meth_checkcategories("","","",cat_item);
        }
        else if(cate=="Gift Cards")
        {
            System.out.println("category====="+cate);
            category.meth_checkcategories("","","",cat_item);
        }
    }
    @Then("^user should see the (\\d+) and  (\\d+)$")
    public void userShouldSeeTheAnd(int total_count, int cat_cout) throws Throwable {
        category.meth_todo_counttotal_item(total_count,cat_cout);
    }



}
