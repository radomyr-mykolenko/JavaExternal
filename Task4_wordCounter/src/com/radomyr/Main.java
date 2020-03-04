package com.radomyr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.sql.SQLOutput;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

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
