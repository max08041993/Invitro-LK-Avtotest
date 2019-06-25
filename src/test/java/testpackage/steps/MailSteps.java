package testpackage.steps;

import cucumber.api.java.en.When;
import testpackage.pages.mail;

public class MailSteps {

    mail page;

    @When("Нажать кнопку Войти")
    public void clickButtonVhod(){
        page.clickButtonVhod();
    }

    @When("Ввести логин на сайте яндекса")
    public void inputInputLogin(){
        page.inputInputLogin();
    }

    @When("В окне авторизации нажать кнопку Войти на сайте яндекса")
    public void clickButtonInput(){
        page.clickButtonInput();
    }

    @When("Ввести пароль на сайте яндекса")
    public void inputInputPassword(){
        page.inputInputPassword();
    }

    @When("Нажать кнопку отказа привязки телефона")
    public void clickButtonNotNow(){
        page.clickButtonNotNow();
    }

    @When("Найти письмо о восстановлении пароля")
    public void clickEmailSmenaPasword(){
        page.clickEmailSmenaPasword();
    }

    @When("Перейти к восстановлению пароля")
    public void clickSsilkaNaSmenu(){
        page.clickSsilkaNaSmenu();
    }



}
