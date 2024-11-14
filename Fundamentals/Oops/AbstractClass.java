abstract class Computers {
    // define method with abstract and also class
    abstract public void mouse();

    public void keyboard() {
        System.out.println("inside A1");
    }
}

class Laptops extends Computers {
    public void mouse() {
        System.out.println("this is mouse");
    }
}

public class AbstractClass {
public static void main(String[] args) {
    Laptops obj=new Laptops();
    obj.mouse();
}
}
// abstract means only define the method with abstract keyword and class also
// define abstract and its compulsory to child call that method


// description:parent has idea only to computer has mouse but how to use and how toinvent no idea so for future forcast it define only method 

// so method and class has abstract

// and in child shoud extend that parent and also call the that method andsolve the issue .


// not compulsory to abstract class has only abstract method its allow to any type of method 