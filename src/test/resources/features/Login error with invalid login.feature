Feature:Ошибка входа с не верным логином

  Scenario:Ошибка входа с не верным логином
    Given Открыть страницу по адресу www.invitro.ru
    When Проверить что выбрана Москва кликнуть Да верно
    And Кликнуть по кнопке Вход в кабинет пациента
    And Ввести не верный логин
    And Закрыть попап