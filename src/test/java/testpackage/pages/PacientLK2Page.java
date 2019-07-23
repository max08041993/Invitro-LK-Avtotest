package testpackage.pages;

import net.thucydides.core.pages.PageObject;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import testpackage.help.Help_Methods;
import java.util.ArrayList;


public class PacientLK2Page extends PageObject {

    private static final Help_Methods help = Help_Methods.getInstance();
    public ArrayList<String> TheBoardValues = new ArrayList();

    private By AppCookie = By.xpath("//button[contains(@class,'attention-close-button')]");

    //22.07.2019

    //Медкарты
    @FindBy(xpath = "//a[contains(text(),'МЕДКАРТЫ')]")
    WebElement MedKarty;//Ссылка на медкарты

    @FindBy(xpath = "//h1[contains(text(),'Медкарты')]")
    WebElement ZagolovokMeskarty;//Заголовок Медкарты

    @FindBy(xpath = "//div[@class='list_medcarsd']")
    WebElement MedkartList;//Таблица Медкарт




    public void MedKarty(){
        help.Click_Method(MedKarty);//Переход в Медкарты
    }

    public void clickAddNewMedCartPacient(){
        help.Check_Visible_Element(ZagolovokMeskarty);
        help.Check_Visible_Element(MedkartList);//Прверка успешного перехода и отображения Медкарт
    }

    //Проверка отображения и функционала Автоматического добавления всех результатов

    @FindBy(xpath = "(//label[@class='medcard-update disabled-checkbox'])[1]")
    WebElement ChecBoxDisabled;//Не активный чекбокс Автоматическое добавление всех результатов

    @FindBy(xpath = "//div[@class='checkbox med_auto_update']/label")//Все активные чекбоксы Автоматическое добавление всех результатов
    WebElement FullChecBoxActived;

    @FindBy(xpath = "//label[@for='add_orders_auto_8cf08a3b-c901-e911-80d5-00155d52d70b']")
    WebElement ChecBoxActived;//Активный чекбокс Автоматическое добавление всех результатов

    @FindBy(xpath = "//button[@id='agreeing_btn']")
    WebElement ButtonPodtverditEmail;//Кнопка подтверждения емаила в Автоматическое добавление всех результатов

    @FindBy(xpath = "//h2[contains(text(),'Проверьте почту')]")
    WebElement MessageGoodSendEmail;//    На адрес  отправлено письмо со ссылкой для подтверждения вашего email.

    @FindBy(xpath = "//button[@id='continue']")
    WebElement ButonContinete;//Кнопка продолжить

    public void visibleClosePopUpNewPacient(){
        help.Check_Enabled_Element(ChecBoxDisabled);
//        help.Check_Enabled_Element(FullChecBoxActived);
        help.Click_Method(ChecBoxActived);
        help.Click_Method(ButtonPodtverditEmail);
        help.Verify_Text(MessageGoodSendEmail,"Проверьте почту");
        help.Click_Method(ButonContinete);
    }

    //Проверка добавления новой Медкарты

    @FindBy(xpath="//button[@class='btn-icon btn-icon--fill popupBtn add-medcard']")// Кнопка 'Добавить МедКарту пациента'
    WebElement AddMedkart;

    @FindBy(xpath="//label[@for='patientMale']//span[@class='radio__item']")// Пациент Мужского пола
    WebElement ButtonMen;

    @FindBy(xpath="//label[@for='patientFemale']//span[@class='radio__item']")// Пациент Женского пола
    WebElement ButtonGerl;

    @FindBy(xpath="//*[@id='surname']")// Поле ввода 'Фамилия'
    WebElement InputFamily;

    @FindBy(xpath="//*[@id='name']")// Поле ввода 'Имя'
    WebElement InputName;

    @FindBy(xpath="//*[@id='secondname']")// Поле ввода 'Отчество'
    WebElement InputSurename;

    @FindBy(xpath="//*[@id='birthday']")// Поле ввода 'День рождения'
    WebElement InputData;

    @FindBy(xpath="//*[@id='phone']")// Поле ввода 'Телефон'
    WebElement InputTel;

    @FindBy(xpath="//*[@class='form__field form__field--w33']//input[@id='email']")// Поле ввода 'Email'
    WebElement InputEmail;

    @FindBy(xpath="//button[contains(text(),'Сохранить')]")// Кнопка 'Сохранить'
    WebElement ButtonSave;

    @FindBy(xpath = "//button[@class='btn btn--empty js-close-edit-card']")//Кнопка Перейти в раздел
    WebElement ButtonGoToInRazdel;

    @FindBy(xpath = "//span[contains(text(),'Тест08')]/..")//Добавленая медкарта
    WebElement MewMedkarta;

    public void clickChooseMalePacient(){
        help.Click_Method(AddMedkart);
        help.Click_Method(ButtonMen);
        help.Check_Visible_Element(ButtonGerl);
        help.Enter_Text(InputFamily,"Тест08");
        help.Enter_Text(InputName,"Тест08");
        help.Enter_Text(InputSurename,"Тест08");
        help.Click_Method(InputData);
        help.Enter_Text(InputData,"01011980");
        help.Enter_Text(InputTel,"9999999999");
        help.Enter_Text(InputEmail,"test@mail.ru");
        help.Check_Visible_Element(ButtonGoToInRazdel);
        help.Click_Method(ButtonSave);
        help.Check_Visible_Element(MewMedkarta);
    }


    //Удаление новой медкарты

    @FindBy(xpath = "//button[@data-item-id='11']")
    WebElement DeleteNewMedkart;

    public void enterAddSurnameField(){
        help.Click_Method(DeleteNewMedkart);
    }


//
//    // Процедура добавления новой медицинской карты пациента
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
//
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


}