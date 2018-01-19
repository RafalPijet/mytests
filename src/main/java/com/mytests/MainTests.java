package com.mytests;

import com.mytests.lambda.CounterNumbers;
import com.mytests.lambda.PreparingText;

public class MainTests {
    public static void main(String[] args) {
        CounterNumbers counterNumbers = new CounterNumbers();
        counterNumbers.process(75, 5, ((a, b) -> a + b));
        counterNumbers.process(458, 854, ((a, b) -> a - b));
        counterNumbers.process(4125, 445, ((a, b) -> a / b));
        counterNumbers.process(23, 89, ((a, b) -> a * b));
        System.out.println();
        PreparingText preparingText = new PreparingText();
        String answerText = preparingText.process("...NO DRUKUJEMY", text -> text + " !?! " + text.toLowerCase());
        System.out.println();
        System.out.println("----> " + answerText);
    }
}
