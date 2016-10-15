package Demo.nopcommerce;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Created by Piyush on 13/09/2016.
 */
public class HomePage extends BaseMain
{
    public void meth_onhomepage()
    {
        System.out.println("I M ON ONHOMEPAGE");
        String Aspected_Title="nopCommerce demo store";
        meth_checktitle(Aspected_Title);
    }
    public void meth_checktitle(String Aspected_Title)
    {
        System.out.println("I M ON CHECKTITLE");
        String Actual_Title=webDriver.getTitle();
        System.out.println("I m on GET TITLE :"+Actual_Title);
        System.out.println("Actual_Title="+Actual_Title);
        System.out.println("Aspected_Title="+Aspected_Title);
        Assert.assertTrue(Actual_Title.equals(Aspected_Title));
    }
    public void meth_goto_RegisterPage()
    {
        System.out.println("I m on GOTO REGISTER PAGE");
        //webDriver.findElement(By.xpath("//a[@class='ico-register']")).click();
        WebElement register_link = webDriver.findElement(By.className("ico-register"));
        register_link.click();
    }
    public void meth_check_content(String str_cmpl_reg)
    {
        System.out.println("I m On  CHECK Content :"+str_cmpl_reg);
        WebElement content_DOM=webDriver.findElement(By.tagName("body"));

        Assert.assertTrue(content_DOM.getText().contains(str_cmpl_reg));

    }
}
