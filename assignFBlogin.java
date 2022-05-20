package week2day1;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class assignFBlogin {
	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
	//	ChromeDriver driver=new ChromeDriver();
		EdgeDriver driver=new EdgeDriver();
	
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("email")).sendKeys("8300772315");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("6374799nagaraj@");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
		
		
		//driver.close();
				
}
}		  