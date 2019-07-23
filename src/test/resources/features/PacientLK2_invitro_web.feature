Feature: Проверка ЛК2


    Scenario: Медкарты
      Given Открыть страницу по адресу www.invitro.ru
      When Проверить что выбрана Москва кликнуть Да верно
      And Кликнуть по кнопке Вход в кабинет пациента
      And Ввести в поле логина email
      And Ввести пароль в поле Авторизации
      And Нажать Войти в Авторизации
      And Проверка Перехода в ЛК после нажатия Войти
      And Проверка Успешного входа и загрузки страницы с заказами
      And Переход в Медкарты
      And Прверка успешного перехода и отображения Медкарт
      And Проверка отображения и функционала Автоматического добавления всех результатов
      And Проверка добавления новой Медкарты
#      And Проверка добавления результатов по ИНЗ в новой медкарте
      And Удаление новой медкарты

  Scenario: Программа Инвитро здоровый плюс
    Given Открыть страницу по адресу www.invitro.ru
    When Проверить что выбрана Москва кликнуть Да верно
    And Кликнуть по кнопке Вход в кабинет пациента
    And Ввести в поле логина email
    And Ввести пароль в поле Авторизации
    And Нажать Войти в Авторизации
    And Проверка Перехода в ЛК после нажатия Войти
    And Проверка Успешного входа и загрузки страницы с заказами
    And Переход в Программа Инвитро здоровый плюс
    And Проверка отображения статуса участия основного пациента
    And Кликнуть на выбор медкарты пациента Тестовый Бонус7
    And Проверка 1отображения статуса участия медкарты пациента Тестовый Бонус7
    And Проверка 2отображения статуса участия медкарты пациента Тестовый Бонус5
    And Проверка 3отображения статуса участия медкарты пациента Тестовый Бонус10
    And Проверка 4отображения статуса участия медкарты пациента Тестовый Бонус10п
    And Проверка 5отображения статуса участия медкарты пациента Тестовый Бонус10с
    And Проверка 1отображения статуса участия медкарты пациента Тестовый Дисконт5
    And Проверка 2отображения статуса участия медкарты пациента Тестовый Дисконт10
    And Проверка 3отображения статуса участия медкарты пациента Тестовый Дисконт13
    And Проверка 4отображения статуса участия медкарты пациента Тестовый Дисконт20
    And Проверка 5отображения статуса участия медкарты пациента Тестовый Дисконт30


#    Scenario: Оформление нового заказа для авторизованного пациента
#        Given Открыть главную страницу сайта
#        When Кликнуть по кнопке 'Вход в кабинет пациента'
#        And Проверка ввода логина в поле Авторизации
#        And Проверка ввода пароля в поле Авторизации
#        And Кликнуть по кнопке 'Войти'
#        And Кликнуть по учетной записи ЛК
#        And Кликнуть по кнопке Новый заказ
#        And Кликнуть развернуть раздел Гематологические исследования
#        And Пролистать страницу вниз
#        And Добавить в корзину Анализ 1
#        And Добавить в корзину Анализ 2
#        And Пролистать страницу вниз
#        And Добавить в корзину Анализ 3
#        And Добавить в корзину Анализ 4
#        And Осуществить переход на страницу Корзины
#        And Проверить текст Корзина
#        And Проверка блока 'Заказанные анализы' в корзине
#        And Проверить текст Итого:
#        And Проверить отображение Итоговой стоимости заказа
#        And Кликнуть по кнопке Оформить заказ
#        And Проверить текст Оформление заказа
#        And Проверить текст Состав заказа
#        And Проверка блока 'Заказанные анализы' на этапе оформления
#        And Проверить текст Личные данные
#        And Проверить отображение блока Добавленного пациента
#        And Проверить текст Оплата
#        And Проверить отображение радиобаттона в Медицинском офисе
#        And Проверить текст В медицинском офисе
#        And Кликнуть по чекбоксу Я даю свое согласие на обработку персональных данных
#        And Проверить блок советы по изменению заказа
#            | При необходимости заказ можно изменить после оформления двумя способами:                                                                  |
#            | 1) В личном кабинете, в разделе «Заказы».                                                                                                 |
#            | 2) Попросить администратора в медицинском офисе. Он сформирует новый заказ, который вам надо будет подтвердить своей подписью и оплатить. |
#            | Стоимость заказа рассчитывается согласно прайс-листу, действующему на момент изменения.                                                   |
#        And Проверить текст Итого страница Оформления заказа
#        And Проверить текст Итоговая стоимость страница Оформления заказа
#        And Кликнуть Подтвердить заказ
#        And Проверить текст Спасибо
#        And Проверить текст Благодарим Вас за доверие, оказанное нашей компании
#        And Проверить отображение Иконки скачать результат
#        And Проверить текст Заказ № на общую сумму успешно оформлен
#        And Кликнуть Скачать заказ
#        And Кликнуть по учетной записи ЛК
#
#
#    Scenario: Создание нового заказа без подтверждения для неавторизованного пациента
#        Given Открыть главную страницу сайта
#        When Перейти на анализы и цены
#        And Кликнуть развернуть раздел Гематологические исследования
#        And Пролистать страницу вниз
#        And Добавить в корзину Анализ 1
#        And Добавить в корзину Анализ 2
#        And Осуществить переход на страницу Корзины
#        And Кликнуть по кнопке Оформить заказ
#        And Проверка наличия блока Личные данные
#        And Нажатие на кнопку Войти в блоке Личные данные
#        And Проверка ввода логина
#        And Проверка ввода пароля
#        And Кликнуть по кнопке 'Войти'
#        And Проверить отображение блока Добавленного пациента
#        And Проверить отображение радиобаттона в Медицинском офисе
#        And Проверить текст В медицинском офисе
#        And Кликнуть по чекбоксу Я даю свое согласие на обработку персональных данных
#
#    Scenario: Создание нового заказа используя карточку пациента у которого уже есть оформленные заказы
#        Given Открыть главную страницу сайта
#        When Кликнуть по кнопке 'Вход в кабинет пациента'
#        And Проверка авторизации, ввод Логина
#        And Проверка авторизации, ввод Пароля
#        And Кликнуть по кнопке 'Войти'
#        And Кликнуть по учетной записи ЛК
#        And Проверка ввода номера заказа 'LK000445213' в поле ввода поиска заказа
#        And Кликнуть по кнопке поиска по номеру заказа
#        And Кликнуть по кнопке сброса фильтра
#        And Кликнуть по фильтру 'Показать за период'
#        And Кликнуть по фильтру 'Показать за период - Месяц'
#        And Кликнуть по кнопке сброса фильтра
#        And Кликнуть по фильтру 'Статус заказа'
#        And Кликнуть по фильтру 'Статус заказа - Черновик'
#        And Кликнуть по кнопке сброса фильтра
#        And Кликнуть выбрать мед карту
#        And Кликнуть по медкарте пациента 'Петров Петр Петрович'
#        And Проверка Фамилии 'Петров' выбранной мед карты
#        And Проверка Имени 'Петр' выбранной мед карты
#        And Проверка Отчества 'Петрович' выбранной мед карты
#        And Проверка текста 'Дата рождения: 13.12.1988 - 30 лет' выбранной мед карты
#        And Проверка отображения иконки блока лояльности
#        And Проверка текста 'Вы не являетесь участником программы ИНВИТРО Здоровый плюс'
#        And Проверка текста 'Узнать подробности о программе и способе вступления'
#        And Проверка отображения блока 'Помогите нам стать лучше'
#        And Проверка отображения иконки блока 'Помогите нам стать лучше'
#        And Проверка отображения кнопки 'Перейти' в блоке 'Помогите нам стать лучше'
#        And Кликнуть по кнопке 'Новый заказ' с медкарты пациента уже имеющего заказы
#        And Кликнуть развернуть раздел Гематологические исследования
#        And Пролистать страницу вниз
#        And Добавить в корзину Анализ 1
#        And Добавить в корзину Анализ 2
#        And Пролистать страницу вниз
#        And Добавить в корзину Анализ 3
#        And Добавить в корзину Анализ 4
#        And Осуществить переход на страницу Корзины
#        And Перейти в раздел Оформление заказа
#        And Кликнуть по радиобаттону пациента 'Петров Петр Петрович'
#        And Кликнуть по чекбоксу Я даю свое согласие на обработку персональных данных
#        And Кликнуть Подтвердить заказ
#        And Проверить текст Спасибо
#        And Проверить текст Благодарим Вас за доверие, оказанное нашей компании
#        And Проверить отображение Иконки скачать результат
#        And Проверить текст Заказ № на общую сумму успешно оформлен
#        And Кликнуть по учетной записи ЛК
#        And Кликнуть выбрать мед карту
#        And Кликнуть по медкарте пациента 'Петров Петр Петрович'
#        And Кликнуть по кнопке 'Добавить результат'
#        And Проверка отображения поля ввода '№ заказа - ИНЗ в чеке'
#        And Проверка отображения поля ввода 'Дата рождения'
#        And Проверка отображения поля ввода 'Фамилия пациента'
#        And Проверка отображения кнопки 'Добавить'
#        And Кликнуть по кнопке закрыть Pop-up
#        And Проверка отображения блока 'Вопросы и Ответы'