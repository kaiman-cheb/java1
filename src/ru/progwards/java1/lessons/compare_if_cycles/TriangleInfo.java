package ru.progwards.java1.lessons.compare_if_cycles;

public class TriangleInfo {
    public static boolean isTriangle(int a, int b, int c){
        boolean result = (a+b)>c && (b+c)>a && (a+c)>b;
        System.out.println(result);
        return result;
    }
    public static boolean isRightTriangle(int a, int b, int c){
        boolean result = a*a + b*b == c*c || b*b + c*c == a*a || c*c + a*a == b*b;
        System.out.println(result);
        return result;
    }
    public static boolean isIsoscelesTriangle(int a, int b, int c){
        boolean result = a == c || b == a || c == b;
        System.out.println(result);
        return result;
    }
    public static void main(String[] args){
        isTriangle(3, 3, 3);
        isRightTriangle(4, 2, 3);
        isIsoscelesTriangle(3, 3, 9);
    }
}
