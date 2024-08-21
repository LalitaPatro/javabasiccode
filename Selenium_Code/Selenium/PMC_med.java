package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class PMC_med {

	public static void main(String[] args) throws InterruptedException 
	{
	      ChromeDriver c1 = new ChromeDriver();
	      c1.get("https://www.apollopharmacy.in/");
	      c1.manage().window().maximize();
	      Thread.sleep(2000);
	      WebElement w1= c1.findElement(By.xpath("//div[@class='Home_searchSelectMain__VL1lN']"));
	     // WebElement w1= c1.findElement(By.partialLinkText("Search Medicines"));
	      Thread.sleep(1000);
	      w1.sendKeys("PMC"); w1.sendKeys( Keys.ENTER);
	      
	      

	}

}
