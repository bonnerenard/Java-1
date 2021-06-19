import java.util.Scanner;
import java.util.Random;

public class HomeWorkApp4 {

    public static char[][] map;
    public static int size = 5;
    public static int marksToWin = 4;
    public static final char DOT = '.';
    public static final char DOT_X = 'x';
    public static final char DOT_0 = '0';

    public static void main(String[] args) {
        initXO();
        printXO();
        while (true) {
            turmHM();
            printXO();
            turnIT();
            printXO();

        }

    }

    public static void initXO() {
        map = new char[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                map[i][j] = DOT;
            }
        }

    }

    public static void printXO() {
        for (int i = 0; i <= size; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 0; i < size; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < size; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void turmHM() {
        Scanner scanner = new Scanner(System.in);
        int x;
        int y;
        do {
            System.out.println("Введите координаты хода в формате Х У");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!check(x, y));
        map[x][y] = DOT_X;
        checkWin(DOT_X, x, y);
    }

    public static void turnIT() {
        Random random = new Random();

        int x;
        int y;
        do {
            x = random.nextInt(size);
            y = random.nextInt(size);
        } while (!check(x, y));
        System.out.println("Компьютер произвёл ход в точку " + (x + 1) + " " + (y + 1));
        map[x][y] = DOT_0;
        checkWin(DOT_0, x, y);
    }

    public static boolean check(int x, int y) {
        if (x < 0 || x > size || y < 0 || y > size) {
            return false;
        }
        if (map[x][y] == DOT) {
            return true;
        }
        return false;
    }

    public static void checkWin(char currentChar, int x, int y) {
        Scanner scanner = new Scanner(System.in);
        int sumi = x + y;
        int difi = x - y;
        int countRow = 0;
        int countCol = 0;
        int countDiag = 0;
        int countSubDiag = 0;
        for( int i=0; i< size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == x && countRow < marksToWin) {
                    if (map[i][j] == currentChar) {
                        countRow = countRow + 1;
                    } else {
                        countRow = 0;
                    }
                }
                if (j == y && countCol < marksToWin) {
                    if (map[i][j] == currentChar) {
                        countCol = countCol + 1;
                    } else {
                        countCol = 0;
                    }
                }
                if (i + j == sumi && countDiag < marksToWin) {
                    if (map[i][j] == currentChar) {
                        countDiag = countDiag + 1;
                    } else {
                        countDiag = 0;
                    }
                }
                if (i - j == difi && countSubDiag < marksToWin) {
                    if (map[i][j] == currentChar) {
                        countSubDiag = countSubDiag + 1;
                    } else {
                        countSubDiag = 0;
                    }
                }
                if (countRow == marksToWin || countCol == marksToWin || countDiag == marksToWin || countSubDiag == marksToWin) {
                    String answer;
                    printXO();
                    do {
                        System.out.println(currentChar + " Победили! Начать заново? (Да)");
                        answer = scanner.next();
                    } while (!answer.equals("Да"));
                    initXO();
                    printXO();
                    return;
                }
            }
        }
    }
}


