Feature:Проверка Настройки

  Scenario: Проверка Настройки
    Given Открыть страницу по адресу www.invitro.ru
    When Проверить что выбрана Москва кликнуть Да верно
    When Кликнуть по кнопке Вход в кабинет пациента
    And Ввести логин iivanov.iivan.iivanovich@mail.ru и пароль a4AxPF3b для входа
    When Проверка Перехода в ЛК после нажатия Войти
    When Проверка Успешного входа и загрузки страницы с заказами
    When Переход в Настройки
    When Проверка Личных данных пациента
    When Переход в Историю посещений и проверка таблицы
    When Переход в Безопасность и смена пароля