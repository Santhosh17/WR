package com.wildriver.pageobjects.Admin.DealerMGR.DealerDetails;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.wildriver.libraries.SuperTestNG;

public class DealerDetailsPage extends SuperTestNG
{
	public static WebElement txtbx_CompanyName()
	{
		WebElement Element = driver.findElement(By.id("UserUserName"));
		return Element;
	}
	public static WebElement txtbx_CompanyACNorABN()
	{
		WebElement Element = driver.findElement(By.id("UserDetailsCompanyAcnAbn"));
		return Element;
	}
	public static WebElement txtbx_PostalAddress()
	{
		WebElement Element = driver.findElement(By.id("UserDetailsPostalAddress"));
		return Element;
	}
	public static WebElement txtbx_City()
	{
		WebElement Element = driver.findElement(By.id("UserDetailsPostalCity"));
		return Element;
	}
	public static WebElement txtbx_State()
	{
		WebElement Element = driver.findElement(By.id("UserDetailsPostalState"));
		return Element;
	}
	public static WebElement txtbx_PostCode()
	{
		WebElement Element = driver.findElement(By.id("UserDetailsPostalCode"));
		return Element;
	}
	public static WebElement chkbx_AddressCopyFromPostaltoDelivery()
	{
		WebElement Element = driver.findElement(By.xpath("//input[@type='checkbox']"));
		return Element;
	}
	public static WebElement txtbx_DeliveryAddress()
	{
		WebElement Element = driver.findElement(By.id("UserDetailsDeliveryAddress"));
		return Element;
	}
	public static WebElement txtbx_DeliveryCity()
	{
		WebElement Element = driver.findElement(By.id("UserDetailsDeliveryCity"));
		return Element;
	}
	public static WebElement txtbx_DeliveryState()
	{
		WebElement Element = driver.findElement(By.id("UserDetailsDeliveryState"));
		return Element;
	}
	public static WebElement txtbx_DeliveryPostCode()
	{
		WebElement Element = driver.findElement(By.id("UserDetailsDeliveryPostalCode"));
		return Element;
	}
	public static WebElement txtbx_Phone()
	{
		WebElement Element = driver.findElement(By.id("UserDetailsPhone"));
		return Element;
	}
	public static WebElement txtbx_Fax()
	{
		WebElement Element = driver.findElement(By.id("UserDetailsFax"));
		return Element;
	}
	public static WebElement txtbx_Email()
	{
		WebElement Element = driver.findElement(By.id("UserEmail"));
		return Element;
	}
	public static WebElement txtbx_Password()
	{
		WebElement Element = driver.findElement(By.id("UserPassword"));
		return Element;
	}
	public static WebElement txtbx_ReTypePassword()
	{
		WebElement Element = driver.findElement(By.id("UserPasswordAgain"));
		return Element;
	}
	public static WebElement txtbx_Notes()
	{
		WebElement Element = driver.findElement(By.id("UserDetailsNotes"));
		return Element;
	}
	public static WebElement btn_AddDealer()
	{
		WebElement Element = driver.findElement(By.id("add-dealer"));
		return Element;
	}
}