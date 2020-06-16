package steps;

import Ultils.UtilsSteps;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class gravarProposta extends UtilsSteps{
	
	@After
	public void after(Scenario scenario) throws InterruptedException{
		Thread.sleep(2000);
	    //modulo.takeScreenshot(scenario, driver);
	    
	    if (scenario.isFailed()) try {
	    	modulo.screenshot(driver, System.currentTimeMillis(), "ErroDeCenario", "ErroResultado");
	    } catch (ClassCastException cce) {
	        cce.printStackTrace();
	    }
	}
	@Given("^que acesso o youtube$")
	public void queAcessoOYoutube() throws Throwable {
		initiate();
		singleton.managerDriver();
		loginSISO.getUrl();
	}

	@Given("^pesquiso um video$")
	public void pesquisoUmVideo() throws Throwable {
		gravProp.youtPesquisa();
		gravProp.accerYoutEscVD();
		gravProp.youtEscVD2();
	}

	@When("^curto o video$")
	public void curtoOVideo() throws Throwable {
		gravProp.youtPularAnun();

	}

	@Then("^acessarei o video certo$")
	public void acessareiOVideoCerto() throws Throwable {
		//gravProp.assertYoutlike();
		gravProp.youtlike();
	}

}
