class A {
    public void display() {
        System.out.println("inside a");
    }
}

class B extends A {
    public void display() {
        System.out.println("inside b");
    }
}

public class MethodOverRiding {
    public static void main(String[] args) {
        B b = new B();
        b.display();
    }
}
// overloading means method ,arg ,return same so its do conflicts so it follw of
// parent