package PageObject;

import Utils.Capabilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import java.net.MalformedURLException;

public class MobilePage extends Capabilities {
    public static void main(String[] args) throws MalformedURLException {
        AndroidDriver<AndroidElement> androidDriver =  capabilties();

    }
}
