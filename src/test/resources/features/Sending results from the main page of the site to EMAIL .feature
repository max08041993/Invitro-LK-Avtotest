Feature:Отправка результатов с главной страницы сайта на EMAIL

  Scenario: Отправка результатов с главной страницы сайта на EMAIL
    Given Открываю главную страницу сайта www.invitro.ru
    And Нажать Получить результаты анализов
    And Проверяю отображение попапа просмотра результатов
    And Ввожу Код ИНЗ 900003942 Дату рождения 04041986 и Фамилию Иванов
    And Нажать найти результаты
    And Проверяю отображение подсказки Найдены результаты 1 анализов.
    And Проверяю выбор способа получения результата
    And Выбор отправки результата по Email
    And Ввод Email mkozlov@invitro.ru для отправки результата
    And Нажать кнопку Отправить результат
    And Проверяю отображение подсказки Документ отправлен на указанный E-mail.
    And Закрыть попап