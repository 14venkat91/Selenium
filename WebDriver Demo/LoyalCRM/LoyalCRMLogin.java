package LoyalCRM;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class LoyalCRMLogin {


    public static void main(String[] args) {
        
    	System.setProperty("webdriver.gecko.driver","C:\\drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		//WebDriver driver = new ChromeDriver();
    	
        String baseUrl = "http://localhost/loyal/login/";
        String expectedTitle = "Dashboard | Loyal CRM";
        String actualTitle = "";

       
        driver.get(baseUrl);

        // get the actual value of the title
        actualTitle = driver.getTitle();

        /*
         * compare the actual title of the page with the expected one and print
         * the result as "Passed" or "Failed"
         */
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
       
        //close Fire fox
        driver.close();
       
    }

}