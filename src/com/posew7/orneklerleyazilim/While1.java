package com.posew7.orneklerleyazilim;

public class While1 {

    public static void main(String[] args) {
        int i = 1;
        int toplam = 0;
        while (i <= 10) {
            System.out.print(i + " ");
            toplam = toplam + i;
            i++;
        }
        System.out.println();
        System.out.println(toplam);
    }

}
