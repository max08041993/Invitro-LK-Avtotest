package testpackage.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import testpackage.help.Help_Methods;
import java.util.ArrayList;

public class PacientLKPage extends PageObject {

    private static final Help_Methods help = Help_Methods.getInstance();
    public ArrayList<String> TheBoardValues = new ArrayList();

    private By AppCookie = By.xpath("//button[contains(@class,'attention-close-button')]");

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

    @FindBy(xpath = "//div[contains(text(),'Вы не являетесь участником программы \"ИНВИТРО Здоровый плюс\"')]")
    WebElementFacade NotPL;//сообщение у основного пациента по ПЛ

    @FindBy(xpath = "//p[@class='select-drop__title'][contains(text(),'Тестовый Бонус5')]")//Медкарта Тестовый Бонус5
            WebElementFacade BB5;

    @FindBy(xpath = "//p[@class='select-drop__title'][contains(text(),'Тестовый Бонус7')]")//Медкарта Тестовый Бонус5
            WebElementFacade BB7;

    @FindBy(xpath = "//p[@class='select-drop__title'][text()='Тестовый Бонус10']")//Медкарта Тестовый Бонус10
            WebElementFacade BB10;

    @FindBy(xpath = "//p[@class='select-drop__title'][text()='Тестовый Бонус10п']")//Медкарта Тестовый Бонус10п
            WebElementFacade NewBB10p;

    @FindBy(xpath = "//p[@class='select-drop__title'][text()='Тестовый Бонус10с']")//Медкарта Тестовый Бонус10с
            WebElementFacade New2BB10c;

    @FindBy(xpath = "//p[@class='select-drop__title'][text()='Тестовый Дисконт5']")//Медкарта Тестовый Дисконт5
            WebElementFacade DK5;

    @FindBy(xpath = "//p[@class='select-drop__title'][text()='Тестовый Дисконт10']")//Медкарта Тестовый Дисконт10
            WebElementFacade DK10;

    @FindBy(xpath = "//p[@class='select-drop__title'][text()='Тестовый Дисконт13']")//Медкарта Тестовый Дисконт13
            WebElementFacade DK13;

    @FindBy(xpath = "//p[@class='select-drop__title'][text()='Тестовый Дисконт20']")//Медкарта Тестовый Дисконт20
            WebElementFacade DK20;

    @FindBy(xpath = "//p[@class='select-drop__title'][text()='Тестовый Дисконт30']")//Медкарта Тестовый Дисконт30
            WebElementFacade DK30;

    @FindBy(xpath = "//div[@class='lk-info-bar__title lk-info-bar__title--big']")//Информация о номинале ДК и ББ
            WebElementFacade NominalDK;

    @FindBy(xpath = "//img[@class='discount_card_small']")//Изображение ДК
            WebElementFacade ImageDK;

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

    @FindBy(xpath = "//div[@class='checkbox med_auto_update']/label")//Все активные чекбоксы Автоматическое добавление всех результатов
            WebElementFacade FullChecBoxActived;

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

    @FindBy(xpath = "//a[contains(text(),'НАСТРОЙКИ')]")//Ссылка на настройки
            WebElementFacade ButtonSceting;

    @FindBy(xpath = "//input[@id='name']")//Поле ввода Имени
            WebElementFacade InputScetName;

    @FindBy(xpath = "//input[@id='email']")//Поле ввода Email
            WebElementFacade InputScetEmail;

    @FindBy(xpath = "//input[@id='phone3']")//Поле ввода телефона
            WebElementFacade InputScetTel;

    @FindBy(xpath = "//button[@class='btn-icon btn-icon--fill']")//Кнопка Сохранить
            WebElementFacade ButtonScetSave;

//безопасность

    @FindBy(xpath = "//a[text()='Безопасность']")//Вкладка Безопасность
            WebElementFacade ElementSecurity;

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

    @FindBy(xpath = "//a[@href='/personal/history/']")//Вкладка История посещения
            WebElementFacade ElementHistory;

    @FindBy(xpath = "//div[@class='lk-setting__history analysis-table analysis-table--no-padding-left a']")//Таблица Истории посещений
            WebElementFacade TableHistory;


    @FindBy(xpath = "//a[@class='btn btn--narrow btn--empty city__change-btn']")//Выбрать другой
            WebElementFacade ChengeOtherCity;

    @FindBy (xpath = "//button[@class='attention-close-button btn-icon btn-icon--fill']")
    WebElementFacade Prinyat;

    @FindBy (xpath = "//button[@class='btn btn--narrow city__confirm-btn']") //Да верно
            WebElementFacade ChangeYesOk;

    @FindBy (xpath = "//div[@class='change-city-wrapper__left']//a[@class='change-city-block__item bold'][contains(text(),'Москва')]") //надпись крупные города Москва
            WebElementFacade BigCityMoscow;

    private By Moscow = By.xpath("//span[@class='city__name city__btn city__name--label']");

    @FindBy (xpath = "//button[@class='header-nav__get-result popupBtn']")
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

    @FindBy (xpath = "//input[@id='emailSend']")
    WebElementFacade InputEmail1;

    @FindBy (xpath = "//button[@id='getEmailAnalysisBtn']")
    WebElementFacade ButtonSend;

    @FindBy (xpath = "(//div[@class='attention__content'])[1]")
    WebElementFacade FallPodskazka;

    @FindBy (xpath = "//button[@id='header_button_login']")
    WebElementFacade ButtonLogin;

    @FindBy (xpath = "//a[@class='autorisation__link-forgot link forgetPass autorisation__link-passforgot'][contains(text(),'Забыли')]")//Забыли пароль
    WebElementFacade ZabilPassword;

    @FindBy(xpath = "//input[@id='loginForgot']")
    WebElementFacade InputEmailOrTel;

    @FindBy(xpath = "//input[@id='passwordForgotEmail']")//Поле ввода нового пароля
    WebElementFacade NewPassword1;

    @FindBy(xpath = "//input[@id='repareLogin']")
    WebElementFacade ButtonVostanovleniyaPasword;

    @FindBy(xpath = "//div[@class='fields']")
    WebElementFacade MessagePasword;

    @FindBy(xpath = "//input[@name='Forgot']")
    WebElementFacade ButtonVostanovPasword;

    //-------------------------------Проверка Динамики-------------

    @FindBy(xpath = "//a[contains(text(),'ДИНАМИКА')]")//Вкладка Динамика
            WebElementFacade ElementDinamika;

    @FindBy(xpath = "//div[@class='box-empty__msg']")//Сообщение У вас еще нет результатов или они еще не готовы в Динамике
            WebElementFacade NotRezult;

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

    @FindBy(xpath = "//div[@id='dynamic-list']//label[contains(text(),'Общий белок')]")//"//ul[@class='options']")//Чекбокс Общий белок
            WebElementFacade ViborIssledovObsh;

    @FindBy(xpath = "//p[@class='btnOk']")//Кнопка ОК при выборе Исследования
            WebElementFacade BootnOkDinam;

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

    @FindBy(xpath = "//div[@class='h3']")// Текст Спасибо! Ваш ответ принят.
            WebElementFacade MessagePosEmail;

    @FindBy(xpath = "(//td[@class='fixed-side'][contains(text(),'Эритроциты')])[2]")//Элемент Общий анализ крови в таблице динамики
            WebElementFacade TablElementObsh;   /////------------------При клике Можно применить для перехода к диаграме Общего белка

    @FindBy(xpath = "//canvas[@class='flot-overlay']")//Проверить что Строится график при переходе на конкретное исследование
            WebElementFacade GrafikObshBel;

    @FindBy(xpath = "//div[@id='detail-table']")//Таблица Деталей Общего белка
            WebElementFacade TableDetalObshZak;

    @FindBy(xpath = "(//button[@class='list-order__edit'])[2]")
    WebElementFacade PencilLK000432080;//Карандаш для переименования

    @FindBy(xpath = "//input[@placeholder='LK000432080']")
    WebElementFacade InputLK000432080;//поле переименования заказа

    @FindBy(xpath = "//input[@placeholder='LK000432080']/../button[@class='list-order__send sender_alias']")
    WebElementFacade ButtonPrinyatIzmeneniyaLK000432080;//Кнопка применить

    @FindBy(xpath = "//input[@placeholder='LK000432080']/../button[@class='list-order__cansel']")
    WebElementFacade ButtonCancelIzmeneniyaLK00043208;//Кнопка отмена

    @FindBy(xpath = "//h2[@class='list-order__title'][contains(text(),'Avtotest')]")
    WebElementFacade NameAvtotest;//Переименованый заказ Avtotest

    @FindBy(xpath = "//h2[@class='list-order__title'][contains(text(),'LK000432080')]")
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

    @FindBy(xpath = "//div[@class='conteiner inner']")
    WebElementFacade ZakazyAktiv;

    @FindBy(xpath = "//div[@class='list-order__item list-order__item--on-result showDetailInzInfo showDetailInzInfoClicker doneOrder']//h2")
    WebElementFacade OpenZakaz;

    @FindBy(xpath = "//div[@class='analysis-table analysis-table--no-padding-left analysis-table--v-align-top']")
    WebElementFacade Table1Result;

    @FindBy(xpath = "(//span[@class='attention__acc show_error'])[1]")
    WebElementFacade ErrorLogPass;

    @FindBy(xpath = "//button[@class='list-order__action list-order__action--download dwnlod']")
    WebElementFacade DonloadRez;

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

    @FindBy (xpath = "//li[@class='ss__item'][contains(text(),'Черновик заказа')]")
    WebElementFacade StatusdOne;//Выбор Статус заказа: Черновик заказа

    @FindBy(xpath = "//li[@class='ss__item'][contains(text(),'Выполненный заказ (с результатами)')]")
    WebElementFacade StatusSecond;//Выбор Статус заказа: Выполненный заказ (с результатами)

    @FindBy(xpath = "//li[@class='ss__item'][contains(text(),'Сформированный заказ')]")
    WebElementFacade StatusThird;//Выбор Статус заказа: Сформированный заказ

    @FindBy(xpath = "//li[@class='ss__item'][contains(text(),'Результаты без заказа')]")
    WebElementFacade StatusFourth;//Выбор Статус заказа: Результаты без заказа

    @FindBy(xpath = "//li[@class='ss__item'][contains(text(),'Все')]")
    WebElementFacade StatusAll;//Выбор Статус заказа: Все

    @FindBy(xpath = "//h2[contains(text(),'LK000432080')]")
    WebElementFacade LK000432080;//Заказ LK000432080

    @FindBy(xpath = "(//button[@class='list-order__action tablet-hide printer'])[2]")
    WebElementFacade PrintLK000432080;//Кнопка Распечатать

    @FindBy(xpath = "(//button[@class='list-order__action repiter'])[2]")
    WebElementFacade ReplayLK000432080;//Кнгопка Повторить

    @FindBy(xpath = "(//button[@class='list-order__action cansler'])[2]")
    WebElementFacade CancelLK000432080;//Кнопка Отменить

    @FindBy(xpath = "//div[@class='attention--header--button']")
    WebElementFacade ButtonKolokol;//Колокольчик

    @FindBy(xpath = "//div[@class='attention--header--showmore']")
    WebElementFacade ButtonPokazVse;//показать все

    @FindBy(xpath = "//a[contains(text(),'ссылке')]")
    WebElementFacade LinkOldLK;//ссылке на старый ЛК

    @FindBy(xpath = "//div[@class='girl']")
    WebElementFacade GirlImage;//отображение старого ЛК

    @FindBy(xpath = "(//a[@class='list-order__fill-link to-detail'])[2]")
    WebElementFacade ZakazAvtotest0;//Заказ Avtotest (LK000432080)

    @FindBy(xpath = "//h2[@class='list-order__title list-order__title--inner']")
    WebElementFacade NameZakzPosleIzm;//Имея в теле заказа после переиминование осталось прежним Заказ от 18.06.2019 №LK000432080

    @FindBy(xpath = "//a[@class='back-link']//*[contains(text(),'Назад к списку заказов')]")
    WebElementFacade ButtonNazad;

    @FindBy(xpath = "//div[@class='input__icon-wrap input__icon-wrap--calendar']")
    WebElementFacade Inputcalendar;

    @FindBy(xpath = "//div[@class='preload__overlay']")
    WebElementFacade blockWindow;

    @FindBy(xpath = "//div[@class='lk-dynamic-table__content']")
    WebElementFacade tableDinamIsled;

    @FindBy(xpath = "//div[@id='headerAttention'][@class='attention--header open']")
    WebElementFacade headerAttentionOpen;

    @FindBy(xpath = "//div[@class='box-empty__msg']")
    WebElementFacade loadDan;

    @FindBy(xpath = "//h1[contains(text(),'Программа «ИНВИТРО Здоровый плюс»')]")
    WebElementFacade titleBlockBB;

    @FindBy(xpath = "//*[text()='Загрузка...']")
    WebElementFacade blockLoad;

    @FindBy(xpath = "//div[@class='attention--header--list hidden']//div[@class='close-block']")
    WebElementFacade messageComand;


    //------------------------------------------------------------------------------------------


    public void clickAddThirdClinicalBloodTest(){
        ButtonSceting.waitUntilClickable().click();
    }

    public void clickAddFourthClinicalBloodTest(){
        InputScetName.waitUntilVisible().isVisible();
        InputScetEmail.waitUntilVisible().isVisible();
        InputScetTel.waitUntilVisible().isVisible();
        ButtonScetSave.waitUntilVisible().isVisible();
    }


    public void clickGoToBasketButton(){
        ElementSecurity.waitUntilClickable().click();
        BlockSecur.waitUntilVisible().isVisible();
        OldPassword.sendKeys("a4AxPF3b");
        NewPassword.sendKeys("a4AxPF3b");
        GlazPassword.waitUntilClickable().click();
        New2Password.sendKeys("a4AxPF3b");
        ButtonSecurSave.waitUntilClickable().click();
        blockLoad.waitUntilNotVisible();
        Assertions.assertThat(PasswordPas.getText()).isEqualTo("Пароль успешно изменён");
        ButtonClose.waitUntilClickable().click();
    }

    public void verifyBasketText(){
        TextLK.waitUntilVisible().isVisible();
        ElementHistory.click();
        TableHistory.waitUntilVisible().isVisible();
    }


    public void ClickYesMoskow(){
        if (messageComand.isVisible()){
            messageComand.click();
        }
        if (find(Moscow).getText().equals("Москва"))
        {
            ChangeYesOk.waitUntilClickable().click();
        }
        else{
            ChengeOtherCity.waitUntilClickable().click();
            BigCityMoscow.waitUntilClickable().click();
            ChangeYesOk.waitUntilClickable().click();
        }
        Prinyat.waitUntilClickable().click();
    }

    public void clickButtonLogin(){
        ButtonLogin.waitUntilClickable().click();
    }

    public void clickResultat(){
        Resultat.waitUntilClickable().click();
    }

    public void visiblePopapResult(){
        PopapResult.waitUntilVisible().isVisible();
    }

    public void inputINZBornSurename(){
        InputINZ.waitUntilClickable().click();
        InputINZ.sendKeys("900003942");
        Born.click();
        Born.sendKeys(" 04041986");
        Surename.click();
        Surename.sendKeys("Иванов");
    }

    public void clickFindSubmit(){
        FindSubmit.click();
        blockWindow.waitUntilNotVisible();
    }

    public void visiblePodskazkaResult(){
        Assertions.assertThat(PodskazkaResult.getText()).isEqualTo("Найдены результаты 1 анализов.");
    }


    public void visibleRadioEmailDownload(){
        RadioEmailGet.isVisible();
        RadioDownload.isVisible();
    }


    public void visiblePovtorPoisk(){
        PovtorPoisk.isVisible();
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

    public void visiblePodskazkaSend(){
        Assertions.assertThat(PodskazkaResult.getText()).isEqualTo("Документ отправлен на указанный E-mail.");
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
        help.Verify_Text(FallPodskazka,"Ваши результаты анализов не найдены. Пожалуйста, измените параметры и повторите поиск");

    }

    public void clickZabilPassword(){
        ZabilPassword.waitUntilClickable().click();
    }

    public void inputInputEmailOrTel(){
        InputEmailOrTel.waitUntilVisible().sendKeys("pacient.lk5.invitro@yandex.ru");
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
        ButtonVostanovPasword.waitUntilClickable().click();
        ButtonVostanovleniyaPasword.isVisible();
    }

//---------------------------------------------------------------------------------------------------------------------------------------------------------------



    // Авторизация


    public void sendLogandPass(String login, String password) {
        LoginFieldAuthorization.waitUntilClickable().click();
        LoginFieldAuthorization.type(login);
        LoginFieldAuthorization.waitUntilClickable().click();
        PasswordFieldAuthorization.type(password);
        ButtonInput.waitUntilClickable().click();
        blockWindow.waitUntilNotVisible();
    }

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
        TextLK.waitUntilVisible().isVisible();
    }

    public void visibleZakaziAktiv(){
        ZakaziAktiv.waitUntilVisible().isVisible();
    }

    public void clickChooseMedCart() { //Кликнуть, Выбрать мед карту
        ViborMedKart.click();
        TestovyBonus7.waitUntilClickable().click();
        TestovyBonus7.waitUntilNotVisible();
        loadDan.waitUntilNotVisible();
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
        Table1Result.waitUntilVisible().isVisible();
    }

    // Ввод неверного Логина пароля



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
        help.Verify_Text(ErrorLogPass,"Ошибка авторизации");
    }

    public void enterFallPasswordFieldAuthorization() { // Ввод Неверного пароля
        help.Click_Method(LoginFieldAuthorization);
        help.Enter_Text(LoginFieldAuthorization, "inv.loyal.1@gmail.com");
        help.Click_Method(PasswordFieldAuthorization);
        help.Enter_Text(PasswordFieldAuthorization, "QazWsxEdc34532");
        help.getSlow();
        help.Click_Method(ButtonInput);
        help.getSlow();
        help.Verify_Text(ErrorLogPass,"Ошибка авторизации");
    }

    public void enterFallLoginFieldAuthorization() { // Ввод Неверного Имени
        help.Click_Method(LoginFieldAuthorization);
        help.Enter_Text(LoginFieldAuthorization, "inv.loya32546l.1@gmail.com");
        help.Click_Method(PasswordFieldAuthorization);
        help.Enter_Text(PasswordFieldAuthorization, "QazWsxEdc");
        help.Click_Method(ButtonInput);
        help.getSlow();
        help.Verify_Text(ErrorLogPass,"Ошибка авторизации");
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



    public void sendINZ(String Namber){
        InputINZAndNameTest.sendKeys(Namber);
        waitABit(1000);
    }

    public void sendSearch(){
        Search.click();
    }

    public void visibleINZ904160861(){
        Assertions.assertThat(ZakazOt21Fev.getText()).isEqualTo("LK001057389");
    }

    public void sendResetFiltr(){
        ButtonResetFilter.click();
    }

    public void sendArt1515(){
        InputINZAndNameTest.sendKeys("1515");
    }

    public void visibleArt1515(){
        ElementArt1515First.isVisible();
    }

// --------------------  Полная проверка страницы Заказы Проверка работы фильтров-----------------------




    public void PeriodOne(){
        PeriodFiltr.click();
        waitABit(1000);
        PeriodOne.waitUntilClickable().click();
        waitABit(1000);
        TableResultFiltr.waitUntilVisible().isVisible();
    }

    public void PeriodSecond(){
        PeriodFiltr.click();
        waitABit(1000);
        PeriodSecond.waitUntilClickable().click();
        waitABit(1000);
        TableResultFiltr.waitUntilVisible().isVisible();
    }

    public void PeriodThird(){
        PeriodFiltr.click();
        waitABit(1000);
        PeriodThird.waitUntilClickable().click();
        waitABit(1000);
        TableResultFiltr.waitUntilVisible().isVisible();
    }

    public void PeriodAll(){
        PeriodFiltr.click();
        waitABit(1000);
        PeriodAll.waitUntilClickable().click();
        waitABit(1000);
        TableResultFiltr.waitUntilVisible().isVisible();
    }

    public void StatusdOne(){
        StatusFiltr.click();
        waitABit(1000);
        StatusdOne.waitUntilClickable().click();
        waitABit(1000);
        TableResultFiltr.waitUntilVisible().isVisible();
    }

    public void StatusSecond(){
        StatusFiltr.click();
        waitABit(1000);
        StatusSecond.waitUntilClickable().click();
        waitABit(1000);
        TableResultFiltr.waitUntilVisible().isVisible();
    }

    public void StatusThird(){
        StatusFiltr.click();
        waitABit(1000);
        StatusThird.waitUntilClickable().click();
        waitABit(1000);
        TableResultFiltr.waitUntilVisible().isVisible();
    }

    public void StatusFourth(){
        StatusFiltr.click();
        waitABit(1000);
        StatusFourth.waitUntilClickable().click();
        waitABit(1000);
        TableResultFiltr.waitUntilVisible().isVisible();
    }

    public void StatusAll(){
        StatusFiltr.click();
        waitABit(1000);
        StatusAll.waitUntilClickable().click();
        waitABit(1000);
        TableResultFiltr.waitUntilVisible().isVisible();
    }

//---------------------------Проверить кнопки Отменить Распечатать в списке-------------------




    public void MoveToElementLK000432080(){    //Наведение мыши на LK000432080 и проверка кнопок
        Actions actions = new Actions(getDriver());
        actions.moveToElement(LK000432080).build().perform();
        waitABit(1000);
        PrintLK000432080.waitUntilVisible().isVisible();
        ReplayLK000432080.isVisible();
        CancelLK000432080.isVisible();
    }


//------------------Найти заказ LK000432080 и переимовать его в Avtotest---------------------------



    public void NameAvtotest(){
        PencilLK000432080.click();//Нажать карандаш
//        Actions actions = new Actions(getDriver());
//        actions.doubleClick(InputLK000432080).build().perform();//Двойной клик по полю ввода
        InputLK000432080.clear();
        InputLK000432080.sendKeys("Avtotest");//Ввести Avtotest
        ButtonCancelIzmeneniyaLK00043208.isVisible();//Проверить видимость кнопки Отмена
        ButtonPrinyatIzmeneniyaLK000432080.click();//Нажать применить
        blockWindow.waitUntilNotVisible();
        Assertions.assertThat(NameAvtotest.getText()).isEqualTo("Avtotest");//Проверить, что название изменилось
    }

    public void NameLK000432080(){
        PencilLK000432080.click();//Нажать карандаш
//        Actions actions = new Actions(getDriver());
//        actions.doubleClick(InputLK000432080).build().perform();//Двойной клик по полю ввода
        InputLK000432080.clear();
        InputLK000432080.sendKeys("LK000432080");//Ввести Avtotest
        ButtonCancelIzmeneniyaLK00043208.isVisible();//Проверить видимость кнопки Отмена
        ButtonPrinyatIzmeneniyaLK000432080.click();//Нажать применить
        blockWindow.waitUntilNotVisible();
        Assertions.assertThat(NameLK000432080.getText()).isEqualTo("LK000432080");//Проверить, что название изменилось
    }


    //-------------------------




    //Провалиться в Avtotest
    //Проверить, что название не изменилось и соответствует LK000432080
    //Нажать вернуться к списку

    public void SendAvtotest(){
        ZakazAvtotest0.click();
        Assertions.assertThat(NameZakzPosleIzm.getText()).isEqualTo("Заказ от 18.06.2019 №LK000432080");
        ButtonNazad.click();
    }


    //-------------------------------Оповещение о переходе на старый ЛК-------------------------------

    public void OldLK(){
        if (headerAttentionOpen.isVisible()){
            ButtonPokazVse.waitUntilClickable().click();    //Нажать показать все
            LinkOldLK.click();//Перейти по ссылке на старый ЛК
            GirlImage.waitUntilVisible().isVisible();//Проверить отображение старого ЛК
        }else {
        ButtonKolokol.click();//Нажать Колокольчик
        ButtonPokazVse.waitUntilClickable().click();    //Нажать показать все
        LinkOldLK.click();//Перейти по ссылке на старый ЛК
        GirlImage.waitUntilVisible().isVisible();//Проверить отображение старого ЛК
            }
    }

    public void MedKarty(){
        MedKarty.waitUntilClickable().click();//Переход в Медкарты
    }

    public void clickAddNewMedCartPacient(){
        ZagolovokMeskarty.waitUntilVisible().isVisible();
        MedkartList.waitUntilVisible().isVisible();;//Прверка успешного перехода и отображения Медкарт
    }

    //Проверка отображения и функционала Автоматического добавления всех результатов


    public void visibleClosePopUpNewPacient(){
        ChecBoxDisabled.waitUntilVisible().isVisible();
        ChecBoxActived.waitUntilClickable().click();
        ButtonPodtverditEmail.waitUntilClickable().click();
        Assertions.assertThat(MessageGoodSendEmail.getText()).isEqualTo("Проверьте почту");
        ButonContinete.waitUntilClickable().click();
        waitABit(2000);
    }


    public void clickChooseMalePacient(){
        AddMedkart.waitUntilClickable().click();
        ButtonMen.waitUntilClickable().click();
        ButtonGerl.waitUntilVisible().isVisible();
        InputFamily.sendKeys("Тест08");
        InputName.sendKeys("Тест08");
        InputSurename.sendKeys("Тест08");
        InputData.waitUntilClickable().click();
        InputData.sendKeys("01011980");
        InputTel.click();
        InputTel.sendKeys("9999999999");
        Input2Email.sendKeys("test@mail.ru");
        ButtonGoToInRazdel.waitUntilVisible().isVisible();
        ButtonSave.waitUntilClickable().click();
        MewMedkarta.waitUntilVisible().isVisible();
    }




    public void enterAddNameField(){
        ProgrammaInvitroZdorPlus.waitUntilClickable().click();
        //     loadDan.waitUntilVisible();
        loadDan.waitUntilNotVisible();
    }

    public void enterAddSecondnameField(){
        NotPL.waitUntilVisible().isVisible();
    }



    public void enterAddPhoneField(){//Проверка отображения статуса участия медкарты пациента Тестовый Бонус5
        ViborMedKart.waitUntilClickable().click();
        BB5.waitUntilClickable().click();
        //     loadDan.waitUntilVisible();
        loadDan.waitUntilNotVisible();
        NominalDK.waitUntilVisible().isVisible();
    }

    public void enterAddBirthdayField(){//Проверка отображения статуса участия медкарты пациента Тестовый Бонус7
        ViborMedKart.waitUntilClickable().click();
        BB7.waitUntilClickable().click();
        //     loadDan.waitUntilVisible();
        loadDan.waitUntilNotVisible();
        NominalDK.waitUntilVisible().isVisible();
    }

    public void clickNHematologicalStudies(){//Проверка отображения статуса участия медкарты пациента Тестовый Бонус10
        ViborMedKart.waitUntilClickable().click();
        BB10.waitUntilClickable().click();
        //     loadDan.waitUntilVisible();
        loadDan.waitUntilNotVisible();
        NominalDK.waitUntilVisible().isVisible();
    }

    public void enterNewPacientEmailTField(){//Проверка отображения статуса участия медкарты пациента Тестовый Бонус10п
        ViborMedKart.waitUntilClickable().click();
        NewBB10p.waitUntilClickable().click();
        //     loadDan.waitUntilVisible();
        loadDan.waitUntilNotVisible();
        NominalDK.waitUntilVisible().isVisible();
    }

    public void clickNewPacientSaveButton(){//Проверка отображения статуса участия медкарты пациента Тестовый Бонус10с
        ViborMedKart.waitUntilClickable().click();
        New2BB10c.waitUntilClickable().click();
        //     loadDan.waitUntilVisible();
        loadDan.waitUntilNotVisible();
        NominalDK.waitUntilVisible().isVisible();
    }

    public void enterLoginField(){//Проверка отображения статуса участия медкарты пациента Тестовый Дисконт5
        ViborMedKart.waitUntilClickable().click();
        DK5.waitUntilClickable().click();
        //     loadDan.waitUntilVisible();
        loadDan.waitUntilNotVisible();
        NominalDK.waitUntilVisible().isVisible();
        ImageDK.waitUntilVisible().isVisible();
    }

    public void enterPasswordField(){//Проверка отображения статуса участия медкарты пациента Тестовый Дисконт10
        ViborMedKart.waitUntilClickable().click();
        DK10.waitUntilClickable().click();
        //     loadDan.waitUntilVisible();
        loadDan.waitUntilNotVisible();
        NominalDK.waitUntilVisible().isVisible();
        ImageDK.waitUntilVisible().isVisible();
    }

    public void clickNewOrderButton(){//Проверка отображения статуса участия медкарты пациента Тестовый Дисконт13
        ViborMedKart.waitUntilClickable().click();
        DK13.waitUntilClickable().click();
        //     loadDan.waitUntilVisible();
        loadDan.waitUntilNotVisible();
        NotPL.waitUntilVisible().isVisible();
    }

    public void clickAddFirstAnalysis(){//Проверка отображения статуса участия медкарты пациента Тестовый Дисконт20
        ViborMedKart.waitUntilClickable().click();
        DK20.waitUntilClickable().click();
        //     loadDan.waitUntilVisible();
        loadDan.waitUntilNotVisible();
        NominalDK.waitUntilVisible().isVisible();
        ImageDK.waitUntilVisible().isVisible();
    }

    public void clickAddSecondClinicalBloodTest(){//Проверка отображения статуса участия медкарты пациента Тестовый Дисконт30
        ViborMedKart.waitUntilClickable().click();
        DK30.waitUntilClickable().click();
        //     loadDan.waitUntilVisible();
        loadDan.waitUntilNotVisible();
        NominalDK.waitUntilVisible().isVisible();
        ImageDK.waitUntilVisible().isVisible();
        loadDan.waitUntilNotVisible();
    }

    public void checkOrderedAnalyzesInBasketBlock(){
        ElementDinamika.waitUntilClickable().click();
        ZagolovokDinam.waitUntilVisible().isVisible();
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
        InputToPeriod.sendKeys("2019/08/05");
        tableDinamIsled.waitUntilVisible().isVisible();
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
        tableDinamIsled.waitUntilVisible().isVisible();
    }

    public void verifyOrderListText(){
        TablElementObsh.click();
        GrafikObshBel.isVisible();
        TableDetalObshZak.isVisible();
    }



}