package com.radomyr;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        GameModel model = new GameModel();
        GameView view = new GameView();
        GameController controller = new GameController(model, view);

        controller.Game();
    }
}
