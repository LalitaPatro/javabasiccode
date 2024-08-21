package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Copypaster {

	public static void main(String[] args) throws InterruptedException 
	{
	   ChromeDriver driver = new ChromeDriver();   
	   driver.get("https://grotechminds.com/registration/");
	   driver.manage().window().maximize();
	   WebElement e1= driver.findElement(By.name("fname"));		
	   e1.sendKeys("Rama");
	   e1.sendKeys(Keys.CONTROL+"a");
	   e1.sendKeys(Keys.CONTROL+"c");
	   WebElement e2= driver.findElement(By.name("lname"));		
	   e2.sendKeys(Keys.CONTROL+"v");
	   Thread.sleep(2000);
	   driver.close();
	
	
	}

}
