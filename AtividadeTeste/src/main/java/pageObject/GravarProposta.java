package pageObject;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Ultils.UtilsFrames;
import Ultils.UtilsModule;

public class GravarProposta {

	WebDriver driver;
	WebElement element;
	String elementStr;

	UtilsModule modulo = new UtilsModule();
	UtilsFrames frame = new UtilsFrames(driver);

	public GravarProposta(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement elementControl(String elementStr2) {
		elementStr = elementStr2;
		modulo.waitingElement(driver, elementStr, "xpath");
		element = driver.findElement(By.xpath(elementStr));
		modulo.highLight(element, driver);
		return element;
	}
	
	public void youtPesquisa() throws InterruptedException {
		
		elementControl("//form//*[@id='search']");
		Thread.sleep(2000);
		element.sendKeys("Tecnologia em video");
		Thread.sleep(4000);
		elementControl("//*[@id='search-icon-legacy']");
		Thread.sleep(2000);
		element.click();
		Thread.sleep(4000);
	}

	public void youtEscVD() throws InterruptedException {
		elementControl("//*[@id=\"video-title\"]/yt-formatted-string");
		Thread.sleep(2000);
		element.click();
		Thread.sleep(4000);
	}
	
	public void youtEscVD2() throws InterruptedException {
		elementControl("//*[contains(@title,'Framework - Tecnologia em 3 Minutos #08')]");
		Thread.sleep(2000);
		element.click();
		Thread.sleep(4000);
	}
	public void youtPularAnun() throws InterruptedException {
		elementControl("//*[@id=\"ad-text:8\"]");
		element.click();
		Thread.sleep(4000);
	}
	
	public void accerYoutEscVD() {
		WebElement text= driver.findElement(By.xpath("//*[contains(@title,'Framework - Tecnologia em 3 Minutos #08')]"));
		element.click();
		String texto = text.getText().toString();
		assertEquals("Framework - Tecnologia em 3 Minutos #08", texto);
		
	}
	
	public void youtlike() throws InterruptedException {
		//elementControl("//*[@id=\"video-title\"]/yt-formatted-string");
		//Thread.sleep(2000);
		//element.click();
		
	}
	
	public void assertYoutlike() throws InterruptedException {
		//Thread.sleep(2000);
		//WebElement text= driver.findElement(By.xpath("//*[contains(@title,'Framework - Tecnologia em 3 Minutos #08')]"));
		//String texto = text.getText().toString();
		//assertEquals("Framework - Tecnologia em 3 Minutos #08", texto);
		
	}


}
