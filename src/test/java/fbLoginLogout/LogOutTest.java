package fbLoginLogout;

public class LogOutTest {
  @Test
public void logout()
{
	WebDriver driver;
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	//String URL=System.getProperty("url");
	//driver.get(URL);
	driver.get("https://www.facebook.com/");
	Reporter.log("loggedout Successfully",true);
	//hello all
}
}
