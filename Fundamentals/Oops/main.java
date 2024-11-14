import Inheritance.SciCalc;

public class main {
    public static void main(String[] args) {
        SciCalc c = new SciCalc();
        int sum = c.Add(3, 5);
        int sub = c.sub(3, 5);
        int mul = c.mul(3, 5);
        int div = c.div(3, 5);
        int pow = c.Powers(3, 5);
        System.out.println("sum is :" + sum);
        System.out.println("minus is :" + sub);
        System.out.println("multy is :" + mul);
        System.out.println("division is :" + div);
        System.out.println("power is :" + pow);
    }
}
