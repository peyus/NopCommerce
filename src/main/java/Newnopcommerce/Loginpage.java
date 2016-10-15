package Newnopcommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by peyus on 16/09/2016.
 */
public class Loginpage extends BaseMain
{
    public void meth_todo_login(String email,String password)
    {
        System.out.printf("I m on todo login");
        WebElement username=webdriver.findElement(By.id("Email"));
        username.sendKeys(email);

        WebElement Password=webdriver.findElement(By.id("Password"));
        Password.sendKeys(password);

        WebElement submit= webdriver.findElement(By.xpath("//input[@class='button-1 login-button']"));
        submit.click();
    }
}
