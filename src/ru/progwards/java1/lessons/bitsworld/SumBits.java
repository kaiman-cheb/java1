package ru.progwards.java1.lessons.bitsworld;

public class SumBits {
    public static int sumBits(byte value) {
        System.out.println(Integer.toBinaryString(value));
      int p = value;
        int sum = p & 0b00000000_00000000_00000000_00000001;
          System.out.println("Первое значение = " + sum);

          for (int i = 0; i<=6; i++ ) {
            p >>= 1;
            sum += (p & 0b00000000_00000000_00000000_00000001);
            System.out.println(Integer.toBinaryString(p));
            }
        System.out.println(sum);
        return sum;

    }
    public static void main(String[] args) {
sumBits((byte) 0b01010101);
    }
}
