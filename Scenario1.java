package practicejava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Scenario1{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement ele =driver.findElement(By.xpath("//input[@id='search_query_top']"));
		ele.sendKeys("printed chiffon dress");
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='searchbox']/button")).click();
		Thread.sleep(2000);
	String	temp=driver.findElement(By.xpath("//div[@class='product-count']")).getText();
		System.out.println(temp);
		if(temp.contains("Showing 1")) {
			System.out.println("the search result is displayed");
		}
		driver.close();
		
		

		
		
                
         
	}

}
