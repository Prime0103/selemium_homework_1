package nopcommetrce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultiBrowserTesting
{
    static String browser = "FireFox";

    static String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2";
    static WebDriver driver;

    public static void main(String[] args) {

        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("FireFox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else {
            System.out.println("Wrong Browser name");
        }
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        //Open Browser
        System.out.println(driver.getTitle());
        //Find Current URL
        System.out.println(driver.getCurrentUrl());
        //Print Page Source
        System.out.println(driver.getPageSource());

        //find the emailfield
        WebElement emailfield = driver.findElement(By.id("Email"));
        emailfield.sendKeys("abc123@gmail.com");

        //find the password field
        driver.findElement(By.name("Password")).sendKeys("abc123");

        //close the browser
        driver.close();

    }
}
