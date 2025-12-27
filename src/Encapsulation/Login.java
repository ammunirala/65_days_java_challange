package Encapsulation;
class Login {
    private String username;
    private String password;

    public void setData(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public boolean login(String user, String pass) {
        return username.equals(user) && password.equals(pass);
    }

    public static void main(String[] args) {
        Login l = new Login();
        l.setData("admin", "1234");

        if (l.login("admin", "1234")) {
            System.out.println("Login Successful");
        } else {
            System.out.println("Login Failed");
        }
    }
}
