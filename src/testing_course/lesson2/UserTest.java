package testing_course.lesson2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UserTest {

    /*В классе UserTest пропишите следующие тесты:
    -Создайте тест, который выполнит тестирование создания объекта User с передачей в него двух параметров.
    Такая функция лишь должна проверять устанавливаются ли данные при создании объекта;

    -Создайте аналогичный тест, который выполнит тестирование по созданию объекта без передачи в него параметров;

    -Создайте тест, который протестирует установлен ли корректный Email адрес в поле email в классе User.
    Некорректным будет считаться тот email, в котором нет знака @ или же знака точки.

    -Создайте тест, который определяет, равны ли login и email (Они не должны быть равны). */

    private static final String DEFAULT_LOGIN = "Skankhunt42";
    private static final String DEFAULT_EMAIL = "ya_russkiy1972@cringe.com";
    private User out = new User();

    @Test
    void shouldGetTwoFields() {
        out = new User(DEFAULT_LOGIN, DEFAULT_EMAIL);
        Assertions.assertNotNull(out);
        Assertions.assertEquals("Skankhunt42", out.getLogin());
        Assertions.assertEquals("ya_russkiy1972@cringe.com", out.getEmail());
    } // тест на корректную работу конструктора с передачей в него параметров двух полей

    @Test
    void shouldWorkWithEmptyFields() {
        out = new User();
        Assertions.assertNotNull(out);
    } // тест на создание объекта с пустым конструктором

    @Test
    void shouldHaveCorrectEmail() {
        String result = "ss@gmail.com";
        out = new User(DEFAULT_LOGIN, "ss@gmail.com");
        Assertions.assertTrue(result.contains("@")); //тут идея предлагает поставить conditions: true, полагаю, потому что создаю строку проверяемую уже с этими символами
        Assertions.assertTrue(result.contains("."));
        Assertions.assertEquals(result, out.getEmail());
    } //проверка на содержание собаки и точки в строке имейл

    @Test
    void fieldsShouldBeDifferent() {
        out = new User(DEFAULT_LOGIN, DEFAULT_EMAIL);
        Assertions.assertNotEquals(out.getLogin(), out.getEmail());
    } // проверка на то, что логин и почта не equals
}