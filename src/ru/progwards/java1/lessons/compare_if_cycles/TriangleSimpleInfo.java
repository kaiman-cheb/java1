package ru.progwards.java1.lessons.compare_if_cycles;

public class TriangleSimpleInfo {
    public static int maxSide(int a, int b, int c){
       int lmax;
       if (a >= b && a >= c)
       lmax = a;
       else if (b >= a && b >= c)
           lmax = b;
       else lmax = c;
       System.out.println( "Максимальная длина стороны треугольника " + lmax );
       return lmax;
    }
    public static int minSide(int a, int b, int c){
        int lmin;
        if (a <= b && a <= c)
            lmin = a;
        else if (b <= a && b <= c)
            lmin = b;
        else lmin = c;
        System.out.println( "Минимальная длина стороны треугольника " + lmin );
        return lmin;
            }
    public static boolean isEquilateralTriangle(int a, int b, int c){
boolean result = a == b && b == c;
        System.out.println(result);
        return result;
    }
    public static void main(String[] args){
        maxSide(10, 10, 8);
        minSide(3, 3, 4);
        isEquilateralTriangle(2, 2, 3);
        isEquilateralTriangle(2, 3, 2);
        isEquilateralTriangle(3, 2, 2);
        isEquilateralTriangle(2, 2, 2);
        isEquilateralTriangle(3, 3, 3);
    }
}
