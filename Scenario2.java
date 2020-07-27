package practicejava;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		JavascriptExecutor jsx=((JavascriptExecutor)driver);
	    jsx.executeScript("window.scrollBy(0,800)");
	   Actions act =new Actions(driver);
	   WebElement mouse=driver.findElement(By.xpath(".//*[@id='homefeatured']/li[2]/div/div[2]/h5/a"));
	   act.moveToElement(mouse).perform();
	   driver.findElement(By.xpath(".//*[@id='homefeatured']/li[2]/div/div[2]/div[2]/a[1]/span")).click();
	   String temp=driver.findElement(By.xpath(".//*[@id='layer_cart']/div[1]/div[1]/h2/i")).getAttribute("class");
	   System.out.println(temp);
	   if(temp.contains("icon-ok")) {
		   System.out.println("sucessfully added to cart");
	   }
	   driver.close();
	}

}
