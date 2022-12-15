package com.hrms.lib;

import org.openqa.selenium.WebDriver;

public class Global {

	
		//To Provide Test Data and Objects of Whole Application
	public WebDriver driver;	
	//****************Test Data*******************
		
	public String URL = "http://183.82.103.245/nareshit/login.php";
   public  String Username ="nareshit";
   public  String Password = "nareshit";
   public String  FirstName    ="VinodKumar";
   public String LastName      = "Nandyala";
   // Edit Names
   public String Ed_FN    = "Rosaiah";
   public String Ed_LN   = "Nandyala";
   //*************Objects***********
   public  String txt_loginname   ="txtUserName";
   public  String txt_password    = "txtPassword";
   public  String  btn_login      =  "Submit";
   public  String link_logout     = "Logout";
   //Add Employee
   public  String frame_empinfo   = "rightMenu";
   public  String   btn_Add       = "//input[@value='Add']";
   public String    btn_Save      ="btnEdit";
   public String   Add_EFN        ="txtEmpFirstName";
   public String  Add_ELN         ="txtEmpLastName";
   //Edit Names
   public  String   txt_EditFN    ="txtEmpFirstName";
   public  String   txt_EditLN    ="txtEmpLastName";
   public  String   Edit_btn      = "EditMain";
   public String   Edit_EFN       = "txtEmpFirstName";
    public String  Edit_ELN       = "txtEmpLastName";
    public String  Save_btn       ="//input[@value='Save']";
  //  Delete Employee
    public String  txt_Searchby  ="loc_code";
    public String txt_Searchfor  ="loc_name";
    public String Search_btn     ="//input[@value='Search']";
    public String Checkbox       ="//input[@value='8974']";
    public String  Delete_btn     = "//input[@type='button']";
    public String ID              ="8974";
    
    
   }


