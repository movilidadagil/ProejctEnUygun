import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.sql.Driver;
import java.util.List;

public class EnUygunWebMain {

    /*

        - signup flow will be implemented.
        - try catch,
        - validation
        - verification
     */

    static ChromeDriver chromeDriver;
    static FirefoxDriver fireFoxDriver;


    public static void main(String[] args){


      //  Utility.setDriverProps(DriverType.CHROME);
        try{
            String[] arguments = {"start-maximized"};

           // tek bir open metodu kullanarak firefox ve chrome da enuygun sitesinin açılmasını sağlamak istiyorum
            // daha sonra signup yapacağız her iki tarayıcıda da.
            /*DriverSetup driverSetup = new DriverSetup();
            driverSetup.open("https://www.enuygun.com");
            List<WebDriver> driverSetupList = driverSetup.setupDrivers();
            SignupPage signupPage = new SignupPage(driverSetupList);
            signupPage.openSignup();*/
        //    DriverSetup driverSetup = new DriverSetup();

         //   chromeDriver = driverSetup.openChrome("https://www.enuygun.com");
         //   fireFoxDriver = driverSetup.openFirefox("https://www.enuygun.com");

            SignupPageTest signupPageTest = new SignupPageTest();
          //  signupPageTest.checkOpenWebApp();
            //signupPageTest.checkOpenWebV2();
           // signupPageTest.checkOpenSignup();

            LoginPageTest loginPageTest = new LoginPageTest();
            loginPageTest.checkOpenWebV2();
            loginPageTest.checkOpenLogin();


            /*
                daha iyi nasıl bu projede login ve signup senaryoları koşturulabilir,
                daha ne kadar iyileştirilebilir
                BEyzanur un metod yaklaşımı
                yapıcı yaklaşımı ile değiştirildi
                hasan ın yapıcı yaklaşımı daha iyi ne ile değiştirilebilir.
                hedefimizi en iyi en scalable, en maintainable şekilde
                senaryoları koşabilmek.
                şu ana kadar öğrendiklerimizle
                nesne, sınıf, enum, list, map, interface, inheritance, abstraction, override
             */
        }catch(IllegalStateException e){
            System.out.println("hasan hoca driver ı yükle lütfen"+ e.getMessage());
        }


    }

    public void validateSignupModal(){
        DriverSetup driverSetup = new DriverSetup();

        chromeDriver = driverSetup.openChrome("https://www.enuygun.com");
        fireFoxDriver = driverSetup.openFirefox("https://www.enuygun.com");

        SignupPage signupPage = new SignupPage();
        //signupPage.openSignup();
        signupPage.openSignupV2(chromeDriver,fireFoxDriver);

    }
}
