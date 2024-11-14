class Mobile {
    String name;
    int price;
    static String model; // Static variable shared across all instances

    // static block execuated when class loaded
    static {
        model = "Default Model";
        System.out.println("Static block executed: Model is set to " + model);
    }

    // static method
    static void display() {
        System.out.println("model is :" + model);
    }
}

public class StaticConcept {
    public static void main(String[] args) {

        Mobile ob = new Mobile();
        ob.model = "aplle";
        System.out.println(ob.model);

        // acess var without made a object
        Mobile.model = "Samsung";
        System.out.println(Mobile.model);

        // call static method without creating a constructor
        Mobile.display();

        // modify static var
        Mobile.model = "google";
        Mobile.display();

    }
}

// 1. Static Variable
// A static variable (also known as a class variable) is shared among all
// instances of a class. It’s declared using the static keyword and exists at
// the class level, meaning all objects of that class share the same copy of the
// variable.

// Characteristics of Static Variables:
// Memory is allocated only once, when the class is loaded.
// Shared by all objects of the class.
// Can be accessed directly using the class name (without creating an instance).
// The value of the static variable persists across different instances of the
// class.

// you can assesd without object ,u can easily acess using class name

// 2. Static Block
// A static block (also known as a static initializer block) is used to
// initialize static data members. This block is executed once when the class is
// loaded into memory, before any object is created, and even before the main()
// method is executed.

// Characteristics of Static Block:
// Can be used to initialize static variables.
// Executed only once, when the class is loaded.
// Runs before the main method or any static methods.
