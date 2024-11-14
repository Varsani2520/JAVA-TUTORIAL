class Addition {
    public int add(int n1, int n2) {

        int r = n1 + n2;
        System.out.println("sum of two number:" + r);
        return r;
    }

    public double add(double n1, double n2, double n3) {
        double r = n1 + n2 + n3;
        System.out.println("sum of three number" + r);
        return r;
    }
}

class MethodOverLoading {
    public static void main(Strings[] args) {
        int a = 10;
        int b = 10;
        int c = 10;

        Addition ad = new Addition();
        ad.add(b, c);
        ad.add(b, c, a);
    }
}

// methos overloading means method name same in same class but argument or return type different 