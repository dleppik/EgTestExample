import com.vocalabs.egtest.annotation.Eg;

import java.util.Arrays;

public class EgExample {

    @Eg(given = {"2", "1"}, returns = "3")
    @Eg(given = {"-1", "Integer.MIN_VALUE"}, returns = "Integer.MAX_VALUE")
    public static int add(int a, int b) {
        return a + b;
    }

    @Eg(given = {"\"World\""}, returns = "\"Hello, World!\"")
    @Eg(given = {"\"Earth\""}, returns = "\"Hello, Earth!\"")
    public static String greet(String target) {
        return "Hello, " + target + "!";
    }

    @Eg(given = {"1.0", "2.0"}, returns = "0.5")
    @Eg(given = {"1.0", "3.0"}, returns = "0.33333", delta = 0.001)
    @Eg(given = {"1.0", "0.0"}, returns = "Double.POSITIVE_INFINITY")
    @Eg(given = {"0.0", "0.0"}, returns = "Double.NaN")
    public static double divide(double numerator, double divisor) {
        return numerator / divisor;
    }

    @Eg(given = {"5.0"}, returns = "5.0")
    @Eg(given = {"2.0", "3.0", "5.0"}, returns = "30.0")
    public static double multiply(double a, double... others) {
        return Arrays.stream(others).reduce(a, (b, c) -> b * c);
    }

    @Eg(given = {"7f", "5f"}, returns = "35f")
    @Eg(given = {"null", "5f"}, returns = "null")
    @Eg(given = {"1f", "(Float) null"}, returns = "null")
    public static Float multiply(Float a, Float b) {
        return (a == null || b == null) ? null : a * b;
    }


    @Eg(given = {"null", "5.0"}, returns = "null")
    @Eg(given = {"1.0", "(Double) null"}, returns = "null")
    public static Double multiply(Double a, Double b) {
        return (a == null || b == null) ? null : a * b;
    }


    @Eg(given = {"5"}, returns = "5")
    @Eg(given = {"2", "3", "5"}, returns = "30")
    public static int multiply(int a, int... others) {
        return Arrays.stream(others).reduce(a, (b, c) -> b * c);
    }

    // When testing a non-static method, the public default constructor is used
    private final int decrementStep;

    public EgExample() {
        this(1);
    }

    public EgExample(int decrementStep) {
        this.decrementStep = decrementStep;
    }

    @Eg(given = {"Integer.MIN_VALUE"}, returns = "Integer.MAX_VALUE")
    @Eg(given = {"1"}, returns = "0")
    public int decrement(int a) {
        return a - decrementStep;
    }

    @Eg(given = {"1"}, returns = "1")
    @Eg(given = {"5"}, returns = "120")
    @Eg(given = {"0"}, returns = "1")
    private static int factorialPrivate(int x) {
        int result = 1;
        if (x == 0) {
            return result;
        }
        for (int i = result; i <= x; i++) {
            result = result * i;
        }
        return result;
    }

    @Eg(given = {"3.0"}, returns = "6.0", delta = 0.0d)
    private static double doubleTheDouble(double x) {
        x *= 2;
        return x;
    }

    @Eg(given = {}, returns = "\"\"")
    public String whatShouldWeNameOurMethodIAmSoConfusedddddddWillThisWorkIHopeItDoesWaitYouWantItEvenLongerrrrrrrrrrrrrrrrrrrr() {
        return "";
    }

    @Eg(given = {"56"}, returns = "0")
    public int parameterName(int whatShouldWeNameOurParamterIAmSoConfusedddddddWillThisWorkIHopeItDoesWaitYouWantItEvenLongerrrrrrrrrrrrrrrrrrrr) {
        return 0;
    }

    @Eg(given = {"1", "2", "3", "4", "5", "1", "2", "3", "4", "5", "1", "2", "3", "4", "5", "1", "2", "3", "4", "5",
            "1", "2", "3", "4", "5", "1", "2", "3", "4", "5", "1", "2", "3", "4", "5", "1", "2", "3", "4", "5", "1", "2", "3", "4", "5", "1", "2", "3", "4", "5",
            "1"}, returns = "0")
    public int longParameterList(int a, int b, int c, int d, int e, int f, int g, int h, int i, int j, int k, int l,
                                 int m, int n, int o, int p, int q, int r, int s, int t, int u, int v, int w, int x,
                                 int y, int z, int aa, int bb, int cc, int dd, int ee, int ff, int gg, int hh, int ii,
                                 int jj, int kk, int ll, int mm, int oo, int pp, int qq, int rr, int ss, int tt, int uu,
                                 int vv, int ww, int xx, int yy, int zz) {
        return zz - a;
    }

    @Eg(given = {"1"}, returns = "(new int [] {1, 1, 1, 1})")
    public int[] checkIntArrays(int x) {
        int[] arr = new int[4];
        for (int i = 0; i < 4; i++) {
            arr[i] = x;
        }
        return arr;
    }

    @Eg(given = {"\"a\""}, returns = "new String [] {\"a\", \"a\", \"a\", \"a\"}")
    public String[] CheckStringArrays(String x) {
        String[] arr = new String[4];
        for (int i = 0; i < 4; i++) {
            arr[i] = x;
        }
        return arr;
    }
    /*
    @Eg
    public Integer CheckIntWrapper(int x){
        return new Integer(x);
    }*/

}






