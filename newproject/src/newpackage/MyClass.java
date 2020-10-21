package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyClass {
	
	public static void main(String[] args) throws InterruptedException
	{

	System.setProperty("webdriver.chrome.driver","C:\\Users\\SHERRYTower\\eclipse-workspace\\libs\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();

	// Navigate to a website
	driver.get("https://www.expedia.ca/");

	//Maximize current window
	driver.manage().window().maximize();

	// Begin Interaction with website
	
	driver.findElement(By.linkText("Flights")).click();
	
	//travelers
	//driver.findElement(By.linkText("2 travelers")).click();
	
	
	driver.findElement(By.xpath("//a[contains(text(), 'travellers')]")).click();		
	
	String p = driver.findElement(By.xpath("//a[contains(text(), 'travellers')]")).getText();
	String Firstchar=(p.replaceAll("(\\d+).+", "$1"));
	
	
		//System.out.println("This is p"+Firstchar);
   
	
    switch(Firstchar)
    {
    case "1":
    	   
    	driver.findElement(By.xpath("//*[@id='adaptive-menu']/div/div/section/div[1]/div[1]/div/button[2]")).click();
		driver.findElement(By.xpath("//button[contains(text(), 'Done')]")).click();
	  
		System.out.println("Case1: Value is: "+Firstchar);//enter two flights TAG"Increase adults" click "Done"
	    break;
	    
	  /// Since the default is always "2" i used this portion to test Decrease & Increase even though this case would be do nothing.
	    
	case "2":	
		// Decrease adult //*[@id="adaptive-menu"]/div/div/section/div[1]/div[1]/div/button[1]
		// Increase adult //*[@id="adaptive-menu"]/div/div/section/div[1]/div[1]/div/button[2]
		
		driver.findElement(By.xpath("//*[@id='adaptive-menu']/div/div/section/div[1]/div[1]/div/button[1]")).click();
		//driver.findElement(By.xpath("//*[@id='adaptive-menu']/div/div/section/div[1]/div[1]/div/button[2]")).click();
		driver.findElement(By.xpath("//button[contains(text(), 'Done')]")).click();

      System.out.println("Case2: Value is: "+Firstchar);//enter two flights (do nothing)
	  break;
	  
	case "3":
		driver.findElement(By.xpath("//*[@id='adaptive-menu']/div/div/section/div[1]/div[1]/div/button[1]")).click();
		driver.findElement(By.xpath("//button[contains(text(), 'Done')]")).click();
	  System.out.println("Case3: Value is: "+Firstchar);//enter two flights TAG"Decrease adults" by 1
	  break;
	  
	case "4":
		driver.findElement(By.xpath("//*[@id='adaptive-menu']/div/div/section/div[1]/div[1]/div/button[1]")).click();
		driver.findElement(By.xpath("//*[@id='adaptive-menu']/div/div/section/div[1]/div[1]/div/button[1]")).click();
		driver.findElement(By.xpath("//button[contains(text(), 'Done')]")).click();
	  System.out.println("Case3: Value is: "+Firstchar);//enter two flights TAG"Decrease adults" by 2
	  break;
	  
	case "5":
		driver.findElement(By.xpath("//*[@id='adaptive-menu']/div/div/section/div[1]/div[1]/div/button[1]")).click();
		driver.findElement(By.xpath("//*[@id='adaptive-menu']/div/div/section/div[1]/div[1]/div/button[1]")).click();
		driver.findElement(By.xpath("//*[@id='adaptive-menu']/div/div/section/div[1]/div[1]/div/button[1]")).click();
		driver.findElement(By.xpath("//button[contains(text(), 'Done')]")).click();
      System.out.println("Case3: Value is: "+Firstchar);//enter two flights TAG"Decrease adults" by 3
	  break;
	  
	case "6":
		driver.findElement(By.xpath("//*[@id='adaptive-menu']/div/div/section/div[1]/div[1]/div/button[1]")).click();
		driver.findElement(By.xpath("//*[@id='adaptive-menu']/div/div/section/div[1]/div[1]/div/button[1]")).click();
		driver.findElement(By.xpath("//*[@id='adaptive-menu']/div/div/section/div[1]/div[1]/div/button[1]")).click();
		driver.findElement(By.xpath("//*[@id='adaptive-menu']/div/div/section/div[1]/div[1]/div/button[1]")).click();
			
		driver.findElement(By.xpath("//button[contains(text(), 'Done')]")).click();
	  System.out.println("Case3: Value is: "+Firstchar);//enter two flights TAG"Decrease adults" by 4
	  break;
     }
			
	// CLASS Economy
	//driver.findElement(By.linkText("Economy")).click();
	
	
	//driver.findElement(By.linkText("//span[contains(text(), 'Travellers')]")).click();
	
	Thread.sleep(5000); 
	JavascriptExecutor js = (JavascriptExecutor)driver;
	
	//Identify "Leaving From"
    js.executeScript("document.getElementById('location-field-leg1-origin-input').click();");
    driver.findElement(By.id("location-field-leg1-origin")).sendKeys("YYZ");
    driver.findElement(By.id("location-field-leg1-origin")).sendKeys(Keys.RETURN);
    
    
    //Identify "Going to"
    js.executeScript("document.getElementById('location-field-leg1-destination-input').click();");
    driver.findElement(By.id("location-field-leg1-destination")).sendKeys("YHZ");
    driver.findElement(By.id("location-field-leg1-destination")).sendKeys(Keys.RETURN);
    
    //Filter lowest
 
    ////*[@id="sortDropdown"]/option[1]
    
    // select flight
    //select button - //*[@id="flight-module-2020-10-30t08:10:00-04:00-coach-yyz-yhz-ac-604_2020-10-31t05:25:00-03:00-coach-yhz-yyz-ac-603_"]/div[1]/div[2]/div[2]/div/div[2]/button
   
    //if xpath .isdisplay.click() // Select button
    ////*[@id="flight-module-2020-10-30t08:10:00-04:00-coach-yyz-yhz-ac-604_2020-10-31t05:25:00-03:00-coach-yhz-yyz-ac-603_"]/div[1]/div[2]/div[2]/div/div[2]/button/span/span[2]
    //else
    	//click on the other one.
    	
    	
    driver.findElement(By.xpath("//span[contains(text(), 'Search')]")).submit();
        
    System.out.println("PASSED");
    
	//Close the browser
    
	//driver.quit();
	} 
	}

