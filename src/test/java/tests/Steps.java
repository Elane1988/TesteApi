package tests;

import java.io.IOException;

import elementos.ElementosWeb;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Metodos;

public class Steps {
	
	Metodos metodos = new Metodos();
	ElementosWeb el = new ElementosWeb();
	
	
	@Given("que eu esteja no {string}")
	public void que_eu_esteja_no(String appUrl) {
		metodos.abrirNavegador(appUrl,"acessando o site.");
		
	    
	}

	@When("clicar em documentação")
	public void clicar_em_documentação() throws InterruptedException {
		Thread.sleep(2000);
		metodos.clicar(el.getPesquisar());
		Thread.sleep(2000);
		metodos.clicar(el.getFilme());
		Thread.sleep(2000);
		metodos.clicar(el.getPessoas());
		Thread.sleep(2000);
		metodos.clicar(el.getPlanets());
		Thread.sleep(2000);
		
	}   

	@Then("validos as informações")
	public void validos_as_informações(String teste) throws IOException, InterruptedException {
		metodos.screnShot(teste);
		Thread.sleep(2000);
		metodos.fecharNavegador("fechar navegador.");
	    

	
}
}