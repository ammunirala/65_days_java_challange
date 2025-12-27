package Encapsulation;

class first {
    private int age; // data hidden

    public void setAge(int age) {
        this.age = age;
    }
    public int getAge(){
        return age;

    }

     public static void main(String[] args) {
        first s = new first();
        s.setAge(24);
         System.out.println("Age: " + s.getAge());

    }

}
