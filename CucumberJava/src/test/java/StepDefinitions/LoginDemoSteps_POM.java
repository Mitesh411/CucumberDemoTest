//package StepDefinitions;
//
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.cucumber.java.en.*;
//import pages.loginPage;
//
//public class LoginDemoSteps_POM {
//	
//	WebDriver driver = null;
//	loginPage login;
//	
//	
//	
//	@Given("browser is open")
//	public void browser_is_open() {
//		System.out.println("\n \t POM Framework is Runing \n");
//		System.out.println("Inside Step - Browser is open");
//		
//		String projectPath = System.getProperty("user.dir");
//		System.out.println("Project Path is :- "+projectPath);
//		System.setProperty("webdriver.chrome.driver",projectPath+"/src/test/resources/drivers/chromedriver");
//		driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
//		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
//		driver.manage().window().maximize(); 
//
//	}
//
//	@And("user is on login page")
//	public void user_is_on_login_page() {
//		
//			
//		driver.navigate().to("https://example.testproject.io/web/");
//		
//	}
//
//	@When("^user enter (.*) and (.*)$")
//	public void user_enter_username_and_password(String username, String password) throws InterruptedException  {
//		 login = new loginPage(driver);
//			login.enterUsername(username);
//			login.enterPassword(password);
//		
////		driver.findElement(By.id("name")).sendKeys(username);
////		driver.findElement(By.id("password")).sendKeys(password);
//		Thread.sleep(5000);
//		
//
//	}
//
//
//	@When("user clicks on login")
//	public void user_clicks_on_login() throws InterruptedException {
//		
//		login.clickLogin();
//	//	driver.findElement(By.id("login")).click();
//		Thread.sleep(5000);
//	}
//
//	@Then("user is navigated to the home page")
//	public void user_is_navigated_to_the_home_page() {
//		login.checkLogogOutIsDisplayed();
//		//driver.findElement(By.id("logout")).isDisplayed();
//		driver.close();
//		driver.quit();
//	}
//
//
//}
