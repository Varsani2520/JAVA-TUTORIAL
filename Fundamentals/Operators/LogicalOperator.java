public class LogicalOperator {
    public static void main(Strings[] args) {
        int a = 10;
        int b = 20;

        // boolean result=a<b; //return true or false

        // boolean result = a < b && b > a; //if both true then return ture otherwise
        // false
        // boolean result = a < b && b < a; //if both true then return ture otherwise
        // false
        boolean result = a > b || b < a; // if any one true then return ture otherwise false
        System.out.println(result);
        System.out.println(!result);
    }
}
