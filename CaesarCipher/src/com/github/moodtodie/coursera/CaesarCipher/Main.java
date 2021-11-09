package com.github.moodtodie.coursera.CaesarCipher;

//  Assignment 2: Caesar Cipher

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        CaesarCipher caesarCipher = new CaesarCipher();
        Scanner in = new Scanner(System.in);
        String message = "";
        int key1 = 0, key2 = 0;

        //  input message and key
        System.out.println("    Caesar Cipher");
        System.out.println("  Enter message for encrypt:");
        message = in.nextLine();

        System.out.println("  Enter key1 for encrypt:");
        key1 = in.nextInt();
        System.out.println("  Enter key2 for encrypt (Enter '0' for one key encryption):");
        key2 = in.nextInt();

        message = caesarCipher.encryptTwoKeys(message, key1, key2);

        System.out.println("  Encrypted message:\n" + message);
    }
}
