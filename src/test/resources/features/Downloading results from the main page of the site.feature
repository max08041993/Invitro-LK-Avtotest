Feature: Скачивание результатов с главной страницы сайта

  Scenario: Скачивание результатов с главной страницы сайта
    Given Открываю главную страницу сайта www.invitro.ru
    And Нажать Получить результаты анализов
    And Проверяю отображение попапа просмотра результатов
    And Ввожу Код ИНЗ 900003942 Дату рождения 04041986 и Фамилию Иванов
    And Нажать найти результаты
    And Проверяю отображение подсказки Найдены результаты 1 анализов.
    And Проверяю выбор способа получения результата
    And Проверяю наличие кнопки Повторить поиск
    And Скачиваю результат
    When Проверяю что файл загрузился
    And Закрыть попап
