package root;

public class HomeWorkApp3 {
    public static void main(String[] args) {
        zero2One();
        hundred();
        three();
        fo();
        five(4, 3);
        six();
        System.out.println(seven(new int[]{1, 8, 9, 2}));
        int[] result = eight(new int[]{1,2,3,4,5}, -11); // + влево; - вправо
        for(int i = 0; i < result.length; i++) {
            System.out.print(" " + result[i]);
        }
    }

    public static void zero2One() {
        int[] array = {0, 1, 0, 1, 1, 1, 0, 1, 0, 0, 1};
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else if (array[i] == 1) {
                array[i] = 0;
            }
            System.out.println(array[i]);
        }
    }

    public static void hundred() {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {

            array[i] = (i + 1);
            System.out.println(array[i]);

        }


    }

    public static void three() {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] = array[i] * 2;
                System.out.println(array[i]);
            }
        }
    }

    public static void fo() {
        int[][] array = new int[8][8];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i == j || i + j == array.length - 1) {
                    array[i][j] = 1;

                }

                System.out.print(array[i][j]);
            }
            System.out.println();
        }

    }

    public static void five(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
            System.out.println(array[i]);
        }
    }

    public static void six() {
        int[] array = {6, 9, 775, 9478, 67, 9, 644, 7466, 85};
        int min = 1000;
        int max = -1000;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println(max + " максимальное");
        System.out.println(min + " минимальное");

    }

    public static boolean seven(int[] begemotik) {
        int sumLeft = 0;
        for (int i = 0; i < begemotik.length; i++) {
            sumLeft = sumLeft + begemotik[i];
            int sumRight = 0;
            for (int j = i + 1; j < begemotik.length; j++) {
                sumRight = sumRight + begemotik[j];
            }
            if (sumLeft == sumRight) {
                return true;
            }
        }
        return false;
    }

    public static int[] eight(int[] homychok, int n) {
        while (n < 0) {
            n = homychok.length + n;
        }
        for(int j = 0; j < n; j++) {
            int zeroElem = homychok[0];
            for (int i = 0; i < homychok.length; i++) {
                int s = (i + 1) % homychok.length;
                if (s < 0) {
                    s = homychok.length + s;
                }
                if (s == 0) {
                    homychok[i] = zeroElem;
                } else {
                    homychok[i] = homychok[s];
                }
            }
        }
        return homychok;
    }
}


