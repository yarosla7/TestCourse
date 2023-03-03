package testing_course.lesson2;

public class User {

    private String login;
    private String email;

    public User() {
    }

    public User(String login, String email) {
        this.login = login;
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public String getEmail() {
        return email;
    }
}
