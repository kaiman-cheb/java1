package ru.progwards.java1.lessons.arrays;

import java.util.Arrays;

public class Eratosthenes {
    private boolean[] sieve;
    int N;
    int p;
       public Eratosthenes(int N) {
        this.N = N;
//       }
    sieve = new boolean[N];
//       {
//        Arrays.fill(sieve, true);
        for (int k=0; k<(N); k++)
        {
            sieve[k] = true;
//            System.out.print(k);
        }
//           System.out.println(Arrays.toString(sieve));
           sift();
    }
    private void sift (){
        sieve[0] = false;
        sieve[1] = false;
       for (int i=2; i< sieve.length; i++)
        {
//            System.out.print(i + "-");
//            System.out.println(sieve[i]);
                for (int j=2; j<(sieve.length/i); j++) {
                    p = j * i;
                    sieve[p] = false;
                }
        }
//        System.out.println(N);
    }
        public boolean isSimple ( int n){
            System.out.print(n + "-");
        return sieve[n];
        }

        public static void main (String[]args){
            Eratosthenes re6eto = new Eratosthenes(14);
            System.out.println(Arrays.toString(re6eto.sieve));
            System.out.println(re6eto.isSimple(13));
        }
    }

