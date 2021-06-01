package io.github.bhhan.pages;

import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MainPage {
    @Autowired
    private LoginPage loginPage;

    @Value("${app.url}")
    private String url;

    @Autowired
    private HomePage homePage;

    @Autowired
    private WebDriver webDriver;

    public void performLogin(){
        webDriver.navigate().to(url);
        homePage.clickLogin();
        loginPage.login("admin", "password");
        loginPage.clickLogin();
    }
}
