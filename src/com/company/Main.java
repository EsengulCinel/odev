package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        while (true) {
            Scanner reader = new Scanner(System.in);
            System.out.print("1 ile 3 secim girin:");

            int secim = reader.nextInt();
            if (secim == 1) {
                System.out.print("Bir deger Girin:");
                int faktoriyelAlinacakDeger = reader.nextInt();
                System.out.println(faktoriyelAlinacakDeger+"!= "+faktoriyel(faktoriyelAlinacakDeger));
            }
            if (secim == 2) {
                System.out.print("Bir kelime Girin:");
                Scanner readerPL = new Scanner(System.in);
                String palindromAlinacakDeger = readerPL.nextLine();
                if(palindrom(palindromAlinacakDeger)==true)
                    System.out.println(palindromAlinacakDeger+" kelimesi palindrom");
                if(palindrom(palindromAlinacakDeger)==false)
                    System.out.println(palindromAlinacakDeger+" kelimesi palindrom degil");
            }
            if (secim == 3) {
                System.out.print("Bir deger Girin:");

                long fibonnaciAdimi = reader.nextLong();
                System.out.println(fibonnaciAdimi+".adiminin degeri:"+fibonacci(fibonnaciAdimi));
            }

        }
    }

    //faktoriyel
    public static int faktoriyel(int sayi) {
        if (sayi >= 1)
            return sayi * faktoriyel(sayi - 1);
        else
            return 1;
    }

    //palindrom
    public static boolean palindrom(String s) {
        if (s.length() == 0 || s.length() == 1)
            return true;
        if (s.charAt(0) == s.charAt(s.length() - 1))
            return palindrom(s.substring(1, s.length() - 1));
        return false;

    }

    //fibonacci
    public static long fibonacci(long n) {
        if ((n == 0) || (n == 1))
            return n;
        else
            return fibonacci(n - 1) + fibonacci(n - 2);
    }
}