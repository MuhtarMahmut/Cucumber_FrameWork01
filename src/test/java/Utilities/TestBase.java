package Utilities;

import Elements.AmazonElements;
import Elements.GoogleElemnts;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public abstract class TestBase {

    public static WebDriver driver;
    public static WebDriverWait wait;
    public static Actions act;

    public static GoogleElemnts google;
    public static AmazonElements amazon;



}
