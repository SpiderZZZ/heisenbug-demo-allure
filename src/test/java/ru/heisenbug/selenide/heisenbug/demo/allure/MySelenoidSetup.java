package ru.heisenbug.selenide.heisenbug.demo.allure;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.extension.BeforeAllCallback;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.openqa.selenium.remote.DesiredCapabilities;

public class MySelenoidSetup implements BeforeAllCallback {
    @Override
    public void beforeAll(ExtensionContext context) {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName("firefox");
        capabilities.setVersion("");
        capabilities.setCapability("enableVNC", true);
        capabilities.setCapability("enableVideo", false);

        Configuration.browserCapabilities = capabilities;
        Configuration.browser = "chrome";
        Configuration.remote = "http://test:test@192.168.32.147:4446/wd/hub";
    }
}
