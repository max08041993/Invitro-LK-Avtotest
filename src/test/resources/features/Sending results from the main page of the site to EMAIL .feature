Feature:Отправка результатов с главной страницы сайта на EMAIL

  Scenario: Отправка результатов с главной страницы сайта на EMAIL
    Given Открыть страницу по адресу www.invitro.ru
    When Проверить что выбрана Москва кликнуть Да верно
    And Нажать Получить результаты анализов
    And Проверить отображения попапа просмотра результатов
    And Ввод Кода ИНЗ Дата рождения Фамилия
    And Нажать найти результаты
    And Проверка отображения подсказки Найдены результаты 1 анализов
    And Проверка выбора способа получения результата
    And Выбор отправки результата по Email
    And Ввод Email mkozlov@invitro.ru для отправки результата
    And Нажать кнопку Отправить результат
    And Проверить сообщение об успешной отправке результата по Email
    And Закрыть попап