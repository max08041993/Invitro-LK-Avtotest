Feature:Медкарты

  Scenario: Медкарты
    Given Открыть страницу по адресу www.invitro.ru
    When Проверить что выбрана Москва кликнуть Да верно
    And Кликнуть по кнопке Вход в кабинет пациента
    And Ввести логин inv.loyal.1@gmail.com и пароль QazWsxEdc для входа
    And Проверка Перехода в ЛК после нажатия Войти
    And Проверка Успешного входа и загрузки страницы с заказами
    And Переход в Медкарты
    And Прверка успешного перехода и отображения Медкарт
    And Проверка отображения и функционала Автоматического добавления всех результатов
    And Проверка добавления новой Медкарты
#      And Проверка добавления результатов по ИНЗ в новой медкарте
    And Удаление новой медкарты
