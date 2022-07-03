import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class LoginPage {
    WebDriver driverChrome;
    WebDriver driverFirefox;


    public LoginPage(){

    }

    public LoginPage(List<WebDriver> driverList){
        this.driverChrome = driverList.get(0);
        this.driverFirefox = driverList.get(1);
    }

    public void openLoginPage(){
        this.driverChrome.findElement(By.id("ctx-LoginBtn")).click();
        this.driverFirefox.findElement(By.id("ctx-LoginBtn")).click();
    }
}
