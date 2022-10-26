package selenium_Automation_Projects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Makemytrip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Git\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://uk.mytrip.com/rf/order-login");
		//driver.findElement(By.xpath("//header/div/button[1]")).click();
		//driver.findElement(By.)
		driver.close();
		System.out.println("The End");

	}

}
