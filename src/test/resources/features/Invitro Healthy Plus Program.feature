Feature:Программа Инвитро здоровый плюс

  Scenario: Программа Инвитро здоровый плюс
    Given Открываю главную страницу сайта www.invitro.ru
    When Проверяю что выбрана Москва и убраны все всплывающие окна
    And Кликнуть по кнопке Вход в кабинет пациента
    And Ввести логин inv.loyal.1@gmail.com и пароль QazWsxEdc для входа
    And Проверка Перехода в ЛК после нажатия Войти
    And Проверка Успешного входа и загрузки страницы с заказами
    And Переход в Программа Инвитро здоровый плюс
    And Проверка отображения статуса участия основного пациента
    And Кликнуть на выбор медкарты пациента Тестовый Бонус7
    And Проверка 1отображения статуса участия медкарты пациента Тестовый Бонус7
#    And Проверка 2отображения статуса участия медкарты пациента Тестовый Бонус5
#    And Проверка 3отображения статуса участия медкарты пациента Тестовый Бонус10
    And Проверка 4отображения статуса участия медкарты пациента Тестовый Бонус10п
    And Проверка 5отображения статуса участия медкарты пациента Тестовый Бонус10с
#    And Проверка 1отображения статуса участия медкарты пациента Тестовый Дисконт5
    And Проверка 2отображения статуса участия медкарты пациента Тестовый Дисконт10
    And Проверка 3отображения статуса участия медкарты пациента Тестовый Дисконт13
    And Проверка 4отображения статуса участия медкарты пациента Тестовый Дисконт20
    And Проверка 5отображения статуса участия медкарты пациента Тестовый Дисконт30