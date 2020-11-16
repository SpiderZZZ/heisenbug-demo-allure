package ru.heisenbug.selenide.heisenbug.demo.allure;

import com.automation.remarks.junit5.Video;
import org.junit.jupiter.api.Disabled;
import io.qameta.allure.Step;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class todoMVCTestWithExtendsBaseTest extends BaseTest {


    @BeforeEach
    void setUp() {
        open("http://todomvc.com/examples/angularjs/#/");
    }

    @Test
    public void test1() {
        step1();
        step2();
        step3();
        step4();
        step5();
    }

    @Step
    private void step1() {
        refresh();
    }
    @Step
    private void step2() {
        refresh();
    }
    @Step
    private void step3() {
        refresh();
    }
    @Step
    private void step4() {
        refresh();
    }

    @Step
    private void step5() {
        $(By.xpath("//input[@ng-model='newTodo']")).shouldBe((visible));
    }

    //@Video
    @Test
    public void test2() {
        $(By.xpath("//input[@ng-model='newTodo']")).setValue("make Coffee").pressEnter();
        $(By.xpath("//input[@ng-model='newTodo']")).setValue("make Tea").pressEnter();
        $(By.xpath("//input[@ng-model='newTodo']")).setValue("drink Coffee").pressEnter();
        $(By.xpath("//input[@ng-model='newTodo']")).setValue("drink Tea").pressEnter();
        $(By.xpath("//span[@class='todo-count']")).shouldBe((visible));
    }

    @Test
    public void tes3() {
        $(By.xpath("//span[@class='foo-bar']")).shouldBe((visible));
    }
}
