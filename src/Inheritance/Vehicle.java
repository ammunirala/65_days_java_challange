package Inheritance;
class Vehicle {
    protected String brand = "Ford"; // vehicle attribute
    public void honk(){ // vehicle method
        System.out.println("Tuut, tuut!");

    }
}
class Car extends Vehicle {
    private String modelName = "Mustang";  // car attribute
    public static void main(String[] args){

        // creating my car object
        Car myCar = new Car();

        //call honk() method
        myCar.honk();

        //Display
        System.out.println(myCar.brand + " " + myCar.modelName);
    }
}