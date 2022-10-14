package automation;

public class login {

	public static void main(String[] args) {

		String driverPath = System.getProperty("user.dir") + "\\Drivers\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", driverPath);
		
		ChromeDriver driver = new ChromeDriver();
		
		//OR
		
		//String driverPath = System.getProperty("user.dir") + "\\Drivers\\geckodriver.exe";
		
		//System.setProperty("webdriver.gecko.driver", driverPath);
				
		//FirefoxDriver driver = new FirefoxDriver();
		
		//OR
		
	//	String driverPath = System.getProperty("user.dir") + "\\Drivers\\msedgedriver.exe";
		
	//	System.setProperty("webdriver.edge.driver", driverPath);
						
	//	EdgeDriver driver = new EdgeDriver();
		
		
		driver.get("https://demo.actitime.com/login.do");
		

	}

}