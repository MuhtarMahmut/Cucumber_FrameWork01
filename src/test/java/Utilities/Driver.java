package Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Driver extends TestBase{

    public static WebDriver getDriver(){
        WebDriver driver=null;
        String Browser = ConfigurationReader.getPropertiesData("Browser").toLowerCase();       // from propertiesfile
    //   String Browser=ExcelReader.getExcelData(2,2).toLowerCase();                 // from excel
       //   String Browser = Encapsulate.getBrowser().toLowerCase();                      // from Encapsulate

        if(Browser.equals("firefox")){
            WebDriverManager.firefoxdriver().setup();
            driver=new FirefoxDriver();
        }else if(Browser.equals("chrome")){
            WebDriverManager.chromedriver().setup();
            driver=new ChromeDriver();
        } else if(Browser.equals("ie")){
            WebDriverManager.iedriver().setup();
            driver=new InternetExplorerDriver();
        } else if (Browser.equals("edge")){
            WebDriverManager.edgedriver().setup();
            driver=new EdgeDriver();
        }
        return driver;
    }

    public static void CloseBrowser(){
        MyLibrary.sleepForNow(2);
        driver.quit();
        driver = null;
    }

}
