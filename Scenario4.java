package practicejava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		driver.findElement(By.xpath(".//*[@id='header']/div[2]/div/div/nav/div[1]/a")).click();
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("s.awadhani2102@gmail.com");
		driver.findElement(By.xpath(".//*[@id='passwd']")).sendKeys("Sga@123");
		driver.findElement(By.xpath(".//*[@id='SubmitLogin']")).click();
		WebElement ele=driver.findElement(By.xpath(".//*[@id='center_column']/div[1]/ol/li"));
		String text=ele.getText();
		if(text.equals("Authentication failed.")) {
			System.out.println("login page failure validation is passed");
		}
		else {
			System.out.println("login page failure validation is failed ");
		}
		driver.close();
			
		}
	}


