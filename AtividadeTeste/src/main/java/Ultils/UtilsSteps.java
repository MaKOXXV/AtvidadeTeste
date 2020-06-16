package Ultils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.Scenario;
import factory.FactorySingletonBrowserClass;
import pageObject.GravarProposta;
import pageObject.LoginSISOPage;

public class UtilsSteps {

	protected WebDriver driver;
	protected Scenario scenario;
	protected long ms;

	WebDriverWait wait;
	private JavascriptExecutor jsExec;
	
	protected static FactorySingletonBrowserClass singleton = FactorySingletonBrowserClass
			.getInstanceOfSingletonBrowserClass();
	protected UtilsModule modulo = new UtilsModule();
	protected LoginSISOPage loginSISO;
	protected UtilsFrames frame = new UtilsFrames(driver);
	//protected CadastroCandidatoPage cadastroP;
	protected GravarProposta gravProp = new GravarProposta(driver);




	public void initiate() {
		singleton = FactorySingletonBrowserClass.getInstanceOfSingletonBrowserClass();
		this.driver = FactorySingletonBrowserClass.getDriver();
		loginSISO = new LoginSISOPage(this.driver);
		frame = new UtilsFrames(this.driver);
		gravProp = new GravarProposta(this.driver);
		//loginP = new LoginPortalCandidatoPage(this.driver);
		this.wait = new WebDriverWait(this.driver, 60);
		//cadastroP = new CadastroCandidatoPage(this.driver);
		jsExec = (JavascriptExecutor) driver;
		singleton.managerDriver();

	}

	public void killDriver() {
		if (driver != null) {
			driver.quit();

		}
	}

	// Variações de clicks

	public void clickPadrao(By by) {

		WebElement campo = wait.until(ExpectedConditions.elementToBeClickable(by));
		campo.click();
	}

	public void clickJS(By by) {
		WebElement campo = wait.until(ExpectedConditions.elementToBeClickable(by));
		this.jsExec.executeScript("arguments[0].click", campo);
	}

	public void sleep(int time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public WebElement waitVisibility(By by) {

		return this.wait.until(ExpectedConditions.visibilityOfElementLocated(by));
	}

}
