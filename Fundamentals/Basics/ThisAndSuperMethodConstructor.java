class A {
    public A() {
        super();
        System.out.println("in A");
    }

    public A(int a) {
        super();
        System.out.println("inside A");
    }
}

class B extends A {
    public B() {
        super(5);
        System.out.println("in B");
    }

    public B(int b) {
        this();
        System.out.println("inside B");
    }
    public void display(){
        System.out.println("anonymus method");
    }
}

public class ThisAndSuperMethodConstructor {
    public static void main(String[] args) {
        // B b = new B(6); // call A inA

        // new B(); // anonymus object
        new B().display(); // anonymus object
    }
}
// two type constructor method :this and super
// super means call that supper class and this means call this also
