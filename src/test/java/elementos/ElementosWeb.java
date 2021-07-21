package elementos;

import org.openqa.selenium.By;

public class ElementosWeb {
	
	private By pesquisar = By.xpath("//a[text()=\"Documentation\"]");
	private By pessoas = By.xpath("//a[text()='People']");
	private By filme = By.xpath("//a[text()='Films']");
    private By planets = By.xpath("//a[text()='Planets']");
    
	public By getPesquisar() {
		return pesquisar;
	}


	public By getPessoas() {
		return pessoas;
	}


	public By getFilme() {
		return filme;
	}


	public By getPlanets() {
		return planets;
	}


	public void setPlanets(By planets) {
		this.planets = planets;
	}

}
