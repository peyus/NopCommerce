package Newnopcommerce;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Created by peyus on 16/09/2016.
 */
public class Homepage extends BaseMain
{

        public void meth_onhomepage()
        {
            System.out.printf("I m on Hoem Page");
            String str_aspected="nopCommerce demo store";
            meth_checktitle(str_aspected);
        }
        public void meth_checktitle(String str_aspected)
        {
            System.out.printf("I m check  home title page");
            String str_actual=webdriver.getTitle();
            System.out.printf(str_actual);
            Assert.assertTrue(str_actual.equals(str_aspected));
        }
        public void meth_goto_registerpage()
        {
            System.out.printf("I m register page");
            WebElement register_link=webdriver.findElement(By.className("ico-register"));
            register_link.click();
        }
        public void meth_goto_login()
        {
            System.out.printf("I m login page");
            WebElement login_link=webdriver.findElement(By.className("ico-login"));
            login_link.click();
        }

}
