package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginsteps {
	public class WebDriverFactory {
	    public WebDriver createWebDriver() {
	        String webdriver = System.getProperty("browser", "firefox");
	        switch(webdriver) {
	            case "firefox":
	                return new FirefoxDriver();
	            case "chrome":
	                return new ChromeDriver();
	            default:
	                throw new RuntimeException("Unsupported webdriver: " + webdriver);
	        }
	    }
	}
	

	public WebDriver driver;
	
	
	
	
	@Given("open browser")
	public void open_browser() 
	{
		 System.setProperty("Webdriver.chrome.driver", "C://Users//gthirumalasetti//Desktop//chromedriver.exe");
		
	    driver=new ChromeDriver();
	}

	@Then("user enter the url {string}")
	public void user_enter_the_url(String string) 
	{
		driver.get("https://www.telerik.com");
		driver.manage().window().maximize();
	   
	}

	@Then("user click on Demos")
	public void user_click_on_demos() 
	{
		driver.findElement(By.xpath("//a[@class='TK-Menu-Item-Link'][normalize-space()='Demos']")).click();
	    
	}

	@Then("user navigate to Banner")
	public void user_navigate_to_banner() {
	   
	}

	@When("user click on Services")
	public void user_click_on_services() 
	{
		driver.findElement(By.xpath("//a[normalize-space()='Services']")).click();
	    
	}

	@Then("user navigate to Services Banner")
	public void user_navigate_to_services_banner() {
	    
	}

	@When("user click on BLOGS")
	public void user_click_on_blogs() 
	{
		driver.findElement(By.xpath("//a[@class='TK-Menu-Item-Link'][normalize-space()='Blogs']")).click();
	    
	}

	@Then("user navigate to BLOGS Banner")
	public void user_navigate_to_blogs_banner() {
	    
	}

	@When("user click on DOCS & SUPPORT")
	public void user_click_on_docs_support() 
	{
		driver.findElement(By.xpath("//a[normalize-space()='Docs & Support']")).click();
	   
	}

	@Then("user navigate  on DOCS & SUPPORT Banner")
	public void user_navigate_on_docs_support_banner() {
	  
	}

	@When("user click on PRICING")
	public void user_click_on_pricing() 
	{
		driver.findElement(By.xpath("//a[@class='TK-Menu-Item-Link'][normalize-space()='Pricing']")).click();
	    
	}

	@Then("user navigate PRICING Banner")
	public void user_navigate_pricing_banner() {
	    
	}

	@Then("user click on INDIVIDUAL Banner")
	public void user_click_on_individual_banner() 
	{
		driver.findElement(By.xpath("//span[normalize-space()='Individual Products']")).click();
	    
	}
	@Then("user click on progress Telerik")
	public void user_click_on_progress_telerik() 
	{
		driver.findElement(By.xpath("//a[@aria-label='Go to Homepage']//*[name()='svg']//*[name()='path'][5]")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,5000)", "");
	}

	@When("user is click on Web Components")
	public void user_is_click_on_web_components() throws Exception 
	{
		driver.findElement(By.xpath("//button[@aria-label='expand Web Components']")).click();
		
		Thread.sleep(3000);
	    
	}

	
	@Then("user close the Web Component")
	public void user_close_the_web_component() throws Exception 
	{
		driver.findElement(By.xpath("//button[@aria-label='expand Web Components']//div[@class='Box-close icon-x']")).click();
		
	}

	@When("user click on the Desktop Components")
	public void user_click_on_the_desktop_components() throws Exception 
	{
		driver.findElement(By.xpath("(//button[@aria-label='expand Desktop Components'])[1]")).click();
	  Thread.sleep(3000);
	}
	@Then("user close the Desktop Component")
	public void user_close_the_desktop_component() {
	    driver.findElement(By.xpath("//button[@aria-label='expand Desktop Components']//div[@class='Box-close icon-x']")).click();
	}

}



