package pack01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemoMain {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Java Selenium\\BrowserDrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/droppable");
		
		Actions a=new Actions(driver);
		driver.findElement(By.xpath("//a[@id=\"droppableExample-tab-preventPropogation\"]")).click();
		WebElement source=driver.findElement(By.xpath("//div[@id=\"dragBox\"]"));
		WebElement target=driver.findElement(By.xpath("//div[@id=\"notGreedyDropBox\"]"));
		a.dragAndDrop(source, target).perform();
		driver.close();
		
		
		
		
	}

}
