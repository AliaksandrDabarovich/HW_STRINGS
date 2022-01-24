package com.epam.workwithstrings.task1;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class MainTask1 {
    private static final int NUMBER_OF_WORDS = 3;
    private static final int MIN = 1;
    private static final int MAX_WORD_LENGTH = 10;

    public static void main(String[] args) {
        String text = new StringBuilder(inputText()).toString();

        String newText = generateNewWords(text);

        System.out.println(newText);
    }

    private static String generateNewWords(String someText) {
        char[] chars = someText.replaceAll(" ", "").toCharArray();

        StringBuilder sentenceBuilder = new StringBuilder();
        for (int i = 1; i <= NUMBER_OF_WORDS; i++) {
            int randomWordLength = ThreadLocalRandom.current().nextInt(MIN, MAX_WORD_LENGTH + 1);
            StringBuilder wordBuilder = new StringBuilder();
            for (int j = 1; j < randomWordLength; j++) {
                int randomLetter = ThreadLocalRandom.current().nextInt(MIN, chars.length);
                wordBuilder.append(chars[randomLetter]);
            }
            sentenceBuilder.append(wordBuilder);
            sentenceBuilder.append(" ");
        }
        return sentenceBuilder.toString();
    }

    private static String inputText() {
        Scanner scanner = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder(scanner.nextLine());
        return stringBuilder.toString();
    }
}
