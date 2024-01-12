package PageLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class UserInformation {
    @FindBy(xpath = "//*[contains(@name,'email')]")
    public static WebElement username;
    @FindBy(xpath = "//*[contains(@name,'password')]")
    public static WebElement password;
    @FindBy(xpath = "//*[contains(@name,'confirmPassword')]")
    public static WebElement confirmpassword;
    @FindBy(xpath = "//*[contains(@name,'submit')]")
    public static WebElement submitBtn;


    @FindBy(xpath = "//*[contains(@name,'country')]//preceding::option")
    public static List<WebElement > Countrylist;
}
