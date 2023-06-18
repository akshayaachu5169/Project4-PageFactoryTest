package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class CheckoutPage {
	@FindBy(how=How.ID, using="id0")
	public static WebElement prodname;
	
	public  void enterprodname(WebDriver wd, String prodname) {
		//wd.findElement(By.id("id0")).sendKeys(prodname);
		this.prodname.sendKeys(prodname);
	}
	@FindBy(how=How.ID, using="id1")
	public static WebElement mobileno;
	public  void entermobileno(WebDriver wd, String mobileno) {
		//wd.findElement(By.id("id1")).sendKeys(mobileno);
		this.mobileno.sendKeys(mobileno);
	}
	@FindBy(how=How.ID, using="id2")
	public static WebElement mailid;
	public  void enteremail(WebDriver wd, String mailid) {
		//wd.findElement(By.id("id2")).sendKeys(mailid);
		this.mailid.sendKeys(mailid);
	}
	@FindBy(how=How.ID, using="id3")
	public static WebElement prodcate;
	public  void enterprodcat(WebDriver wd, String prodcate) {
		//WebElement prodcat = wd.findElement(By.id("id3"));
		Select s = new Select(this.prodcate);
		s.selectByVisibleText(prodcate);
		
	}
	@FindBy(how=How.ID, using="id4")
	public static WebElement prodqua;
	public  void enterprodqua(WebDriver wd, String prodqua) {
		//wd.findElement(By.id("id4")).sendKeys(prodqua);
		this.prodqua.sendKeys(prodqua);
	}
	@FindBy(how=How.ID, using="id5")
	public static WebElement purname;
	public  void enterpurchasername(WebDriver wd, String purname) {
		//wd.findElement(By.id("id5")).sendKeys(purname);
	this.purname.sendKeys(purname);
	
	}
	@FindBy(how=How.ID, using="idyes")
	public static WebElement GST;
	public  void enterGST(WebDriver wd) {
		//wd.findElement(By.id("idyes")).click();
		this.GST.click();
	}
	@FindBy(how=How.ID, using="cod")
	public static WebElement codClick;
	public  void enterpaymentmethod(WebDriver wd) {

		//wd.findElement(By.id("cod")).click();
		this.codClick.click();
	}
	@FindBy(how=How.ID, using="order")
	public static WebElement placeorder;
	public  void placeorder(WebDriver wd) {
this.placeorder.click();
		//wd.findElement(By.id("order")).click();
	}

	
}
