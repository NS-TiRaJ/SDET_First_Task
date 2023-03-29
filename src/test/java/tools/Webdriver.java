package tools;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Webdriver {
    public static ChromeDriver getChromeDriver() {
        System.setProperty("webdriver.chrome.driver","H:\\Programming\\Java\\SDET_First_Task\\src\\test\\java\\tools\\chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        return new ChromeDriver(chromeOptions);
    }
}
