package ru.progwards.java1.lessons.basics;

public class ReverseDigits {
    public static int reverseDigits(int number){
        int i = (number / 10) % 10;
        int l = number / 100;
        int m = number % 10;
        int result = (m *100 + i *10 + l);
        System.out.print (result);
        return number;
    }
       public static void main(String[] args){
        reverseDigits(123);
    }

}
