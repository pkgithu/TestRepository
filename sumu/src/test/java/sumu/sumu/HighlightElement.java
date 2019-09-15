package sumu.sumu;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HighlightElement {
	static WebDriver driver;
	
	public static void main(String args[]) throws InterruptedException 
	{
		
		//System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver.exe");
		//System.setProperty("webdriver.firefox.driver", "C:\\SeleniumDrivers\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		 driver.get("https://google.co.in");
		 System.out.println(driver.getTitle());
		 
		 WebElement text=driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[3]/center/input[2]"));
		 
		 
		 
		 //JavascriptExecutor js= ((JavascriptExecutor)driver);
		 
		 //js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');",text);
		 
		 
		 highlightElement("5", "solid", "red", text);
		 Thread.sleep(50);
		 
		 
				 
		 driver.quit();
	}
	public static void highlightElement(String a, String type, String color, WebElement element) throws InterruptedException
	 {
		
		 JavascriptExecutor js= ((JavascriptExecutor)driver);
		 for(int i = 0; i< 6; i++) {
			 js.executeScript("arguments[0].style.border = '" + a + "px " + type + " " + color+ "';",element);
			
			 Thread.sleep(250);
			 js.executeScript("arguments[0].style.border = 'none'"
			 		+ ";",element);
			 Thread.sleep(250);
		 }
		 
		 
	 }
}
