package com.edima.presentacion;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        int a =10;
        a=a+5;
        System.out.println(a);
        int b=10;
        b-=5;
        System.out.println(b);
        int c=10;
        System.out.println((c%3));
        //Pro-incremento y post-incremento
        int e=10;
        int f=5;
        e+=f++;
        System.out.println(e);
        System.out.println(f);

        int g=10;
        int h=5;
        g+=h--;
        System.out.println(g);
        System.out.println(h);
    }
}