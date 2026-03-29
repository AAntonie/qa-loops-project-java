package com.anaantonie.homework;

import java.util.Scanner;

public class UsernameValidator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean isValidUsername = false;
        String username = "";

        do {
            boolean hasDigit = false;
            boolean hasSpace = false;

            System.out.print("Introdu un username: ");
            username = scanner.nextLine();

            // verificăm caracterele
            for (int i = 0; i < username.length(); i++) {
                if (username.charAt(i) == ' ') {
                    hasSpace = true;
                    break; // nu mai are rost să continuăm for-ul
                }
                if (Character.isDigit(username.charAt(i))) {
                    hasDigit = true;
                }
            }

            // regula 1: spații
            if (hasSpace) {
                System.out.println("Username-ul nu poate contine spatii.");
                continue;
            }

            // regula 2: lungime
            if (username.length() < 6 || username.length() > 12) {
                System.out.println("Username-ul trebuie sa aiba intre 6 si 12 caractere.");
                continue;
            }

            // regula 3: cifră
            if (!hasDigit) {
                System.out.println("Username-ul trebuie sa contina cel putin un numar.");
                continue;
            }

            isValidUsername = true;

        } while (!isValidUsername);

        System.out.println("Username acceptat: " + username);
        scanner.close();
    }
}