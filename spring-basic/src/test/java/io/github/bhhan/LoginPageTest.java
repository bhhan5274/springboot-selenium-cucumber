package io.github.bhhan;

import io.github.bhhan.pages.MainPage;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

@SpringBootTest
public class LoginPageTest extends AbstractTestNGSpringContextTests {
    @Autowired
    private MainPage mainPage;

    @Autowired
    private WebDriver webDriver;

    @Test
    public void testLogin(){
        mainPage.performLogin();
    }

    @AfterTest
    public void clear(){
        webDriver.quit();
    }
}
