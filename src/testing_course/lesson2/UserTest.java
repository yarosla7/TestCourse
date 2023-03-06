package testing_course.lesson2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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
        assertEquals("Skankhunt42", out.getLogin());
        assertEquals("ya_russkiy1972@cringe.com", out.getEmail());
    } // тест на корректную работу конструктора с передачей в него параметров двух полей

    @Test
    void shouldWorkWithEmptyFields() {
        out = new User();
        assertNull(out.getLogin());
        assertNull(out.getEmail());
    } // тест на создание объекта с пустым конструктором

    @Test
    void shouldHaveCorrectEmail() {
        User user = new User();
        user.setEmail(DEFAULT_EMAIL);
        assertEquals(DEFAULT_EMAIL, user.getEmail());
    } //проверка на содержание собаки и точки в строке имейл

    @Test
    void invalidEmailTest() {
        String check = "usersobakadotcom";
        assertThrows(IllegalArgumentException.class, () -> out.setEmail(check));
    } //проверка на исключение если email не корректный

    @Test
    void fieldsShouldBeDifferent() {
        assertThrows(IllegalArgumentException.class,
                () -> new User("login", "login"));
        assertThrows(IllegalArgumentException.class,
                () -> new User("email@gmail.com", "email@gmail.com"));
    } // проверка на то, что логин и почта не equals
}