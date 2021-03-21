package ru.progwards.java1.lessons.arrays;

import java.util.Arrays;

public class ArraySort {

    public static void sort(int[] a){
        System.out.println(Arrays.toString(a));
           for (int i=0; i<a.length; i++) {
           for (int j=i+1; j<a.length; j++) {
    if (a[i] > a[j]){
         int pi = a[i];
         int pj = a[j];
         a[i] = pj;
         a[j] = pi;
    }
}
}
            System.out.println();
        for (int value : a)
            System.out.println(value);
    }

    public static void main(String[] args) {
        int[] sormass =  {100,4,8,6,0,99,55};
sort(sormass);
    }
}