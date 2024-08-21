/* Write a program for absolute xpath*/
package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateMKT {

	public static void main(String[] args)
	{
         ChromeDriver d1= new ChromeDriver();
         d1.get("file:///C:/Users/Lalita/Desktop/Automation/Manish/learningHTML1.html");
         WebElement un = d1.findElement(By.name("username"));
         un.sendKeys("Lalita@123");
         WebElement ht = d1.findElement(By.name("say hello"));
         ht.sendKeys("myself");
         WebElement pwd = d1.findElement(By.name("password"));
         pwd.sendKeys("Savi@231");
         WebElement fn = d1.findElement(By.name("fname"));
         fn.sendKeys("Lalita Patro");
         WebElement e1= d1.findElement(By.xpath(("(/html/body/form[2]/input[2])")));
         e1.click();
         WebElement e2= d1.findElement(By.xpath(("(//input)[12]"))); e2.click();
         WebElement e3= d1.findElement(By.xpath("(/html/body/input[6])")); e3.click();//absolute xpath
         WebElement e4= d1.findElement(By.xpath(("(/html/body/a)")));
         e4.click();
         
         
         
    }

}
