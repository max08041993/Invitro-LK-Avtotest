Feature:Полная проверка страницы Заказы

  Scenario: Полная проверка страницы Заказы
    Given Открываю главную страницу сайта www.invitro.ru
    And Проверяю что выбрана Москва и убраны все всплывающие окна
    Then Кликнуть по кнопке Вход в кабинет пациента
    And Ввести логин inv.loyal.1@gmail.com и пароль QazWsxEdc для входа
    When Проверка Перехода в ЛК после нажатия Войти
    When Кликнуть на выбор медкарты пациента Тестовый Бонус7
    And Проверка поиска по ИНЗ LK001057389
    Then Проверить кнопки Повторить и Распечатать в списке
    And Найти заказ LK001057389 и переимовать его в Avtotest
    And Перейти в заказ LK001057389 и проверить что заголовок не изменился
    And Найти заказ Avtotest и переимовать его в LK001057389
    And Проверка поиска по Артикилу 1515
    And Проверка работы фильтров