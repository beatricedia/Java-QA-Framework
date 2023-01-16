package stepsDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class UIElementsInteractionStepDefinitions {

    WebDriver driver = null;

    @Given("^I am on the \"([^\"]*)\" page$")
    public void iAmOnThePage(String page)  {
//        -------- OPEN BROWSER ---------
        System.setProperty("webdriver.chrome.driver",".idea/drivers/chromedriver.exe");
        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(6,TimeUnit.SECONDS);
        driver.manage().window().maximize();

//        ----- NAVIGATION TO THE PAGE -----

//        if (page == "Tools QA")
        driver.navigate().to("https://demoqa.com/text-box");
    }

    @Given("^I click on the tab \"([^\"]*)\"$")
    public void iClickOnTheTab(String arg0){
        System.out.println("Step is here");
        driver.findElement(By.xpath("//*[@class=\"header-text\"][text() = \"" + arg0 + "\"]")).click();
    }


}
