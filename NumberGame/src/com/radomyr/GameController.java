package com.radomyr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;
import java.util.Locale;
import java.util.ResourceBundle;

public class GameController {
    private GameModel model;
    private GameView view;
    private ResourceBundle bundle;
    public GameController(GameModel model, GameView view) {
        this.model = model;
        this.view = view;
    }

    public void Game() throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        model.setRandomvalue();
        this.bundle = chooseLang();
        int inputNumber = 0;
        do {
            //this.bundle = chooseLang();
            view.printMsg(bundle.getString("INPUT_MESSAGE") + " " + model.getMinvalue() + " - " + model.getMaxvalue());
            try {
                inputNumber = Integer.parseInt(br.readLine());
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }

            try {
                if (checkValidRange(inputNumber)) {
                    if (model.checkMatching(inputNumber)) {
                        view.printMsg(bundle.getString("WIN_MESSAGE") + model.getRandomvalue());
                    } else {
                        checkNumber(inputNumber);
                        view.printMsg(bundle.getString("CONTINUE_MESSAGE"));
                    }
                    System.out.println(bundle.getString("LIST_OF_ATTEMPTS_MESSAGE") + model.getAttempts());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        } while (inputNumber != model.getRandomvalue());

        view.printMsg(bundle.getString("ATTEMPTS_MESSAGE") + model.getAttempts().size());

    }

    public boolean checkValidRange(int ourNumber) {
        if (ourNumber > model.getMinvalue() && ourNumber < model.getMaxvalue()) {
            return true;
        } else {
            System.out.println(bundle.getString("OUT_OF_RANGE_MESSAGE"));
            return false;
        }
    }

    public void checkNumber(int number) {
        if (number > model.getRandomvalue()) {
            view.printMsg(bundle.getString("LOWER_NUMBER_MESSAGE"));
        } else {
            view.printMsg(bundle.getString("HIGHER_NUMBER_MESSAGE"));
        }
    }
   public ResourceBundle chooseLang() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean marker = true;
        while (marker) {
            view.printMsg(view.CHOOSE_THE_LANGUAGE_MESSAGE);
            int chooseLangRes = Integer.parseInt(br.readLine());
            switch (chooseLangRes) {
                case 1: {
                    marker = false;
                    String language = "en";
                    String country = "EN";
                    Locale lang = new Locale(language,country);

                    bundle = ResourceBundle.getBundle("com.radomyr.resources", lang);
                    break;
                }
                case 2: {
                    //this.bundle = ResourceBundle.getBundle("resources_ua", new Locale("ua", "UA"));
                    marker = false;
                    String language = "ua";
                    String country = "UA";
                    Locale lang = new Locale(language,country);
                    bundle = ResourceBundle.getBundle("com.radomyr.resources", lang);
                    break;
                }
                default: {
                    view.printMsg(view.TRY_AGAIN_LANG_MESSAGE);
                }
            }
        }
        return bundle;
    }

}
