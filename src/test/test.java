package test;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;  

public class test {	
	

	public static void main(String[] args) throws InterruptedException {
		
		//for open the browser
		String userPC = System.getProperty("user.home");
		System.setProperty("webdriver.gecko.driver",  userPC + "/eclipse-workspace/test_bizzy/lib/geckodriver/geckodriver");
		FirefoxOptions option = new FirefoxOptions();
		option.setHeadless(false);		
		WebDriver driver = new FirefoxDriver(option);
		
		//get url
		driver.get("https://devexpress.github.io/testcafe/example/");
		
		//resize the window
		Dimension window = new Dimension(800, 500);
		driver.manage().window().setSize(window);
		
		//fill your name
		driver.findElement(By.xpath("//input[@id='developer-name']")).sendKeys("test");
		
		//click populate button
		driver.findElement(By.xpath("//input[@id='populate']")).click();
		
		//click ok notivication
		driver.switchTo().alert().accept();
			
		//select some important features
		driver.findElement(By.xpath("//input[@id='remote-testing']")).click();
		driver.findElement(By.xpath("//input[@id='reusing-js-code']")).click();
		driver.findElement(By.xpath("//input[@id='background-parallel-testing']")).click();
		driver.findElement(By.xpath("//input[@name='CI']")).click();
		driver.findElement(By.xpath("//input[@id='traffic-markup-analysis']")).click();
				
		//select primary operating system
		driver.findElement(By.xpath("//input[@id='windows']")).click();
		
		//select testcafe interface
		new Select(driver.findElement(By.id("preferred-interface"))).selectByVisibleText("JavaScript API");
	    
		//click I have tried testcafe
		driver.findElement(By.xpath("//input[@id='tried-test-cafe']")).click();
				
		//determine rate testcafe
		WebElement one = driver.findElement(By.xpath("//div[@id='slider']"));

        int borderWidth = 1;        
        Actions builder = new Actions(driver);

        builder.moveByOffset(one.getLocation().getX() + borderWidth, 
        one.getLocation().getY() + borderWidth).click().build().perform();
    
		
		//write note
		driver.findElement(By.xpath("//textarea[@id='comments']")).sendKeys("Ini hanya test");
		Thread.sleep(4000);
		//click submit button
		driver.findElement(By.xpath("//button[@id='submit-button']")).click();
		Thread.sleep(6000);
	
//		//close the window
		driver.quit();
		

	}

}
