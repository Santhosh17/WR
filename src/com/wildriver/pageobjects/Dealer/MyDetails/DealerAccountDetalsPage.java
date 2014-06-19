package com.wildriver.pageobjects.Dealer.MyDetails;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.wildriver.libraries.SuperTestNG;

public class DealerAccountDetalsPage extends SuperTestNG
{
	public static WebElement txtbx_PostalAddress()
	{
		WebElement element = driver.findElement(By.id("postal"));
		return element;
	}
	public static WebElement txtbx_PostalCity()
	{
		WebElement element = driver.findElement(By.id("city"));
		return element;
	}
	public static WebElement txtbx_PostalState()
	{
		WebElement element = driver.findElement(By.id("state"));
		return element;
	}
	public static WebElement txtbx_PostalPostCode()
	{
		WebElement element = driver.findElement(By.id("postcode"));
		return element;
	}
	public static WebElement chkbx_CopyPostaltoDelivery()
	{
		WebElement element = driver.findElement(By.id("same-addr"));
		return element;
	}
	public static WebElement txtbx_DeliveryAddress()
	{
		WebElement element = driver.findElement(By.id("postalcopy"));
		return element;
	}
	public static WebElement txtbx_DeliveryCity()
	{
		WebElement element = driver.findElement(By.id("citycopy"));
		return element;
	}
	public static WebElement txtbx_DeliveryState()
	{
		WebElement element = driver.findElement(By.id("statecopy"));
		return element;
	}
	public static WebElement txtbx_DeliveryPostCode()
	{
		WebElement element = driver.findElement(By.id("postcodecopy"));
		return element;
	}
	public static WebElement txtbx_Phone()
	{
		WebElement element = driver.findElement(By.id("phone"));
		return element;
	}
	public static WebElement txtbx_Fax()
	{
		WebElement element = driver.findElement(By.id("fax"));
		return element;
	}
	public static WebElement txtbx_Email()
	{
		WebElement element = driver.findElement(By.id("email"));
		return element;
	}
	public static WebElement txtbx_NewPassword()
	{
		WebElement element = driver.findElement(By.id("password"));
		return element;
	}
	public static WebElement txtbx_ReTypeNewPassword()
	{
		WebElement element = driver.findElement(By.id("retype_password"));
		return element;
	}
	public static WebElement btn_UpdateDetails()
	{
		WebElement element = driver.findElement(By.id("updusr"));
		return element;
	}
	public static WebElement txt_ValidationMSG()
	{
		WebElement element = driver.findElement(By.id("flashMessage"));
		return element;
	}
}