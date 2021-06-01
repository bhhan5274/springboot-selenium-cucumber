package io.github.bhhan.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.springframework.stereotype.Component;

@Component
public class LoginPage extends BasePage{
    @FindBy(how = How.NAME, using = "UserName")
    private WebElement txtUserName;

    @FindBy(how = How.NAME, using = "Password")
    private WebElement txtPassword;

    @FindBy(how = How.CSS, using = ".btn-default")
    private WebElement btnLogin;

    public void login(String userName, String password){
        txtUserName.sendKeys(userName);
        txtPassword.sendKeys(password);
    }

    public HomePage clickLogin(){
        btnLogin.click();
        return new HomePage();
    }
}
