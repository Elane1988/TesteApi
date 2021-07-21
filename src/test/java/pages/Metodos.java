package pages;



import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Metodos {

	WebDriver driver;
	
	public void abrirNavegador (String appUrl,String descricaoPasso) {
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(appUrl);
		driver.manage().window().maximize();
		
	}
		public void clicar(By elemento) {
			driver.findElement(elemento).click();;
			
			
		}
			public void submit(By elemento) {
				driver.findElement(elemento).submit();
			}
			
			public void screnShot(String nome) throws IOException {
				TakesScreenshot scrShot = ((TakesScreenshot)driver);
				File srcFile = scrShot.getScreenshotAs(OutputType.FILE);
				File destFile = new File("./src/evidencies/"+nome+".png");
				FileUtils.copyFile(srcFile, destFile);
				
			}
				
				public void fecharNavegador(String descricaoPasso) {
					driver.close();
				
			}
				
			
			
				
				
			
			}
		
		
		
	
	
	
	

