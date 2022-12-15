package com.hrms.testscripts;
import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;
import com.hrms.lib.General;

public class TC_002{ 
public void before(){

}

@Test
	public void m1() throws Exception{
		// Test Steps
	DOMConfigurator.configure("log4j.xml");
		General obj = new General();
		obj.openApplication();
		
		obj.login();
		obj.enterFrame();
		obj.addNewEmp();
		obj.exitFrame();

		obj.logout();
		obj.closeApplication();
		
			}

}


