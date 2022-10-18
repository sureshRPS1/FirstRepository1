package testPackage;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

class B extends TestClass{
	public void display() {
		//display1();	
			//new TestClass().display1();
			System.out.println("Test");
		}
}

public  class  TestClass {

	
	
	public  void display() {
	//display1();	
		//new TestClass().display1();
		System.out.println("Test");
	}
	
	public void display1() {
		display();
	}
	
	
	
	public static void main(String[] args) throws IOException, InstantiationException, IllegalAccessException {
		// TODO Auto-generated method stub
		//B tc = B.class.newInstance();
		//B tc= new B();
		//tc.display();
//System.setProperty("wedriver.chrome.driver","C:\\Users\\moharaj\\Downloads\\chromedriver_win32\\chromedriver.exe");
//	WebDriver driver  = new ChromeDriver();
//	driver.get("https://login.veevavault.com/");
//	TakesScreenshot ts = (TakesScreenshot) driver;
//	File src = ts.getScreenshotAs(OutputType.FILE);
//	File targ = new File ("\\test.png");
//	FileUtils.copyFile(src,targ);
//	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
//	WebDriverWait wait = new WebDriverWait(driver,10);
//	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("")));
	}

}
