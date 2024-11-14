class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }

    public void bark() {
        System.out.println("Dog-specific bark method");
    }
}

public class Casting {
    public static void main(String[] args) {
         // Upcasting
         Animal a = new Dog();  // Dog is upcast to Animal
         a.sound();  // Calls Dog's overridden method


        //  down casting
        a=new Dog();
        a.sound();

        Dog d = (Dog) a;  // Explicit downcast from Animal to Dog
        d.bark(); 
    }
}
// Upcasting: Implicit, safe, and allows superclass references to hold subclass objects.
// Downcasting: Explicit, needs type checking, and allows access to subclass-specific methods and fields.