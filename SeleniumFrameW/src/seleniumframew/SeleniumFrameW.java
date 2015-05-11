/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seleniumframew;

import connect.Connector;
import functions.CommonCalls;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author Iniyan
 */
public class SeleniumFrameW {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  throws IOException {
        CommonCalls call = new CommonCalls();
        call.GotoURL("http://localhost/InianSelvanProfile/index.php");
        
    }
    
}
