import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class SignupPage {

        WebDriver driverChrome;
        WebDriver driverFirefox;

    public SignupPage() {


    }

    public SignupPage(List<WebDriver> driverList){
        this.driverChrome = driverList.get(0);
        this.driverFirefox = driverList.get(1);
    }


    public void openSignup(){
        // chromedriver.findElement(By.id("ctx-RegisterBtn")).click()
        //firefoxdriver.findElement(By.id("ctx-RegisterBtn")).click()
        this.driverChrome.findElement(By.id("ctx-RegisterBtn")).click();
        this.driverFirefox.findElement(By.id("ctx-RegisterBtn")).click();


    }

    public void openSignupV2(WebDriver chromeDriver, WebDriver fireFoxDriver) {
        chromeDriver.findElement(By.id("ctx-RegisterBtn")).click();
        fireFoxDriver.findElement(By.id("ctx-RegisterBtn")).click();
    }


}
