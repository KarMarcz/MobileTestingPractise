package Utils;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class Capabilities {
    public static AndroidDriver<AndroidElement> capabilties() throws MalformedURLException {
        File pathToResources = new File("src/main/resources");
        File nameOfApp = new File(pathToResources, "ApiDemos-debug.apk");
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "MobileTesting");
        desiredCapabilities.setCapability(MobileCapabilityType.APP, nameOfApp.getAbsolutePath());
        AndroidDriver<AndroidElement> androidDriver = new AndroidDriver<>( new URL("http://127.0.0.1:4723/wd/hub"),desiredCapabilities);
        return androidDriver;
    }
}
