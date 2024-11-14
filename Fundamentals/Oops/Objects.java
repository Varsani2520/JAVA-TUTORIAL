
class calculator {

    public int add(int num1, int num2) {
        int r = num1 + num2;
        System.out.println(r);
        return r;
    }

    public int minus(int num1, int num2) {
        int result = num1 - num2;
        System.out.println(result);
        return result;
    }
}

public class Objects {
    public static void main(Strings[] args) {
        int a = 10;
        int b = 20;
        // calculator calc = new calculator(); 
        
        // calc.add(a, b);
        // calc.minus(a, b);


        // another method
       new calculator().add(a, b);

    }
}
// if you want to acess the method of class then make a object to acess 