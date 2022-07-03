
import org.openqa.selenium.SessionNotCreatedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class DriverChrome {

    public WebDriver driver;

    public DriverChrome(){
        Utility.setDriverProps(DriverType.CHROME);
        this.driver = new ChromeDriver();

    }
    public void open(String url) {


        try{
            /*Path resourceDirectory = Paths.get("src","main","resources");
            String absolutePath = resourceDirectory.toFile().getAbsolutePath();

            System.setProperty("webdriver.chrome.driver", absolutePath+"/binary/chromedriver");*/

            //Utility.setDriverPropsForChrome("Chrome");
            String[] args = {"start-maximized"};

            Utility.setDriverProps(DriverType.CHROME);

            /*

            ChromeOptions options = new ChromeOptions();
            options.addArguments(arguments);
            WebDriver driver = new ChromeDriver(options);

                       */

            //for headless usage you need to add headless parameter as true or false in chromeoptions method.
            WebDriver driver = new ChromeDriver();
            driver.get(url);
        }catch (SessionNotCreatedException e){
            System.out.println(" sesssion not created version error  during chromedriver instance in open method\n"+ e.getLocalizedMessage());
        }


    }
}
