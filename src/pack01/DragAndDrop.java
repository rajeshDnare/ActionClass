package pack01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragAndDrop {
	@Test
	public void dragDrop() {
		System.setProperty("webdriver.chrome.driver", "D:\\Java Selenium\\BrowserDrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://testingshastra.com/assignments/drag-and-drop");
		
		WebElement source=driver.findElement(By.xpath("//h5[contains(text(),'Automation ')]"));
		WebElement target=driver.findElement(By.xpath("//h4[@class=\"ui-widget-header\"]"));
		
		Actions a=new Actions(driver);
		a.dragAndDrop(source, target).build().perform();
//		driver.close();
	}

}
