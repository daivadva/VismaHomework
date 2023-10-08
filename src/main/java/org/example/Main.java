package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the amount of numbers:");
        n = scanner.nextInt();
        int[] array = new int[10];
        System.out.println("Enter numbers:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Numbers are:");
        for (int i = 0; i < n; i++) {

            System.out.println(array[i]);

            if (array[i] != 0) {
                count++;
                continue;
            } else {
               break;
            }
        }
        System.out.println("Amount of numbers are: " + array.length);
        System.out.println("Full array:");
        for (int i = 0; i < n; i++) {
            System.out.println(array[i]);

        }
    }

}