package Inheritance;

class User {
    String username;
    String password;

    void setData(String u, String p) {
        username = u;
        password = p;
    }
}

class Login extends User {

    void login(String u, String p) {
        if (username.equals(u) && password.equals(p)) {
            System.out.println("Login Successful");
        } else {
            System.out.println("Login Failed");
        }
    }

    public static void main(String[] args) {
        Login l = new Login();
        l.setData("admin", "1234");   // inherited method
        l.login("admin", "1234");
    }
}
