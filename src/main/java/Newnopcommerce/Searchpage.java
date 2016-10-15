package Newnopcommerce;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Created by peyus on 16/09/2016.
 */
public class Searchpage extends BaseMain
{
    public void meth_todosearch(String productname)
    {
        WebElement search = webdriver.findElement(By.name("q"));
        search.sendKeys(productname);

        WebElement search_button = webdriver.findElement(By.xpath("//input[@value='Search']"));
        search_button.click();
    }

    public void meth_checkForMsg(String text)
    {
        WebElement content_ui = webdriver.findElement(By.tagName("body"));

        System.out.println(content_ui.getText());

        Assert.assertTrue(content_ui.getText().contains(text));
    }
    public void meth_check_result(int expectedCount )
    {

        List<WebElement> results = webdriver.findElements(By.className("item-box"));

        int result_count = results.size();

        System.out.println("total result is-----=="+result_count);
        Assert.assertEquals(expectedCount,result_count);
    }








}
