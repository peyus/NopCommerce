package Newnopcommerce;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by peyus on 17/09/2016.
 */
public class Categorypage extends BaseMain
{
    public void meth_gotocategorypage( String category)
    {

        WebElement Computers_cat=webdriver.findElement(By.linkText(category));
        Computers_cat.click();

    }
   public void meth_checkcategories(String item1,String item2,String item3,int cat_item)
   {

       System.out.println("I M item page.......");
       List<WebElement> total_categories=webdriver.findElements(By.xpath("//div[@class='category-grid sub-category-grid']//div[@class='item-grid']//div[@class='item-box']"));

       List items = new ArrayList();

       items.add(item3);
       items.add(item2);
       items.add(item1);

        int result_count = total_categories.size();
            for (int i=cat_item;i>=1;i--)
            {
                WebElement item_info=total_categories.get(total_categories.size()-i);
                WebElement cat_title=item_info.findElement(By.className("title"));
                String actual_item1=cat_title.getText();
                Assert.assertEquals(actual_item1,items.get(i-1));
                System.out.println(i+"_item title is== "+cat_title.getText());
                System.out.println(i+"_total categories are===="+result_count);
            }


   }


   public void meth_todo_counttotal_item(int cate_count,int total_count)
   {

       System.out.println("I M meth_todo_counttotal_item.......");
//       WebElement total_categories_item=webdriver.findElement(By.id("products-pagesize"));
//       total_categories_item.sendKeys(Integer.toString(total_count));

        if(cate_count!=0)
        {
            List<WebElement> total_categories_count=webdriver.findElements(By.xpath("//div[@ class='category-grid sub-category-grid']//div[@class='item-box']"));
            int actual_cat_count=total_categories_count.size();
            System.out.println("actual_cat_count====="+actual_cat_count);
            Assert.assertEquals(cate_count,actual_cat_count);
        }



       List<WebElement> total_item_page=webdriver.findElements(By.xpath("//div[@class='product-grid']//div[@class='item-grid']//div[@class='item-box']"));
       int add_total_item=total_item_page.size();
       if(add_total_item>=6)
       {
           WebElement total_categories_item=webdriver.findElement(By.xpath("//li[@class='individual-page']"));
           total_categories_item.click();
           total_item_page=webdriver.findElements(By.xpath("//div[@class='product-grid']//div[@class='item-grid']//div[@class='item-box']"));
           add_total_item+=total_item_page.size();
       }


       System.out.println("add_total_item===="+add_total_item);
       Assert.assertEquals(total_count,add_total_item);
   }

}
