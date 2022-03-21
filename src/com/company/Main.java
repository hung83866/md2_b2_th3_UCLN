package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số a bất kì = ");
        int a = scanner.nextInt();
        System.out.println("nhập số b bất kì = ");
        int b = scanner.nextInt();
        if (a == 0) {
            if (b == 0) {
                System.out.println("không có UCLN");
            } else {
                System.out.println("UCLN = " + b);
            }
        } else {
            if (b == 0) {
                System.out.println("UCLN = " + a);
            } else {
                for (int i = a; i >= 2; i--) {
                    if (a % i == 0 && b % i == 0) {
                        System.out.println("UCLN = " + i);
                        break;
                    }
                }
            }
        }
    }
}

