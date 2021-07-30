package enums;

public enum Email {

    YANDEXEMAIL("yandexmail@yandex.by"),
    GMAILEMEIL("gmailmail@gmail.com");

    private final String email;

    Email(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }
}
