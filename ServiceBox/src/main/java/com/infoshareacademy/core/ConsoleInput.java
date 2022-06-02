package com.infoshareacademy.core;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ConsoleInput {
    public static final String ROW_SEPARATOR = "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~";

    public static int getInt(String prompt, String errorMessage) {
        System.out.print(prompt);
        int input = 0;
        boolean isValid = false;

        // repeat until input is not valid
        while (!isValid) {
            try {
                Scanner scanner = new Scanner(System.in);
                input = scanner.nextInt();
                isValid = true;
            } catch (InputMismatchException e) {
                System.out.println(errorMessage);
                System.out.print(prompt);
            }
        }

        return input;
    }

    public static String getString(String prompt, String errorMessage) {
        System.out.print(prompt);
        String input = "";
        boolean isValid = false;

        // repeat until input is not valid
        while (!isValid) {
            try {
                Scanner scanner = new Scanner(System.in);
                input = scanner.nextLine();
                isValid = true;
            } catch (InputMismatchException e) {
                System.out.println(errorMessage);
                System.out.print(prompt);
            }
        }

        return input;
    }

    public static int getOptionFromRange(int min, int max) {
        int selectedOption = 0;
        boolean isValid = false;

        // repeat until input is not valid
        while (!isValid) {
            try {
                Scanner scanner = new Scanner(System.in);
                selectedOption = scanner.nextInt();

                // check if in range
                if (selectedOption >= min && selectedOption <= max) {
                    isValid = true;
                } else {
                    // out of range
                    System.out.print("Wybierz opcje z zakresu " + min + "-" + max + ": ");
                }
            } catch (InputMismatchException e) {
                System.out.print("Niepoprawa wartosc, sprobuj ponownie:  ");
            }
        }

        return selectedOption;
    }

}

