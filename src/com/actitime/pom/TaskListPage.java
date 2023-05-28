package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPage 
{
	@FindBy(xpath="//div[text()='Add New']")
	private WebElement addNewBtn;
	
	@FindBy(xpath="//div[text()='+ New Customer']")
	private WebElement newCustomerBtn;
	
	@FindBy(xpath="//input[@placeholder='Enter Customer Name' and @class='inputFieldWithPlaceholder newNameField inputNameField']")
	private WebElement enterCustNameTF;
	
	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
	private WebElement enterCustDescriptionTF;
	
	@FindBy(xpath="//div[text()='- Select Customer -' and @class='emptySelection']")
	private WebElement selectCustDropdown;
	
	@FindBy(xpath="//div[text()='Our company' and @class='itemRow cpItemRow ']")
	private WebElement ourCompany;
	
	@FindBy(xpath="//div[text()='Create Customer']")
	private WebElement createCustBtn;
	
	@FindBy(xpath="//div[text()='AxisBank_001' and @class='title']")
	private WebElement createdCustName;
	
	public TaskListPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getAddNewBtn() 
	{
		return addNewBtn;
	}

	public WebElement getNewCustomerBtn() 
	{
		return newCustomerBtn;
	}

	public WebElement getEnterCustNameTF() 
	{
		return enterCustNameTF;
	}

	public WebElement getEnterCustDescriptionTF() 
	{
		return enterCustDescriptionTF;
	}
	
	public WebElement getSelectCustDropdown() 
	{
		return selectCustDropdown;
	}
	
	public WebElement getOurCompany() 
	{
		return ourCompany;
	}

	public WebElement getCreateCustBtn() 
	{
		return createCustBtn;
	}

	public WebElement getCreatedCustName() 
	{
		return createdCustName;
	}
	

}
