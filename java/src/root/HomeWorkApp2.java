package root;

public class HomeWorkApp2 {
    public static void main(String[] args) {
        System.out.println(twoNumber(4, 9));
        oneNumber(-9);
        System.out.println(oneNumberBoolean(8));
        stringNumber("пирожок", 5);
        System.out.println(leap(304));

    }

    public static boolean twoNumber(int a, int b) {
        int c = a + b;
        return c >= 10 && c <= 20;
    }

    public static void oneNumber(int x) {
        if (x < 0)
            System.out.println("отрицательное");
        else
            System.out.println("положительное");
    }

    public static boolean oneNumberBoolean(int y) {
        return y < 0;
    }

    public static void stringNumber(String z, int k) {
        for (int i = 0; i < k; i++) {
            System.out.println(z);
        }
    }

    public static boolean leap(int e) {
        if (e % 400 == 0)
            return true;
        else if (e % 100 == 0)
            return false;
        else return e % 4 == 0;
    }


}

