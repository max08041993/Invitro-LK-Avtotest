Feature:Ошибка входа с не корректным Телефоном

  Scenario:Ошибка входа с не корректным Телефоном
    Given Открыть страницу по адресу www.invitro.ru
    When Проверить что выбрана Москва кликнуть Да верно
    And Кликнуть по кнопке Вход в кабинет пациента
    And Ввести не корректный Телефон
    And Закрыть попап