package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Firstcomefirstserve {

	public static void main(String[] args) throws InterruptedException 
	{
        ChromeDriver driver= new ChromeDriver();
        driver.get("https://www.amazon.in");
        WebElement e1 = driver.findElement(By.name("field-keywords"));
        e1.sendKeys("Shoes");
        Thread.sleep(2000);
        e1.sendKeys(Keys.ARROW_DOWN);
        e1.sendKeys(Keys.ENTER);
        //e1.sendKeys(Keys.DOWN);
        WebElement e2 = driver.findElement(By.xpath(("//a[@class='a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal']")));
        e2.click();
        
    }

}


//a-section aok-relative s-image-tall-aspect