package appiumBasics;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;

public class AppiumBasics {

    @Test
    public void appiumTest() throws MalformedURLException, URISyntaxException {

        UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName("RajatEmulator");
        options.setApp("C:\\Users\\erraj\\IdeaProjects\\Appium\\src\\test\\resources\\ApiDemos-debug.apk");


        AndroidDriver driver = new AndroidDriver(new URI( "http://127.0.0.1:4723").toURL(),options);

    }
}
