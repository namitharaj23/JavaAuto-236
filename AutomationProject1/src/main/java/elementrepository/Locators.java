package elementrepository;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebElement;

public class Locators extends Base{
public void idLocators() {
	WebElement idMsg=driver.findElement(By.id("single-input-field")); 
	WebElement idText=driver.findElement(By.id("message-one"));
	WebElement idNext=driver.findElement(By.id("value-b"));
	WebElement idBtn=driver.findElement(By.id("button-one"));
	WebElement idValue=driver.findElement(By.id("value-a"));
	
}
public void locatorClass() {
	WebElement clsLoc=driver.findElement(By.className("mt-5"));
	WebElement clsCon=driver.findElement(By.className("container page"));
	WebElement clsdiv=driver.findElement(By.className("col-lg-3 col-md-3 col-sm-12 col-xs-12"));
	WebElement listCls=driver.findElement(By.className("list-group list-group-flush"));
}
public void locName() {
	WebElement nameLoc=driver.findElement(By.name("description"));
	WebElement nameLoca=driver.findElement(By.name("keywords"));
	WebElement nameLocb=driver.findElement(By.name("author"));
	WebElement nameLocC=driver.findElement(By.name("viewport"));
	
}
public void linkTxt() {
	WebElement linkLoc=driver.findElement(By.linkText("simple-form-demo.php"));
	WebElement linkLocA=driver.findElement(By.linkText("ajax-form-submit.php"));
	WebElement linkLocB=driver.findElement(By.linkText("check-box-demo.php"));
	WebElement linkLocC=driver.findElement(By.linkText("jquery-select.php"));
	WebElement linkLocD=driver.findElement(By.linkText("radio-button-demo.php"));
	
}
public void parLnkText() {
	WebElement parText=driver.findElement(By.partialLinkText("simple-form"));
	
	WebElement parlTextA=driver.findElement(By.partialLinkText("ajax-form"));
	WebElement parlTextB=driver.findElement(By.partialLinkText("check-box"));
	WebElement parlTextC=driver.findElement(By.partialLinkText("jquery-sel"));
	WebElement parlTextD=driver.findElement(By.partialLinkText("radio-button"));
}
public void tagIdCssLocator() {
	WebElement tagLocA=driver.findElement(By.cssSelector("input#single-input-field"));
	WebElement tagLocB=driver.findElement(By.cssSelector("button#button-two"));
	WebElement tagLocC=driver.findElement(By.cssSelector("button#button-one"));
	WebElement tagLocD=driver.findElement(By.cssSelector("input#value-a"));
	WebElement tagLocE=driver.findElement(By.cssSelector("input#value-b"));
}
public void tagCls() {
	WebElement tagClsA=driver.findElement(By.cssSelector("input.form-control"));
	WebElement tagClsB=driver.findElement(By.cssSelector("section.clearfix"));
	WebElement tagClsC=driver.findElement(By.cssSelector("a.navbar-brand"));
	WebElement tagClsD=driver.findElement(By.cssSelector("button.navbar-toggler"));
	WebElement tagClsE=driver.findElement(By.cssSelector("footer.mt-5"));
}
public void tagAttribute() {
	WebElement tagAttrA=driver.findElement(By.cssSelector("input[id=single-input-field]"));
	WebElement tagAttrB=driver.findElement(By.cssSelector("div[id=collapsibleNavbar]"));
	WebElement tagAttrC=driver.findElement(By.cssSelector("button[class=navbar-toggler]"));
	WebElement tagAttrD=driver.findElement(By.cssSelector("input[id=single-input-field]"));
}
public void tagClsAttribute() {
	WebElement tgaA=driver.findElement(By.cssSelector("input.form-control[id=single-input-field]"));
	
	WebElement tgaB=driver.findElement(By.cssSelector("input.form-control[id=value-b]"));
	WebElement tgaC=driver.findElement(By.cssSelector("input.form-control[id=value-a]"));
	WebElement tgaD=driver.findElement(By.cssSelector("div.my-2[id=message-one]"));
}
public void relXPath() {
	WebElement relXA=driver.findElement(By.xpath("//input[@id='single-input-field']"));
	WebElement relXB=driver.findElement(By.xpath("//button[@id='button-two']"));
	WebElement relXC=driver.findElement(By.xpath("//button[@id='button-one']"));
	WebElement relXD=driver.findElement(By.xpath("//input[@id='value-a']"));
	WebElement relXE=driver.findElement(By.xpath("//input[@id='value-b']"));
	}
public void absXPath() {
	WebElement abs=driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[1]/div/div[2]/form/div[1]/input"));
	WebElement absOne=driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[2]/div/div[2]/form/button"));
}
public void dynamicXPath() {
	WebElement dyXpath=driver.findElement(By.xpath("//input[contains(@type,'text')]"));//try 3
}
public void dynamicTxt() {
	WebElement dytxt=driver.findElement(By.xpath("//button[(text()='Show Message')]"));
}
public void dynamicAxesChild() {
	WebElement dyChld=driver.findElement(By.xpath("//a[@class='navbar-brand']//child::img[@alt='logo']"));
}
public void dynamicAxesParent() {
	WebElement parentDy=driver.findElement(By.xpath("//button[@id='button-one']//parent::form"));
}
public void dynamicAxsesFollowing() {
	WebElement follo=driver.findElement(By.xpath("//button[@id='button-one']//following::div[@id='message-one']"));
}
public void dynamicIndex() {
	WebElement ind=driver.findElement(By.xpath("(//form[@method='POST'])[2]"));
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		///html/body/section/div/div/div[2]/div[1]/div/div[2]/form/div[1]/input
	}

}