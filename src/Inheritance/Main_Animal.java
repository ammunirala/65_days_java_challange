package Inheritance;

class Main_Animal {

    void sound() {
        System.out.println("Animal sound");
    }
}

class Dog2 extends Main_Animal {

    void sound() {
        super.sound();   // parent method
        System.out.println("Dog barks");
    }

    public static void main(String[] args) {
        Dog2 d = new Dog2();
        d.sound();
    }
}
