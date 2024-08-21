/*Utilize the methods GetTiltle(), quit(), close(), Getwindowhandles(), manage(), Getwindowhandle(), maximize(),
minimize() on the launched browsers.*/
package Selenium;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException 
	{
			ChromeDriver c1=new ChromeDriver();
			c1.get("https://www.google.co.in/");
			//c1.close();
			c1.manage().window().maximize();
			Thread.sleep(2000);
			FirefoxDriver d2=new FirefoxDriver();
			d2.get("https://www.mozilla.org/");
			c1.quit();
			Thread.sleep(2000);
			//always add driver.quit() cause it can quit everything whereas if 
			//you write c1.close() it will only close parent tab not the child
			System.out.println(c1.getWindowHandle());
			System.out.println(c1.getWindowHandles());
			c1.quit();
			}

}
