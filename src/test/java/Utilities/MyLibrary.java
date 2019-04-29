package Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import java.io.*;
import java.time.*;
import java.util.Properties;

public class MyLibrary extends TestBase {


    public static void sleepForNow(int a){
        try {
            Thread.sleep(a * 1000);
        } catch (Exception e){}
    }



    public static void TakeScreenShots(String saveAs){
        String DateTime= LocalDate.now().toString()+ LocalTime.now().toString().substring(0,5);
        saveAs = saveAs+"_"+DateTime.replaceAll("[-,:]","");
        try {
            TakesScreenshot ss = (TakesScreenshot) driver;
            File muhtar = ss.getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(muhtar, new File("src/test/java/Utilities/Captures/"+saveAs+".jpg"));
        } catch (Exception e){}

    }




}
