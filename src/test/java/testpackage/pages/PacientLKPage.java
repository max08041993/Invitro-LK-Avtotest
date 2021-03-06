package testpackage.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.List;

public class PacientLKPage extends PageObject {

    //19.06.2019

    //Удаление новой медкарты

    @FindBy(xpath = "//button[@data-item-id='11']")
    WebElementFacade DeleteNewMedkart;

    public void enterAddSurnameField() {
        DeleteNewMedkart.waitUntilClickable().click();
    }


    //-------------------Программа Инвитро здоровый плюс----------------------

    @FindBy(xpath = "//a[contains(text(),'ПРОГРАММА «ИНВИТРО ЗДОРОВЫЙ ПЛЮС»')]")
    WebElementFacade ProgrammaInvitroZdorPlus;//Ссылка на ПРОГРАММА «ИНВИТРО ЗДОРОВЫЙ ПЛЮС»

    //Проверка добавления новой Медкарты

    @FindBy(xpath="//button[@class='btn-icon btn-icon--fill popupBtn add-medcard']")// Кнопка 'Добавить МедКарту пациента'
            WebElementFacade AddMedkart;

    @FindBy(xpath="//label[@for='patientMale']//span[@class='radio__item']")// Пациент Мужского пола
            WebElementFacade ButtonMen;

    @FindBy(xpath="//label[@for='patientFemale']//span[@class='radio__item']")// Пациент Женского пола
            WebElementFacade ButtonGerl;

    @FindBy(xpath="//*[@id='surname']")// Поле ввода 'Фамилия'
            WebElementFacade InputFamily;

    @FindBy(xpath="//*[@id='name']")// Поле ввода 'Имя'
            WebElementFacade InputName;

    @FindBy(xpath="//*[@id='secondname']")// Поле ввода 'Отчество'
            WebElementFacade InputSurename;

    @FindBy(xpath="//*[@id='birthday']")// Поле ввода 'День рождения'
            WebElementFacade InputData;

    @FindBy(xpath="//*[@id='phone']")// Поле ввода 'Телефон'
            WebElementFacade InputTel;

    @FindBy(xpath="//input[@id='emailSend']")// Поле ввода 'Email'
            WebElementFacade InputEmail;

    @FindBy(xpath="//input[@id='email']")// Поле ввода 'Email'
            WebElementFacade Input2Email;

    @FindBy(xpath="//button[contains(text(),'Сохранить')]")// Кнопка 'Сохранить'
            WebElementFacade ButtonSave;

    @FindBy(xpath = "//button[@class='btn btn--empty js-close-edit-card']")//Кнопка Перейти в раздел
            WebElementFacade ButtonGoToInRazdel;

    @FindBy(xpath = "//span[contains(text(),'Тест08')]/..")//Добавленая медкарта
            WebElementFacade MewMedkarta;

    @FindBy(xpath = "(//label[@class='medcard-update disabled-checkbox'])[1]")
    WebElementFacade ChecBoxDisabled;//Не активный чекбокс Автоматическое добавление всех результатов

    @FindBy (xpath = "//a[@id='header_logout_button']")
    WebElementFacade exitLk;

    @FindBy(xpath = "//label[@for='add_orders_auto_8cf08a3b-c901-e911-80d5-00155d52d70b']")
    WebElementFacade ChecBoxActived;//Активный чекбокс Автоматическое добавление всех результатов

    @FindBy(xpath = "//button[@id='agreeing_btn']")
    WebElementFacade ButtonPodtverditEmail;//Кнопка подтверждения емаила в Автоматическое добавление всех результатов

    @FindBy(xpath = "//h2[contains(text(),'Проверьте почту')]")
    WebElementFacade MessageGoodSendEmail;//    На адрес  отправлено письмо со ссылкой для подтверждения вашего email.

    @FindBy(xpath = "//button[@id='continue']")
    WebElementFacade ButonContinete;//Кнопка продолжить

    @FindBy(xpath = "//a[contains(text(),'МЕДКАРТЫ')]")
    WebElementFacade MedKarty;//Ссылка на медкарты

    @FindBy(xpath = "//h1[contains(text(),'Медкарты')]")
    WebElementFacade ZagolovokMeskarty;//Заголовок Медкарты

    @FindBy(xpath = "//div[@class='list_medcarsd']")
    WebElementFacade MedkartList;//Таблица Медкарт

    //------------------------- Проверка Настройки-------------------------

    @FindBy(xpath = "//input[@id='name']")//Поле ввода Имени
            WebElementFacade InputScetName;

    @FindBy(xpath = "//input[@id='email']")//Поле ввода Email
            WebElementFacade InputScetEmail;

    @FindBy(xpath = "//input[@id='phone3']")//Поле ввода телефона
            WebElementFacade InputScetTel;

    @FindBy(xpath = "//button[@class='btn-icon btn-icon--fill']")//Кнопка Сохранить
            WebElementFacade ButtonScetSave;

//безопасность

    @FindBy(xpath = "//input[@name='password']")//Поле ввода старого пароля QazWsxEdc
            WebElementFacade OldPassword;

    @FindBy(xpath = "//input[@name='new_password']")//Поле ввода нового пароля QazWsxEdc
            WebElementFacade NewPassword;

    @FindBy(xpath = "//input[@name='new_password_confirm']")////Поле ввода повторения нового пароля QazWsxEdc
            WebElementFacade New2Password;

    @FindBy(xpath = "//button[text()='Сохранить']")//Кнопка сохранить в Безопасности
            WebElementFacade ButtonSecurSave;

    @FindBy(xpath = "//h3[text()='Пароль успешно изменён']")//Сообщение об успешном смени пароля
            WebElementFacade PasswordPas;

    @FindBy(xpath = "//button[@title='Close (Esc)']")//Кнопа закрытия сообщения
            WebElementFacade ButtonClose;

    @FindBy(xpath = "//div[@class='lk-double-autorized lk-setting__box']")//Блок Защита с помощью мобильного телефона
            WebElementFacade BlockSecur;

    @FindBy(xpath = "(//span[@class='form__pass-visible'])[5]")//Кнопка просмотра нового пароля
            WebElementFacade GlazPassword;

    //История посещений

    @FindBy(xpath = "//div[@class='lk-setting__history analysis-table analysis-table--no-padding-left a']")//Таблица Истории посещений
            WebElementFacade TableHistory;


//    @FindBy(xpath = "//a[@class='btn btn--narrow btn--empty city__change-btn']")//Выбрать другой
//            WebElementFacade ChengeOtherCity;

//    @FindBy (xpath = "//button[@data-id='cookie']")
//    WebElementFacade Prinyat;

//    @FindBy (xpath = "//button[@class='btn btn--narrow city__confirm-btn']") //Да верно
//            WebElementFacade ChangeYesOk;

//    @FindBy (xpath = "//div[@class='change-city-wrapper__left']//a[@class='change-city-block__item bold'][contains(text(),'Москва')]") //надпись крупные города Москва
//            WebElementFacade BigCityMoscow;

//    @FindBy(xpath="//span[@class='city__name city__btn city__name--label']")
//    WebElementFacade moskow;

    @FindBy (xpath = "//div[@class='invitro_header-bottom_right']/button[@class='invitro_header-get_result popupBtn']")
    WebElementFacade Resultat;

    @FindBy (xpath = "//div[@id='popupResult']")// Поле ввода
    WebElementFacade PopapResult;

    @FindBy (xpath = "//input[@id='inz']")// Поле ввода
    WebElementFacade InputINZ;

    @FindBy (xpath = "//input[@id='born']")// Поле ввода
    WebElementFacade Born;

    @FindBy (xpath = "//input[@id='surname']")// Поле ввода
    WebElementFacade Surename;

    @FindBy (xpath = "//button[@id='getAnalisisBtn']")
    WebElementFacade FindSubmit;

    @FindBy (xpath = "//span[@class='radio__text'][contains(text(),'Скачать файл')]")
    WebElementFacade RadioDownload;

    @FindBy(xpath = "//span[@class='radio__text'][contains(text(),'Отправить по e-mail')]")
    WebElementFacade RadioEmailGet;

    @FindBy(xpath = "//p[@id='resultQuant']")
    WebElementFacade PodskazkaResult;

    @FindBy (xpath = "//div[@id='AnalysisResult']/span[@class='btn__side-link js-button-reset']")
    WebElementFacade PovtorPoisk;

    @FindBy(xpath = "//button[@id='downloadAnalysisBtn']")
    WebElementFacade ButtonFind;

    @FindBy (xpath = "//button[@title='Close (Esc)']")
    WebElementFacade Close;

    @FindBy (xpath = "//button[@id='getEmailAnalysisBtn']")
    WebElementFacade ButtonSend;

    @FindBy (xpath = "(//div[@class='attention__content'])[1]")
    WebElementFacade FallPodskazka;

    @FindBy (xpath = "//button[@id='header_button_login']")
    WebElementFacade ButtonLogin;

    @FindBy (xpath = "//a[@class='autorisation__link-forgot link forgetPass autorisation__link-passforgot'][contains(text(),'Забыли')]")//Забыли пароль
    WebElementFacade ZabilPassword;

    @FindBy(xpath = "//input[@id='repareLogin']")
    WebElementFacade ButtonVostanovleniyaPasword;

    @FindBy(xpath = "//div[@class='fields']")
    WebElementFacade MessagePasword;

    @FindBy(xpath = "//input[@name='Forgot']")
    WebElementFacade ButtonVostanovPasword;

    //-------------------------------Проверка Динамики-------------

    @FindBy(xpath = "//h1")//Заголовок Динамика результатов
            WebElementFacade ZagolovokDinam;

    @FindBy(xpath = "//input[@id='dynamic-from']")//Поле ввода периода С 2018/10/01
            WebElementFacade InputOnePeriod;

    @FindBy(xpath = "//input[@id='dynamic-to']")//Поле ввода периода ДО 2019/07/16
            WebElementFacade InputToPeriod;

    @FindBy(xpath = "//p[@class='CaptionCont SelectBox search']")//Попап выбора исследования
            WebElementFacade ViborIssledov;

    @FindBy(xpath = "//button[@class='select-all']")//Чекбокс Выбрать Все
            WebElementFacade ViborIssledovAll;

    @FindBy(xpath = "//a[@class='list-order__action']")//Скачать
            WebElementFacade SaveDinam;

    @FindBy(xpath = "//a[@class='list-order__action popupBtn']")//Отправить на email
            WebElementFacade SendDinamEmail;

    @FindBy(xpath = "//input[@id='form_email_70']")//Поле ввода Email
            WebElementFacade InputEmailDinam;

    @FindBy(xpath = "//button[@class='btn ripple js-button-submit']")//Кнопка Отправить на Email
            WebElementFacade ButtonSendDinam;

    @FindBy(xpath = "//button[@class='btn btn-popup-close']")//Кнопка продолжиьть после отправки Емаил
            WebElementFacade ButtonProdolDinam;

    @FindBy(xpath = "//div[@id='popupThanks']/div")// Текст Спасибо! Письмо отправлено.
            WebElementFacade MessagePosEmail;

    @FindBy(xpath = "(//td[@class='fixed-side']/span[contains(text(),'Эритроциты')]/following::span[1])[1]")//Элемент Общий анализ крови в таблице динамики
            WebElementFacade TablElementObsh;   /////------------------При клике Можно применить для перехода к диаграме Общего белка

    @FindBy(xpath = "//canvas[@class='flot-overlay']")//Проверить что Строится график при переходе на конкретное исследование
            WebElementFacade GrafikObshBel;

    @FindBy(xpath = "//div[@id='detail-table']")//Таблица Деталей Общего белка
            WebElementFacade TableDetalObshZak;

    @FindBy(xpath = "//button[@class='list-order__edit']")
    WebElementFacade PencilLK000432080;//Карандаш для переименования

    @FindBy(xpath = "//input[@placeholder='LK001057389']")
    WebElementFacade InputLK000432080;//поле переименования заказа

    @FindBy(xpath = "//input[@placeholder='LK001057389']/../button[@class='list-order__send sender_alias']")
    WebElementFacade ButtonPrinyatIzmeneniyaLK000432080;//Кнопка применить

    @FindBy(xpath = "//input[@placeholder='LK001057389']/../button[@class='list-order__cansel']")
    WebElementFacade ButtonCancelIzmeneniyaLK00043208;//Кнопка отмена

    @FindBy(xpath = "//h2[@class='list-order__title'][contains(text(),'Avtotest')]")
    WebElementFacade NameAvtotest;//Переименованый заказ Avtotest

    @FindBy(xpath = "//h2[@class='list-order__title'][contains(text(),'LK001057389')]")
    WebElementFacade NameLK000432080;//Переименованый заказ Avtotest

    // Локаторы ЛК
    @FindBy (xpath = "//input[@id='login']")// Поле ввода Логина
            WebElementFacade LoginFieldAuthorization;

    @FindBy (xpath = "//input[@id='password']")// Поле ввода Пароля
            WebElementFacade PasswordFieldAuthorization;

    @FindBy(xpath = "//input[@type='submit'][@name='Login']")
    WebElementFacade ButtonInput;

    @FindBy(xpath = "//div[@class='header-title']")
    WebElementFacade TextLK;

    @FindBy(xpath = "//a[@class='header-nav__link header-nav__link--active']")
    WebElementFacade ZakaziAktiv;

    @FindBy(xpath = "//button[@class='select-drop__toggle']")
    WebElementFacade ViborMedKart;

    @FindBy(xpath = "//p[@class='select-drop__title'][contains(text(),'Тестовый Бонус7')]")
    WebElementFacade TestovyBonus7;

    @FindBy(xpath = "//p[@class='select-drop__title'][contains(text(),'Иванов Иван Иванович')]")
    WebElementFacade IvanovIvanIvanovoch;

    @FindBy(xpath = "(//div[@class='list-order']/div[1])[1]")
    WebElementFacade INZ904160861;

    @FindBy(xpath = "//a[@class='list-order__action ddownload']")
    WebElementFacade DownloadLK;

    @FindBy(xpath = "//a[@class='list-order__action popupBtn sender']")
    WebElementFacade FindOnEmailLK;

    @FindBy(xpath = "//input[@id='email']")
    WebElementFacade InputEmailLK;

    @FindBy(xpath = "//button[@class='btn ripple'][contains(text(),'Отправить')]")
    WebElementFacade SendOtpravitLK;

    @FindBy(xpath = "//div[@class='list-order__item list-order__item--on-result showDetailInzInfo showDetailInzInfoClicker doneOrder']//h2")
    WebElementFacade OpenZakaz;

    @FindBy(xpath = "//div[@class='analysis-table analysis-table--no-padding-left analysis-table--v-align-top']")
    WebElementFacade Table1Result;

    @FindBy(xpath = "(//span[@class='attention__acc show_error'])[1]")
    WebElementFacade ErrorLogPass;

    @FindBy(xpath = "//input[@class='search__input']")
    WebElementFacade InputINZAndNameTest;//Поле ввода ИНЗ и Артиклу

    @FindBy(xpath = "//button[@class='search__btn']")
    WebElementFacade Search;//кнопка поиска по ИНЗ и Артиклу

    @FindBy(xpath = "//h2[@class='list-order__title']")
    WebElementFacade ZakazOt21Fev;//Заголовок заказа по ИНЗ 904160861 "Заказ от 21 февраля 2019"

    @FindBy(xpath = "//span[contains(text(),'Сбросить фильтр')]")
    WebElementFacade ButtonResetFilter;//Кнопка Сбросить фильтр

    @FindBy(xpath = "(//div[@class='tip tip--text'][contains(text(),'1515')])[1]")
    WebElementFacade ElementArt1515First;

    @FindBy (xpath = "(//div[@class='ss__select'])[1]")
    WebElementFacade PeriodFiltr;//Выпадающее меню Показать за период:

    @FindBy (xpath = "//li[@class='ss__item'][contains(text(),'Полгода')]")
    WebElementFacade PeriodOne;//Выбор периода Полгода

    @FindBy (xpath = "//li[@class='ss__item'][contains(text(),'Квартал')]")
    WebElementFacade PeriodSecond;//Выбор периода Квартал

    @FindBy (xpath = "//li[@class='ss__item'][contains(text(),'Месяц')]")
    WebElementFacade PeriodThird;//Выбор периода Месяц

    @FindBy (xpath = "//li[@class='ss__item'][contains(text(),'Все')]")
    WebElementFacade PeriodAll;//Выбор периода Все

    @FindBy(xpath = "//div[@class='list-order']")
    WebElementFacade TableResultFiltr;//Результат отображения по периоду и Статусу заказа

    //--

    @FindBy (xpath = "(//div[@class='ss__select'])[2]")
    WebElementFacade StatusFiltr;//Выпадающее меню Статус заказа:

    @FindBy(xpath = "//li[@class='ss__item'][contains(text(),'Выполненный заказ (с результатами)')]")
    WebElementFacade StatusSecond;//Выбор Статус заказа: Выполненный заказ (с результатами)

    @FindBy(xpath = "//li[@class='ss__item'][contains(text(),'Сформированный заказ')]")
    WebElementFacade StatusThird;//Выбор Статус заказа: Сформированный заказ

    @FindBy(xpath = "//li[@class='ss__item'][contains(text(),'Результаты без заказа')]")
    WebElementFacade StatusFourth;//Выбор Статус заказа: Результаты без заказа

    @FindBy(xpath = "//li[@class='ss__item'][contains(text(),'Все')]")
    WebElementFacade StatusAll;//Выбор Статус заказа: Все

    @FindBy(xpath = "//h2[@class='list-order__title']")
    WebElementFacade LK000432080;//Заказ LK000432080

    @FindBy(xpath = "//button[@class='list-order__action tablet-hide printer']")
    WebElementFacade PrintLK000432080;//Кнопка Распечатать

    @FindBy(xpath = "//button[@class='list-order__action repiter']")
    WebElementFacade ReplayLK000432080;//Кнгопка Повторить

    @FindBy(xpath = "//button[@class='list-order__action cansler']")
    WebElementFacade CancelLK000432080;//Кнопка Отменить

    @FindBy(xpath = "//div[@class='attention--header--button']")
    WebElementFacade ButtonKolokol;//Колокольчик

    @FindBy(xpath = "//div[@class='attention--header--showmore']")
    WebElementFacade ButtonPokazVse;//показать все

    @FindBy(xpath = "//a[contains(text(),'ссылке')]")
    WebElementFacade LinkOldLK;//ссылке на старый ЛК

    @FindBy(xpath = "//div[@class='girl']")
    WebElementFacade GirlImage;//отображение старого ЛК

    @FindBy(xpath = "//a[@class='list-order__fill-link to-detail']")
    WebElementFacade ZakazAvtotest0;//Заказ Avtotest (LK000432080)

    @FindBy(xpath = "//h2[@class='list-order__title list-order__title--inner']")
    WebElementFacade NameZakzPosleIzm;//Имея в теле заказа после переиминование осталось прежним Заказ от 18.06.2019 №LK000432080

    @FindBy(xpath = "//a[@class='back-link']//*[contains(text(),'Назад к списку заказов')]")
    WebElementFacade ButtonNazad;

    @FindBy(xpath = "//div[@class='preload__overlay']")
    WebElementFacade blockWindow;

    @FindBy(xpath = "//div[@id='dynamicList']")
    WebElementFacade tableDinamIsled;

    @FindBy(xpath = "//div[@id='headerAttention'][@class='attention--header open']")
    WebElementFacade headerAttentionOpen;

    @FindBy(xpath = "//div[@class='box-empty__msg']")
    WebElementFacade loadDan;

    @FindBy(xpath = "//*[text()='Загрузка...']")
    WebElementFacade blockLoad;
//
//    @FindBy(xpath = "(//div[@class='attention--header--list hidden']//div[@class='close-block'])[2]")
//    WebElementFacade messageComand;

    @FindBys({@FindBy(xpath = "//div[@class='lk-setting__nav lk-setting-nav']/a")})
    List<WebElementFacade> listFullNamesBlock;

    @FindBys({@FindBy(xpath = "//div[@class='header-nav']//a")})
    List<WebElementFacade> listFullNameDerictores;

    @FindBys(@FindBy(xpath = "//p[@class='select-drop__title']"))
    List<WebElementFacade> pacientVibor;

    @FindBy(xpath = "//div[contains(@class,'no-program-member')]")
    WebElementFacade youNotPL;//сообщение у пациента без ПЛ

    @FindBy(xpath = "//div[@class='lk-status__rating']")
    WebElementFacade statusBB;

//    @FindBy(xpath = "//div[@class='attention--header--block--desktop']//div[@class='close-block']/*")
//    WebElementFacade closeAttention;

    @FindBy(xpath = "//div[@class='lk-status_inner_discount']")
    WebElementFacade statusDk;

    public void openDirectoriesName(String name) {
        for (WebElementFacade medInfoRow : listFullNameDerictores) {
            if (medInfoRow.getText().replaceAll("[\r\n]", " ").equals(name)) {
                medInfoRow.waitUntilClickable().click();
                return;
            }
        }
        Assert.fail("На странице нет раздела " + name);
    }


    //------------------------------------------------------------------------------------------

    public void listFullNamesBlock(String name) {
        for (WebElementFacade medInfoRow : listFullNamesBlock) {
            if (medInfoRow.getText().replaceAll("[\r\n]", " ").equals(name)) {
                medInfoRow.waitUntilClickable().click();
                return;
            }
        }
        Assert.fail("На странице слева нет блока " + name);
    }

    public void clickAddFourthClinicalBloodTest(){
        InputScetName.waitUntilVisible().isDisplayed();
        InputScetEmail.waitUntilVisible().isDisplayed();
        InputScetTel.waitUntilVisible().isDisplayed();
        ButtonScetSave.waitUntilVisible().isDisplayed();
    }

    public void clickGoToBasketButton(String one, String too){
        BlockSecur.waitUntilVisible().isDisplayed();
        OldPassword.sendKeys(one);
        NewPassword.sendKeys(too);
        GlazPassword.waitUntilClickable().click();
        New2Password.sendKeys(too);
        ButtonSecurSave.waitUntilClickable().click();
        blockLoad.waitUntilNotVisible();
        Assertions.assertThat(PasswordPas.getText()).isEqualTo("Пароль успешно изменён");
        ButtonClose.waitUntilClickable().click();
    }

    public void verifyBasketText(){
        TableHistory.waitUntilVisible().isDisplayed();
    }


//    public void ClickYesMoskow(){
//        if (messageComand.isVisible() && messageComand.isDisplayed()){
//            messageComand.click();
//        }
//        if (moskow.getText().equals("Москва"))
//        {
//            ChangeYesOk.waitUntilClickable().click();
//        }
//        else{
//            ChengeOtherCity.waitUntilClickable().click();
//            BigCityMoscow.waitUntilClickable().click();
//            ChangeYesOk.waitUntilClickable().click();
//        }
//        Prinyat.waitUntilClickable().click();
//        if (closeAttention.isVisible()){
//            closeAttention.click();
//        }
//    }

    public void clickButtonLogin(){
        ButtonLogin.waitUntilClickable().click();
    }

    public void exitLk(){
        exitLk.waitUntilClickable().click();
    }

    public void clickResultat(){
        Resultat.waitUntilClickable().click();
    }

    public void visiblePopapResult(){
        PopapResult.waitUntilVisible().isDisplayed();
    }

    public void inputINZBornSurename(String INZ, String data, String family){
        InputINZ.waitUntilClickable().click();
        InputINZ.sendKeys(INZ);
        Born.click();
        Born.sendKeys(data);
        Surename.click();
        Surename.sendKeys(family);
    }

    public void clickFindSubmit(){
        FindSubmit.click();
        blockWindow.waitUntilNotVisible();
    }

    public void visiblePodskazkaResult(String value){
        waitABit(1000);
        Assertions.assertThat(PodskazkaResult.getText()).isEqualTo(value);
    }


    public void visibleRadioEmailDownload(){
        RadioEmailGet.isDisplayed();
        RadioDownload.isDisplayed();
    }


    public void visiblePovtorPoisk(){
        PovtorPoisk.isDisplayed();
    }

    public void clickButtonFind(){
        ButtonFind.click();
        blockWindow.waitUntilNotVisible();
    }

    public void clickClose(){
        Close.waitUntilClickable().click();
    }

    public void clickRadioEmailGet(){
        RadioEmailGet.waitUntilClickable().click();
    }

    public void inputInputEmail(String adr){
        InputEmail.sendKeys(adr);

    }

    public void clickButtonSend(){
        ButtonSend.waitUntilClickable().click();
        blockWindow.waitUntilNotVisible();
    }

    public void visiblePodskazkaSend(String value){
        waitABit(1500);
        Assertions.assertThat(PodskazkaResult.getText()).isEqualTo(value);
    }

    public void inputFallINZBornSurename(){
        InputINZ.waitUntilClickable().click();
        InputINZ.sendKeys("854672629");
        Born.click();
        Born.sendKeys(" 01011800");
        Surename.click();
        Surename.sendKeys("Ложные Данные");
    }

    public void visibleFallPodskazka(){
        Assertions.assertThat(FallPodskazka.getText()).isEqualTo("Ваши результаты анализов не найдены. Пожалуйста, измените параметры и повторите поиск");
    }

    public void clickZabilPassword(){
        ZabilPassword.waitUntilClickable().click();
    }

    public void inputNewPassword(){
        NewPassword.waitUntilVisible().sendKeys("12345");
    }

    public void clickButtonVostanovleniyaPasword(){
        ButtonVostanovleniyaPasword.click();
    }

    public void visinleMessagePasword(){
        Assertions.assertThat(MessagePasword.getText()).isEqualTo("Пароль успешно восстановлен!");
    }

    public void clickButtonVostanovPasword(){
        ButtonVostanovPasword.waitUntilClickable().click();
    }

//---------------------------------------------------------------------------------------------------------------------------------------------------------------



    // Авторизация


    public boolean sendLogandPass(String login, String password) {
        LoginFieldAuthorization.waitUntilClickable().click();
        LoginFieldAuthorization.type(login);
        LoginFieldAuthorization.waitUntilClickable().click();
        PasswordFieldAuthorization.type(password);
        ButtonInput.waitUntilClickable().click();
        LocalDateTime startTime = LocalDateTime.now();
        while (isDisplayed(blockWindow) && startTime.plusMinutes(3).isAfter(LocalDateTime.now())){
            waitABit(300);
        }
        return !isDisplayed(blockWindow) || !isDisplayed(ButtonInput);
    }

    public void enterLoginFieldAuthorization(String Login) { // Ввод Имени inv.loyal.1@gmail.com
        LoginFieldAuthorization.click();
        LoginFieldAuthorization.sendKeys(Login);
    }

    public void enterPasswordFieldAuthorization(String Password) { // Ввод пароля QazWsxEdc
        PasswordFieldAuthorization.click();
        PasswordFieldAuthorization.sendKeys(Password);
    }

    public void clickButtonInput(){
        ButtonInput.click();
    }

    public void visibleTextLK(){
        TextLK.waitUntilVisible().isDisplayed();
    }

    public void visibleZakaziAktiv(){
        ZakaziAktiv.waitUntilVisible().isDisplayed();
    }

    public void clickChooseMedCart() { //Кликнуть, Выбрать мед карту
        waitABit(300);
        ViborMedKart.isDisplayed();
        ViborMedKart.click();
        waitABit(300);
        TestovyBonus7.isDisplayed();
        TestovyBonus7.click();
        TestovyBonus7.waitUntilNotVisible();
        loadDan.waitUntilNotVisible();
        waitABit(1500);
    }

    public void clickINZ904160861(){
        waitABit(2000);
        INZ904160861.click();
    }

    public void clickDownloadLK(){
       DownloadLK.waitUntilClickable().click();
    }

    public void clickFindOnEmailLK(String AdrEmail){
        FindOnEmailLK.waitUntilClickable().click();
        waitABit(2000);
        InputEmailLK.waitUntilClickable().click();
        InputEmailLK.sendKeys(AdrEmail);//mkozlov@invitro.ru
        SendOtpravitLK.waitUntilClickable().click();
        waitABit(1000);
    }

    public void visibleTableResult(){
        OpenZakaz.waitUntilClickable().click();
        waitABit(2000);
        Table1Result.waitUntilVisible().isDisplayed();
    }

    // Ввод неверного Логина пароля



    public void enterErrorLoginFieldAuthorization(String EmailFall, String PassFall) { // Ввод не корректного Email
        LoginFieldAuthorization.click();
        LoginFieldAuthorization.sendKeys(EmailFall);//inv.loyal.1@gmailcom
        waitABit(1000);
        PasswordFieldAuthorization.click();
        PasswordFieldAuthorization.sendKeys(PassFall);//QazWsxEdc
        waitABit(1000);
        ButtonInput.click();
        waitABit(1000);
        Assertions.assertThat(ErrorLogPass.getText()).isEqualTo("логин не является корректным email или телефоном");
    }

    public void enterErrorTelLoginFieldAuthorization(String TelFall, String PassFall) { // Ввод не корректного Телефона
        LoginFieldAuthorization.click();
        LoginFieldAuthorization.sendKeys(TelFall);//+7987366427785
        waitABit(1000);
        PasswordFieldAuthorization.click();
        PasswordFieldAuthorization.sendKeys(PassFall);//QazWsxEdc
        waitABit(1000);
        ButtonInput.click();
        waitABit(1000);
        Assertions.assertThat(ErrorLogPass.getText()).isEqualTo("логин не является корректным email или телефоном");
    }

    public void enterFallPasswordFieldAuthorization() { // Ввод Неверного пароля
        LoginFieldAuthorization.click();
        LoginFieldAuthorization.sendKeys( "inv.loyal.1@gmail.com");
        PasswordFieldAuthorization.click();
        PasswordFieldAuthorization.sendKeys( "QazWsxEdc34532");
        waitABit(1000);
        ButtonInput.click();
        waitABit(1000);
        Assertions.assertThat(ErrorLogPass.getText()).isEqualTo("неверный логин/пароль пользователя");
    }

    public void enterFallLoginFieldAuthorization() { // Ввод Неверного Имени
        LoginFieldAuthorization.click();
        LoginFieldAuthorization.sendKeys( "inv.loya32546l.1@gmail.com");
        PasswordFieldAuthorization.click();
        PasswordFieldAuthorization.sendKeys( "QazWsxEdc");
        ButtonInput.click();
        waitABit(1000);
        Assertions.assertThat(ErrorLogPass.getText()).isEqualTo("неверный логин/пароль пользователя");
    }


    //--------------------------------------------------------------------------------------------------


    public void enterLoginTelFieldAuthorization() { // Ввод Имени
        LoginFieldAuthorization.click();
        LoginFieldAuthorization.sendKeys( "+79873664277");
    }

    public void enterPasswordTelFieldAuthorization() { // Ввод пароля
        PasswordFieldAuthorization.click();
        PasswordFieldAuthorization.sendKeys( "123456");
    }


// --------------------  Полная проверка страницы Заказы поиск по ИНЗ и Артиклу -----------------------



    public void sendINZ(String Namber){
        InputINZAndNameTest.isDisplayed();
        InputINZAndNameTest.click();
        InputINZAndNameTest.sendKeys(Namber);
        waitABit(1000);
    }

    public void sendSearch(){
        waitABit(1000);
        Search.click();
        waitABit(1000);
    }

    public boolean visibleINZ904160861(){
        ZakazOt21Fev.waitUntilVisible();
        return ZakazOt21Fev.getText().equals("LK001057389");
    }

    public void sendResetFiltr(){
        ButtonResetFilter.click();
    }

    public void sendArt1515(String var){
        InputINZAndNameTest.sendKeys(var);
    }

    public void visibleArt1515(){
        ElementArt1515First.isDisplayed();
    }

// --------------------  Полная проверка страницы Заказы Проверка работы фильтров-----------------------




    public void PeriodOne(){
        PeriodFiltr.click();
        waitABit(1000);
        PeriodOne.waitUntilClickable().click();
        waitABit(1000);
        TableResultFiltr.waitUntilVisible().isDisplayed();
    }

    public void PeriodSecond(){
        PeriodFiltr.click();
        waitABit(1000);
        PeriodSecond.waitUntilClickable().click();
        waitABit(1000);
        TableResultFiltr.waitUntilVisible().isDisplayed();
    }

    public void PeriodThird(){
        PeriodFiltr.click();
        waitABit(1000);
        PeriodThird.waitUntilClickable().click();
        waitABit(1000);
        TableResultFiltr.waitUntilVisible().isDisplayed();
    }

    public void PeriodAll(){
        PeriodFiltr.click();
        waitABit(1000);
        PeriodAll.waitUntilClickable().click();
        waitABit(1000);
        TableResultFiltr.waitUntilVisible().isDisplayed();
    }

    public void StatusSecond(){
        StatusFiltr.click();
        waitABit(1000);
        StatusSecond.waitUntilClickable().click();
        waitABit(1000);
        TableResultFiltr.waitUntilVisible().isDisplayed();
    }

    public void StatusThird(){
        StatusFiltr.click();
        waitABit(1000);
        StatusThird.waitUntilClickable().click();
        waitABit(1000);
        TableResultFiltr.waitUntilVisible().isDisplayed();
    }

    public void StatusFourth(){
        StatusFiltr.click();
        waitABit(1000);
        StatusFourth.waitUntilClickable().click();
        waitABit(1000);
        TableResultFiltr.waitUntilVisible().isDisplayed();
    }

    public void StatusAll(){
        StatusFiltr.click();
        waitABit(1000);
        StatusAll.waitUntilClickable().click();
        waitABit(1000);
        TableResultFiltr.waitUntilVisible().isDisplayed();
    }

//---------------------------Проверить кнопки Отменить Распечатать в списке-------------------




    public void MoveToElementLK000432080(){    //Наведение мыши на LK001057389 и проверка кнопок
        Actions actions = new Actions(getDriver());
        actions.moveToElement(LK000432080).build().perform();
        waitABit(1000);
        PrintLK000432080.isDisplayed();
        ReplayLK000432080.isDisplayed();
        CancelLK000432080.isDisplayed();
    }


//------------------Найти заказ LK000432080 и переимовать его в Avtotest---------------------------



    public void NameAvtotest(){
        PencilLK000432080.click();//Нажать карандаш
        InputLK000432080.clear();
        InputLK000432080.sendKeys("Avtotest");//Ввести Avtotest
        ButtonCancelIzmeneniyaLK00043208.isDisplayed();//Проверить видимость кнопки Отмена
        waitABit(1000);
        ButtonPrinyatIzmeneniyaLK000432080.click();//Нажать применить
        blockWindow.waitUntilNotVisible();
        Assertions.assertThat(NameAvtotest.getText()).isEqualTo("Avtotest");//Проверить, что название изменилось
    }

    public void NameLK000432080(){
        PencilLK000432080.click();//Нажать карандаш
        InputLK000432080.clear();
        InputLK000432080.sendKeys("LK001057389");//Ввести Avtotest
        ButtonCancelIzmeneniyaLK00043208.isDisplayed();//Проверить видимость кнопки Отмена
        ButtonPrinyatIzmeneniyaLK000432080.click();//Нажать применить
        blockWindow.waitUntilNotVisible();
        Assertions.assertThat(NameLK000432080.getText()).isEqualTo("LK001057389");//Проверить, что название изменилось
    }


    //-------------------------




    //Провалиться в Avtotest
    //Проверить, что название не изменилось и соответствует LK000432080
    //Нажать вернуться к списку

    public void SendAvtotest(){
        ZakazAvtotest0.click();
        Assertions.assertThat(NameZakzPosleIzm.getText()).isEqualTo("Заказ от 20.02.2020 №LK001057389");
        ButtonNazad.click();
    }


    //-------------------------------Оповещение о переходе на старый ЛК-------------------------------

    public void OldLK(){
        if (headerAttentionOpen.isDisplayed()){
            ButtonPokazVse.waitUntilClickable().click();    //Нажать показать все
            LinkOldLK.click();//Перейти по ссылке на старый ЛК
            GirlImage.waitUntilVisible().isDisplayed();//Проверить отображение старого ЛК
        }else {
        ButtonKolokol.click();//Нажать Колокольчик
        ButtonPokazVse.waitUntilClickable().click();    //Нажать показать все
        LinkOldLK.click();//Перейти по ссылке на старый ЛК
        GirlImage.waitUntilVisible().isDisplayed();//Проверить отображение старого ЛК
            }
    }

    public void MedKarty(){
        MedKarty.waitUntilClickable().click();//Переход в Медкарты
    }

    public void clickAddNewMedCartPacient(){
        ZagolovokMeskarty.waitUntilVisible().isDisplayed();
        MedkartList.waitUntilVisible().isDisplayed();//Прверка успешного перехода и отображения Медкарт
    }

    //Проверка отображения и функционала Автоматического добавления всех результатов


    public void visibleClosePopUpNewPacient(){
        ChecBoxDisabled.waitUntilVisible().isDisplayed();
        ChecBoxActived.waitUntilClickable().click();
        ButtonPodtverditEmail.waitUntilClickable().click();
        Assertions.assertThat(MessageGoodSendEmail.getText()).isEqualTo("Проверьте почту");
        ButonContinete.waitUntilClickable().click();
        waitABit(2000);
    }


    public void clickChooseMalePacient(){
        AddMedkart.waitUntilClickable().click();
        ButtonMen.waitUntilClickable().click();
        ButtonGerl.waitUntilVisible().isDisplayed();
        InputFamily.sendKeys("Тест08");
        InputName.sendKeys("Тест08");
        InputSurename.sendKeys("Тест08");
        InputData.waitUntilClickable().click();
        InputData.sendKeys("01011980");
        InputTel.click();
        InputTel.sendKeys("9999999999");
        Input2Email.sendKeys("test@mail.ru");
        ButtonGoToInRazdel.waitUntilVisible().isDisplayed();
        ButtonSave.waitUntilClickable().click();
        MewMedkarta.waitUntilVisible().isDisplayed();
    }




    public void enterAddNameField(){
        ProgrammaInvitroZdorPlus.waitUntilClickable().click();
        LocalDateTime startTime = LocalDateTime.now();
        while (isDisplayed(loadDan) && startTime.plusMinutes(3).isAfter(LocalDateTime.now())){
            waitABit(300);
        }
    }

    public boolean isDisplayed(WebElementFacade element) {
        try {
            return element.isDisplayed();
        } catch (WebDriverException e) {
            return false;
        }
    }


    public void scrollToElement(WebElementFacade element) {
        if (elementInViewPort(element)) {
            ((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView();", element);
            scrollToElement(element, 0, -400);
        }
    }

    public void scrollToElement(WebElementFacade element, int x, int y) {
        if (elementInViewPort(element)) {
            String code = "window.scroll(" + (element.getLocation().x + x) + ","
                    + (element.getLocation().y + y) + ");";
            ((JavascriptExecutor) getDriver()).executeScript(code, element, x, y);
        }
    }

    private boolean elementInViewPort(WebElementFacade element) {
        Dimension screenSize = getDriver().manage().window().getSize();
        try {
            Long y = (Long) ((JavascriptExecutor) getDriver()).executeScript(
                    "var elem = arguments[0],                 " +
                            "  box = elem.getBoundingClientRect();    " +
                            "return box.top;                            "
                    , element);
            return y >= screenSize.getHeight() - 200 || y <= 200;
        } catch (ClassCastException e) {
            Double y = (Double) ((JavascriptExecutor) getDriver()).executeScript(
                    "var elem = arguments[0],                 " +
                            "  box = elem.getBoundingClientRect();    " +
                            "return box.top;                            "
                    , element);
            return y >= screenSize.getHeight() - 200 || y <= 200;
        }
    }

    public boolean sendPacient(String value){
        ViborMedKart.waitUntilClickable().click();
        LocalDateTime startTime = LocalDateTime.now();
        for (WebElementFacade pacient : pacientVibor) {
            if (pacient.getText().equals(value)) {
//                scrollToElement(pacient);
                pacient.waitUntilClickable().click();
                loadDan.waitUntilVisible();
                while (isDisplayed(loadDan) && startTime.plusMinutes(3).isAfter(LocalDateTime.now())) {
                    waitABit(300);
                }
                return true;
            }
        }
        Assert.fail("Пациент " + value +  " не найден в списке");
        return false;
    }

    public boolean checkNotPL(){
        return youNotPL.getText().contains("Вы не являетесь участником программы \"ИНВИТРО Здоровый плюс\"");
    }

    public boolean checkBBPl(){
        return statusBB.getText().contains("ваш статус в бонусной программе");
    }

    public boolean checkDkPl(){
        return statusDk.getText().contains("Номинал карты") || statusDk.getText().contains("дисконтная программа") || isDisplayed(statusDk.findBy("./img[@class='discount_card_small']"));
    }

    public void checkOrderedAnalyzesInBasketBlock(){
        ZagolovokDinam.waitUntilVisible().isDisplayed();
    }

    public void verifyTotalText(){
        ViborMedKart.click();
        IvanovIvanIvanovoch.waitUntilClickable().click();
        IvanovIvanIvanovoch.waitUntilNotVisible();
        loadDan.waitUntilNotVisible();
        InputOnePeriod.waitUntilVisible();
        ViborIssledov.click();
        ViborIssledovAll.click();
        InputOnePeriod.sendKeys("2018/10/01");
        InputToPeriod.sendKeys("2020/04/05");
        tableDinamIsled.waitUntilVisible().isDisplayed();
    }

    public void clickChoosePacientOrderPage(){
        SaveDinam.click();
    }

    public void clickCheckoutOrderButton(){
        SendDinamEmail.click();
        InputEmailDinam.sendKeys("mkozlov@invitro.ru");
        ButtonSendDinam.waitUntilClickable().click();
        Assertions.assertThat(MessagePosEmail.getText()).isEqualTo("Спасибо! Письмо отправлено.");
        ButtonProdolDinam.waitUntilClickable().click();
    }

    public void verifyCheckoutOrderText(){
        tableDinamIsled.waitUntilVisible().isDisplayed();
    }

    public void verifyOrderListText(){
        TablElementObsh.click();
        GrafikObshBel.isDisplayed();
        TableDetalObshZak.isDisplayed();
    }

    public void scrollToUp() {
        ((JavascriptExecutor) getDriver()).executeScript("window.scrollTo(0, 0)");
    }

    public void scrollToDown() {
        ((JavascriptExecutor) getDriver()).executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }

    public String getLastDowloadedFile() {
        WebDriver driver = getDriver();
        String currentWindow = driver.getWindowHandle();
        ((JavascriptExecutor) driver).executeScript("window.open();");
        for (String tab : driver.getWindowHandles()) {
            if (!tab.equals(currentWindow)) {
                driver.switchTo().window(tab);
                break;
            }
        }
        driver.navigate().to("chrome://downloads/");
        waitABit(2000);
        String fileName = "";
        int count = 0;
        while (count < 3) {
            try {
                Object fileNameFromCromeDownloads = ((JavascriptExecutor) getDriver()).executeScript("return document.querySelector('downloads-manager').shadowRoot.querySelector('downloads-item').shadowRoot.querySelector('#file-link').text");
                fileName = fileNameFromCromeDownloads.toString();
                break;
            } catch (WebDriverException e) {
                waitABit(60000);
                getDriver().navigate().refresh();
                waitABit(10000);
                count++;
            }
        }
        driver.close();
        driver.switchTo().window(currentWindow);
        return (fileName);
    }

    public boolean CheckFileHasLoaded() {
        waitABit(15000);
        String fileName = getLastDowloadedFile();
        try {
            FileInputStream fis = new FileInputStream(new File("C:\\chrome\\" + fileName));
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }




}