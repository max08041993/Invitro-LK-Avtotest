package testpackage.pages;

import net.thucydides.core.pages.PageObject;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import testpackage.help.Help_Methods;
import java.util.ArrayList;
import testpackage.pages.PacientLKPage;


public class PacientLK2Page extends PageObject {

    private static final Help_Methods help = Help_Methods.getInstance();
    public ArrayList<String> TheBoardValues = new ArrayList();
    PacientLKPage page1 = new PacientLKPage();
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


    //-------------------Программа Инвитро здоровый плюс----------------------

    @FindBy(xpath = "//a[contains(text(),'ПРОГРАММА «ИНВИТРО ЗДОРОВЫЙ ПЛЮС»')]")
    WebElement ProgrammaInvitroZdorPlus;//Ссылка на ПРОГРАММА «ИНВИТРО ЗДОРОВЫЙ ПЛЮС»

    @FindBy(xpath = "//div[contains(text(),'Вы не являетесь участником программы \"ИНВИТРО Здоровый плюс\"')]")
    WebElement NotPL;//сообщение у основного пациента по ПЛ

    @FindBy(xpath = "//p[@class='select-drop__title'][contains(text(),'Тестовый Бонус5')]")//Медкарта Тестовый Бонус5
    WebElement BB5;

    @FindBy(xpath = "//p[@class='select-drop__title'][contains(text(),'Тестовый Бонус7')]")//Медкарта Тестовый Бонус5
    WebElement BB7;

    @FindBy(xpath = "//p[@class='select-drop__title'][text()='Тестовый Бонус10']")//Медкарта Тестовый Бонус10
    WebElement BB10;

    @FindBy(xpath = "//p[@class='select-drop__title'][text()='Тестовый Бонус10п']")//Медкарта Тестовый Бонус10п
    WebElement NewBB10p;

    @FindBy(xpath = "//p[@class='select-drop__title'][text()='Тестовый Бонус10с']")//Медкарта Тестовый Бонус10с
    WebElement New2BB10c;

    @FindBy(xpath = "//p[@class='select-drop__title'][text()='Тестовый Дисконт5']")//Медкарта Тестовый Дисконт5
    WebElement DK5;

    @FindBy(xpath = "//p[@class='select-drop__title'][text()='Тестовый Дисконт10']")//Медкарта Тестовый Дисконт10
    WebElement DK10;

    @FindBy(xpath = "//p[@class='select-drop__title'][text()='Тестовый Дисконт13']")//Медкарта Тестовый Дисконт13
    WebElement DK13;

    @FindBy(xpath = "//p[@class='select-drop__title'][text()='Тестовый Дисконт20']")//Медкарта Тестовый Дисконт20
    WebElement DK20;

    @FindBy(xpath = "//p[@class='select-drop__title'][text()='Тестовый Дисконт30']")//Медкарта Тестовый Дисконт30
    WebElement DK30;

    @FindBy(xpath = "//div[@class='lk-info-bar__title lk-info-bar__title--big']")//Информация о номинале ДК и ББ
    WebElement NominalDK;

    @FindBy(xpath = "//img[@class='discount_card_small']")//Изображение ДК
    WebElement ImageDK;


    public void enterAddNameField(){
        help.Click_Method(ProgrammaInvitroZdorPlus);
    }

    public void enterAddSecondnameField(){
        help.Check_Enabled_Element(NotPL);
    }



    public void enterAddPhoneField(){//Проверка отображения статуса участия медкарты пациента Тестовый Бонус5
        help.Click_Method(page1.ViborMedKart);
        help.Click_Method(BB5);
        help.Check_Enabled_Element(NominalDK);
    }

    public void enterAddBirthdayField(){//Проверка отображения статуса участия медкарты пациента Тестовый Бонус7
        help.Click_Method(page1.ViborMedKart);
        help.Click_Method(BB7);
        help.Check_Enabled_Element(NominalDK);
    }

    public void clickNHematologicalStudies(){//Проверка отображения статуса участия медкарты пациента Тестовый Бонус10
        help.Click_Method(page1.ViborMedKart);
        help.Click_Method(BB10);
        help.Check_Enabled_Element(NominalDK);
    }

    public void enterNewPacientEmailTField(){//Проверка отображения статуса участия медкарты пациента Тестовый Бонус10п
        help.Click_Method(page1.ViborMedKart);
        help.Click_Method(NewBB10p);
        help.Check_Enabled_Element(NominalDK);
    }

    public void clickNewPacientSaveButton(){//Проверка отображения статуса участия медкарты пациента Тестовый Бонус10с
        help.Click_Method(page1.ViborMedKart);
        help.Click_Method(New2BB10c);
        help.Check_Enabled_Element(NominalDK);
    }

    public void enterLoginField(){//Проверка отображения статуса участия медкарты пациента Тестовый Дисконт5
        help.Click_Method(page1.ViborMedKart);
        help.Click_Method(DK5);
        help.Check_Enabled_Element(NominalDK);
        help.Check_Enabled_Element(ImageDK);
    }

    public void enterPasswordField(){//Проверка отображения статуса участия медкарты пациента Тестовый Дисконт10
        help.Click_Method(page1.ViborMedKart);
        help.Click_Method(DK10);
        help.Check_Enabled_Element(NominalDK);
        help.Check_Enabled_Element(ImageDK);
    }

    public void clickNewOrderButton(){//Проверка отображения статуса участия медкарты пациента Тестовый Дисконт13
        help.Click_Method(page1.ViborMedKart);
        help.Click_Method(DK13);
        help.Check_Enabled_Element(NotPL);
    }

    public void clickAddFirstAnalysis(){//Проверка отображения статуса участия медкарты пациента Тестовый Дисконт20
        help.Click_Method(page1.ViborMedKart);
        help.Click_Method(DK20);
        help.Check_Enabled_Element(NominalDK);
        help.Check_Enabled_Element(ImageDK);
    }

    public void clickAddSecondClinicalBloodTest(){//Проверка отображения статуса участия медкарты пациента Тестовый Дисконт30
        help.Click_Method(page1.ViborMedKart);
        help.Click_Method(DK30);
        help.Check_Enabled_Element(NominalDK);
        help.Check_Enabled_Element(ImageDK);
    }


//------------------------- Проверка Настройки-------------------------

    @FindBy(xpath = "//a[contains(text(),'НАСТРОЙКИ')]")//Ссылка на настройки
    WebElement ButtonSceting;

    @FindBy(xpath = "//input[@id='name']")//Поле ввода Имени
    WebElement InputScetName;

    @FindBy(xpath = "//input[@id='email']")//Поле ввода Email
    WebElement InputScetEmail;

    @FindBy(xpath = "//input[@id='phone3']")//Поле ввода телефона
    WebElement InputScetTel;

    @FindBy(xpath = "//button[@class='btn-icon btn-icon--fill']")//Кнопка Сохранить
    WebElement ButtonScetSave;

//безопасность

    @FindBy(xpath = "//a[text()='Безопасность']")//Вкладка Безопасность
    WebElement ElementSecurity;

    @FindBy(xpath = "//input[@name='password']")//Поле ввода старого пароля QazWsxEdc
    WebElement OldPassword;

    @FindBy(xpath = "//input[@name='new_password']")//Поле ввода нового пароля QazWsxEdc
    WebElement NewPassword;

    @FindBy(xpath = "//input[@name='new_password_confirm']")////Поле ввода повторения нового пароля QazWsxEdc
    WebElement New2Password;

    @FindBy(xpath = "//button[text()='Сохранить']")//Кнопка сохранить в Безопасности
    WebElement ButtonSecurSave;

    @FindBy(xpath = "//h3[text()='Пароль успешно изменён']")//Сообщение об успешном смени пароля
    WebElement PasswordPas;

    @FindBy(xpath = "//button[@title='Close (Esc)']")//Кнопа закрытия сообщения
    WebElement ButtonClose;

    @FindBy(xpath = "//div[@class='lk-double-autorized lk-setting__box']")//Блок Защита с помощью мобильного телефона
    WebElement BlockSecur;

    @FindBy(xpath = "(//span[@class='form__pass-visible'])[5]")//Кнопка просмотра нового пароля
    WebElement GlazPassword;

    //История посещений

    @FindBy(xpath = "//a[text()='История посещения']")//Вкладка История посещения
    WebElement ElementHistory;

    @FindBy(xpath = "//div[@class='lk-setting__history analysis-table analysis-table--no-padding-left a']")//Таблица Истории посещений
    WebElement TableHistory;


    public void clickAddThirdClinicalBloodTest(){
        help.Click_Method(ButtonSceting);
    }

    public void clickAddFourthClinicalBloodTest(){
        help.Check_Enabled_Element(InputScetName);
        help.Check_Enabled_Element(InputScetEmail);
        help.Check_Enabled_Element(InputScetTel);
        help.Check_Enabled_Element(ButtonScetSave);
    }

    public void clickGoToBasketButton(){
        help.Click_Method(ElementSecurity);
        help.Check_Enabled_Element(BlockSecur);
        help.Enter_Text(OldPassword,"QazWsxEdc");
        help.Enter_Text(NewPassword,"QazWsxEdc");
        help.Click_Method(GlazPassword);
        help.Enter_Text(New2Password,"QazWsxEdc");
        help.Click_Method(ButtonSecurSave);
        help.Verify_Text(PasswordPas,"Пароль успешно изменён");
        help.Click_Method(ButtonClose);
    }

    public void verifyBasketText(){
        help.Click_Method(ElementHistory);
        help.Check_Enabled_Element(TableHistory);
    }

}