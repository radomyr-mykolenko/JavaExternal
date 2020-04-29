package com.radomyr;

import java.io.IOException;


public class Main {

    public static void main(String[] args) {

Model model = new Model();
View view = new View();
Controller controller = new Controller(model,view);

        try {
            controller.Run();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
