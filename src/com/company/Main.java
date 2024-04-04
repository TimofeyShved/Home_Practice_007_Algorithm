package com.company;

public class Main {

    public static void main(String[] args) {

        //------------------------------------- 1 ---------------------------------

        int n = 1000000000;
        int massivDan[] = new int[n];
        for (int i = 0; i<n; i++){
            massivDan[i] = i;
        }

        int key = 33556759;

        long time = System.currentTimeMillis();
        System.out.println(binare(massivDan, key));
        System.out.println(System.currentTimeMillis() - time + " ms");

        time = System.currentTimeMillis();
        System.out.println(defaultSort(massivDan, key));
        System.out.println(System.currentTimeMillis() - time + " ms");



        //------------------------------------- 2 ---------------------------------
        int a, b, w, h;
        n = 11;
        a = 2;
        b = 3;
        w = 21;
        h = 25;

        int l = 0, r = Math.max(h,w);
        int m;

        while ((r - 1) > 1){
            m = (r + l) / 2;
            if (moduli(m, a, b, w, h) >= n){
                l = m;
            }else {
                r = m - 1;
            }
        }

        System.out.println(l);
    }

    static int binare(int massivDan[], int key){
        int l = -1, r = massivDan.length, m;
        while (r - l > 1){
            m = (r + l) / 2;
            if (massivDan[m]<key){
                l = m;
            }else{
                r = m;
            }
        }
        return r;
    }

    static int defaultSort(int massivDan[], int key){
        for (int i = 0; i<massivDan.length; i++){
            if (massivDan[i]==key){
                return massivDan[i];
            }
        }
        return -1;
    }

    static int moduli(int m, int a, int b, int W, int H){
        int ac = a + 2 * m;
        int bc = b + 2 * m;
        int x = Math.max((W/ac)*(H/bc), (W/bc)*(H/ac));
        return x;
    }
}
