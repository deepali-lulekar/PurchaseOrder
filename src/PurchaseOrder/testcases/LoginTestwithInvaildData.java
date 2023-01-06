package PurchaseOrder.testcases;

import PurchaseOrder.library.LoginPage;
import utils.AppUtilis;

public class LoginTestwithInvaildData {

	public static void main(String[] args) 
	{
             
		AppUtilis.launchApp("http://65.1.124.191:49183/auth/login-2");
		
		LoginPage lp = new LoginPage();
		lp.login("rohit@jetatech.in", "Rohit123");
		boolean res = lp.isErrorMsgDisplayed();
		if(res)
		{
			System.out.println("System displayed appropriate error message, Test Pass");
		}else
		{
			System.out.println("System not displayed appropriate error message, Test Fail");
		}
		AppUtilis.closeApp();		

		
		
		
		
		
	}

}
