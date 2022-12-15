package com.hrms.lib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import com.hrms.utility.Log;

import org.openqa.selenium.By;
public class General extends Global{

		public void openApplication() {
			
	System.setProperty("webdriver.chrome.driver","C:\\Driver\\chromedriver_win32\\chromedriver.exe");
	
	driver =  new ChromeDriver();
	driver.navigate().to(URL);
System.out.println("Application  Opened");
Reporter.log("Application Opened");
Log.info("Application Opened");
	}
		
public void closeApplication() {
	driver.quit();
	System.out.println("Application  closed");
	Reporter.log("Application Closed");
	Log.info("Application Closed");	
}
public void login()  throws Exception{
	driver.findElement(By.name(txt_loginname)).sendKeys(Username);
	driver.findElement(By.name(txt_password)).sendKeys(Password);
	driver.findElement(By.name(btn_login)).click();
	Thread.sleep(5400);
System.out.println("Login Completed");
Reporter.log("Login Completed");
Log.info("Login Completed");
}

public void logout() {
	driver.findElement(By.linkText(link_logout)).click();
	System.out.println("Logout completed");
	Reporter.log("Logout completed");
	Log.info("Logout completed");
}
public void enterFrame() {
	driver.switchTo().frame(frame_empinfo);
	System.out.println("Entered into Frame");
	Reporter.log("Entered into Frame");
	Log.info("Entered into Frame");
}
public void  addNewEmp()  throws Exception{
	driver.findElement(By.xpath(btn_Add)).click();
	driver.findElement(By.name(Add_EFN)).sendKeys(FirstName);
	driver.findElement(By.name(Add_ELN)).sendKeys(LastName);
	driver.findElement(By.id(btn_Save)).click();
	Thread.sleep(5200);
	System.out.println("New  Emp added");
	Reporter.log("New  Emp added");
	Log.info("New  Emp added");
}
public void edit()  throws Exception{
	driver.findElement(By.name(Edit_btn )).click();
	driver.findElement(By.name(txt_EditFN )).clear();
	driver.findElement(By.name(txt_EditLN )).clear();
   driver.findElement(By.name( Edit_EFN )).sendKeys( Ed_FN);
	driver.findElement(By.name(Edit_ELN)).sendKeys( Ed_LN);
	driver.findElement(By.xpath( Save_btn)).click();
	Thread.sleep(5400);
	System.out.println("Edit Employee ");
	Reporter.log("Edit Employee");
	Log.info("Edit Employee");
}


public void exitFrame() {
	driver.switchTo().defaultContent();
	System.out.println("Exit into frame");
	Reporter.log("Exit into frame");
	Log.info("Exit into frame");
}
public void DeleteEmpty() throws Exception{
Select st = new Select(driver.findElement(By.name("loc_code")));
st.selectByVisibleText("Emp. ID");
driver.findElement(By.name(txt_Searchby));
driver.findElement(By.name(txt_Searchfor)).sendKeys(ID);
driver.findElement(By.xpath(Search_btn )).click();
driver.findElement(By.xpath(Checkbox)).click();
driver.findElement(By.xpath(Delete_btn)).click();
Thread.sleep(5200);
System.out.println("Delete Employee");
Reporter.log("Delete Employee");
Log.info("Delete Employee");
}
}














