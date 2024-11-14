// Class with final variable
class F1 {
    // final variable
    final double PI = 3.14;
    
    // Method to read/display the final variable
    public void displayPI() {
        System.out.println("Value of PI: " + PI);
    }
}

// final method
class F2{
    final public void M1(){
        System.out.println("final method");
    }

    // we never override method of final 
    //  public void M1(){
    //     System.out.println("final method");
    // }
}

// final class
final class F3{
    public void A(){
        System.out.println("in A");
    }
}
// err cant acess the subclass 
// class F4 extends F3{
//     public void A(){
//         System.out.println("in A");
//     }
// }


public class finalKeyword {
    public static void main(String[] args) {
        F1 obj = new F1();
        // obj.PI=4;  // err doens't modify value of pi
        obj.displayPI();

        F2 f=new F2();
        f.M1();

        F3 finalObj = new F3();
        finalObj.A();
    }
}

// final keyword has 3 type : variable,method and class
// final ver does not modify anyone and dont call directly without method so first create method 
// final method do not override anyone
// final class never extends any class