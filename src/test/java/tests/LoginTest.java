package tests;

import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import pages.LoginPage;

public class LoginTest extends TestBase {
	
	LoginPage Admin;
	
	@Test
	public void Admin_login()
	{
		Admin = new LoginPage(driver);
		Admin.login("admin@monshaat.com", "root");
	}
	
	@AfterTest
	public void endDriver()
	{
		driver.quit();
	}

}
