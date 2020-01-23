package co.lexis.test;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class test {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = 	new ChromeDriver();
		
		driver.get("http://google.com/");
		driver.manage().window().maximize();
		
		WebElement search_box = driver.findElement(By.name("q"));
		search_box.sendKeys("LexisNexis");
		search_box.submit();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		WebElement third_link = driver.findElement(By.xpath("//*[@id='rso']//div[3]/div/div[2]/div/div/div[1]/a/h3"));
		third_link.click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		String page_title = driver.getTitle();
		System.out.println("Third link's page title is: " + page_title);
		
		
	}

}
