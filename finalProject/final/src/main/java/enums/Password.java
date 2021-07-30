package enums;

public enum Password {

    PASSWORD(423423423);

    private final int password;

    Password(int password) {
        this.password = password;
    }

    public static int getPassword(int password) {
        return password;
    }
}
