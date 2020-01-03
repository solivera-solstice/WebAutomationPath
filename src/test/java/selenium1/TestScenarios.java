package selenium1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestScenarios {
	
	public static String baseurl = "https://the-internet.herokuapp.com";
	public static WebElement loguinlink;
	
	public static void loginform() {
		
		
		loguinlink = Driver.driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[21]/a"));
		

	}

}
