package Test_Steps;

import Elements.AmazonElements;
import Elements.GoogleElemnts;
import Utilities.*;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class hooks extends TestBase{

    @Before(order = 1)
    public void setup01(){

        driver= Driver.getDriver();
        wait = new WebDriverWait(driver,10);
        act = new Actions(driver);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       driver.navigate().to( ConfigurationReader.getPropertiesData("Website") );
    //    driver.navigate().to(ExcelReader.getExcelData(1,2));

    }

    @Before(order = 2)
    public void setup02(){
        google=new GoogleElemnts();
        amazon = new AmazonElements();


    }

    @After
    public void end(Scenario result){

        if(result.isFailed()){
            TakesScreenshot ss = (TakesScreenshot)driver;
            result.embed( ss.getScreenshotAs(OutputType.BYTES) ,  "image/png" );
        }

       Driver.CloseBrowser();

    }

}
