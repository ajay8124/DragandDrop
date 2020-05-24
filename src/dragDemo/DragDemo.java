package dragDemo;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DragDemo {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chromedriver","D:\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		String URL =("https://jqueryui.com/droppable/");
		driver.get(URL);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Actions action=new Actions(driver);
		WebElement draggable =driver.findElementByClassName("ui-widget-content ui-draggable ui-draggable-handle");
		WebElement droppable =driver.findElementByClassName("ui-widget-header ui-droppable");
		
		
action.dragAndDrop(draggable,droppable).build().perform();
	}
}
