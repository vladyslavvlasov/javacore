package com.vladyslavvlasov.app.webdriver.tests;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

/**
 * Created by Vladyslav Vlasov on 21.12.2016.
 */
public class BaseTest {
    protected WebDriver driver;
    private static String BROWSER = System.getProperty("browser");
    private static String REMOTE = System.getProperty("remote");
    private static String REMOTE_URL = "http://localhost:4444/wd/hub";
    private static String OS = System.getProperty("os.name").toLowerCase();
    private static final String CHROME_PATH_MAC = "src/test/resources/drivers/chromedriver";
    private static final String CHROME_PATH_WIN = "src/test/resources/drivers/chromedriver.exe";
    DesiredCapabilities capabilities = new DesiredCapabilities();


    @Before
    public void setUp() {

        //mvn clean test -Dbrowser="Chrome"

        if (BROWSER == null || BROWSER.equalsIgnoreCase("Firefox") || BROWSER.equalsIgnoreCase("")) {
            this.driver = new FirefoxDriver();
            capabilities.setBrowserName("firefox");
        } else if (BROWSER.equalsIgnoreCase("Chrome")) {
            if (isWindows()) {
                System.setProperty("webdriver.chrome.driver", CHROME_PATH_WIN);
            } else if (isMac()) {
                System.setProperty("webdriver.chrome.driver", CHROME_PATH_MAC);
            }
            capabilities.setBrowserName("chrome");
            this.driver = new ChromeDriver();
        }


        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();

    }

    @After
    public void tearDown() {
        driver.quit();
        //moved to TestWatcher
        //driver.close();
    }

    private static boolean isWindows() {
        return (OS.contains("win"));
    }

    private static boolean isMac() {
        return (OS.contains("mac"));
    }

    public static boolean isUnix() {
        return (OS.contains("nix") || OS.contains("nux") || OS.contains("aix"));
    }
}


