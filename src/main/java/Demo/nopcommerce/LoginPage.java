package Demo.nopcommerce;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Created by Piyush on 13/09/2016.
 */
public class LoginPage extends BaseMain
{
    public void meth_todoLogin(String email,String Password)
    {
        //meth_check_content("Welcome, Please Sign In!");

        WebElement username=webDriver.findElement(By.id("Email"));
        username.sendKeys(email);

        WebElement password=webDriver.findElement(By.id("Password"));
        password.sendKeys(Password);

        WebElement submit=webDriver.findElement(By.xpath("//input[@class='button-1 login-button']"));
        submit.click();
    }
    public void meth_gotoHomepage()
    {

        WebElement logout=webDriver.findElement(By.className("ico-logout"));
        logout.click();
    }
    public void meth_nottodoLogin(String email,String Password)
    {
        //meth_check_content("Welcome, Please Sign In!");

        WebElement username=webDriver.findElement(By.id("Email"));
        username.sendKeys(email);

        WebElement password=webDriver.findElement(By.id("Password"));
        password.sendKeys(Password);

        WebElement submit=webDriver.findElement(By.xpath("//input[@class='button-1 login-button']"));
        submit.click();

        meth_check_content("Login was unsuccessful. Please correct the errors and try again");
    }
    public void meth_check_content(String str_cmpl_reg)
    {
        System.out.println("I m On  CHECK Content :"+str_cmpl_reg);
        WebElement content_DOM=webDriver.findElement(By.tagName("body"));

        Assert.assertTrue(content_DOM.getText().contains(str_cmpl_reg));

    }

}
