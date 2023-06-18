package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {

	public void navigatehomepage(WebDriver wd) {
		wd.get("https://djangovinoth.pythonanywhere.com/labhome/");
	}
	
	@FindBy(how=How.ID, using="element44")
	public static WebElement simpleform;
public void clickformsubmission(WebDriver wd) {
	//wd.findElement(By.id("element44")).click();
	this.simpleform.click();
	}


@FindBy(how=How.ID, using="element45")
public static WebElement secondform;
public  void clicksimpleform(WebDriver wd){
	//wd.findElement(By.id("element45")).click();
	this.secondform.click();
}
}


