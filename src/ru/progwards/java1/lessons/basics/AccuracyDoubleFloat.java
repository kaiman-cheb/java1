package ru.progwards.java1.lessons.basics;

public class AccuracyDoubleFloat {


        public static double volumeBallDouble(double radius) {
            double PI = 3.14;
        double v = 4.0 / 3.0 * PI * radius * radius * radius;
            return v;
        }
        public static float volumeBallFloat ( float radius){
            float  PI = 3.14f;
            float v = 4.0f / 3.0f * PI * radius * radius * radius;
            return v;
        }
        public static double calculateAccuracy(double radius){
           double d = (volumeBallDouble(radius)) - (volumeBallFloat ( (float) radius));
           return d;
        }
        public static void main(String[] args) {
        System.out.println(volumeBallDouble(6371.2));
        System.out.println(volumeBallFloat ( 6371.2f));
        System.out.println(calculateAccuracy(6371.2));
    }
}
