package testpackage.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.yecht.Data;
import testpackage.help.Help_Methods;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;


public class PacientLKPage extends PageObject {

    private static final Help_Methods help = Help_Methods.getInstance();
    public ArrayList<String> TheBoardValues = new ArrayList();

    private By AppCookie = By.xpath("//button[contains(@class,'attention-close-button')]");

    //19.06.2019

    @FindBy(xpath = "//a[@class='btn btn--narrow btn--empty city__change-btn']")//Выбрать другой
            WebElement ChengeOtherCity;

    @FindBy (xpath = "//button[@class='attention-close-button btn-icon btn-icon--fill']")
    WebElement Prinyat;

    @FindBy (xpath = "//button[@class='btn btn--narrow city__confirm-btn']") //Да верно
            WebElement ChangeYesOk;

    @FindBy (xpath = "//div[@class='change-city-wrapper__left']//a[@class='change-city-block__item bold'][contains(text(),'Москва')]") //надпись крупные города Москва
            WebElement BigCityMoscow;

    private By Moscow = By.xpath("//span[@class='city__name city__btn city__name--label']");

    @FindBy (xpath = "//button[@class='header-nav__get-result popupBtn']")
    WebElement Resultat;

    @FindBy (xpath = "//div[@id='popupResult']")// Поле ввода
    WebElement PopapResult;

    @FindBy (xpath = "//input[@id='inz']")// Поле ввода
    WebElement InputINZ;

    @FindBy (xpath = "//input[@id='born']")// Поле ввода
    WebElement Born;

    @FindBy (xpath = "//input[@id='surname']")// Поле ввода
    WebElement Surename;

    @FindBy (xpath = "//button[@id='getAnalisisBtn']")
    WebElement FindSubmit;

    @FindBy (xpath = "//span[@class='radio__text'][contains(text(),'Скачать файл')]")
    WebElement RadioDownload;

    @FindBy(xpath = "//span[@class='radio__text'][contains(text(),'Отправить по e-mail')]")
    WebElement RadioEmailGet;

    @FindBy(xpath = "//p[@id='resultQuant']")
    WebElement PodskazkaResult;

    @FindBy (xpath = "//div[@id='AnalysisResult']/span[@class='btn__side-link js-button-reset']")
    WebElement PovtorPoisk;

    @FindBy(xpath = "//button[@id='downloadAnalysisBtn']")
    WebElement ButtonFind;

    @FindBy (xpath = "//button[@title='Close (Esc)']")
    WebElement Close;

    @FindBy (xpath = "//input[@id='emailSend']")
    WebElement InputEmail;

    @FindBy (xpath = "//button[@id='getEmailAnalysisBtn']")
    WebElement ButtonSend;

    @FindBy (xpath = "(//div[@class='attention__content'])[1]")
    WebElement FallPodskazka;

    @FindBy (xpath = "//button[@id='header_button_login']")
    WebElement ButtonLogin;

    @FindBy (xpath = "//a[@class='autorisation__link-forgot link'][contains(text(),'Забыли')]")//Забыли пароль
    WebElement ZabilPassword;

    @FindBy(xpath = "//input[@id='loginForgot']")
    WebElement InputEmailOrTel;

    @FindBy(xpath = "//input[@id='passwordForgotEmail']")//Поле ввода нового пароля
    WebElement NewPassword;

    @FindBy(xpath = "//input[@id='repareLogin']")
    WebElement ButtonVostanovleniyaPasword;

    @FindBy(xpath = "//div[@class='fields']")
    WebElement MessagePasword;

    @FindBy(xpath = "//input[@name='Forgot']")
    WebElement ButtonVostanovPasword;

    //------------------------------------------------------------------------------------------


    public void ClickYesMoskow(){
        if (find(Moscow).getText().equals("Москва"))
        {
            help.Click_Method(ChangeYesOk);
            help.getSlow();
            help.Click_Method(Prinyat);
        }
        else{
            help.Click_Method(ChengeOtherCity);
            help.Click_Method(BigCityMoscow);
            help.Click_Method(ChangeYesOk);
            help.getSlow();
            help.Click_Method(Prinyat);
        }
    }

    public void clickButtonLogin(){
        help.Click_Method(ButtonLogin);
    }

    public void clickResultat(){
        help.clickOn(Resultat);
    }

    public void visiblePopapResult(){
        help.Check_Visible_Element(PopapResult);
    }

    public void inputINZBornSurename(){
        help.Click_Method(InputINZ);
        help.Enter_Text(InputINZ,"904160861");
        help.Click_Method(Born);
        help.Enter_Text(Born," 07071997");
        help.Click_Method(Surename);
        help.Enter_Text(Surename,"Тестовый Бонус7");
    }

    public void clickFindSubmit(){
        help.Click_Method(FindSubmit);
    }

    public void visibleRadioEmailDownload(){
        help.Check_Visible_Element(RadioEmailGet);
        help.Check_Visible_Element(RadioDownload);
    }

    public void visiblePodskazkaResult(){
        help.Verify_Text(PodskazkaResult,"Найдены результаты 1 анализов.");
    }

    public void visiblePovtorPoisk(){
        help.Check_Visible_Element(PovtorPoisk);
    }

    public void clickButtonFind(){
        help.Click_Method(ButtonFind);
    }

    public void clickClose(){
        help.getSlow5();
        help.Click_Method(Close);
    }

    public void clickRadioEmailGet(){
        help.Click_Method(RadioEmailGet);
    }

    public void inputInputEmail(){
        help.Click_Method(InputEmail);
        help.Enter_Text(InputEmail,"mkozlov@invitro.ru");
    }

    public void clickButtonSend(){
        help.Click_Method(ButtonSend);
    }

    public void visiblePodskazkaSend(){
        help.Verify_Text(PodskazkaResult,"Документ отправлен на указанный E-mail.");
    }

    public void inputFallINZBornSurename(){
        help.Click_Method(InputINZ);
        help.Enter_Text(InputINZ,"854672629");
        help.Click_Method(Born);
        help.Enter_Text(Born," 01011800");
        help.Click_Method(Surename);
        help.Enter_Text(Surename,"Ложные Данные");
    }

    public void visibleFallPodskazka(){
        help.Verify_Text(FallPodskazka,"Ваши результаты анализов не найдены. Пожалуйста, измените параметры и повторите поиск");
    }

    public void clickZabilPassword(){
        help.Click_Method(ZabilPassword);
    }

    public void inputInputEmailOrTel(){
        help.Enter_Text(InputEmailOrTel,"pacient.lk5.invitro@yandex.ru");
    }

    public void inputNewPassword(){
        help.Enter_Text(NewPassword,"12345");
    }

    public void clickButtonVostanovleniyaPasword(){
        help.Click_Method(ButtonVostanovleniyaPasword);
    }

    public void visinleMessagePasword(){
        help.Verify_Text(MessagePasword,"Пароль успешно восстановлен!");
    }

    public void clickButtonVostanovPasword(){
        help.Click_Method(ButtonVostanovPasword);
        help.getSlow();
    }

//---------------------------------------------------------------------------------------------------------------------------------------------------------------

    // Локаторы ЛК
    @FindBy (xpath = "//input[@id='login']")// Поле ввода Логина
    WebElement LoginFieldAuthorization;

    @FindBy (xpath = "//input[@id='password']")// Поле ввода Пароля
    WebElement PasswordFieldAuthorization;

    @FindBy(xpath = "//input[@type='submit'][@name='Login']")
    WebElement ButtonInput;

    @FindBy(xpath = "//div[@class='header-title']")
    WebElement TextLK;

    @FindBy(xpath = "//a[@class='header-nav__link header-nav__link--active']")
    WebElement ZakaziAktiv;

    @FindBy(xpath = "//button[@class='select-drop__toggle']")
    WebElement ViborMedKart;

    @FindBy(xpath = "//p[@class='select-drop__title'][contains(text(),'Тестовый Бонус7')]")
    WebElement TestovyBonus7;

    @FindBy(xpath = "//div[@class='list-order__item list-order__item--on-hover to-detail_main']//a[contains(text(),'ИНЗ 904160861')]")
    WebElement INZ904160861;

    @FindBy(xpath = "//a[@class='list-order__action ddownload']")
    WebElement DownloadLK;

    @FindBy(xpath = "//a[@class='list-order__action popupBtn sender']")
    WebElement FindOnEmailLK;

    @FindBy(xpath = "//input[@id='email']")
    WebElement InputEmailLK;

    @FindBy(xpath = "//button[@class='btn ripple'][contains(text(),'Отправить')]")
    WebElement SendOtpravitLK;

    @FindBy(xpath = "//div[@class='conteiner inner']")
    WebElement ZakazyAktiv;

    @FindBy(xpath = "//div[@class='list-order__item list-order__item--on-result showDetailInzInfo showDetailInzInfoClicker doneOrder']")
    WebElement OpenZakaz;

    @FindBy(xpath = "//div[@class='analysis-table analysis-table--no-padding-left analysis-table--v-align-top']")
    WebElement Table1Result;

    @FindBy(xpath = "(//button[@class='list-order__edit'])[1]")//Кнопка переименования первого заказа
    WebElement EditNameZakaz;

    @FindBy(xpath = "(//input[@class='list-order__input'])[1]")//Поле ввода имени первого заказа
    WebElement InputNameZakaz;

    @FindBy(xpath = "(//button[@class='list-order__send sender_alias'])[1]")//Кнопка сохранения имени первго заказа
    WebElement SaveNameZakaz;

    @FindBy(xpath = "(//h2[@class='list-order__title'])[1]")//Имя первого заказа
    WebElement NameZakaz;

    @FindBy(xpath = "(//div[@class='list-order__wrap'])[1]")//Переход к телу переименованого первого заказа
    WebElement TeloFirstZakaz;






    // Авторизация

    public void enterLoginFieldAuthorization(String Login) { // Ввод Имени inv.loyal.1@gmail.com
        help.Click_Method(LoginFieldAuthorization);
        help.Enter_Text(LoginFieldAuthorization, Login);
    }

    public void enterPasswordFieldAuthorization(String Password) { // Ввод пароля QazWsxEdc
        help.Click_Method(PasswordFieldAuthorization);
        help.Enter_Text(PasswordFieldAuthorization, Password);
    }

    public void clickButtonInput(){
        help.Click_Method(ButtonInput);
    }

    public void visibleTextLK(){
        help.Verify_Text(TextLK,"ЛИЧНЫЙ КАБИНЕТ");
    }

    public void visibleZakaziAktiv(){
        help.Check_Visible_Element(ZakaziAktiv);
    }

    public void clickChooseMedCart() { //Кликнуть, Выбрать мед карту
        help.Click_Method(ViborMedKart);
        help.Click_Method(TestovyBonus7);
    }

    public void clickINZ904160861(){
        help.Click_Method(INZ904160861);
    }

    public void clickDownloadLK(){
        help.Click_Method(DownloadLK);
    }

    public void clickFindOnEmailLK(String AdrEmail){
        help.Click_Method(FindOnEmailLK);
        help.getSlow();
        help.Click_Method(InputEmailLK);
        help.Enter_Text(InputEmailLK,AdrEmail);//mkozlov@invitro.ru
        help.Click_Method(SendOtpravitLK);
    }

    public void visibleTableResult(){
        help.Click_Method(OpenZakaz);
        help.getSlow();
        help.Check_Visible_Element(Table1Result);
    }

    // Ввод неверного Логина пароля

    @FindBy(xpath = "(//span[@class='attention__acc show_error'])[1]")
    WebElement ErrorLogPass;

    public void enterErrorLoginFieldAuthorization(String EmailFall, String PassFall) { // Ввод не корректного Email
        help.Click_Method(LoginFieldAuthorization);
        help.Enter_Text(LoginFieldAuthorization, EmailFall);//inv.loyal.1@gmailcom
        help.getSlow();
        help.Click_Method(PasswordFieldAuthorization);
        help.Enter_Text(PasswordFieldAuthorization, PassFall);//QazWsxEdc
        help.getSlow();
        help.Click_Method(ButtonInput);
        help.getSlow();
        help.Verify_Text(ErrorLogPass,"логин не является корректным email или телефоном");

    }

    public void enterErrorTelLoginFieldAuthorization(String TelFall, String PassFall) { // Ввод не корректного Телефона
        help.Click_Method(LoginFieldAuthorization);
        help.Enter_Text(LoginFieldAuthorization, TelFall);//+7987366427785
        help.getSlow();
        help.Click_Method(PasswordFieldAuthorization);
        help.Enter_Text(PasswordFieldAuthorization, PassFall);//QazWsxEdc
        help.getSlow();
        help.Click_Method(ButtonInput);
        help.getSlow();
        help.Verify_Text(ErrorLogPass,"логин не является корректным email или телефоном");
    }

    public void enterFallPasswordFieldAuthorization() { // Ввод Неверного пароля
        help.Click_Method(LoginFieldAuthorization);
        help.Enter_Text(LoginFieldAuthorization, "inv.loyal.1@gmail.com");
        help.Click_Method(PasswordFieldAuthorization);
        help.Enter_Text(PasswordFieldAuthorization, "QazWsxEdc34532");
        help.getSlow();
        help.Click_Method(ButtonInput);
        help.getSlow();
        help.Verify_Text(ErrorLogPass,"неверный логин/пароль пользователя");
    }

    public void enterFallLoginFieldAuthorization() { // Ввод Неверного Имени
        help.Click_Method(LoginFieldAuthorization);
        help.Enter_Text(LoginFieldAuthorization, "inv.loya32546l.1@gmail.com");
        help.Click_Method(PasswordFieldAuthorization);
        help.Enter_Text(PasswordFieldAuthorization, "QazWsxEdc");
        help.Click_Method(ButtonInput);
        help.getSlow();
        help.Verify_Text(ErrorLogPass,"неверный логин/пароль пользователя");
    }


    //--------------------------------------------------------------------------------------------------


    public void enterLoginTelFieldAuthorization() { // Ввод Имени
        help.Click_Method(LoginFieldAuthorization);
        help.Enter_Text(LoginFieldAuthorization, "+79873664277");
    }

    public void enterPasswordTelFieldAuthorization() { // Ввод пароля
        help.Click_Method(PasswordFieldAuthorization);
        help.Enter_Text(PasswordFieldAuthorization, "123456");
    }


// --------------------  Полная проверка страницы Заказы поиск по ИНЗ и Артиклу -----------------------

    @FindBy(xpath = "//button[@class='list-order__action list-order__action--download dwnlod']")
    WebElement DonloadRez;

    @FindBy(xpath = "//input[@class='search__input']")
    WebElement InputINZAndNameTest;//Поле ввода ИНЗ и Артиклу

    @FindBy(xpath = "//button[@class='search__btn']")
    WebElement Search;//кнопка поиска по ИНЗ и Артиклу

    @FindBy(xpath = "//h2[@class='list-order__title']")
    WebElement ZakazOt21Fev;//Заголовок заказа по ИНЗ 904160861 "Заказ от 21 февраля 2019"

    @FindBy(xpath = "//span[contains(text(),'Сбросить фильтр')]")
    WebElement ButtonResetFilter;//Кнопка Сбросить фильтр

    @FindBy(xpath = "(//div[@class='tip tip--text'][contains(text(),'1515')])[1]")
    WebElement ElementArt1515First;

    public void sendINZ904160861(){
        help.Enter_Text(InputINZAndNameTest,"904160861");
    }

    public void sendSearch(){
        help.Click_Method(Search);
    }

    public void visibleINZ904160861(){
        help.Verify_Text(ZakazOt21Fev,"Заказ от 21 февраля 2019");
    }

    public void sendResetFiltr(){
        help.Click_Method(ButtonResetFilter);
    }

    public void sendArt1515(){
        help.Enter_Text(InputINZAndNameTest,"1515");
    }

    public void visibleArt1515(){
        help.Verify_Text(ElementArt1515First,"1515");
    }

// --------------------  Полная проверка страницы Заказы Проверка работы фильтров-----------------------

    @FindBy (xpath = "(//div[@class='ss__select'])[1]")
    WebElement PeriodFiltr;//Выпадающее меню Показать за период:

    @FindBy (xpath = "//li[@class='ss__item'][contains(text(),'Полгода')]")
    WebElement PeriodOne;//Выбор периода Полгода

    @FindBy (xpath = "//li[@class='ss__item'][contains(text(),'Квартал')]")
    WebElement PeriodSecond;//Выбор периода Квартал

    @FindBy (xpath = "//li[@class='ss__item'][contains(text(),'Месяц')]")
    WebElement PeriodThird;//Выбор периода Месяц

    @FindBy (xpath = "//li[@class='ss__item'][contains(text(),'Все')]")
    WebElement PeriodAll;//Выбор периода Все

    @FindBy(xpath = "//div[@class='list-order']")
    WebElement TableResultFiltr;//Результат отображения по периоду и Статусу заказа

    //--

    @FindBy (xpath = "(//div[@class='ss__select'])[2]")
    WebElement StatusFiltr;//Выпадающее меню Статус заказа:

    @FindBy (xpath = "//li[@class='ss__item'][contains(text(),'Черновик заказа')]")
    WebElement StatusdOne;//Выбор Статус заказа: Черновик заказа

    @FindBy(xpath = "//li[@class='ss__item'][contains(text(),'Выполненный заказ (с результатами)')]")
    WebElement StatusSecond;//Выбор Статус заказа: Выполненный заказ (с результатами)

    @FindBy(xpath = "//li[@class='ss__item'][contains(text(),'Сформированный заказ')]")
    WebElement StatusThird;//Выбор Статус заказа: Сформированный заказ

    @FindBy(xpath = "//li[@class='ss__item'][contains(text(),'Результаты без заказа')]")
    WebElement StatusFourth;//Выбор Статус заказа: Результаты без заказа

    @FindBy(xpath = "//li[@class='ss__item'][contains(text(),'Все')]")
    WebElement StatusAll;//Выбор Статус заказа: Все


    public void PeriodOne(){
        help.Click_Method(PeriodFiltr);
        help.Click_Method(PeriodOne);
        help.Check_Visible_Element(TableResultFiltr);
    }

    public void PeriodSecond(){
        help.Click_Method(PeriodFiltr);
        help.Click_Method(PeriodSecond);
        help.Check_Visible_Element(TableResultFiltr);
    }

    public void PeriodThird(){
        help.Click_Method(PeriodFiltr);
        help.Click_Method(PeriodThird);
        help.Check_Visible_Element(TableResultFiltr);
    }

    public void PeriodAll(){
        help.Click_Method(PeriodFiltr);
        help.Click_Method(PeriodAll);
        help.Check_Visible_Element(TableResultFiltr);
    }

    public void StatusdOne(){
        help.Click_Method(StatusFiltr);
        help.Click_Method(StatusdOne);
        help.Check_Visible_Element(TableResultFiltr);
    }

    public void StatusSecond(){
        help.Click_Method(StatusFiltr);
        help.Click_Method(StatusSecond);
        help.Check_Visible_Element(TableResultFiltr);
    }

    public void StatusThird(){
        help.Click_Method(StatusFiltr);
        help.Click_Method(StatusThird);
        help.Check_Visible_Element(TableResultFiltr);
    }

    public void StatusFourth(){
        help.Click_Method(StatusFiltr);
        help.Click_Method(StatusFourth);
        help.Check_Visible_Element(TableResultFiltr);
    }

    public void StatusAll(){
        help.Click_Method(StatusFiltr);
        help.Click_Method(StatusAll);
        help.Check_Visible_Element(TableResultFiltr);
    }










//
//    // Процедура добавления новой медицинской карты пациента
//    private By ChooseMedCart = By.xpath("//*[@class='select-drop__toggle']");// Кнопка 'Выбрать медкарту пациента'
//    private By AddNewMedCartPacient = By.xpath("//*[@class='select-drop__action select-drop__action--add popupBtn addMedcard']");// Кнопка 'Добавить МедКарту пациента'
//    private By ClosePopUpNewPacient = By.xpath("//*[@class='mfp-close']");// Кнопка закрыть pop-up добавления пациента
//    private By ChooseMalePacient = By.xpath("//label[@for='patientMale']//span[@class='radio__item']");// Пациент Мужского пола
//    private By ChooseFemalePacient = By.xpath("//label[@for='patientFemale']//span[@class='radio__item']");// Пациент Женского пола
//    private By AddSurnameField = By.xpath("//*[@id='surname']");// Поле ввода 'Фамилия'
//    private By AddNameField = By.xpath("//*[@id='name']");// Поле ввода 'Имя'
//    private By AddSecondnameField = By.xpath("//*[@id='secondname']");// Поле ввода 'Отчество'
//    private By AddBirthdayField = By.xpath("//*[@id='birthday']");// Поле ввода 'День рождения'
//    private By AddPhoneField = By.xpath("//*[@id='phone']");// Поле ввода 'Телефон'
//    private By NewPacientEmailTField = By.xpath("//*[@class='form__field form__field--w33']//input[@id='email']");// Поле ввода 'Email'
//    private By NewPacientSaveButton = By.xpath("//button[contains(text(),'Сохранить')]");// Кнопка 'Сохранить'
//
//    // Локаторы для проверки создания предзаказа для неавторизованного пациента
//    private By PersonalData = By.xpath("//div[@class='accordion'][2]");// Блок Личные данные при оформлении предзаказа
//    private By ButtonEnter = By.xpath("//div[@class='accordion'][2]//button");// Кнопка Войти в блоке Личные данные
//   /* private By LoginAuthorization = By.xpath("//*[@id='login']");// Поле ввода Логина
//    private By PasswordAuthorization = By.xpath("//*[@id='password']");// Поле ввода Пароля*/
//
//    // 1. Процедура оформления заказа из ЛК (Если новый ЛК)
//    private By NewOrderButton = By.xpath("//button[@class='btn-icon btn-icon--fill']");// Кнопка 'Новый заказ' (Если других заказов нет)
//    private By AddFirstAnalysis = By.xpath(" //div[@data-product-id='5100']");// Добавить Анализ 911
//    private By HematologicalStudies = By.xpath("//*[@class='side-bar-second__link side-bar__link--third'][contains(text(),'Гематологические исследования')]");// Развернуть раздел Гематологические исследования
//    private By AddSecondClinicalBloodTest = By.xpath("//div[@data-product-id='3786']");// Добавить Анализ 119
//    private By AddThirdClinicalBloodTest = By.xpath("//div[@data-product-id='3739']");// Добавить Анализ 139
//    private By AddFourthClinicalBloodTest = By.xpath("//div[@data-product-id='3738']");// Добавить Анализ 5
//    private By GoToBasketButton = By.xpath("//*[@class='icon icon-icon-cart']");// Открыть Корзину
//    private By BasketText = By.xpath("//h1[contains(text(),'Корзина')]");// Текст 'Корзина'
//    private By OrderedAnalyzesInBasketBlock = By.xpath("//div[@class='cart-page__block']");// Проверка блока 'Заказанные анализы' в корзине
//    private By TotalText = By.xpath("//*[@class='cart-page__calculate-item-title']");// Текст 'Итого'
//    private By SumResultText = By.xpath("//*[@id='cartSumResult']");// Текст '1 444 руб.'
//    private By CheckoutOrderButton = By.xpath("//*[@class='btn-icon btn-icon--fill']");// 'Кнопка 'Оформить заказ'
//    private By ChoosePacientOrderPage = By.xpath("//label[@for='patientName1']//span[@class='radio__item']");// Выбрать киента Петров Петр Петрович
//    private By CheckoutOrderText = By.xpath("//h1[contains(text(),'Оформление заказа')]");// Текст 'Оформление заказа'
//    private By OrderListText = By.xpath("//*[contains(text(),'Состав заказа')]");// Текст 'Состав заказа'
//    private By OrderedAnalyzesBlock = By.xpath("//div[@class='accordion__content cart-page']");// Проверка блока 'Заказанные анализы' на этапе оформления
//    private By PersonalDataText = By.xpath("//*[contains(text(),'Личные данные')]");// Текст 'Личные данные'
//    private By AddNewMedCartPacientBlock = By.xpath("//div[@class='service-home-column-main service-home-column-main--column service-home__rate']");// Блок Добавленный пациент
//    private By ChoosePacientMedCart = By.xpath("//a[@class='select_medcard select-drop__item']/p[contains(text(),'Петров Петр Петрович')]");// Выбрать пациента 'Петров Петр Петрович'
//    private By PaymentText = By.xpath("//*[contains(text(),'Оплата')]");// Текст 'Оплата'
//    private By PaymentRadioButton = By.xpath("//*[@for='payMetod1']//span[@class='radio__item']");// Радиобатон где оплачивать
//    private By InTheMedicalOfficeText = By.xpath("//*[contains(text(),'В медицинском офисе')]");// Текст 'В медицинском офисе'
//    private By CheckBoxPersonalData = By.xpath("//*[@for='agree']//span[@class='checkbox__item']");// Чекбокс Я даю свое согласие на обработку персональных данных
//    private By CheckBoxPersonalDataButton = By.xpath("//*[contains(text(),'на обработку персональных данных')]");// Ссылка 'Я даю свое согласие на обработку персональных данных'
//
//    //ШАПКА Блока советы
//    private By ChangeOrderCouncil = By.xpath("//div[@class='cart-order__info-text']");// Блок Советы, под согласием на обработку персональных данных
//
//    private By AllTotalText = By.xpath("//*[@class='cart-page__calculate-item-title']");// Текст 'Итого'
//    private By AllSumResultText = By.xpath("//*[@id='cartSumResult']");// Текст '1 524 руб'
//    private By ConfirmOrder = By.xpath("//a[@class='btn-icon btn-icon--fill js-button-submit']");// Кнопка 'подтвердить заказ'
//    private By ThankText = By.xpath("//h1[contains(text(),'Спасибо!')]");// Текст 'Спасибо'
//    private By ThankText2 = By.xpath("//p[@class='result-item__text']");// Текст 'Благодарим Вас за доверие, оказанное нашей компании.'
//    private By DownloadOrderIcon = By.xpath("//*[contains(@class,'icon icon-icon-download')]");// Иконка 'Скачать заказ'
//    private By DownloadOrder = By.xpath("//*[contains(text(),'Скачать заказ')]");// Кнопка 'Скачать заказ'
//    private By ReturnInLK = By.xpath("//button[@class='login__btn']");// Кликнуть по учтеной записи для Возврата в ЛК
//
//    // Описание блока уже созданных заказов
//
//    // Описание выбранной медицинской карты
//    private By PacientSurnameText = By.xpath("//*[@class='lk-info-bar__name']");// Фамилия выбранного пациента
//    private By PacientNameText = By.xpath("//*[@class='lk-info-bar__surname']");// Имя выбранного пациента
//    private By PacientSecondnameText = By.xpath("//*[@class='lk-info-bar__secondname']");// Отчество выбранного пациента
//    private By PacientBirthdayText = By.xpath("//div[@class='lk-info-bar__text']");// Текст дата рождения
//    private By LoyaltyIcon = By.xpath("//*[@class='lk-info-bar__icon']");// Иконка программы лояльности
//    private By ConnectToLoyalty = By.xpath("//*[@class='lk-info-bar__title']");// Текст 'Вы не подключены к программе лояльности'
//    private By LearnMoreToLoyaltyProgrammText = By.xpath("//p[@class='lk-info-bar__text']");// Текст 'Узнать подробности о программе и способе вступления'
//    private By LearnMoreToLoyaltyProgrammLink = By.xpath("//*[@class='loyality_link']");// Ссылка 'Узнать подробности' использования лояльности
//
//    private By SearchInzPacientField = By.xpath("//input[@class='search__input']");// Поле поиска ИНЗ (созданного заказа)
//    private By SearchButton = By.xpath("//button[@class='search__btn']");// Кнопка поиска ИНЗ
//    private By OpenFilterForPeriod = By.xpath("//div[@class='lk-toolbar__select']//div[@class='select1 select']//div[@class='ss__select']");// Открыть фильтр 'Показать за период'
//    private By OpenFilterStatus = By.xpath("//div[@class='lk-toolbar__select']//div[@class='select2 select']//div[@class='ss__select']");// Открыть фильтр 'Статус заказа'
//    private By ChooseFilterMonthPeriod = By.xpath("//li[@class='ss__item'][contains(text(),'Месяц')]");// Показать заказы за 'Месяц'
//    private By ChooseFilterStatus = By.xpath("//li[@class='ss__item'][contains(text(),'Черновик')]");// Показать заказы со статусов 'Черновик'
//    private By ClearFilter = By.xpath("//a[@class='back-link']//span[contains(text(),'Сбросить фильтр')]");// Отчистить фильтр
//    private By FirstOrder = By.xpath("//div[@class='list-order__item list-order__item--on-hover to-detail_main'][1]");// Первый заказ
//    private By CancelOrder = By.xpath("//div[@class='list-order__item list-order__item--on-hover to-detail_main'][1]//button[@class='list-order__action cansler']");// Отменить первый заказ
//    private By CloseButton = By.xpath("//button[@class='mfp-close']");// Закрыть Pop-up отмены заказа
//    private By AddNewOrderLK = By.xpath("//div[@class='lk-order-main']//button[@class='btn ripple']");// Кнопка 'Новый заказ'
//    private By SubstrateInHelpToTheBest = By.xpath("//*[@class='info-block lk-order-banner__box']");// Подложка в блоке 'Помогите нам стать лучше'
//    private By IconHelpToTheBest = By.xpath("//div[@class='info-block lk-order-banner__box']//div//img[@class='lk-order-banner__main-icon']");// Иконка в блоке 'Помогите нам стать лучше'
//    private By GoToInHelpToTheBest = By.xpath("//a[@class='btn-icon btn-icon--fill']");// Кнопка 'Перейти' в блоке 'Помогите нам стать лучше'
//
//    // Добавление анализа в корзину
//    private By ButtonKartAnalisi = By.xpath("//span[contains(text(),'В корзину')]"); //Кнопка в корзину до нажатия
//    private By ButtonClickKartAnalisi = By.xpath("//span[contains(text(),'Добавлено')]"); //Кнопка в корзину после нажатия
//    private By PriceKartAnalisi = By.xpath("//span[@class='info-block__price info-block__price--total']"); //Стоимость анализа
//    private By ZagolovorKartAnalisi = By.xpath("//div[contains(@class,'title-block--narrow')]//h1"); //Кнопка в корзину после нажатия
//    private By PriceAnalisiKorzina = By.xpath("//span[contains(@class,'result-item__price--sum')]"); //Стоимость анализа в корзине
//    private By NamrAnalisiKorzina = By.xpath("//div[@class='cart-page__table']/div[3]/div[1]"); //Название анализа
//    private By SpisokAnalisi = By.xpath("//div[@class='pagination-items']//div[@class='result-item__title']//a"); //список всех иследований
//
//    // Процедура Добавления результата
//    private By AddResultButton = By.xpath("//*[@class='lk-order-main']//button[@class='btn btn--empty addResults']");// Кнопка 'Добавить результат'
//    private By NumberINZField = By.xpath("//*[@class='input input--inz']");// Поле ввода ИНЗ из чека
//    private By AddResultBirthdayField = By.xpath("//*[@class='input datePicker']");// Поле ввода Даты рождения
//    private By AddResultSurnameField = By.xpath("//*[@class='form_body']//div[3]//input[1]");// Поле ввода Фамилия
//    private By AddResultButtonInPopUp = By.xpath("//*[@class='btn ripple'][contains(text(),'Добавить')]");// Кнопка 'Добавить'
//
//    private By QuestionsAndAnswersBlock = By.xpath("//section[@class='quest-accord quest-accord--column show-block show-block--active container container--no-border inner']");// Блок 'Вопросы и ответы'
//    private By LogoutButton = By.xpath("//a[@id='header_logout_button']");// Кнопка 'Выйти'
//
//    public PacientLKPage() throws AWTException {
//    }
//
//
//
//// Создание мед карты
//
//
//
//    public void clickAddNewMedCartPacient() { //Кликнуть, Добавить новую мед карту
//
//        help.Click_Method(AddNewMedCartPacient);
//    }
//
//    public void visibleClosePopUpNewPacient() {
//
//        help.Check_Visible_Element(ClosePopUpNewPacient);
//    }
//
//    public void clickChooseMalePacient() { //Кликнуть, Мужской пол
//
//        help.Click_Method(ChooseMalePacient);
//    }
//
//    public void clickChooseFemalePacient() { //Кликнуть, Женский пол
//
//        help.Click_Method(ChooseFemalePacient);
//    }
//
//
//    public void enterAddSurnameField() { // Ввод Фамилии
//
//        find(AddSurnameField).sendKeys("test1");
//    }
//
//    public void enterAddNameField() { // Ввод Имени
//
//        help.Enter_Text(AddNameField, "test2");
//    }
//
//
//    public void enterAddSecondnameField() { // Ввод Отчества
//
//        help.Enter_Text(AddSecondnameField, "test3");
//    }
//
//
//    public void enterAddBirthdayField() { // Ввод Даты рождения
//
//        help.Enter_Text(AddBirthdayField, "01.01.1980");
//    }
//
//
//    public void enterAddPhoneField() { // Ввод телефона
//
//        help.Enter_Text(AddPhoneField, "+7 (999) 888-77-66");
//    }
//
//
//    public void enterNewPacientEmailTField() { // Ввод Даты рождения
//
//        help.Enter_Text(NewPacientEmailTField, "pacient.lk1.invitro@gmail.com");
//    }
//
//    public void clickNewPacientSaveButton() { //Кликнуть, Сохранить
//
//        help.Click_Method(NewPacientSaveButton);
//    }
//
//    // Авторизация
//
//    public void enterLoginField() { // Ввод Имени
//
//        help.Enter_Text(LoginFieldAuthorization, "pacient.lk2.invitro@gmail.com");
//    }
//
//    public void enterPasswordField() { // Ввод пароля
//
//        help.Enter_Text(PasswordFieldAuthorization, "12345");
//    }
//// Методы оформления заказа с новой мед карты
//
//    public void clickNewOrderButton() { //Кликнуть, Новый заказ
//
//        help.Click_Method(NewOrderButton);
//    }
//
//    public void clickAddFirstAnalysis() { //Кликнуть, добавить Анализ 1
//
//        help.Click_Method(AddFirstAnalysis);
//    }
//
//    public void clickAddSecondClinicalBloodTest() { //Кликнуть, добавить Анализ 2
//
//        help.Click_Method(AddSecondClinicalBloodTest);
//    }
//
//    public void clickNHematologicalStudies() { //Кликнуть, развернуть раздел Гематологические исследования
//
//        help.Click_Method(HematologicalStudies);
//    }
//
//    public void clickAddFourthClinicalBloodTest() { //Кликнуть, Добавить анализ 1515
//
//        help.Click_Method(AddFourthClinicalBloodTest);
//    }
//
//    public void clickAddThirdClinicalBloodTest() { //Кликнуть, Добавить анализ 1515
//
//        help.Click_Method(AddThirdClinicalBloodTest);
//    }
//
//    public void clickGoToBasketButton() { //Кликнуть, открыть корзину
//
//        help.Click_Method(GoToBasketButton);
//    }
//
//    public void verifyBasketText() {
//        help.Verify_Text(BasketText, "Корзина");
//    }
//
//    public void checkOrderedAnalyzesInBasketBlock() { //Кликнуть, Добавить пациента
//
//        help.Check_Enabled_Element(OrderedAnalyzesInBasketBlock);
//    }
//
//    public void verifyTotalText() {
//        help.Verify_Text(TotalText, "Итого:");
//    }
//
//    public void verifySumResultText() {
//        help.Check_Enabled_Element(SumResultText);
//    }
//
//
//    public void clickChoosePacientOrderPage() { //Кликнуть, Оформить заказ
//
//        help.Click_Method(ChoosePacientOrderPage);
//    }
//
//    public void VeriFyBlockAnalises()  { //переход в раздел акции
//        help.Click_Method(CheckoutOrderButton);
//        if (element(PersonalData).isVisible()){
//            System.out.println("Произошел переход на страницу Оформление заказа");
//        }
//        else {
//            assert (false ):  "Не было перехода на страницу Оформление заказа";
//        }
//    }
//
//    public void clickCheckoutOrderButton() { //Кликнуть, Оформить заказ
//
//        help.Click_Method(CheckoutOrderButton);
//    }
//
//    public void verifyCheckoutOrderText() {
//        help.Verify_Text(CheckoutOrderText, "Оформление заказа");
//    }
//
//    public void verifyOrderListText() {
//        help.Verify_Text(OrderListText, "Состав заказа");
//    }
//
//    public void checkOrderedAnalyzesBlock() { //Кликнуть, Добавить пациента
//
//        help.Check_Enabled_Element(OrderedAnalyzesBlock);
//    }
//
//    public void verifyPersonalDataText() {
//        help.Verify_Text(PersonalDataText, "Личные данные");
//    }
//
//    public void checkAddNewMedCartPacientBlock() { //Кликнуть, Добавить пациента
//
//        help.Check_Visible_Element(AddNewMedCartPacientBlock);
//    }
//
//    /*
//        public void сlickAddNewMedCartPacientInBasket() { //Кликнуть, Добавить пациента
//            help.Click_Method(AddNewMedCartPacientInBasket);
//        }
//        public void verifyAddNewMedCartPacientText() {
//            help.Verify_Text(AddNewMedCartPacientText, "Данные пациента");
//        }
//        public void verifyAddNewMedCartPolPacientText() {
//            help.Verify_Text(AddNewMedCartPolPacientText, "Пол");
//        }
//        public void сlickAddNewMedCartMalePacient() { //Кликнуть, по радиобаттону Пациент мужского пола
//            help.Click_Method(AddNewMedCartMalePacient);
//        }
//        public void сlickAddNewMedCartFemalePacient() { //Кликнуть, по радиобаттону Пациент женского пола
//            help.Click_Method(AddNewMedCartFemalePacient);
//        }
//        public void verifyAddNewMedCartMalePacientText() {
//            help.Verify_Text(AddNewMedCartMalePacientText, "Мужской");
//        }
//        public void verifyAddNewMedCartFemalePacientText() {
//            help.Verify_Text(AddNewMedCartFemalePacientText, "Женский");
//        }
//        public void verifyAddNewMedCartSurnameText() {
//            help.Verify_Text(AddNewMedCartSurnameText, "Фамилия");
//        }
//        public void enterAddNewMedCartSurnameField() { // Ввод Фамилии пациента
//            help.Enter_Text(AddNewMedCartSurnameField, "test4");
//        }
//        public void verifyAddNewMedCartNameText() {
//            help.Verify_Text(AddNewMedCartNameText, "Имя");
//        }
//        public void enterAddNewMedCartNameField() { // Ввод Имя пациента
//            help.Enter_Text(AddNewMedCartNameField, "test5");
//        }
//        public void verifyAddNewMedCartSecondnameText() {
//            help.Verify_Text(AddNewMedCartSecondnameText, "Отчество");
//        }
//        public void enterAddNewMedCartSecondnameField() { // Ввод Отчество пациента
//            help.Enter_Text(AddNewMedCartSecondnameField, "test6");
//        }
//        public void verifyAddNewMedCartBirthdayText() {
//            help.Verify_Text(AddNewMedCartBirthdayText, "Дата рождения");
//        }
//        public void enterAddNewMedCartBirthdayField() { // Ввод Даты рождения
//            help.Enter_Text(AddNewMedCartBirthdayField, "01.05.1975");
//        }
//        public void verifyAddNewMedCartPhoneText() {
//            help.Verify_Text(AddNewMedCartPhoneText, "Телефон");
//        }
//        public void enterAddNewMedCartPhoneField() { // Ввод Телефона пациента
//            help.Enter_Text(AddNewMedCartPhoneField, "+7 (999) 888-77-66");
//        }
//        public void verifyAddNewMedCartEmailText() {
//            help.Verify_Text(AddNewMedCartEmailText, "E-mail");
//        }
//        public void enterAddNewMedCartEmailField() { // Ввод E-mail пациента
//            help.Enter_Text(AddNewMedCartEmailField, "autotest_invitro@gmail.com");
//        }
//        public void сlickAddNewMedCartSaveButton() { //Кликнуть, по кнопке 'Добавить'
//            help.Click_Method(AddNewMedCartSaveButton);
//        }
//        public void visibleCloseButton() {
//            help.Check_Visible_Element(CloseButton);
//        }
//        public void visibleAddNewMedCartIcon() {
//            help.Check_Visible_Element(AddNewMedCartIcon);
//        }
//        public void verifyAddPacientText() {
//            help.Verify_Text(AddPacientText, "Спасибо! Новый пациент добавлен.");
//        }
//        public void сlickContinueButton() { //Кликнуть, по кнопке 'Продолжить'
//            help.Click_Method(ContinueButton);
//        }
//    */
//    public void verifyPaymentText() {
//        help.Verify_Text(PaymentText, "Оплата");
//    }
//
//    public void visiblePaymentRadioButton() {
//
//        help.Check_Visible_Element(PaymentRadioButton);
//    }
//
//    public void verifyInTheMedicalOfficeText() {
//        help.Verify_Text(InTheMedicalOfficeText, "В медицинском офисе");
//    }
//
//    public void clickCheckBoxPersonalData() { //Кликнуть, по чекбоксу 'Я даю свое согласие на обработку персональных данных'
//
//        help.Click_Method(CheckBoxPersonalData);
//    }
//
//    public void clickCheckBoxPersonalDataButton() { //Кликнуть, ссылке 'Я даю свое согласие на обработку персональных данных'
//
//        help.Click_Method(CheckBoxPersonalDataButton);
//    }
//
//    public void verifyTheBoardBlock() {
//        ArrayList<String> lst = new ArrayList<>();
//        List<WebElementFacade> board = findAll(ChangeOrderCouncil); //Получаем список xpath всей Истории компании
//        for (WebElementFacade we : board) {//запускаем цикл//запускаем цикл
//            lst.add(we.getText());//добавляем текст истории компании в лист
//            System.out.println(we.getText());
//        }
//        for (int i = 0; i < TheBoardValues.size(); i++) {
//            Assertions.assertThat(lst.contains(TheBoardValues.get(i))).as("Текст " + TheBoardValues.get(i) + " отсутствует").isEqualTo(true);
//
//        }
//    }
//
//    public void verifyAllTotalText() {
//        help.Verify_Text(AllTotalText, "Итого:");
//    }
//
//    public void verifyAllSumResultText() {
//        help.Check_Enabled_Element(AllSumResultText);
//    }
//
//    public void clickConfirmOrder() { //Кликнуть, Подтвердить заказ
//
//        help.Click_Method(ConfirmOrder);
//    }
//
//    public void verifyThankText() {
//        help.Verify_Text(ThankText, "Спасибо!");
//    }
//
//    public void verifyThankText2() {
//        help.Verify_Text(ThankText2, "Благодарим Вас за доверие, оказанное нашей компании.");
//    }
//
//    public void visibleDownloadOrderIcon() {
//
//        help.Check_Visible_Element(DownloadOrderIcon);
//    }
//
//    public void clickDownloadOrder() { //Кликнуть, Скачать результат
//
//        help.Click_Method(DownloadOrder);
//    }
//
//    public void verifyOrderCreateText() {
//        final String s = "Заказ № LK000194596 на общую сумму 1 524 руб успешно оформлен";  // Здесь ищем слово.
//        final String w = "Заказ №" + "на общую сумму" + "успешно оформлен"; // Слова для поиска.
//        if (s.matches(".*\\b" + w + "\\b.*")) ;
//
//    }
//
//    public void clickReturnInLK() { //Кликнуть, Скачать результат
//        System.out.println();
//        help.Click_Method(ReturnInLK);
//    }
//
//    //создания предзаказа для неавторизованного пациента
//    public void enterLoginFieldAuthorizations() { //ввод логина
//
//        help.Enter_Text(LoginFieldAuthorization,"pacient.lk5.invitro@yandex.ru");
//    }
//
//    public void enterPasswordFieldAuthorizations() { // ввод пароля
//
//        help.Enter_Text(PasswordFieldAuthorization,"12345");
//    }
//
//
//
//    public void enterLogin() { // Ввод Имени
//
//        help.Enter_Text(LoginFieldAuthorization, "pacient.lk3.invitro@gmail.com");
//    }
//
//    public void enterPassword() { // Ввод пароля
//
//        help.Enter_Text(PasswordFieldAuthorization, "12345");
//    }
//
//    public void verifyPersonalData() { //Проверка наличия блока Личные данные
//        Assertions.assertThat(find(PersonalData).isVisible());
//    }
//
//
//    public void clickButtonEnter() {// Нажатие на кнопку Войти в блоке Личные данные
//        find(ButtonEnter).waitUntilClickable().click();
//    }
//
//
//    ////////////////////создания предзаказа с медкарты пациента у которого уже есть созданные заказы////////////////////
//
//    public void clickChoosePacientMedCart() { //Кликнуть, Выбрать пациента
//
//        help.Click_Method(ChoosePacientMedCart);
//    }
//
//    public void enterSearchInzPacientField() { // Ввод ИНЗ
//
//        help.Enter_Text(SearchInzPacientField, "LK000445213");
//    }
//
//    public void clickSearchButton() { //Кликнуть, кнопку поиска ИНЗ
//
//        help.Click_Method(SearchButton);
//    }
//
//    public void clickOpenFilterForPeriod() {
//
//        help.Click_Method(OpenFilterForPeriod);
//    }
//
//    public void clickChooseFilterMonthPeriod() {
//
//        help.Click_Method(ChooseFilterMonthPeriod);
//    }
//
//    public void clickOpenFilterStatus() {
//
//        help.Click_Method(OpenFilterStatus);
//    }
//
//    public void clickChooseFilterStatus() {
//
//        help.Click_Method(ChooseFilterStatus);
//    }
//
//    public void clickClearFilter() {
//
//        help.Click_Method(ClearFilter);
//    }
//
//    public void clickCloseButton() {
//
//        help.Click_Method(CloseButton);
//    }
//
//    public void clickAddNewOrderLK() {
//
//        help.Click_Method(AddNewOrderLK);
//    }
//
//
//    /////////////////////Проверка выбранной мед карты///////////////////////
//
//
//    public void verifyPacientSurnameText() {
//        help.Verify_Text(PacientSurnameText, "Петров");
//    }
//
//    public void verifyPacientNameText() {
//        help.Verify_Text(PacientNameText, "Петр");
//    }
//
//    public void verifyPacientSecondnameText() {
//        help.Verify_Text(PacientSecondnameText, "Петрович");
//    }
//
//    public void verifyPacientBirthdayText() {
//        help.Verify_Text(PacientBirthdayText, "Дата рождения: 13.12.1988 (30 лет)");
//    }
//
//    public void visibleLoyaltyIcon() {
//
//        help.Check_Visible_Element(LoyaltyIcon);
//    }
//
//    public void verifyConnectToLoyalty() {
//        help.Verify_Text(ConnectToLoyalty, "Вы не являетесь участником программы «ИНВИТРО Здоровый плюс»");
//    }
//
//    public void verifyLearnMoreToLoyaltyProgrammText() {
//        help.Verify_Text(LearnMoreToLoyaltyProgrammText, "Узнать подробности о программе и способе вступления");
//    }
//
//    public void clickLearnMoreToLoyaltyProgrammLink() {
//
//        help.Click_Method(LearnMoreToLoyaltyProgrammLink);
//    }
//
//    public void checkSubstrateInHelpToTheBest() {
//
//        help.Check_Enabled_Element(SubstrateInHelpToTheBest);
//    }
//
//    public void visibleIconHelpToTheBest() {
//
//        help.Check_Visible_Element(IconHelpToTheBest);
//    }
//
//    public void visibleGoToInHelpToTheBest() {
//
//        help.Check_Visible_Element(GoToInHelpToTheBest);
//    }
//
//    public void clickAddResultButton() {
//
//        help.Click_Method(AddResultButton);
//    }
//
//    public void visibleNumberINZField() {
//
//        help.Check_Visible_Element(NumberINZField);
//    }
//
//    public void visibleAddResultBirthdayField() {
//
//        help.Check_Visible_Element(AddResultBirthdayField);
//    }
//
//    public void visibleAddResultSurnameField() {
//
//        help.Check_Visible_Element(AddResultSurnameField);
//    }
//
//    public void visibleAddResultButtonInPopUp() {
//
//        help.Check_Visible_Element(AddResultButtonInPopUp);
//    }
//
//
//    public void visibleQuestionsAndAnswersBlock() {
//
//        help.Check_Visible_Element(QuestionsAndAnswersBlock);
//    }
//
///*    public void ADDRandomAnalize() {
//        List<WebElementFacade> massive = findAll(SpisokAnalisi);
//        int count = massive.size();
//        System.out.println("количество анализов: " + count);
//        int random_number = (int) (Math.random() * count); // Генерация 1-го числа
//        System.out.println("случайное число: " + random_number);
//        System.out.println(massive.get(random_number).getText());
//        massive.get(random_number).click();
//        find(By.xpath("//div[@class='lk-order-main']//button[@class='btn ripple']")).setWindowFocus();
//        find(ButtonKartAnalisi).waitUntilClickable().click();
//        String price = find(PriceKartAnalisi).getText();
//        System.out.println(price);
//        String name = find(ZagolovorKartAnalisi).getText();
//        System.out.println(name);
//        find(GoToBasketButton).waitUntilClickable().click();
//        boolean sravneniePrice = price.equals(find(PriceAnalisiKorzina).getText());
//        System.out.println("Значение сравнения прайса " + sravneniePrice);
//        boolean sravnenieName = name.equals(find(NamrAnalisiKorzina).getText());
//        System.out.println("Значение сравнения названия " + sravneniePrice);
//        if (sravneniePrice == sravnenieName) {
//            System.out.println("Все ок. Стоимость и название в разделе анализы и в корзине совпадают");
//        } else if (!sravneniePrice) {
//            System.out.println("Ошибка. Прайс в корзине не равен прайсу в разделе анализы");
//            Assertions.assertThat(sravneniePrice)
//                    .as("Ошибка. Прайс в корзине " + find(PriceAnalisiKorzina).getText() + " не равен прайсу в разделе анализы " + price).isEqualTo(!sravneniePrice);
//        } else if (!sravnenieName) {
//            System.out.println("Ошибка. Наименование анализы в корзине не равен прайсу в разделе анализы");
//            Assertions.assertThat(sravnenieName)
//                    .as("Ошибка. Наименование анализа в корзине " + find(NamrAnalisiKorzina).getText() + " не равен прайсу в разделе анализы " + name).isEqualTo(!sravnenieName);
//            }
//        }*/
//
}