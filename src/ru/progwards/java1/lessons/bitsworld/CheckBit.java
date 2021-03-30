package ru.progwards.java1.lessons.bitsworld;

public class CheckBit {
    public static int checkBit(byte value, int bitNumber) {
        System.out.println(Integer.toBinaryString(value));
        int p = value;
        int sum = p & 0b00000000_00000000_00000000_00000001;
        System.out.println("Первое значение = " + sum);

        for (int i = 0; i<bitNumber; i++ ) {
            p >>= 1;
            sum = (p & 0b00000000_00000000_00000000_00000001);
            System.out.println(Integer.toBinaryString(p));
        }
        System.out.println(sum);
        return sum;
    }

    public static void main(String[] args) {
        checkBit((byte) 0b10010101,7);
    }
}
