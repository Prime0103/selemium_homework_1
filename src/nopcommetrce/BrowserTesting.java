package nopcommetrce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BrowserTesting
{
    public static void main(String[] args) {

        String baseurl = "https://demo.nopcommerce.com/login?returnUrl=%2";
        //setup the browser
        WebDriver driver = new ChromeDriver();
        //launch the Chrome browser
        driver.get(baseurl);

        //maximize browser
        driver.manage().window().maximize();

        //we give implicit wait to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        // get the title of the page.
        String title = driver.getTitle();
        System.out.println(title);

        //get the page source
        System.out.println("Page source :" + driver.getCurrentUrl());

        //get the page source
        System.out.println("Page source :" + driver.getPageSource());

        //find the login link
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();

        //find the email field
        WebElement emailfield = driver.findElement(By.name("Email"));
        emailfield.sendKeys("abc123@gmail.com");

        //find the password field
        driver.findElement(By.name("Password")).sendKeys("abc123");

        //closing the browser
        driver.close();
    }
}
