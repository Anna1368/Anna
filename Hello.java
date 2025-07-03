package examples;


public class Hello {

    // Static method
    public static void sayHello() {
        System.out.println("Hello from static method!");
    }

    // Instance method
    public void sayHi() {
        System.out.println("Hi from instance method!");
    }

    public static void main(String[] args) {
        // Call static method using class name
        Hello.sayHello();

        // Create object to call instance method
        Hello obj = new Hello();
        obj.sayHi();
    }
}