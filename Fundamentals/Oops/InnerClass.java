
class Bird {
    public void fly() {
        System.out.println("Bird is flying");
    }

    // Inner class
    class Sparrow {
        public void red() {
            System.out.println("Sparrow is red in color");
        }
    }
}

public class InnerClass {
    public static void main(String[] args) {
        Bird obj = new Bird(); // instannce for outer class
        obj.fly();// call method of outer class

        Bird.Sparrow b = obj.new Sparrow(); // create a instance for inner class using outer class instance
        b.red(); // call method of inner class



        // annonymous inner class overriding method
        Bird bj = new Bird(){
            public void fly(){
                System.out.println("anonymous bird fly");
            }
        };

        bj.fly();

    }
}
// class inside class is called inner class