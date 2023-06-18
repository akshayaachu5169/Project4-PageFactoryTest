package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

	public  void navigateLoginPage(WebDriver wd) {
		wd.get("https://djangovinoth.pythonanywhere.com/login/");
	}
@FindBy(how=How.NAME, using="username")
public static WebElement username;
	public  void enterusername(WebDriver wd, String username) {
		//wd.findElement(By.name("username")).sendKeys(username);
		this.username.sendKeys(username);
	}
@FindBy(how=How.NAME, using="password")
public static WebElement password;
	public void enterpassword(WebDriver wd, String password) {
		//wd.findElement(By.name("password")).sendKeys(password);
		this.password.sendKeys(password);
	}
	@FindBy(how=How.XPATH, using="/html/body/main/div/div/div/div/form/div/button")
	public static WebElement loginbutton;
	public  void clickloginbutton(WebDriver wd) {
		//wd.findElement(By.xpath("/html/body/main/div/div/div/div/form/div/button")).click();
this.loginbutton.click();
	}
}
