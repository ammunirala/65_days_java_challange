package Inheritance;

class Employee {
    int salary = 30000;

    void work() {
        System.out.println("Employee works");
    }
}

class Developer extends Employee {
    int salary = 50000;

    void work() {
        System.out.println("Developer writes code");
        System.out.println("Base salary: " + super.salary);
        System.out.println("Dev salary: " + salary);
    }

    public static void main(String[] args) {
        Developer d = new Developer();
        d.work();
    }
}
