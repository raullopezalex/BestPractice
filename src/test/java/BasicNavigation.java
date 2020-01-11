import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.BrowserFactory;
import utilities.BrowserUtilities;

public class BasicNavigation {
    public static void main(String[] args) throws InterruptedException {
//
        WebDriver driver= BrowserFactory.getDriver("chrome");
        String expectedGoogleTitle = "Google";
        String expectedAmazonTitle= "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more\n";
        driver.get("https://www.google.com/");
        String firstTitle = driver.getTitle();
       // driver.get("https://www.amazon.com/"); //navigate is faster than get method

        driver.navigate().to("https://www.amazon.com/");
        String secondtTitle = driver.getTitle();
        driver.navigate().back();      //go back to previous page
        String thirdTitle = driver.getTitle();
        driver.navigate().forward();  // go forward to page ahead
        String fourthTitle = driver.getTitle();

       // Thread.sleep(3000);
        driver.navigate().refresh();
     //   driver.navigate().to("https://etsy.com");
//        if(expectedGoogleTitle.equals((firstTitle))){
//            System.out.println("Test1 Passed");
//        }
//        else {
//            System.out.println("Test1 failed");
//        }
        BrowserUtilities.verifyEquals(firstTitle, expectedAmazonTitle);


      driver.close();
    }
}
