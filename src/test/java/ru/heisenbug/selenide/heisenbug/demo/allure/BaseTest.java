package ru.heisenbug.selenide.heisenbug.demo.allure;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeAll;

abstract class BaseTest {

    @BeforeAll
    static void setupAllure()
    {
        SelenideLogger.addListener("AllureSelenide",
                new AllureSelenide().screenshots(true).savePageSource(true));
        //Configuration.headless = true;
    }
}
