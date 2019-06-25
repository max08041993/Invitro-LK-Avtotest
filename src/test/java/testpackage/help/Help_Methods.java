
package testpackage.help;

import jnr.ffi.Struct;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class Help_Methods extends PageObject {

    private static final Help_Methods INSTANCE = new Help_Methods();

    /*
    Данный класс позволит заново не переписывать все методы, а вызывать их отсюда,
    достаточно подставить переменную xPath, которую мы объявляем в классах Page.
    Для того, чтобы было возможно обращаться к методам из этого класса в других,
    внутри нужного нам класса необходимо прописать следующую конструкцию:
    private static final Help_Methods help = Help_Methods.getInstance();
    Где help - является переменной, которую можно назвать как угодно,
    она будет распространятся только внутри класса, в котором написана
    и для вызова метода необходимо внутри созданного метода прописать следущее:
    public void Verify_Address_Button (){
        help.Check_Visible_Element(Address_Page);}
    В примере выше, мы создаем метод в классе, обращаемся к help,
    который подтягивает методы из класса Help_Methods.class, через точку выбираем нужный метод
    например Check_Visible_Element, для того, чтобы кликнуть по элементу.
    В скобках вызванного метода вставить перменную содержащую xPath, например Address_Page,
    которой соответсвует запись:
    private By Address_Page = By.xpath("//a[text()='Адреса']");
    Так как java достаточно умный язык, он будет показывать допустимые методы при написании тестов
     */

    private Help_Methods() {
    }

    public static Help_Methods getInstance() {
        return INSTANCE;
    }

    /*
    Чтобы описать унифицированный метод, необходимо в него добавить переменную, как указано на примере ниже:
        public void Click_Method(By test) { //Метод клика по элементу
        find(test).waitUntilClickable().click();}
    Так как язык java является строго наследуемым, необходимо точно укзывать тип переменной,
    которую мы будем передавать в метод.
    - By - переменная типа xPath
    - String - строковое значение, содержащее текст
    и так далее
    Тип переменной указывается после наименования метода, например Click_Method, в круглых скобках (By test), где:
    By - тип передаваемой переменной
    test - имя переменной
    Переменная указывается внутри необходимого метода, например find(test).
    Наименование перменных можно указвыать одинаковым для нескольких методов, например:
        public void Click_Method(By test) { //Метод клика по элементу
        find(test).waitUntilClickable().click();}
        public void Check_Visible_Element(By test) {
        Assertions.assertThat(find(test).isVisible());}
     Как видно из приведенных выше примеров, в каждом методе есть перменная test,
     но так как они реализованы в разных методах, то программа/автотесты, воспринимает их как уникальные.
    */


    public void Click_Method(By test) { //Метод клика по элементу
        find(test).waitUntilClickable().click();
    }

    public void Click_Method(WebElement test) { //Метод клика по элементу
        WebDriverWait longWait = new WebDriverWait(this.getDriver(), 20);
        WebElement webElement = longWait.until(ExpectedConditions.elementToBeClickable(test));
        elementHighlight(webElement);
        element(webElement).waitUntilVisible().waitUntilClickable().click();
        getSlow();

    }

    //public void Random_RUS_Text(By test, String test1) {find(test).toString();}

    public void Check_Enabled_Element(By test) {
        Assertions.assertThat(find(test).isEnabled());
    }

    public void Check_Enabled_Element(WebElement test) {
        WebDriverWait longWait = new WebDriverWait(this.getDriver(), 20);
        WebElement webElement = longWait.until(ExpectedConditions.visibilityOf(test));
        elementHighlight(webElement);
        Assertions.assertThat(element(webElement).isEnabled());
    }


    /*
     public void Click_On_All_Elements(By Xpath_Massive, By Button_Click, By Check_City, String Check_Text, By City, By Another, By Moscow) {//, By test2
         List<WebElementFacade> massive = findAll(Xpath_Massive);
         for (int i = 0; i <massive.size()-1; i++) {
             massive = findAll(Xpath_Massive);
             massive.get(i).waitUntilVisible();
             massive.get(i).click();
             Click_Method(Button_Click);
         if (Assertions.assertThat(find(Check_City).getText()).isEqualTo(Check_Text)){
             Change_City(City, Another, Moscow);
             Click_Method(Button_Click);
         }
         }
     }
      */
    public void Verify_Text(By test, String test1) {
        Assertions.assertThat(find(test).getText()).isEqualTo(test1);
    } //""

    public void Verify_Text(WebElement test, String test1) {
        WebDriverWait longWait = new WebDriverWait(this.getDriver(), 20);
        WebElement webElement = longWait.until(ExpectedConditions.visibilityOf(test));
        elementHighlight(webElement);
        Assertions.assertThat(test.getText()).isEqualTo(test1);
    }

    public void Check_Visible_Element(By test) {

        Assertions.assertThat(find(test).isVisible());
    }

    public void Check_Visible_Element(WebElement test) {
        scrollTo(test);
        WebDriverWait longWait = new WebDriverWait(this.getDriver(), 20);
        WebElement webElement = longWait.until(ExpectedConditions.visibilityOf(test));
        elementHighlight(webElement);
        Assertions.assertThat(element(webElement).isVisible());
    }

    public boolean Visibility_Of(WebElement test) {
        WebDriverWait longWait = new WebDriverWait(this.getDriver(), 20);
        WebElement webElement = longWait.until(ExpectedConditions.visibilityOf(test));
        elementHighlight(webElement);
        return element(webElement).isVisible();
    }

    public void Enter_Text(By test, String test1) {
        find(test).sendKeys(test1);
    }

    public void Enter_Text(WebElement test, String test1) {
        WebDriverWait longWait = new WebDriverWait(this.getDriver(), 20);
        WebElement webElement = longWait.until(ExpectedConditions.visibilityOf(test));
        elementHighlight(webElement);
        webElement.sendKeys(test1);
    }

    public String Get_Text(WebElement test) {
        WebDriverWait longWait = new WebDriverWait(this.getDriver(), 20);
        WebElement webElement = longWait.until(ExpectedConditions.visibilityOf(test));
        elementHighlight(webElement);
        return webElement.getText();
    }

    public void Returne_to_Prv_Page(By test) {
        String Returne = Keys.chord(Keys.LEFT_ALT, Keys.ARROW_LEFT);
        find(test).sendKeys(Returne);
    }

    public void Returne_to_Prv_Page(WebElement test) {
        String Returne = Keys.chord(Keys.LEFT_ALT, Keys.ARROW_LEFT);
        WebDriverWait longWait = new WebDriverWait(this.getDriver(), 20);
        WebElement webElement = longWait.until(ExpectedConditions.visibilityOf(test));
        elementHighlight(webElement);
        webElement.sendKeys(Returne);
    }


    public void elementHighlight(WebElement test) { // Подсветка проверяемого элемента на скринах
        for (int i = 0; i < 10; i++) {
            JavascriptExecutor js = (JavascriptExecutor) this.getDriver();
            String bgcolor = test.getCssValue("backgroundColor");
            js.executeScript("arguments[0].style.backgroundColor = 'rgb(255,0,0)'", test);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
            }
            js.executeScript("arguments[0].style.backgroundColor = '" + bgcolor + "'", test);
        }
    }

    public void getSlow() {      // Притормаживает выполнение теста на 1 секунду
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void getSlow5() {      // Притормаживает выполнение теста на 1 секунду
        try {
            Thread.sleep(5000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void getSlow10() {      // Притормаживает выполнение теста на 1 секунду
        try {
            Thread.sleep(10000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void scrollTo(WebElement test) { // Скролл к блоку 'Найдено результатов'  
        WebElement webElement = element(test);
        ((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView();", webElement);
    }

    public void maximize() {      // развернуть окно
        getDriver().manage().window().maximize();


    }

    public void EnglishVersion(By EnRuVer) {
        Click_Method(EnRuVer);
    }

    public void Check_EN_RU_URL(String En_URL, By EnRuVer, String Ru_URL) {
        EnglishVersion(EnRuVer);
        boolean Check_EN = getDriver().getCurrentUrl().contains(En_URL);
        if (Check_EN) {
            System.out.println("Переход выполнен корректно на - " + getDriver().getCurrentUrl());
            assert (true) : "Переход выполнен корректно на - " + getDriver().getCurrentUrl();
            getSlow();
        } else {
            System.out.println("Переход не верен");
            assert (false) : "Переход был выполнен на - " + getDriver().getCurrentUrl() + ". А должен был быть выполнен на - " + "https://www.invitro.ru" + En_URL;
            getSlow();
        }
        EnglishVersion(EnRuVer);
        boolean Check_RU = getDriver().getCurrentUrl().contains(Ru_URL);
        if (Check_RU) {
            System.out.println("Переход выполнен корректно на - " + getDriver().getCurrentUrl());
            getSlow();
            assert (true) : "Переход выполнен корректно на - " + getDriver().getCurrentUrl();
            getSlow();
        } else {
            System.out.println("Переход не верен");
            getSlow();
            assert (false) : "Переход был выполнен на - " + getDriver().getCurrentUrl() + ". А должен был быть выполнен на - " + "https://www.invitro.ru" + Ru_URL;
            getSlow();
        }


    }
}