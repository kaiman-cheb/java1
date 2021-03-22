package ru.progwards.java1.lessons.arrays;

import java.util.Arrays;

public class Eratosthenes {
    private boolean[] sieve;
    int N;
    int p;
       public Eratosthenes(int N)
    {
        this.N = N;
    sieve = new boolean[N];

        for (int k=0; k<(N); k++)
        {
            sieve[k] = true;
        }
           sift();
    }
    private void sift (){
        sieve[0] = false;
        sieve[1] = false;
       for (int i=2; i< sieve.length; i++)
        {

                for (int j=2; j<=(sieve.length/i); j++) {
                    p = j * i;
                    if ((p+1) <= sieve.length) {
                        sieve[p] = false;
                    }
                }
        }
//        System.out.println(N);
    }
        public boolean isSimple ( int n){
            System.out.print(n + "-");
        return sieve[n];
        }

        public static void main (String[]args){
            Eratosthenes re6eto = new Eratosthenes(300);
            System.out.println(Arrays.toString(re6eto.sieve));
            System.out.println(re6eto.isSimple(299));
        }
    }

