package com.radomyr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;

public class GameController {
    private GameModel model;
    private GameView view;

    public GameController(GameModel model, GameView view) {
        this.model = model;
        this.view = view;
    }

    public void Game() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        model.setRandomvalue();

        int inputNumber = 0;
        do {
            view.printMsg(view.INPUT_MESSAGE + model.getMinvalue() + " to " + model.getMaxvalue());
            try {
                inputNumber = Integer.parseInt(br.readLine());
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }

            try {
                if (checkValidRange(inputNumber)) {
                    if (model.checkMatching(inputNumber)) {
                        view.printMsg(view.WIN_MESSAGE + model.getRandomvalue());
                    } else {
                        checkNumber(inputNumber);
                        view.printMsg(view.CONTINUE_MESSAGE);
                    }
                    System.out.println(view.LIST_OF_ATTEMPTS_MESSAGE + model.getAttempts());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        } while (inputNumber != model.getRandomvalue());

        view.printMsg(view.ATTEMPTS_MESSAGE + model.getAttempts().size());

    }

    public boolean checkValidRange(int ourNumber) {
        if (ourNumber > model.getMinvalue() && ourNumber < model.getMaxvalue()) {
            return true;
        } else {
            System.out.println(view.OUT_OF_RANGE_MESSAGE);
            return false;
        }
    }

    public void checkNumber(int number) {
        if (number > model.getRandomvalue()) {
            view.printMsg(view.LOWER_NUMBER_MESSAGE);
        } else {
            view.printMsg(view.HIGHER_NUMBER_MESSAGE);
        }
    }

}
