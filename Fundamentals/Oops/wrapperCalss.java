public class wrapperCalss {
    public static void main(String[] args) {
        // primitive to wrapper (autoboxing)
        int a = 10;
        Integer b = a; // store primitive (autoboxing)

        // wrapper to primitive (unboxing
        Integer c = 40;
        int d = c; // store wrapper (unboxing)

        // 3. Manually Boxing and Unboxing
        int primitiveManual = 15;
        Integer manualWrapper = Integer.valueOf(primitiveManual); // Manual Boxing
        int manualPrimitive = manualWrapper.intValue(); // mannual unboxing

        // 4. Using Wrapper Class Methods (parseInt and valueOf)
        String s = "100";
        int p = Integer.parseInt(s); // Convert string to primitive int
        Integer boxedInt = Integer.valueOf(s); // Convert string to Integer object

    }
}
