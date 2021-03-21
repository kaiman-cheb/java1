package ru.progwards.java1.lessons.arrays;

import java.util.Arrays;

public class DIntArray {
    private int [] a;
    public void add(int num)
    {
        if (a == null)
        {
            a = new int[1];
            a[0] = num;
            return;
        }
        int[] b = new int[a.length + 1];
        System.arraycopy(a, 0, b, 0, a.length);
        b[b.length - 1] = num;
        a = b;
    }

    public void atInsert(int pos, int num){

        int[] b = new int[a.length + 1];
        System.arraycopy(a, 0, b, 0, a.length);

        int p;
        for (int i=pos; i<a.length; i++) {
            p = a[i];
            b[i+1] = p;
        }
        b[pos] = num;
        a = b;
    }
    public void atDelete(int pos){

        int[] b = new int[a.length-1];
        int p;
        for (int i=pos; i<a.length-1; i++) {
            p = a[i+1];
            a[i] = p;
        }
        System.arraycopy(a, 0, b, 0, a.length-1);

        a = b;
    }
    public int at(int pos){
        return a[pos];
    }

    public static void main(String[] args) {
        DIntArray mass = new DIntArray();
        System.out.println(Arrays.toString(mass.a));
        mass.add(66);
        mass.add(33);
        mass.add(11);
        System.out.println(Arrays.toString(mass.a));
        mass.atInsert(2,19);
        System.out.println(Arrays.toString(mass.a));
        mass.atInsert(1,333);
        System.out.println(Arrays.toString(mass.a));
        mass.atInsert(0,1);
        System.out.println(Arrays.toString(mass.a));
        mass.atDelete(5);
        System.out.println(Arrays.toString(mass.a));
        mass.atDelete(2);
        System.out.println(Arrays.toString(mass.a));
        System.out.println(mass.at(0));

    }
}
