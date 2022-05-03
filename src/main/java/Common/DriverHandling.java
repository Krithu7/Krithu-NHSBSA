package Common;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.WebDriver;



public class DriverHandling
{
	
	protected static int PAGE_LOAD_TIMEOUT = 50;
	protected static int IMPLICIT_WAIT = 10;	
	public static WebDriver driver;
	
	//For Running in Local Machine
	public static final String chromedriverpath;
    public static final String firefoxdriverpath;
    public static final String iedriverpath;
    
    public boolean AutoBindFlag = false;
    
    static 
    {
    	chromedriverpath = "src//main//resources//chromedriver.exe";
    	firefoxdriverpath = "src//main//resources//geckodriver.exe";
    	iedriverpath = "src//main//resources//IEDriverServer.exe";
    }
    
    public static void initialization(String browser, String URL) throws Exception
	{ 	
    	
    	//For Docker
    	try
    	{    			
    	
    	/*if(browser.equalsIgnoreCase("firefox"))
		{
			 DesiredCapabilities dc = DesiredCapabilities.firefox();
			 driver = new RemoteWebDriver (new URL("http://192.168.40.56:4444/wd/hub"),dc);
		}
		
		else if(browser.equalsIgnoreCase("chrome"))
		{
			 DesiredCapabilities dc = DesiredCapabilities.chrome();
			 driver = new RemoteWebDriver (new URL("http://192.168.40.56:4444/wd/hub"),dc);
		}*/
    	
		//For Running in Local Machine
    	System.setProperty("webdriver.chrome.driver",chromedriverpath);
    	
    	
    	Map<String, Object> prefs = new HashMap<String, Object>();
    	prefs.put("profile.default_content_settings.popups", 0);
    	prefs.put("pdfjs.disabled", true);
    	prefs.put("download.prompt_for_download", "false");
    	prefs.put("safebrowsing.enabled", "true");
    	prefs.put("directory_upgrade","true");
    	prefs.put("plugins.always_open_pdf_externally", true);
    	

    	ChromeOptions options = new ChromeOptions();
    	options.setExperimentalOption("prefs", prefs);
    	DesiredCapabilities cap = DesiredCapabilities.chrome();
    	cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
    	cap.setCapability(ChromeOptions.CAPABILITY, options);
    	
    	driver = new ChromeDriver(options);
    	driver.manage().window().maximize();
    	driver.manage().deleteAllCookies();
    	driver.manage().timeouts().pageLoadTimeout(PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
    	driver.manage().timeouts().implicitlyWait(IMPLICIT_WAIT, TimeUnit.SECONDS); 

        driver.get(URL);
    	}
    	catch (Exception e) 
    	{
    		throw new Exception("ERROR IN OPENING BROWSER", e);
		}
		
    }
    	
	public static void deinitialization()
	{
		System.out.println("BROWSER CLOSE");
    	driver.quit();
	}

		
}

