package io.github.bhhan.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.springframework.stereotype.Component;

@Component
public class HomePage extends BasePage{
    @FindBy(how = How.LINK_TEXT, using = "Login")
    private WebElement loginLink;

    @FindBy(how = How.LINK_TEXT, using = "Log off")
    private WebElement logOffLink;

    @FindBy(how = How.LINK_TEXT, using = "Employee List")
    private WebElement employeeListLink;

    @FindBy(how = How.LINK_TEXT, using = "Employee Details")
    private WebElement employeeDetailsLink;

    public LoginPage clickLogin(){
        loginLink.click();
        return new LoginPage();
    }

    public HomePage clickLogOff(){
        logOffLink.click();
        return new HomePage();
    }

    public void clickEmployeeList(){
        employeeListLink.click();
    }

    public boolean isEmployeeDetailsExist(){
        return employeeDetailsLink.isDisplayed();
    }
}
