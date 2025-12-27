package Polymorphism;

class Employees {
    void work() {
        System.out.println("Employees works");
    }
}

class Developer extends Employees {
    void work() {
        System.out.println("Developer writes code");
    }
}

class Tester extends Employees {
    void work() {
        System.out.println("Tester tests software");
    }
}

public class Main {
    public static void main(String[] args) {

        Employees e1 = new Developer();
        Employees e2 = new Tester();

        e1.work();
        e2.work();
    }
}
