package Elements;

import Utilities.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleElemnts extends TestBase {

    public GoogleElemnts(){
        PageFactory.initElements(driver , this);
    }

    @FindBy(xpath = "//input[@name='q']")
    public WebElement searchbox;




}
