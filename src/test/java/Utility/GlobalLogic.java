package Utility;

import PageLocators.ContactInformation;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;
import net.masterthought.cucumber.Reportable;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class GlobalLogic {
    public static WebDriver driver;
    public static GlobalLogic INSTANCE = new GlobalLogic();
    public static Scenario scenario;
    public static String testcaseid;
    public static String URsL;
    public static String Username;
    public static String Password;

    @Before
    public void GlobalLogic(Scenario scenario) {
        this.scenario = scenario;

    }

    @After
    public static void teardown() {

        driver.close();
        driver.quit();
    }


    public static void takescreenshot() {
        if (scenario != null & !scenario.isFailed()) {
            byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot, "image/png");

        }

    }

    public static void BrowserOpen() throws IOException {
        propertiesLoad();
        driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver.manage().window().maximize();
        driver.get(URsL);

    }
public static void propertiesLoad() throws IOException {
    Properties prop=new Properties();
    String filename="src/test/resources/Browser.properities";
    //est.class.getClassLoader().getResourceAsStream(filename);
    prop.load(new FileInputStream(filename));
    URsL=prop.getProperty("URL");
    Username=prop.getProperty("userName");
    Password=prop.getProperty("password");
}

    public static void reportGenerate()
    {

        File reportOutputDirectory = new File("reports");
        List<String> jsonFiles = new ArrayList<>();

        jsonFiles.add("target/cucumber.json");
        String buildNumber = "1";
        String projectName = "Karthika POC";
        Configuration configuration = new Configuration(reportOutputDirectory, projectName);
        configuration.setBuildNumber(buildNumber);
        configuration.addClassifications("Platform", System.getProperty("os.name"));
        configuration.addClassifications("Environement", GlobalLogic.URsL);
        configuration.addClassifications("Branch", "release/1.0");


        ReportBuilder reportBuilder=new ReportBuilder(jsonFiles,configuration);
        Reportable result=reportBuilder.generateReports();
// and here validate 'result' to decide what to do if report has failed
    }

    public WebDriver getDriver() {
        return driver;
    }


    public static GlobalLogic getInstance() {
        return INSTANCE;
    }

}
