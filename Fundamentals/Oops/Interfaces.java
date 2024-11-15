// Class extends Class
// Class implements Interface
// Interface extends Interface

// Define an interface A
interface I1 {
    int a = 10; // final and static by default in interfaces

    void show(); // Abstract method

    void config(); // Abstract method
}

// Another interface B
interface I2 {
    void run(); // Abstract method
}

// Define an interface C that extends interfaces A and B
interface I3 extends I1, I2 {
    void additionalMethod(); // Abstract method specific to C
}

// Define a base class P
class P {
    public void baseMethod() {
        System.out.println("inside base method of class P");
    }
}

// Implementing a class R that extends P and implements interface C
class R extends P implements I3 {
    // Provide implementation for 'show' method from interface A
    public void show() {
        System.out.println("inside show");
    }

    // Provide implementation for 'config' method from interface A
    public void config() {
        System.out.println("inside config");
    }

    // Provide implementation for 'run' method from interface B
    public void run() {
        System.out.println("inside run");
    }

    // Provide implementation for 'additionalMethod' from interface C
    public void additionalMethod() {
        System.out.println("inside additionalMethod");
    }
}

public class Interfaces {
    public static void main(String[] args) {
        R obj = new R(); // Create an object of class R

        // Call methods implemented from the interfaces
        obj.show();
        obj.config();
        obj.run();
        obj.additionalMethod();

        // Call the method from the base class
        obj.baseMethod();

        // Access the static final variable 'a' from the interface I1
        System.out.println("Accessing static final variable from interface: " + I1.a);

    }
}

// in interface define only method not body and it is act as a abstract
