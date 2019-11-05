package pom;

import gen.Sel_gen;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class fb_welcome {

	@FindBy(xpath="//a[contains(.,'Account')]")
	private WebElement clickCreate;
	
	@FindBy(name="firstname")
	private WebElement fn;
	
	@FindBy(name="lastname")
	private WebElement ln;
	
	@FindBy(name="reg_email__")
	private WebElement mail;
	
	@FindBy(name="reg_email_confirmation__")
	private WebElement confemail;
	
	@FindBy(name="reg_passwd__")
	private WebElement pwd;
	
	@FindBy(id="day")
	private WebElement day;
	
	@FindBy(id="month")
	private WebElement month;
	
	@FindBy(id="year")
	private WebElement year;
	
	@FindBy(xpath="//input[@value='2']")
	private WebElement male;
	
	@FindBy(name="websubmit")
	private WebElement submit;
	
	public fb_welcome(WebDriver d){
		PageFactory.initElements(d, this);
	}
	
	public void createAcc(String firstName, String lastName, String email, String password, String date, String mon, String yr){
		clickCreate.click();
		fn.sendKeys(firstName);
		ln.sendKeys(lastName);
		mail.sendKeys(email);
		confemail.sendKeys(email);
		pwd.sendKeys(password);
		Sel_gen s1 = new Sel_gen(day);
		s1.selTxt(date);
		Sel_gen s2 = new Sel_gen(month);
		s2.selTxt(mon);
		Sel_gen s3 = new Sel_gen(year);
		s3.selTxt(yr);		
		male.click();
		submit.click();
	}
	
}
