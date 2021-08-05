package com.codegym;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //  hinh chu nhat
        for (int i = 1; i < 4; i++) {
            System.out.println("");
            for (int j = 0; j <= 5; j++) {
                System.out.print(" * ");
            }
        }
        //  hinh tam giac vuong
        for (int i = 0; i <= 5; i++) {
            System.out.println("");
            for (int j = 0; j < i; j++) {
                System.out.print(" * ");
            }
        }
        System.out.println("");

        // hinh tam giac vuong dao nguoc

        for (int i = 0; i <= 5; i++) {
            System.out.println("");
            for (int j = 5; j > i; j--) {
                System.out.print(" * ");
            }
        }
        System.out.println("");
        //hinh tam giac can


        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5-i; j++) {
                System.out.print("  ");
            }
                for (int k = 1; k <= 2*i-1 ; k++) {
                    System.out.print("* ");
                }
            System.out.println("");
            }
        }

}
