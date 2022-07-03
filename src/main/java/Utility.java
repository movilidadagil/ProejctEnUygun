
import java.nio.file.Path;
import java.nio.file.Paths;

public class Utility {

    public static void setDriverPropsForFirefox(String firefox){
        Path resourceDirectory = Paths.get("src","main","resources");
        String absolutePath = resourceDirectory.toFile().getAbsolutePath();

        System.setProperty("webdriver.gecko.driver",absolutePath+"/binary/geckodriver");

    }

    public static void setDriverPropsForChrome(String chrome){

        Path resourceDirectory = Paths.get("src","main","resources");
        String absolutePath = resourceDirectory.toFile().getAbsolutePath();

        System.setProperty("webdriver.chrome.driver", absolutePath+"/binary/chromedriver");

    }


   /* public static ChromeOptions setChromeOptions(String[] arguments, boolean headless){

        ChromeOptions options = new ChromeOptions();
        options.addArguments(arguments);
        options.setHeadless(headless);
        return  options;

    }*/

   /* public static FirefoxOptions setFirefoxOptions(String[] arguments){
        FirefoxOptions options = new FirefoxOptions();
        options.addArguments(arguments);
        return options;
    }*/


    public static void setDriverProps(Enum driverType){
        Path resourceDirectory = Paths.get("src","main","resources");
        String absolutePath = resourceDirectory.toFile().getAbsolutePath();



        if(driverType.equals(DriverType.CHROME)){


            System.setProperty("webdriver.chrome.driver", absolutePath+"/binary/chromedriver");

        }

        if(driverType.equals(DriverType.FIREFOX)){


            System.setProperty("webdriver.gecko.driver",absolutePath+"/binary/geckodriver");

        }

        if(driverType.equals("Edge")){

            System.setProperty("webdriver.gecko.driver",absolutePath+"/binary/edgedriver");

        }

    }
}
