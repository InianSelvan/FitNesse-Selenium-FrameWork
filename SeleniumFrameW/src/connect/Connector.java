/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connect;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 *
 * @author Inian
 */
public class Connector {
    private static WebDriver driver;
    
    public static WebDriver init(String BrowserName) throws IOException{
        System.out.println(readFile().getProperty(BrowserName));
        if(readFile().getProperty(BrowserName).contains("chrome")){
            
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\driver\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        }
        if(BrowserName.contains("Firefox")){
            WebDriver driver = new FirefoxDriver();
        }
        return driver;
    }
    
    public static Properties readFile() throws FileNotFoundException, IOException{
        Properties prop = new Properties();
        FileInputStream fp = new FileInputStream(System.getProperty("user.dir")+"\\src\\config\\config.properties");
        prop.load(fp);
        return prop;
    }
}
