package testpackage.steps;


import cucumber.api.java.en.When;
import testpackage.pages.PacientLK2Page;

public class PacientLK2Steps {
    PacientLK2Page page;


    @When("Переход в Медкарты" )
    public void сlickMedCart() {
        page.MedKarty();
    }

    @When("Прверка успешного перехода и отображения Медкарт" )
    public void сlickAddNewMedCartPacient() {
        page.clickAddNewMedCartPacient();
    }

    @When("Проверка отображения и функционала Автоматического добавления всех результатов" )
    public void visibleClosePopUpNewPacient() {
        page.visibleClosePopUpNewPacient();
    }

    @When("Проверка добавления новой Медкарты" )
    public void сlickChooseMalePacient() { page.clickChooseMalePacient(); }

//    @When("Проверка добавления результатов по ИНЗ в новой медкарте" )
//    public void сlickChooseFemalePacient() {
//        page.clickChooseFemalePacient();
//    }

    @When("Удаление новой медкарты" )
    public void enterAddSurnameField() {
        page.enterAddSurnameField();
    }

    @When("Переход в Программа Инвитро здоровый плюс" )
    public void enterAddNameField() {
        page.enterAddNameField();
    }

    @When("Проверка отображения статуса участия основного пациента" )
    public void enterAddSecondnameField() {
        page.enterAddSecondnameField();
    }

    @When("Проверка 1отображения статуса участия медкарты пациента Тестовый Бонус7" )
    public void enterAddBirthdayField() {
        page.enterAddBirthdayField();
    }

    @When("Проверка 2отображения статуса участия медкарты пациента Тестовый Бонус5" )
    public void enterAddPhoneField() {
        page.enterAddPhoneField();
    }
    @When("Проверка 3отображения статуса участия медкарты пациента Тестовый Бонус10" )
    public void сlickNHematologicalStudies() {
        page.clickNHematologicalStudies();
    }

    @When("Проверка 4отображения статуса участия медкарты пациента Тестовый Бонус10п" )
    public void enterNewPacientEmailTField() {
        page.enterNewPacientEmailTField();
    }

    @When("Проверка 5отображения статуса участия медкарты пациента Тестовый Бонус10с" )
    public void сlickNewPacientSaveButton() {
        page.clickNewPacientSaveButton();
    }


    @When("Проверка 1отображения статуса участия медкарты пациента Тестовый Дисконт5" )
    public void enterLoginField() {
        page.enterLoginField();
    }

    @When("Проверка 2отображения статуса участия медкарты пациента Тестовый Дисконт10" )
    public void enterPasswordField() { page.enterPasswordField(); }

    @When("Проверка 3отображения статуса участия медкарты пациента Тестовый Дисконт13" )
    public void сlickNewOrderButton() {
        page.clickNewOrderButton();
    }

    @When("Проверка 4отображения статуса участия медкарты пациента Тестовый Дисконт20" )
    public void сlickAddFirstAnalysis() {
        page.clickAddFirstAnalysis();
    }

    @When("Проверка 5отображения статуса участия медкарты пациента Тестовый Дисконт30" )
    public void сlickAddSecondClinicalBloodTest() {
        page.clickAddSecondClinicalBloodTest();
    }


    //--------------------Проверка Настройки---------------

    @When("Переход в Настройки" )
    public void сlickAddThirdClinicalBloodTest() {
        page.clickAddThirdClinicalBloodTest();
    }

    @When("Проверка Личных данных пациента" )
    public void сlickсlickAddFourthClinicalBloodTest() {
        page.clickAddFourthClinicalBloodTest();
    }

    @When("Переход в Безопасность и смена пароля" )
    public void сlickGoToBasketButton() {
        page.clickGoToBasketButton();
    }

    @When("Переход в Историю посещений и проверка таблицы" )
    public void verifyBasketText() {
        page.verifyBasketText();
    }

              // Проверка Динамики

    @When("Переход в Динамику и проверка отображение страницы" )
    public void checkOrderedAnalyzesInBasketBlock() { page.checkOrderedAnalyzesInBasketBlock(); }

    @When("Применение фильтра по периоду и Исследования" )
    public void verifyTotalText() {
        page.verifyTotalText();
        //page.verify2TotalText();
    }

    @When("Проверка возможности скачать Динамику" )
    public void clickChoosePacientOrderPage() { page.clickChoosePacientOrderPage(); }

    @When("Проверка возможности отправки Динамики на email" )
    public void сlickCheckoutOrderButton() { page.clickCheckoutOrderButton(); }

    @When("Проверка таблицы динамики результатов" )
    public void verifyCheckoutOrderText() { page.verifyCheckoutOrderText(); }

    @When("Проверить что Строится график при переходе на конкретное исследование" )
    public void verifyOrderListText() { page.verifyOrderListText(); }

}