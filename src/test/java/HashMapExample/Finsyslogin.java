package HashMapExample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Finsyslogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://localhost:90/finsys/login.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		String UserCredentials = Data.getUserLoginInfo().get("User");
		//Thread.sleep(1000);
		String UserInfo[] = UserCredentials.split(", ");
		//Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='mainwindow']/center/form/div[2]/div[2]/div[1]/span/input[1]")).sendKeys(UserInfo[0]);
		//Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='mainwindow']/center/form/div[2]/div[2]/div[2]/span/input[1]")).sendKeys(UserInfo[1]);
		
		WebElement LoginBtn = driver.findElement(By.xpath(".//*[@id='mainwindow']/center/form/div[2]/div[2]/div[4]/a/span"));
		JavascriptExecutor js =(JavascriptExecutor) driver;
		//Thread.sleep(2000);
		js.executeScript("arguments[0].click();", LoginBtn);

	}

}
