package ru.progwards.java1.lessons.bitsworld;

public class Binary {
    byte num;
       public Binary(byte num) {
        this.num = num;
    }
    public String toString() {
        String result = "";
        for (int i = 0; i<8; i++)
            result = ((((1<<i) & num) == 0) ? "0" : "1")+ result;
return result;

    }
    public static void main(String[] args) {
Binary abc = new Binary((byte) 15);
        System.out.println(abc.num);
        System.out.println(new Binary((byte) 45).toString());
            }
}
