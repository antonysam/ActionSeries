import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Keyevent {
	// Webdriver Declaration
	WebDriver d;

	public void keyevent() throws InterruptedException {
		
		// Provide chrome driver path
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\samdany\\Desktop\\chromedriver.exe");
        
        // Instantiating chrome driver
        d = new ChromeDriver();
        
        // Maximize the window
        d.manage().window().maximize();
        
        // Delete all cookies
        d.manage().deleteAllCookies();
        
        // Dynamic wait
        d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        // Load the URL
        d.get("https://opensource-demo.orangehrmlive.com/");
        
        // Locating the Webelement
        WebElement usrname = d.findElement(By.id("txtUsername"));
        
        // Instantiating Action class
        Actions act = new Actions(d);
        
        // Performing a group of mouse and keyboard events using Action class
        Action seriesOfAtions = act.moveToElement(usrname)
        		                    .doubleClick()
        		                    .keyDown(usrname, Keys.SHIFT)
        		                    .sendKeys(usrname, "hello")
                                    .keyUp(usrname, Keys.SHIFT)
                                    .build();
        
        // Performing the above series of action
        seriesOfAtions.perform();
        
        
        
	
	}

	public static void main(String[] args) throws InterruptedException {
       
		// Instantiating the Class
		Keyevent k = new Keyevent();

		// Calling the method
		k.keyevent();
	}

}
