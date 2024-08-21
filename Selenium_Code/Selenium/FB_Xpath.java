package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FB_Xpath {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        WebElement e2= driver.findElement(By.xpath("(//input[@id='email'])"));
        e2.sendKeys("lucygaddam1994@gmail.com");
        WebElement e3 = driver.findElement(By.xpath("(//input[@id='pass'])"));
        e3.sendKeys("Lucy@1994");
        WebElement e4 = driver.findElement(By.xpath("(//button[@name='login'])"));
        e4.sendKeys(Keys.ENTER);

	}

}
