package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SBI {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
		driver.manage().window().maximize();
		WebElement continue_to_login=	driver.findElement(By.linkText("CONTINUE TO LOGIN"));
		continue_to_login.click();
		WebElement un=	driver.findElement(By.name("userName"));
		un.sendKeys("Manisg543567");
		WebElement pwd=	driver.findElement(By.name("password"));
		pwd.sendKeys("bgy65redf");
	}

}
