package com.nika;

import java.util.Scanner;

public class Main {

    private static char[] vowels = {'a', 'e', 'i', 'o', 'u', 'y'};

    public static void main(String[] args) {
        // Sort list or array by count of vowels in string (in ascending order) test

        int count = 0;
        System.out.print("Insert number of strings: ");

        Scanner scanner = new Scanner(System.in);
        count = Integer.valueOf(scanner.next());

        String[] list = new String[count];
        String temp;

        for (int i = 0; i < list.length ; i++) {
            System.out.print("Insert a string (in English): ");
            list[i] = scanner.next();
        }

        for (int i = list.length - 1; i >= 0; i--) {
            for (int x = 0; x < i; x++) {
                if (vowelCount(list[x]) > vowelCount(list[x + 1])) {
                    temp = String.valueOf(list[x]);
                    list[x] = String.valueOf(list[x + 1]);
                    list[x + 1] = String.valueOf(temp);
                }
            }
        }

        System.out.println("Sorted strings: ");
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);

        }
    }

    private static int vowelCount(String s) {
        int count = 0;
        for (int k = 0; k < vowels.length; k++) {
            for (int j = 0; j < s.length(); j++) {
                if (vowels[k] == s.charAt(j)) {
                    count++;
                }
            }
        }
        return count;
    }
}