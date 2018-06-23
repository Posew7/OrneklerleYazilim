package com.posew7.orneklerleyazilim;

import java.util.Scanner;

public class For4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("faktöriyeli alınacak sayıyı giriniz");
        int a = input.nextInt();
        int sonuc = 1;

        for (int i = 2; i <= a; i++) {
            sonuc = sonuc * i;

        }
        System.out.println("sonuc :" + sonuc);
    }
}
