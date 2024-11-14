package testcases;

	import java.io.FileInputStream;
	import java.io.IOException;
	import java.time.Duration;
	import java.util.Properties;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

	public class TestBase {

		WebDriver driver;
		Properties prop;
		public void readprop() throws IOException {
			prop = new Properties();
			FileInputStream fileinp = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\config.properties");
			prop.load(fileinp);

		}
	@BeforeClass
		public void basesetup() throws IOException {
			
		readprop();
		String browsername = prop.getProperty("browser");
		if(browsername.equalsIgnoreCase("chrome")) {
			driver= new ChromeDriver();
		}else if(browsername.equalsIgnoreCase("firefox")){
			driver = new FirefoxDriver();
		}
		
		driver.get(prop.getProperty("url"));

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		}

	}


