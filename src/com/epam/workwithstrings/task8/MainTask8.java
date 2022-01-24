package com.epam.workwithstrings.task8;

import java.util.Scanner;

public class MainTask8 {
    public static void main(String[] args) {
        String text = inputText();

        String[] words = text.split(" ");

        String maxLengthWord = findMaxLengthWord(words);

        System.out.println(maxLengthWord);
    }

    private static String inputText() {
        Scanner scanner = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder(scanner.nextLine());
        return stringBuilder.toString();
    }

    private static String findMaxLengthWord(String[] words) {
        String maxLengthWord = words[0];
        for (int i = 1; i < words.length; i++) {
            if (maxLengthWord.length() < words[i].length()) {
                maxLengthWord = words[i];
            }
        }
        return maxLengthWord;
    }
}
