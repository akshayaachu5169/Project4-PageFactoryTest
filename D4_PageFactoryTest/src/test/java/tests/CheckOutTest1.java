package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.CheckoutPage;
import pages.HomePage;
import pages.LoginPage;

public class CheckOutTest1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver wd = new ChromeDriver();
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//object creation
		LoginPage loginpage = PageFactory.initElements(wd, LoginPage.class);
		HomePage homepage = PageFactory.initElements(wd, HomePage.class);
		CheckoutPage checkoutpage = PageFactory.initElements(wd, CheckoutPage.class);

//login page

		loginpage.navigateLoginPage(wd);
		loginpage.enterusername(wd, "Akshayaachu");
		loginpage.enterpassword(wd, "Aswin@1a");
		loginpage.clickloginbutton(wd);

//home page
		homepage.navigatehomepage(wd);
		homepage.clickformsubmission(wd);
		homepage.clicksimpleform(wd);

//checkout page
		checkoutpage.enterprodname(wd, "samsung mobiles");
		checkoutpage.entermobileno(wd, "1234567890");
		checkoutpage.enteremail(wd, "user@123");
		checkoutpage.enterprodcat(wd, "Electronics");
		checkoutpage.enterprodqua(wd, "5");
		checkoutpage.enterpurchasername(wd, "Akshaya");
		checkoutpage.enterGST(wd);
		checkoutpage.enterpaymentmethod(wd);
		checkoutpage.placeorder(wd);

	}

}
