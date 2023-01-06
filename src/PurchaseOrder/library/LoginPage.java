package PurchaseOrder.library;

import org.openqa.selenium.By;

import utils.AppUtilis;

public class LoginPage extends AppUtilis
{

	public void login(String uid,String pwd) 
	{
	
	    driver.findElement(By.id("login-form_email")).sendKeys(uid);
	    driver.findElement(By.id("login-form_password")).sendKeys(pwd);
        driver.findElement(By.xpath("//*[@type = 'submit']")).click();
	}
        
      public boolean isUserLoginDisplayed() 
       {
	     
    	  String logo;
    	  //logo = driver.findElement(By.xpath("//img[@alt='Jetatech logo']")).getText();
    	    //logo = driver.get("http://65.1.124.191:49183/app/home").getText();
    	  logo = driver.findElement(By.xpath("//div[@id='root']/div/section/section/section/footer/span/span")).getText();
    	  if(logo.toLowerCase().contains("Jetatech"))
    	{
    		return true;
    	}else
    	{
    		return false;
    	}
    }
      public boolean isErrorMsgDisplayed()
    	{
			String errmsg;
			  errmsg = driver.findElement(By.cssSelector("span.anticon.anticon-close-circle.ant-notification-notice-icon.ant-notification-notice-icon-error > svg > path")).getText();
			if(errmsg.toLowerCase().contains("Wrong password"))
    	{
    		return true;
    	}else
    	{
    		return false;
    	}
    	}

}


