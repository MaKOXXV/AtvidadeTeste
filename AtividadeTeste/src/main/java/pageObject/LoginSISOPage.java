package pageObject;

import static org.junit.Assert.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Ultils.UtilsFrames;
import Ultils.UtilsModule;

public class LoginSISOPage {
	
	WebDriver driver;
	WebElement element;
	String elementStr;

	UtilsModule modulo = new UtilsModule();
	UtilsFrames frame = new UtilsFrames(driver);
	
	public WebElement elementControl(String elementStr2) {
		elementStr = elementStr2;
		modulo.waitingElement(driver, elementStr, "xpath");
		element = driver.findElement(By.xpath(elementStr));
		modulo.highLight(element, driver);
		return element;
	}
	
	//String url = "http://172.26.174.252/TSNMVC/Account/Login";
	//String url = "https://hmlsite.mapfrecap.com.br/WebMapfreCap/WebAPI/swagger/ui/index#!/Proposta/Proposta_GravarProposta";
	String url = "https://www.youtube.com/?gl=BR&hl=pt";
	public LoginSISOPage(WebDriver driver) {				
		this.driver = driver;
	}
	
	public void getUrl(){
		driver.get(url);
		
	}

	public void acessoGravarproposta() {
		elementControl("//*[@id='details-button']");
		element.click();
		
		elementControl("//*[@id='proceed-link']");
		element.click();
	}
	
	public void cofirmAccesPAgeHome() {
		
		String elementStr = "//marquee[contains(text(), 'Bem vindo ao Sistema')]";
		modulo.waitingElement(driver, elementStr, "xpath");
		WebElement element = driver.findElement(By.xpath(elementStr));
		String value = element.getText().toString();
		System.out.println(value);
		assertEquals("Bem vindo ao Sistema", value);
	
	}
	
	
}
