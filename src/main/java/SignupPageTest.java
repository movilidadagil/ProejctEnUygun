import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.ArrayList;
import java.util.List;

public class SignupPageTest {

    static ChromeDriver chromeDriver;
    static FirefoxDriver fireFoxDriver;
    DriverSetup driverSetup;
    SignupPage signupPage;
    List<WebDriver> driverSetupList ;

    public SignupPageTest(){
        driverSetup = new DriverSetup();
        driverSetupList = new ArrayList<>();
        driverSetupList.add(driverSetup.chromeDriver);
        driverSetupList.add(driverSetup.firefoxDriver);
        signupPage = new SignupPage(driverSetupList);

    }
    public void checkOpenWebApp(){

        DriverSetup driverSetup = new DriverSetup();

        chromeDriver = driverSetup.openChrome("https://www.enuygun.com");
        fireFoxDriver = driverSetup.openFirefox("https://www.enuygun.com");

        String openedWebApp = chromeDriver.getCurrentUrl();
        if(openedWebApp.equals("https://www.enuygun.com/")){
            System.out.println("passed for chrome");
        }
        openedWebApp = fireFoxDriver.getCurrentUrl();
        if(openedWebApp.equals("https://www.enuygun.com/")){
            System.out.println("passed for firefox");
        }

    }

    public void checkOpenWebV2(){
        driverSetup.open("https://www.enuygun.com/");
        String openedWebApp = driverSetup.chromeDriver.getCurrentUrl();
        if(openedWebApp.equals("https://www.enuygun.com/")){
            System.out.println("passed for chrome");
        }

        openedWebApp = driverSetup.firefoxDriver.getCurrentUrl();
        if(openedWebApp.equals("https://www.enuygun.com/")){
            System.out.println("passed for firefox");
        }
    }

    public void checkOpenSignup(){


        signupPage.openSignup();
    }
}
