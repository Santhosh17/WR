package com.wildriver.pageobjects.Admin.DealerMGR;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.wildriver.libraries.SuperTestNG;

public class DealerMGRPage extends SuperTestNG
{
	public static WebElement btn_AddADealer()
	{
		WebElement Element = driver.findElement(By.linkText("ADD A DEALER"));
		return Element;
	}
	public static WebElement btn_ViewActive()
	{
		WebElement Element = driver.findElement(By.linkText("VIEW ACTIVE"));
		return Element;
	}
	public static WebElement btn_ViewSuspended()
	{
		WebElement Element = driver.findElement(By.linkText("VIEW SUSPENDED"));
		return Element;
	}
	public static WebElement btn_Archived()
	{
		WebElement Element = driver.findElement(By.linkText("ARCHIVED"));
		return Element;
	}
	public static WebElement txtbx_Search()
	{
		WebElement Element = driver.findElement(By.xpath("//input[@placeholder='SEARCH']"));
		return Element;
	}
	public static WebElement txt_ValidationMSG()
	{
		WebElement Element = driver.findElement(By.id("flashMessage"));
		return Element;
	}
}
