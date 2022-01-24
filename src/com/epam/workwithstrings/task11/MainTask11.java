package com.epam.workwithstrings.task11;

import java.util.Scanner;

public class MainTask11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder(scanner.nextLine());
        String [] words = stringBuilder.toString().split(" ");

        System.out.println(words.length);
    }
}
