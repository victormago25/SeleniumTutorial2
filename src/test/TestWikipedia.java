package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;

public class TestWikipedia {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
//		System.setProperty("webdriver.ie.driver", "C:\\Users\\v.gomez\\Desktop\\Selenium\\IEDriverServer.exe");
//		WebDriver driver = new InternetExplorerDriver();
		driver.get("http://www.wikipedia.org");
		WebElement link;
		link = driver.findElement(By.linkText("English"));
		link.click();
		Thread.sleep(5000);
		WebElement cajita;
		cajita = driver.findElement(By.id("searchInput"));
		cajita.sendKeys("Software");
		cajita.submit();
		Thread.sleep(5000);
		driver.quit();
	}

}
