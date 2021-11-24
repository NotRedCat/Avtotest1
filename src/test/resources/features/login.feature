
Feature: Login User
  Сценарий входа в приложение:
  Я захожу на https://dev.zveno.io
  Ввожу логин, пароль и нажимаю «Войти»
  Если введенные данные валидны, то я попадаю в приложение
  Захожу в раздел «Техподдержка на https://dev.zveno.io/support»
  Создаю новое обращение
  Если введенные данные валидны, то создается обращение
  Если введенные данные не валидны, то кнопка «Сохранить» не активна


  Scenario: Login User
    Then open "https://dev.zveno.io/login" url
    Then Input "Электронная почта" Email
    Then Input "Пароль" Pass
    Then click "Войти" button
    Then Content with "Добро пожаловать, поддержка!" visible
    Then click support
    Then select "Общее" type
    Then input "Укажите вашу текущую компанию и Роль (в левом верхнем углу).Что вы хотели сделать?" text
    Then click "Сохранить" save
