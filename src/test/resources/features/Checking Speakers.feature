Feature:Проверка Динамики

  Scenario: Проверка Динамики
    Given Открыть страницу по адресу www.invitro.ru
    Then Проверить что выбрана Москва кликнуть Да верно
    When Кликнуть по кнопке Вход в кабинет пациента
    And Ввести логин iivanov.iivan.iivanovich@mail.ru и пароль a4AxPF3b для входа
    Then Проверка Перехода в ЛК после нажатия Войти
    Then Проверка Успешного входа и загрузки страницы с заказами
    When Переход в Динамику и проверка отображение страницы
    Then Применение фильтра по периоду и Исследования
    And Проверка возможности скачать Динамику
    Then Проверка возможности отправки Динамики на email
    Then Проверка таблицы динамики результатов
    Then Проверить что Строится график при переходе на конкретное исследование