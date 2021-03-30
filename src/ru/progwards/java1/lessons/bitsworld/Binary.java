package ru.progwards.java1.lessons.bitsworld;

public class Binary {
    byte num;
       public Binary(byte num) {
        this.num = num;
    }

    public static String toString(int num) {
String result = "";
        System.out.println(result);
while (num>0){
    int rema = num%2;
    System.out.println(rema);
    result = Integer.toString(rema) + result;
    num /=2;
    System.out.println(result);
}
if (result.isEmpty())
    return "0";
        System.out.println(result);
return result;
        }

    public static void main(String[] args) {
Binary abc = new Binary((byte) 15);
        System.out.println(abc.num);
        toString(127);
    }
}
