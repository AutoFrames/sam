package com.hrms.testscripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.lib.General;

public class TC_004 {
@Test
	public void tc_004()throws Exception {
		// Test Steps
	DOMConfigurator.configure("log4j.xml");
		General obj = new General();
		obj.openApplication();
		obj.login();
		obj.enterFrame();
		//obj.addNewEmp();
		//obj.edit();
		obj.DeleteEmpty();
		obj.exitFrame();
		obj.logout();
		obj.closeApplication();

	}

}
