package ashwini_JavaProjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Windows {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Git\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown = new Select(staticDropdown);
		dropdown.selectByIndex(2);
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByValue("INR");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByVisibleText("USD");
		driver.findElement(By.id("divpaxinfo")).click();
		/*int i=1;
		while (i<=5)
		{
			Thread.sleep(1000);
			driver.findElement(By.id("hrefIncAdt")).click();
			i++;
			System.out.println("The End");
		}*/
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		for (int i=1; i<=3; i++)
		{
			Thread.sleep(1000);
			driver.findElement(By.id("hrefIncAdt")).click();
			System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
		driver.findElement(By.xpath("//a[@value='MAA']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[@value='DEL'])[2]")).click();
		System.out.println("The End");
		driver.close();
}
	/*Thread.sleep(1000);
		driver.navigate().to("https://www.tesco.com");
		driver.navigate().back();
		driver.navigate().forward();*/
		
	}



