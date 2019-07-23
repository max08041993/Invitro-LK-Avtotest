package testpackage.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import testpackage.help.Help_Methods;
import java.util.ArrayList;


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

    public void visiblePodskazkaResult(){
        help.Verify_Text(PodskazkaResult,"Найдены результаты 1 анализов.");
    }


    public void visibleRadioEmailDownload(){
        help.Check_Visible_Element(RadioEmailGet);
        help.Check_Visible_Element(RadioDownload);
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

//---------------------------Проверить кнопки Отменить Распечатать в списке-------------------

    @FindBy(xpath = "//h2[contains(text(),'LK000432080')]")
    WebElement LK000432080;//Заказ LK000432080

    @FindBy(xpath = "(//button[@class='list-order__action tablet-hide printer'])[1]")
    WebElement PrintLK000432080;//Кнопка Распечатать

    @FindBy(xpath = "(//button[@class='list-order__action repiter'])[1]")
    WebElement ReplayLK000432080;//Кнгопка Повторить

    @FindBy(xpath = "(//button[@class='list-order__action cansler'])[3]")
    WebElement CancelLK000432080;//Кнопка Отменить


    public void MoveToElementLK000432080(){    //Наведение мыши на LK000432080 и проверка кнопок
        Actions actions = new Actions(getDriver());
        actions.moveToElement(LK000432080).build().perform();
        help.Check_Enabled_Element(PrintLK000432080);
        help.Check_Enabled_Element(ReplayLK000432080);
        help.Check_Enabled_Element(CancelLK000432080);
    }


//------------------Найти заказ LK000432080 и переимовать его в Avtotest---------------------------

    @FindBy(xpath = "(//button[@class='list-order__edit'])[3]")
    WebElement PencilLK000432080;//Карандаш для переименования

    @FindBy(xpath = "//input[@placeholder='LK000432080']")
    WebElement InputLK000432080;//поле переименования заказа

    @FindBy(xpath = "//input[@placeholder='LK000432080']/../button[@class='list-order__send sender_alias']")
    WebElement ButtonPrinyatIzmeneniyaLK000432080;//Кнопка применить

    @FindBy(xpath = "//input[@placeholder='LK000432080']/../button[@class='list-order__cansel']")
    WebElement ButtonCancelIzmeneniyaLK00043208;//Кнопка отмена

    @FindBy(xpath = "//h2[@class='list-order__title'][contains(text(),'Avtotest')]")
    WebElement NameAvtotest;//Переименованый заказ Avtotest

    @FindBy(xpath = "//h2[@class='list-order__title'][contains(text(),'LK000432080')]")
    WebElement NameLK000432080;//Переименованый заказ Avtotest

    public void NameAvtotest(){
        help.Click_Method(PencilLK000432080);//Нажать карандаш
        Actions actions = new Actions(getDriver());
        actions.doubleClick(InputLK000432080).build().perform();//Двойной клик по полю ввода
        help.Enter_Text(InputLK000432080,"Avtotest");//Ввести Avtotest
        help.Check_Enabled_Element(ButtonCancelIzmeneniyaLK00043208);//Проверить видимость кнопки Отмена
        help.Click_Method(ButtonPrinyatIzmeneniyaLK000432080);//Нажать применить
        help.Verify_Text(NameAvtotest,"Avtotest");//Проверить, что название изменилось
    }

    public void NameLK000432080(){
        help.Click_Method(PencilLK000432080);//Нажать карандаш
        Actions actions = new Actions(getDriver());
        actions.doubleClick(InputLK000432080).build().perform();//Двойной клик по полю ввода
        help.Enter_Text(InputLK000432080,"LK000432080");//Ввести LK000432080
        help.Check_Enabled_Element(ButtonCancelIzmeneniyaLK00043208);//Проверить видимость кнопки Отмена
        help.Click_Method(ButtonPrinyatIzmeneniyaLK000432080);//Нажать применить
        help.Verify_Text(NameLK000432080,"LK000432080");//Проверить, что название изменилось
    }


    //-------------------------

    @FindBy(xpath = "(//a[@class='list-order__fill-link to-detail'])[3]")
    WebElement ZakazAvtotest0;//Заказ Avtotest (LK000432080)

    @FindBy(xpath = "//h2[@class='list-order__title list-order__title--inner']")
    WebElement NameZakzPosleIzm;//Имея в теле заказа после переиминование осталось прежним Заказ от 18.06.2019 №LK000432080

    @FindBy(xpath = "//a[@class='back-link']//*[contains(text(),'Назад к списку заказов')]")
    WebElement ButtonNazad;



    //Провалиться в Avtotest
    //Проверить, что название не изменилось и соответствует LK000432080
    //Нажать вернуться к списку

    public void SendAvtotest(){
        help.Click_Method(ZakazAvtotest0);
        help.Verify_Text(NameZakzPosleIzm,"Заказ от 18.06.2019 №LK000432080");
        help.Click_Method(ButtonNazad);
    }


    //-------------------------------Оповещение о переходе на старый ЛК-------------------------------

    @FindBy(xpath = "//div[@class='attention--header--button']")
    WebElement ButtonKolokol;//Колокольчик

    @FindBy(xpath = "//div[@class='attention--header--showmore']")
    WebElement ButtonPokazVse;//показать все

    @FindBy(xpath = "//a[contains(text(),'ссылке')]")
    WebElement LinkOldLK;//ссылке на старый ЛК

    @FindBy(xpath = "//div[@class='girl']")
    WebElement GirlImage;//отображение старого ЛК

    public void OldLK(){
        help.Click_Method(ButtonKolokol);//Нажать Колокольчик
        help.Click_Method(ButtonPokazVse);    //Нажать показать все
        help.Click_Method(LinkOldLK);//Перейти по ссылке на старый ЛК
        help.Check_Enabled_Element(GirlImage);//Проверить отображение старого ЛК
    }

}