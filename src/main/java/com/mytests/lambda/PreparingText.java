package com.mytests.lambda;

public class PreparingText {
    public String process(String text, ShowText showText) {
        String result = showText.takeText(text);
        System.out.println("Wyświetlany tekst --> " + result);
        return result;
    }
}
