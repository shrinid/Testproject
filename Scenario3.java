package practicejava;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Scenario3 {

	public static void main(String[] args) throws InterruptedException {
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
	   driver.findElement(By.xpath("//*[@id='homefeatured']/li[2]/div/div[2]/div[2]/a[2]/span")).click();
	   if (driver.findElement(By.xpath(".//*[@id='product_reference']")).getText().isEmpty())
	   {
		   System.out.println("product reference is empty");
	   }
	   if(driver.findElement(By.xpath(".//*[@id='product_condition']")).getText().isEmpty()){
		   System.out.println("product condition is empty");
	   }
	   if(driver.findElement(By.xpath(".//*[@id='short_description_content']/p")).getText().isEmpty()){
		  System.out.println("short description is empty"); 
	   }
	   String count1=driver.findElement(By.xpath(".//*[@id='quantity_wanted']")).getAttribute("value");
	   driver.findElement(By.xpath(".//*[@id='quantity_wanted_p']/a[2]/span/i")).click();
	   String count2=driver.findElement(By.xpath(".//*[@id='quantity_wanted']")).getAttribute("value");
	   int c1=Integer.parseInt(count1);
	   int c2=Integer.parseInt(count2);
	   if(c2-c1!=1) {
		   System.out.println("the product is not incremented ");
	   }
	   driver.findElement(By.xpath(".//*[@id='quantity_wanted_p']/a[1]/span/i")).click();
	   Select fruits = new Select(driver.findElement(By.xpath(".//*[@id='group_1']")));
	   fruits.selectByVisibleText("M");
	   Thread.sleep(2000);
	   
	   driver.findElement(By.xpath(".//*[@id='add_to_cart']/button")).click();
	  String temp1= driver.findElement(By.xpath(".//*[@id='layer_cart_product_attributes']")).getText();
	   System.out.println(temp1);
	   if(temp1.contains("M")==false) {
		   System.out.println("size is not selected");
	   }
		driver.close();
		
	
			
	}

}
