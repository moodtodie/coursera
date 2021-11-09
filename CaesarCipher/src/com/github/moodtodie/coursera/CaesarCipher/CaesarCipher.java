package com.github.moodtodie.coursera.CaesarCipher;

public class CaesarCipher {

    private String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";


    public String encryptTwoKeys(String message, int key1, int key2){
        StringBuilder sb = new StringBuilder(message);
        int key = 0;

        for (int i = 0; i < message.length(); i++){
            char ch = sb.charAt(i);

            if (key2 != 0){
                key = ((i + 2) % 2 == 0) ? key1 : key2;
            } else
                key = key1;

            ch = encrypt(ch, key);

            sb = sb.deleteCharAt(i);
            sb = sb.insert(i,ch);
        }

        message = sb.toString();
        return message;
    }

    public char encrypt(char ch, int key) {
        String shiftAlphabet = alphabet.substring(key) + alphabet.substring(0,key);

        boolean returnLetter = false;

        if (Character.isLetter(ch) && Character.isLowerCase(ch)) {
            ch = changesCase(ch);
            returnLetter = true;
        }

        int number = alphabet.indexOf(ch);

        if (Character.isLetter(ch)) {

            ch = shiftAlphabet.charAt(number);

            if (returnLetter) {
                ch = changesCase(ch);
            }
        }

        return ch;
    }

    public char changesCase(char ch){
        if (Character.isUpperCase(ch)){
            ch = Character.toLowerCase(ch);
        } else if (Character.isLowerCase(ch)){
            ch = Character.toUpperCase(ch);
        }

        return ch;
    }
}