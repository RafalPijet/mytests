package com.mytests;

class StringChecker {

    public static void main(String[] arguments) {
        String str = "Lannister zawsze spłaca swoje długi.";
        System.out.println("Tekst to: " + str);
        System.out.println("Długość tego tekstu to: " + str.length());
        System.out.println("Znak na szóstej pozycji to: " + str.charAt(6));
        System.out.println("Fragment pomiędzy znakiem 9, a 19 to: " + str.substring(9, 19));
        System.out.println("Index pierwszej litery 't' to: " + str.indexOf('t'));
        System.out.println("Index początku podtekstu " + "\"długi\": " + str.indexOf("długi"));
        System.out.println("Tekst zapisany dużymi literami: " + str.toUpperCase());
    }
}