package com.radomyr;

public class GameView {
    public static final String HIGHER_NUMBER_MESSAGE = "Number is bigger";
    public static final String LOWER_NUMBER_MESSAGE = "Number is smaller";
    public static final String INPUT_MESSAGE = "Input your integer number in range from ";
    public static final String OUT_OF_RANGE_MESSAGE = "Your number is out of range";
    public static final String CONTINUE_MESSAGE = "Try again";
    public static final String LIST_OF_ATTEMPTS_MESSAGE = "Your proposed";
    public static final String WIN_MESSAGE = "You are the winner! The number for guessing was: ";
    public static final String ATTEMPTS_MESSAGE = "To guess the number you tried such times: ";
    public static final String CHOOSE_THE_LANGUAGE_MESSAGE = "Please choose language (1 - eng, 2 - ukr):";
    public static final String TRY_AGAIN_LANG_MESSAGE = "You inputted something other that is needed, please try again";

    public void printMsg(String message) {
        System.out.println(message);
    }

}
