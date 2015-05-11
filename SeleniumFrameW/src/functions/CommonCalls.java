/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package functions;

import connect.Connector;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


/**
 *
 * @author Iniyan
 */
public class CommonCalls extends Connector{
    public WebDriver driver;

    public CommonCalls() throws IOException{
        driver = Connector.init("browser");
    }
    
    public void GotoURL(String url){
        driver.get(url);    
    }
    
    public boolean ClickButton(String webelement){
       try{
        driver.findElement(By.xpath(webelement)).click();
       }
       catch(Exception e){
           System.out.print(e);
           return false;
       }
       return true;
    }
    
    public boolean ClickLink(String webelement){
       try{
        driver.findElement(By.xpath(webelement)).click();
       }
       catch(Exception e){
           System.out.print(e);
           return false;
       }
       return true;
    }
    
    public boolean CheckLabel(String webelement, String expectedLabel){
       try{
        String actualLabel = driver.findElement(By.xpath(webelement)).getText();
           return expectedLabel.equals(actualLabel);
       }
       catch(Exception e){
           System.out.print(e);
           return false;
       }
    }
    
    public boolean ExplicitWait(String webelement){
        try{
            WebDriverWait wait = new WebDriverWait(driver, 10); 
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("webelement")));
            return true;
        }
        catch(Exception e){
            System.out.print(e);
            return false; 
        }
    }
    
    public void setText(String webelement, String setText){
        try{
            driver.findElement(By.xpath(webelement)).sendKeys("setText");
        }
        catch(Exception e){
            System.out.print(e);
        }
    }
    
    public void driverClose(){
        driver.quit();
    }
}
