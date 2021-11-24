
Feature: LoginFail User

  Сценарий входа в приложение:
  Я захожу на https://dev.zveno.io
  Ввожу логин, пароль и нажимаю «Войти»
  Если введенные данные не валидны, то всплывает окно "Неверный логин или пароль, либо пользователь не зарегистрирван"


  Scenario: LoginFail User
    Then open "https://dev.zveno.io/login" url
    Then Input "Электронная почта" NoEmail
    Then Input "Пароль" NoPass
    Then click "Войти" button
    Then Content with "Неверный логин или пароль, либо пользователь не зарегистрирван" visible

