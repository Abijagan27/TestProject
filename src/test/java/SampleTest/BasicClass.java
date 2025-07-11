package SampleTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicClass {

    public static void main(String args[]) throws InterruptedException {
        System.out.print("test");
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.mycontactform.com/");
        driver.manage().window().maximize();

        WebElement text=driver.findElement(By.id("user"));
        text.sendKeys("sridhar");
//        driver.findElement(By.id("user")).sendKeys("sridhar");
        driver.findElement(By.id("pass")).sendKeys("yewtr43tr");
        driver.findElement(By.name("btnSubmit")).click();
        Thread.sleep(2000);
        driver.close();
    }
}
