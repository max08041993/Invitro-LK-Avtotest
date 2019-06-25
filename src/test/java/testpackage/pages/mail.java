package testpackage.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import testpackage.help.Help_Methods;


public class mail extends PageObject {

    private static final Help_Methods help = Help_Methods.getInstance();

  @FindBy(xpath = "//a[. = 'Войти в почту']")//Кнопка входа в почту//a[@class='button desk-notif-card__login-enter-expanded button_theme_gray i-bem button_js_inited']
    WebElement ButtonVhod;

  @FindBy(xpath = "//input[@id='passp-field-login']")//Поле ввода логина
    WebElement InputLogin;

  @FindBy(xpath = "//button[contains(@class, 'button2_type_submit passp-form-button')]")//Кнопка входа
    WebElement ButtonInput;

  @FindBy(xpath = "//input[@id='passp-field-passwd']")//Поле ввода пароля
    WebElement InputPassword;

  @FindBy(xpath = "//button[contains(@class,'button-28_theme_normal button2_width_max passp-form-button')]") //кнопка Не сейчас при запросе привязки телефона
    WebElement ButtonNotNow;

  @FindBy(xpath = "(//span[@title='Вы зарегистрированы.'])[1]")//последнее письмо с подтверждением регистрации
    WebElement EmailRegistr;

  @FindBy(xpath = "//a[contains(text(),'Активировать аккаунт lk.invitro.ru')]")
    WebElement URLPodtvergdeniya;

  @FindBy(xpath = "(//span[@title='Подтверждение Вашего профиля перед сменой пароля.'])[1]")//последнее письмо по смене пароля
  WebElement EmailSmenaPasword;

  @FindBy(xpath = "//a[contains(text(),'Перейдите по этой ссылке, чтобы сформировать новый пароль.')]")
  WebElement SsilkaNaSmenu;




  public void clickButtonVhod(){
          help.Check_Visible_Element(ButtonVhod);
          help.Click_Method(ButtonVhod);

      //help.Click_Method(ButtonVhod);
  }

  public void inputInputLogin(){
      help.Click_Method(InputLogin);
      help.Enter_Text(InputLogin,"pacient.lk5.invitro@yandex.ru");
  }

  public void clickButtonInput(){
      help.Click_Method(ButtonInput);
  }

    public void inputInputPassword(){
        help.Click_Method(InputPassword);
        help.Enter_Text(InputPassword,"invitro123");
    }

//Кнопка входа

    public void clickButtonNotNow(){
      help.Click_Method(ButtonNotNow);
    }

    public void clickEmailSmenaPasword(){
      help.Click_Method(EmailSmenaPasword);
    }

    public void clickSsilkaNaSmenu(){
      help.Click_Method(SsilkaNaSmenu);
    }







}
