package week2day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;


public class assign_fb {

		public static void main(String[]args) {
			WebDriverManager.edgedriver().setup();
			//EdgeDriver driver=new ChromeDriver();
			EdgeDriver driver=new EdgeDriver();
			driver.get("https://en-gb.facebook.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.findElement(By.linkText("Create New Account")).click();
			driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("NAGARAJ");
			driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("MURUGAN");
			driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("ndurai963@gmail.com");
			driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("ndurai963@gmail.com");
			driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("750286Nagaraj@");
		
			WebElement launch = driver.findElement(By.name("birthday_day"));
			Select obj=new Select(launch);
			obj.selectByValue("5");
			
			WebElement launch1 = driver.findElement(By.name("birthday_month"));
			Select obj1=new Select(launch1);
			obj1.selectByValue("12");
			
			WebElement launch2 = driver.findElement(By.name("birthday_year"));
			Select obj2=new Select(launch2);
			obj2.selectByValue("1999");
			
			driver.findElement(By.xpath("//input[@value='2']")).click();
			driver.findElement(By.xpath("//button[@name='websubmit']")).click();
			
			
		//	driver.close();
			
			
		}
}
