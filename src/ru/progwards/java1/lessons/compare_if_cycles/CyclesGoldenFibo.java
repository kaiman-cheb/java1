package ru.progwards.java1.lessons.compare_if_cycles;

public class CyclesGoldenFibo {
    public static boolean containsDigit(int number, int digit) {
        int em;
        if (number == 0)
            if (digit == 0)
            System.out.println("true");
        while (number > 0) {
            em = number % 10;
            boolean result = (em == digit);
            number = number / 10;
            if (em == digit)
                System.out.println(result);
        }
        return false;
    }

    public static int fiboNumber(int n) {
        int n0 = 1;
        int n1 = 1;
        int n2 = 1;
        for (int i = 3; i <= n; i++) {
            n2 = n0 + n1;
            n0 = n1;
            n1 = n2;
        }
        System.out.println(n2);
        return n2;
    }

    public static boolean isGoldenTriangle(int a, int b, int c) {
        float z1;
        float z2;
        float z3;
        if (a > b)
            z1 = (float) a / b;
        else z1 = (float) b / a;
        if (c > a)
            z2 = (float) c / a;
        else z2 = (float) a / c;
        if (c > b)
            z3 = (float) c / b;
        else z3 = (float) b / c;
//        System.out.println(z1);
//        System.out.println(z2);
//        System.out.println(z3);
        boolean result = (a == c | b == a | c == b) & (1.61703 <= z1 & z1 <= 1.61903 | 1.61703 <= z2 & z2 <= 1.61903 | 1.61703 <= z3 & z3 <= 1.61903);
        System.out.println(result);
        return result;
    }

    public static void main(String[] args) {
        containsDigit(12345, 1);
        fiboNumber(3);
        isGoldenTriangle(34, 34, 55);
        {
            int n0 = 1;
            int n1 = 1;
            int n2;
            System.out.println(n0);
            System.out.println(n1);
            for (int i = 3; i <= 15; i++) {
                n2 = n0 + n1;
                System.out.println(n2);
                n0 = n1;
                n1 = n2;
                for (int j = 0; j < 1; j++) {
                    float zt;
                    zt = (float) n1 / n0;
                    if (1.61703 <= zt && zt <=1.61903 && n1<= 100)
                        System.out.println("Золотой треугольник " + zt + ", "+ n0 +", "+ n1);

                }

            }
        }
    }
}
