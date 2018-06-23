package com.posew7.orneklerleyazilim;

import java.util.Scanner;

public class While2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int a = 1;

        while (a != 0) {
            a = input.nextInt();
            if (a != 0) {
                System.err.println(a * a);
            } else {
                System.err.println("sıfır girdiniz");
            }
        }

    }

}
