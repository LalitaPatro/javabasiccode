package Selenium;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebooklogin {

	public static void main(String[] args) 
	{
        ChromeDriver driver = new ChromeDriver();
                
        driver.findElement(By.name("email")).sendKeys("lucygaddam1994@gmail.com");
        driver.findElement(By.name("pass")).sendKeys("Lucy@1994");
        driver.findElement(By.name("login")).sendKeys(Keys.ENTER);
        driver.quit();
        
        
       
	}
}
