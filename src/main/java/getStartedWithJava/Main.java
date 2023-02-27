package getStartedWithJava;

public class Main {
    public static void main(String[] args) {
        // присвоение
        int a = 259;
        byte b = 64;

        int result = a + b;
        System.out.println("// математические операторы");
        System.out.println("a + b = " + result);
        result = a - b;
        System.out.println("a - b = " + result);
        result = a * b;
        System.out.println("a * b = " + result);
        result = a / b;
        System.out.println("a / b = " + result);
        result = a % b;
        System.out.println("a % b = " + result);

        System.out.println("++result = " + (++result));
        System.out.println("--result = " + (--result));

        System.out.println("// операторы сравнения");
        System.out.println("a > b = " + (a>b));
        System.out.println("a < b = " + (a<b));
        System.out.println("a == b = " + (a==b));
        System.out.println("a != b = " + (a!=b));

        System.out.println("a >= b = " + (a>=b));
        System.out.println("a <= b = " + (a<=b));
        System.out.println("a >= a = " + (a>=a));
        System.out.println("b <= b = " + (b<=b));

        System.out.println("// логические операторы");
        boolean f = false;
        boolean t = true;

        System.out.println("f && t = " + (f && t));
        System.out.println("f || t = " + (f || t));
        System.out.println("!t = " + (!t));

        System.out.println("// переполнение");
        System.out.println("(byte) (100*5) = " + ((byte) (100*5)));

        int i = 145;
        double d = 55.66;
        System.out.println("// int & double");
        System.out.println("i + d = " + (i+d));
        System.out.println("i - d = " + (i-d));
        System.out.println("i / d = " + (i/d));
        System.out.println("i % d = " + (i%d));
        System.out.println("i * d = " + (i*d));
     }
}