package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HDFCRegiter {

	public static void main(String[] args) throws InterruptedException 
	{
		 ChromeDriver driver = new ChromeDriver();
		 /*driver.get("https://www.hdfcbank.com/personal/resources/ways-to-bank/online-banking/new-net-banking");
		 driver.manage().window().maximize();*/
		 
		 driver.get("https://mybusiness.digital.hdfcbank.com/register");
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
		 WebElement username=driver.findElement(By.id("registeration_email"));
		 username.sendKeys("patro.lalita23@gmail.com");
		 WebElement mobno=driver.findElement(By.id("registeration_mobile_no"));
		 mobno.sendKeys("7039394553");
		 WebElement custid=	driver.findElement(By.id("registeration_userid"));
		 custid.sendKeys("Lali12312");
		 WebElement pwd=driver.findElement(By.id("registeration_new_password"));
		 pwd.sendKeys("bgy65@redfL");
		 WebElement npwd=driver.findElement(By.id("registeration_confirm_password"));
		 npwd.sendKeys("bgy65@redfL");
		 
		 
		 

	}

}
