class Computer {
    // Method overloading: same method name, different parameters
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double add(double a, double b) {
        return a + b;
    }
}

public class PolyMorphism {
    public static void main(String[] args) {
        Computer c = new Computer();
        System.out.println("Sum of 2 ints: " + c.add(5, 3)); // Calls first method
        System.out.println("Sum of 3 ints: " + c.add(5, 3, 2)); // Calls second method
        System.out.println("Sum of 2 doubles: " + c.add(5.5, 3.5)); // Calls third method
    }
}
// polymorphism has 2 type :compile time (method overloading ) and run time
// (method riding)