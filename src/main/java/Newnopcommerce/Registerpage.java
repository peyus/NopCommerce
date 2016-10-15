package Newnopcommerce;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.Random;

/**
 * Created by Piyush on 12/09/2016.
 */
public class Registerpage extends BaseMain
{
    public void meth_todoRegister(String gender, String firstname, String lastname, String day, String month, String year, String email, String companyname, String password, String conformpassword)
    {


        //Define the  Webelemet
        System.out.println("I m on TODOREGISTER");
        // meth_reg_checktitle("Register - nopCommerce");
        selectGender(true);

        WebElement firstName = webdriver.findElement(By.name("FirstName"));
        firstName.sendKeys(firstname);

        WebElement lastName = webdriver.findElement(By.name("LastName"));
        lastName.sendKeys(lastname);


        WebElement WE_day = webdriver.findElement(By.name("DateOfBirthDay"));
        Select day_select = new Select(WE_day);
        day_select.selectByVisibleText(day);

        WebElement WE_month = webdriver.findElement(By.name("DateOfBirthMonth"));
        Select month_select = new Select(WE_month);
        month_select.selectByVisibleText(month);

        WebElement WE_year = webdriver.findElement(By.name("DateOfBirthYear"));
        Select year_select = new Select(WE_year);
        year_select.selectByVisibleText(year);

        WebElement WE_email = webdriver.findElement(By.id("Email"));
        WE_email.sendKeys((new Random()).nextInt()+email);


        WebElement newsletter = webdriver.findElement(By.id("Newsletter"));
        newsletter.click();



        WebElement WE_password = webdriver.findElement(By.id("Password"));
        WE_password.sendKeys(password);


        WebElement ConfirmPassword = webdriver.findElement(By.id("ConfirmPassword"));
        ConfirmPassword.sendKeys(conformpassword);



        WebElement submit = webdriver.findElement(By.name("register-button"));
        System.out.println("Get attribute demo-get value:" + submit.getAttribute("value"));
        submit.click();





//        WebElement firstname= webDriver.findElement(By.id("ctl00_ctl00_cph1_cph1_ctrlCustomerRegister_CreateUserForm_CreateUserStepContainer_txtFirstName"));
//        firstname.sendKeys("Peyus");
//
//        WebElement lastname=webDriver.findElement(By.id("ctl00_ctl00_cph1_cph1_ctrlCustomerRegister_CreateUserForm_CreateUserStepContainer_txtLastName"));
//        lastname.sendKeys("Keni");
//
//        WebElement email=webDriver.findElement(By.id("ctl00_ctl00_cph1_cph1_ctrlCustomerRegister_CreateUserForm_CreateUserStepContainer_Email"));
//        email.sendKeys("Peyus" + new Random().nextInt() + "@keni.com");
//
//
//        WebElement username=webDriver.findElement(By.id("ctl00_ctl00_cph1_cph1_ctrlCustomerRegister_CreateUserForm_CreateUserStepContainer_UserName"));
//        username.sendKeys("PeyusKeni"+ new Random().nextInt());
//
//        WebElement country=webDriver.findElement(By.id("ctl00_ctl00_cph1_cph1_ctrlCustomerRegister_CreateUserForm_CreateUserStepContainer_ddlCountry"));
//        Select month_select = new Select(country);
//        month_select.selectByVisibleText("United Kingdom");
//
//
//        WebElement password=webDriver.findElement(By.id("ctl00_ctl00_cph1_cph1_ctrlCustomerRegister_CreateUserForm_CreateUserStepContainer_Password"));
//        password.sendKeys("password");
//
//
//        WebElement conformpassword=webDriver.findElement(By.id("ctl00_ctl00_cph1_cph1_ctrlCustomerRegister_CreateUserForm_CreateUserStepContainer_ConfirmPassword"));
//        conformpassword.sendKeys("password");
//
//
//        WebElement submit=webDriver.findElement(By.id("ctl00_ctl00_cph1_cph1_ctrlCustomerRegister_CreateUserForm___CustomNav0_StepNextButton"));
//        submit.click();


    }

    public void selectGender(boolean male)
    {
        if (male)
        {
            WebElement gender_male = webdriver.findElement(By.id("gender-male"));
            gender_male.click();
        }
        else {

            WebElement gender_female = webdriver.findElement(By.id("gender-female"));
            gender_female.click();
        }
    }

    public void meth_reg_checktitle(String Aspected_Title)
    {

        String Actual_Title=webdriver.getTitle();
        System.out.println("I m on GET TITLE :"+Actual_Title);
        System.out.println("Actual_Title="+Actual_Title);
        System.out.println("Aspected_Title="+Aspected_Title);
        Assert.assertTrue(Actual_Title.equals(Aspected_Title));
    }
    public void meth_check_content(String str_cmpl_reg)
    {
        System.out.println("I m On  CHECK Content :"+str_cmpl_reg);
        WebElement content_DOM=webdriver.findElement(By.tagName("body"));

        //  Assert.assertEquals(content_DOM.getText(),str_cmpl_reg);

    }

public void meth_todo_logout()
{

    WebElement logout = webdriver.findElement(By.className("ico-logout"));
    logout.click();


}
}
