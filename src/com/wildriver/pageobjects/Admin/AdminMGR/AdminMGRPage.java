package com.wildriver.pageobjects.Admin.AdminMGR;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.wildriver.libraries.SuperTestNG;

public class AdminMGRPage extends SuperTestNG
{
	public static WebElement txtbx_Name()
	{
		WebElement Element = driver.findElement(By.id("UserUserName"));
		return Element;
	}
	public static WebElement txtbx_EmailAddress()
	{
		WebElement Element = driver.findElement(By.id("UserEmail"));
		return Element;
	}
	public static WebElement txtbx_Password()
	{
		WebElement Element = driver.findElement(By.id("password"));
		return Element;
	}
	public static WebElement txtbx_PasswordAgain()
	{
		WebElement Element = driver.findElement(By.id("UserPasswordAgain"));
		return Element;
	}
	public static WebElement chkbx_FullUsage()
	{
		WebElement Element = driver.findElement(By.id("AdminUserRoleSuperAdm"));
		return Element;
	}
	public static WebElement chkbx_DealerManager()
	{
		WebElement Element = driver.findElement(By.id("AdminUserRoleDealerManager"));
		return Element;
	}
	public static WebElement chkbx_POManager()
	{
		WebElement Element = driver.findElement(By.id("AdminUserRoleP/oManager"));
		return Element;
	}
	public static WebElement chkbx_StockManager()
	{
		WebElement Element = driver.findElement(By.id("AdminUserRoleStockManager/oManager"));
		return Element;
	}
	public static WebElement chkbx_AdminRights()
	{
		WebElement Element = driver.findElement(By.id("AdminUserRoleAdminRights"));
		return Element;
	}
	public static WebElement btn_AddUser()
	{
		WebElement Element = driver.findElement(By.id("add-user"));
		return Element;
	}
	public static WebElement btn_UpdateUser()
	{
		WebElement Element = driver.findElement(By.xpath("//input[@id='add-user' and @value='UPDATE USER']"));
		return Element;
	}
	public static WebElement chkbx_LockUser(String UserName)
	{
		WebElement Element = driver.findElement(By.xpath("//tr[td[text()='"+UserName+"']]/td/input[@type='checkbox']"));
		return Element;
	}
	public static WebElement btn_DeleteUser(String UserName)
	{
		WebElement Element = driver.findElement(By.xpath("//tr[td[text()='"+UserName+"']]/td/a[text()='DELETE']"));
		return Element;
	}
	public static WebElement lnk_User(String UserName)
	{
		WebElement Element = driver.findElement(By.xpath("//tr/td[text()='"+UserName+"']"));
		return Element;
	}
	public static WebElement lnk_AccessLevel(String UserName)
	{
		WebElement Element = driver.findElement(By.xpath("//tr[td[text()='"+UserName+"']]/td[3]"));
		return Element;
	}
	public static WebElement lnk_Email(String UserName)
	{
		WebElement Element = driver.findElement(By.xpath("//tr[td[text()='"+UserName+"']]/td/span/a"));
		return Element;
	}
	public static WebElement txt_ValidationMSG()
	{
		WebElement Element = driver.findElement(By.id("flashMessage"));
		return Element;
	}
}