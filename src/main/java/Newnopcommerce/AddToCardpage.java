package Newnopcommerce;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by peyus on 16/09/2016.
 */
public class AddToCardpage extends BaseMain
{
    public void meth_todo_addcard()
    {
        WebElement addtocard=webdriver.findElement(By.xpath("//div[@class='buttons']//input[@class='button-2 product-box-add-to-cart-button']"));
        addtocard.click();

//
//        WebDriverWait wait = new WebDriverWait(webdriver,10);
//
//        wait.until(new ExpectedCondition<Boolean>() {
//            public Boolean apply(WebDriver driver) {
//                WebElement button = driver.findElement(By.xpath("//li[@id='topcartlink']//a[@class='ico-cart']//span[@class='cart-qty']"));
//                String enabled = button.getAttribute("aria-disabled");
//                if(enabled.equals("true"))
//                    return true;
//                else
//                    return false;
//            }
//        });


//        WebElement close=webdriver.findElement(By.className("close"));
//        close.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement total_addtocard=webdriver.findElement(By.xpath("//li[@id='topcartlink']//a[@class='ico-cart']//span[@class='cart-qty']"));
        total_addtocard.getText();
        Assert.assertEquals(total_addtocard.getText(),"(1)");

        WebElement shop_card=webdriver.findElement(By.xpath("//li[@id='topcartlink']//a[@class='ico-cart']//span[@class='cart-label']"));
        shop_card.click();
    }

}
