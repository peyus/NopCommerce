package Demo.nopcommerce;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.Random;

/**
 * Created by Piyush on 13/09/2016.
 */
public class RegistrationPage extends BaseMain
{
    public void meth_todoRegister(String gender, String firstname, String lastname, String day, String month, String year, String email, String companyname, String password, String conformpassword) {


        //Define the  Webelemet
        System.out.println("I m on TODOREGISTER");
        // meth_reg_checktitle("Register - nopCommerce");
        selectGender(true);

        WebElement firstName = webDriver.findElement(By.name("FirstName"));
        firstName.sendKeys(firstname);

        WebElement lastName = webDriver.findElement(By.name("LastName"));
        lastName.sendKeys(lastname);


        WebElement WE_day = webDriver.findElement(By.name("DateOfBirthDay"));
        Select day_select = new Select(WE_day);
        day_select.selectByVisibleText(day);

        WebElement WE_month = webDriver.findElement(By.name("DateOfBirthMonth"));
        Select month_select = new Select(WE_month);
        month_select.selectByVisibleText(month);

        WebElement WE_year = webDriver.findElement(By.name("DateOfBirthYear"));
        Select year_select = new Select(WE_year);
        year_select.selectByVisibleText(year);

        WebElement WE_email = webDriver.findElement(By.id("Email"));
        WE_email.sendKeys((new Random()).nextInt() + email);


        WebElement newsletter = webDriver.findElement(By.id("Newsletter"));
        newsletter.click();


        WebElement WE_password = webDriver.findElement(By.id("Password"));
        WE_password.sendKeys(password);


        WebElement ConfirmPassword = webDriver.findElement(By.id("ConfirmPassword"));
        ConfirmPassword.sendKeys(conformpassword);


        WebElement submit = webDriver.findElement(By.name("register-button"));
        System.out.println("Get attribute demo-get value:" + submit.getAttribute("value"));
        submit.click();


        meth_check_content("Your registration completed");


    }

    public void selectGender(boolean male)
    {
        if (male)
        {
            WebElement gender_male = webDriver.findElement(By.id("gender-male"));
            gender_male.click();
        }
        else {

            WebElement gender_female = webDriver.findElement(By.id("gender-female"));
            gender_female.click();
        }
    }
    public void meth_check_content(String str_cmpl_reg)
    {
        System.out.println("I m On  CHECK Content :"+str_cmpl_reg);
        WebElement content_DOM=webDriver.findElement(By.tagName("body"));

         Assert.assertTrue(content_DOM.getText().contains(str_cmpl_reg));

    }
    }
