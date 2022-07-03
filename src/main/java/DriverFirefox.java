import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class DriverFirefox {

    WebDriver driver;
    public DriverFirefox(){
        Utility.setDriverProps(DriverType.FIREFOX);
        this.driver = new FirefoxDriver();

    }
    public void open(String url) {



            /*Path resourceDirectory = Paths.get("src","main","resources");
            String absolutePath = resourceDirectory.toFile().getAbsolutePath();

            System.setProperty("webdriver.gecko.driver",absolutePath+"/binary/geckodriver");
            */

            //Utility.setDriverPropsForFirefox("firefox");
            String[] args={"start-maximized", "headless"};
            System.out.println(args[0]);
            Utility.setDriverProps(DriverType.EDGE);


            WebDriver driver = new FirefoxDriver();
            driver.get(url);

    }
}
