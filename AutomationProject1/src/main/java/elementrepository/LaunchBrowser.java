package elementrepository;
import org.openqa.selenium.WebDriver;

//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
	//	WebDriver driver=new FirefoxDriver();
		//WebDriver driver=new EdgeDriver();
		driver.get("https://selenium.qabible.in/index.php");
	}

}
