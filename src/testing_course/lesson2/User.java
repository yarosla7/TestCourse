package testing_course.lesson2;

public class User {

    private String login;
    private String email;

    public User() {
    }

    public User(String login, String email) {
        setLogin(login);
        setEmail(email);
        if (login.equals(email)) {
            throw new IllegalArgumentException("Логин и почта не должны быть одинаковы.");
        }
    }

    public String getLogin() {
        return login;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email == null || !email.contains("@") && !email.contains(".")) {
            throw new IllegalArgumentException("Invalid email address: " + email);
        }
        this.email = email;
    }

    public void setLogin(String login) {
        this.login = login;
    }
}