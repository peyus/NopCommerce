package Demo.nopcommerce;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Piyush on 13/09/2016.
 */
public class BaseMain
{


    //** declare the webdriver variable
    public static WebDriver webDriver;

    //**create the openbrowser function
    public void meth_openbrowser()
    {
        System.out.println("I M ON BASEMAIN");
        /*
        1.It checks the latest version of the WebDriver binary file
        2.It downloads the binary WebDriver if it is not present in your system
        3.It exports the required Java variable by Selenium WebDriver

        CHROME---ChromeDriverManager.getInstance().setup();
        IE--->InternetExplorerDriverManager.getInstance().setup();
        OPERA--->OperaDriverManager.getInstance().setup();
        EDGE--->EdgeDriverManager.getInstance().setup();
        PHANTOM--->PhantomJsDriverManager.getInstance().setup();
        MARIONETT--->MarionetteDriverManager.getInstance().setup();
        */

        ChromeDriverManager.getInstance().setup();

        /*
        * WebDriver is an Interface,
        * and we are defining a reference variable(webdriver) whose type is an interface.
        * Now any object we assign to it must be an instance of a class(ChromeDriver,FireFoxDriver,etc...)
        * that implements the interface."
        */
        webDriver = new ChromeDriver();


        /*
        Navigating
        The first thing you’ll want to do with WebDriver is navigate to a page. The normal way to do this is by calling get:
        driver.get("http://www.google.com");
        WebDriver will wait until the page has fully loaded (that is, the onload event has fired)
        before returning control to your test or script. It’s worth noting that if your page uses a lot of AJAX on load
        then WebDriver may not know when it has completely loaded. If you need to ensure such pages are fully loaded then you can use waits.
        Navigation: History and Location
        Earlier, we covered navigating to a page using
        the get command (driver.get("http://www.example.com")) As you’ve seen,
        WebDriver has a number of smaller, task-focused interfaces, and navigation is a useful task.
        Because loading a page is such a fundamental requirement,
        the method to do this lives on the main WebDriver interface,
        but it’s simply a synonym to:
        driver.navigate().to("http://www.example.com");
        To reiterate: navigate().to() and get() do exactly the same thing. One's just a lot easier to type than the other!
        The navigate interface also exposes the ability to move backwards and forwards in your browser’s history:

        driver.navigate().forward();
        driver.navigate().back();
        * */
        //webDriver.get("http://www.nopcommerce.com/");
        webDriver.get("http://demo.nopcommerce.com");


        //invoking browser using selenium it opens in maximized window
        webDriver.manage().window().maximize();


        /*An implicit wait is to tell WebDriver to poll the DOM
        for a certain amount of time
        when trying to find an element or elements
        if they are not immediately available.
        The default setting is 0. Once set,
        the implicit wait is set for the life of the WebDriver object instance.

        This means that we can tell Selenium
        that we would like it to wait for a certain amount of time
        before throwing an exception that it cannot find the element on the page.
        We should note that implicit waits will be in place
        for the entire time the browser is open.
        This means that any search for elements on the page could take the time the implicit wait is set for.


        Explicit Wait
        It is more extendible in the means that
        you can set it up to wait for any condition you might like.
        Usually, you can use some of the prebuilt ExpectedConditions to wait
        for elements to become clickable, visible, invisible, etc.

        Fluent Wait
        Each FluentWait instance defines the maximum amount of time to wait
        for a condition, as well as the frequency with which to check the condition.
        Furthermore, the user may configure the wait to ignore specific types of exceptions whilst waiting,
        such as NoSuchElementExceptions when searching for an element on the page.

       */
        webDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);//**set wait to browser through for find an element or elements



    }
    //create the quitbrowser function
    public void meth_quitbrowser()
    {
        System.out.println("I M ON BASEMAIN");
        webDriver.quit();
    }




}
