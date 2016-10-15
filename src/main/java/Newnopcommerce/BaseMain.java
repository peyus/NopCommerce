package Newnopcommerce;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by peyus on 16/09/2016.
 */
public class BaseMain {
    public static WebDriver webdriver ;
    public void meth_open_browser()
    {
        System.out.printf("I m on open browser..........");
        ChromeDriverManager.getInstance().setup();
        webdriver=new ChromeDriver();
        webdriver.get("http://demo.nopcommerce.com");
        webdriver.manage().window().maximize();
        webdriver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

    }
public void meth_close_browser()
{
    webdriver.quit();
}






}
