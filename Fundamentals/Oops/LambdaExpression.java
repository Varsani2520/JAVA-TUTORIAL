// 0 parameter
interface MyInterface {
    void display();
}

// 1 parameter
interface print {
    void print(String message);

}

// 2 parameter
interface Calc {
    int add(int a, int b);
}

public class LambdaExpression {
    public static void main(String[] args) {
        MyInterface obj = () -> System.out.println("Hello");
        obj.display();

        print p = (message) -> System.out.println(message);
        p.print("hi  hloy");

        Calc c = (a, b) -> a + b;
        System.out.println("sum is :" + c.add(3, 5));
    }
}

// it is short block of code : syntax is (parameter)=>{body} but it is useful only 1 statement therefore dont need to use curly brace in body simply use this :  ()=>...