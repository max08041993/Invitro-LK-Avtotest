package testpackage.steps;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.FindBy;
import testpackage.pages.PacientLKPage;

import java.util.List;

public class PacientLKSteps {
    PacientLKPage page;

    // шаги сценария создания мед карты

    private String urlPattern = "https://%s";


    @Given("^Открыть страницу по адресу (.*)$")
    public void open_page(String server) {
        String url = String.format(urlPattern,server);
        page.setDefaultBaseUrl(url);
        page.open();
    }

    @When("Проверить что выбрана Москва кликнуть Да верно")
    public void ClickYesMoskow(){
        page.ClickYesMoskow();
    }

    @When("Нажать Получить результаты анализов")
    public void clickResultat() {
        page.clickResultat();
    }

    @When ("Проверить отображения попапа просмотра результатов")
    public void visiblePopapResult() {
        page.visiblePopapResult();
    }

    @When ("Ввод Кода ИНЗ Дата рождения Фамилия")
    public void inputINZBornSurename() {
        page.inputINZBornSurename();
    }

    @When ("Нажать найти результаты")
    public void clickFindSubmit() {
        page.clickFindSubmit();
    }

    @When ("Проверка отображения подсказки Найдены результаты 1 анализов")
    public void visiblePodskazkaResult() {
        page.visiblePodskazkaResult();
    }

    @When ("Проверка выбора способа получения результата")
    public void visibleRadioEmailDownload() {
        page.visibleRadioEmailDownload();
    }

    @When("Повторить поиск")
    public void visiblePovtorPoisk(){
        page.visiblePovtorPoisk();
    }

    @When ("Нажать Скачать")
    public void clickButtonFind() {
        page.clickButtonFind();
    }

    @When("Закрыть попап")
    public void clickClose(){
        page.clickClose();
    }

    @When("Выбор отправки результата по Email")
    public void clickRadioEmailGet(){
        page.clickRadioEmailGet();
    }

    @When("Ввод Email для отправки результата")
    public void inputInputEmail(){
        page.inputInputEmail();
    }

    @When("Нажать кнопку Отправить результат")
    public void clickButtonSend(){
        page.clickButtonSend();
    }

    @When("Проверить сообщение об успешной отправке результата по Email")
    public void visiblePodskazkaSend(){
        page.visiblePodskazkaSend();
    }

    @When("Ввод неверных данных Кода ИНЗ Дата рождения Фамилия")
    public void inputFallINZBornSurename(){
        page.inputFallINZBornSurename();
    }

    @When("Проверка отображения подсказки об ошибке Ваши результаты анализов не найдены")
    public void visibleFallPodskazka(){
        page.visibleFallPodskazka();
    }

    //------------------------------------------------------------

    @When ("Кликнуть по кнопке Вход в кабинет пациента")
    public void clickButtonLogin() {
        page.clickButtonLogin();
    }

    @When("Ввести в поле логина email" )
    public void enterLoginFieldAuthorization() {
        page.enterLoginFieldAuthorization("inv.loyal.1@gmail.com");
    }

    @When("Ввести пароль в поле Авторизации" )
    public void enterPasswordFieldAuthorization() {
        page.enterPasswordFieldAuthorization("QazWsxEdc");
    }

    @When("Нажать Войти в Авторизации")
    public void clickButtonInput(){
        page.clickButtonInput();
    }

    @When("Проверка Перехода в ЛК после нажатия Войти")
    public void visibleTextLK(){
        page.visibleTextLK();
    }

    @When("Проверка Успешного входа и загрузки страницы с заказами")
    public void visibleZakaziAktiv(){
        page.visibleZakaziAktiv();
    }

    @When("Кликнуть на выбор медкарты пациента Тестовый Бонус7")
    public void clickChooseMedCart(){
        page.clickChooseMedCart();
    }

    @When("Переход в заказ с возможностью скачать результат")
    public void clickINZ904160861(){
        page.clickINZ904160861();
    }

    @When("Скачивание результата из ЛК")
    public void clickDownloadLK(){
        page.clickDownloadLK();
    }

    @When("Отправка результата на email из ЛК")
    public void clickFindOnEmailLK(){
        page.clickFindOnEmailLK("mkozlov@invitro.ru");
    }

    @When("Проверка успешного отображения таблицы с результатами")
    public void visibleTableResult(){
        page.visibleTableResult();
    }

    @When("Ввести не корректный Email")
    public void enterErrorLoginFieldAuthorization(){
        page.enterErrorLoginFieldAuthorization("inv.loyal.1@gmailcom","QazWsxEdc");
    }

    @When("Ввести не корректный Телефон")
    public void enterErrorTelLoginFieldAuthorization(){
        page.enterErrorTelLoginFieldAuthorization("+7987366427785","QazWsxEdc");
    }

    @When("Ввести не верный пароль")
    public void enterFallPasswordFieldAuthorization(){
        page.enterFallPasswordFieldAuthorization();
    }

    @When("Ввести не верный логин")
    public void enterFallLoginFieldAuthorization(){
        page.enterFallLoginFieldAuthorization();
    }

    @When ("Ввести телефон в поле Авторизации")
    public void enterLoginTelFieldAuthorization(){
        page.enterLoginTelFieldAuthorization();
    }

    @When("Ввести пароль пациента при входе по номеру телефона в поле Авторизации")
    public void enterPasswordTelFieldAuthorization(){
        page.enterPasswordTelFieldAuthorization();
    }

    @When("Кликнуть забыли пароль")
    public void clickZabilPassword(){
        page.clickZabilPassword();
    }

    @When("Ввести email и кликнуть Восстановить пароль")
    public void inputInputEmailOrTel(){
        page.inputInputEmailOrTel();
        page.clickButtonVostanovPasword();
    }

    @When("Ввести новый пароль 12345")
    public void inputNewPassword(){
        page.inputNewPassword();
    }

    @When("Нажать кнопку Восстановить пароль")
    public void clickButtonVostanovleniyaPasword(){
        page.clickButtonVostanovleniyaPasword();
    }

    @When("Проверить ссообщение Пароль успешно восстановлен!")
    public void visinleMessagePasword(){
        page.visinleMessagePasword();
    }



    // --------------------  Полная проверка страницы Заказы -----------------------

    @When("Проверка поиска по ИНЗ 904160861")
    public void SearchINZ904160861(){
        page.sendINZ904160861();//ввод ИНЗ 904160861
        page.sendSearch();//Кнопка поиска
        page.visibleINZ904160861();//Заголовок
        page.sendResetFiltr();//Сброс фильтра
    }

    @When("Проверка поиска по Артикилу 1515")
    public void Art1515(){
        page.sendArt1515();//ввод Артикула
        page.sendSearch();//Кнопка поиска
        page.visibleArt1515();//Состав 1515
        page.sendResetFiltr();//Сброс фильтра
    }

    @When("Проверка работы фильтров")
    public void VorkingFiltr(){
        page.PeriodOne();//Выбрать Полгода и проверить отоборажение
        page.PeriodSecond();//Выбрать Квартал и проверить отоборажение
        page.PeriodThird();//Выбрать Месяц и проверить отоборажение
        page.PeriodAll();//Выбрать Все и проверить отоборажение

        page.StatusdOne();//Выбрать Черновик заказа и проверить отображение
        page.StatusSecond();//Выбрать Выполненый заказ (с результатами) заказа и проверить отображение
        page.StatusThird();//Выбрать Сформированный заказ и проверить отображение
        page.StatusFourth();//Выбрать Результаты без заказа и проверить отображение
        page.StatusAll();//Выбрать Все и проверить отображение
    }

    @When("Найти заказ LK000432080 и переимовать его в Автотест и Обратно")
    public void SendLK000432080(){
        //Найти заказ LK000432080 Нажать карандаш двойной клик на этом поле, переименовать его в Автотест и нажать галочку
        //Провалиться в него
        //Заказ от 18.06.2019 №LK000432080
        //Нажать Назад к списку
        //Найти заказ Автотест Нажать карандаш двойной клик на этом поле, переименовать его в LK000432080 и нажать галочку
        //Проверить что название LK000432080
    }

    @When("Оповещение о переходе на старый ЛК")
    public void OldLK(){
        //Нажать колокольчик и показать всё
        //Нажать на перейти в старую версию ЛК проверить отображение страницы старого ЛК
    }


}