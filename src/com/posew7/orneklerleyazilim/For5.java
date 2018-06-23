package com.posew7.orneklerleyazilim;

import java.util.Scanner;

public class For5 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("birinci sayıyı giriniz :");
        int a = input.nextInt();
        System.out.println("ikinci sayıyı giriniz :");
        int b = input.nextInt();

        int sonuc = 0;

        if (a < b) {
            for (int i = a + 1; i < b; i++) {
                sonuc = sonuc + i;

            }
            System.err.println("sonuc : " + sonuc);
        } else {
            for (int i = b + 1; i < a; i++) {
                sonuc = sonuc + i;

            }
            System.err.println("sonuc : " + sonuc);
        }

    }

}
