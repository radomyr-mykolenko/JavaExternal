package com.radomyr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Map;

public class Controller {
    private Model model;
    private View view;
    private String url1 = "http://shakespeare.mit.edu/Poetry/sonnet.I.html";
    private String url2 = "http://shakespeare.mit.edu/Poetry/sonnet.II.html";
    private String url3 = "http://shakespeare.mit.edu/Poetry/sonnet.III.html";

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    static String getText(String url) throws Exception {
        URL website = new URL(url);
        URLConnection connection = website.openConnection();
        BufferedReader in = new BufferedReader(
                new InputStreamReader(
                        connection.getInputStream()));

        StringBuilder response = new StringBuilder();
        String inputLine;

        while ((inputLine = in.readLine()) != null)
            response.append(inputLine);

        in.close();

        return response.toString();
    }
    public void Run() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean marker = true;
        while (marker==true){
        setWords();
        createMainHashMap();
        view.printMsg(view.INPUT_MESSAGE);
        String wordForSerach = br.readLine();
        searchWord(wordForSerach);
        marker=false;
        }
    }
    public void setWords(){
        //Map<String, Integer> m1 = new HashMap<String, Integer>();

        String str1= null;
        try {
            str1 = this.getText(url1);
        } catch (Exception e) {
            e.printStackTrace();
        }

        model.words1 = str1.split(" ");
        for (String a : model.words1) {
            Integer freq = model.m1.get(a);
            model.m1.put(a, (freq == null) ? 1 : freq + 1);
        }



        String str2= null;
        try {
            str2 = this.getText(url2);
        } catch (Exception e) {
            e.printStackTrace();
        }

        model.words2 = str2.split(" ");
        for (String a : model.words2) {
            Integer freq = model.m2.get(a);
            model.m2.put(a, (freq == null) ? 1 : freq + 1);
        }



        String str3= null;
        try {
            str3 = this.getText(url3);
        } catch (Exception e) {
            e.printStackTrace();
        }

        model.words3 = str2.split(" ");
        for (String a : model.words3) {
            Integer freq = model.m3.get(a);
            model.m3.put(a, (freq == null) ? 1 : freq + 1);
        }
    }
    public void createMainHashMap(){
        for (int i=0;i<=80;i++){
            HashMap<String, Integer> promizhna = new HashMap<String, Integer>();
            promizhna.put(url1,model.m1.get(model.words1[i]));
            model.observer.put(model.words1[i], promizhna);
        }

        //System.out.println(model.observer.get("own"));

        for (int i=0;i<=89;i++){
            if (model.observer.get(model.words2[i])==null) {
                HashMap<String, Integer> promizhna = new HashMap<String, Integer>();
                promizhna.put(url2,model.m2.get(model.words2[i]));
                model.observer.put(model.words2[i], promizhna);

            } else
            {
                model.observer.get(model.words2[i]).put(url2,model.m2.get(model.words2[i]));
            }
        }

        for (int i=0;i<=89;i++){
            if (model.observer.get(model.words3[i])==null) {
                HashMap<String, Integer> promizhna = new HashMap<String, Integer>();
                promizhna.put(url3,model.m3.get(model.words3[i]));
                model.observer.put(model.words3[i], promizhna);
            } else
            {
                model.observer.get(model.words3[i]).put(url3, model.m3.get(model.words3[i]));
            }
        }

    }
    public void searchWord(String word){
        Integer[] freqMax = new Integer[3];

        if(model.observer.get(word)!=null) {
            view.printMsg(word);

                if (model.observer.get(word).get(url1) != null) {
                    view.printMsg(view.RESULT_1_MESSAGE + url1 + view.RESULT_2_MESSAGE + model.observer.get(word).get(url1) + view.RESULT_3_MESSAGE);
                }
                if (model.observer.get(word).get(url2) != null) {
                    view.printMsg(view.RESULT_1_MESSAGE + url2 + view.RESULT_2_MESSAGE + model.observer.get(word).get(url2) + view.RESULT_3_MESSAGE);
                }
                if (model.observer.get(word).get(url3) != null) {
                    view.printMsg(view.RESULT_1_MESSAGE + url3 + view.RESULT_2_MESSAGE + model.observer.get(word).get(url3) + view.RESULT_3_MESSAGE);
                }

            } else{
                view.printMsg(view.EMPTY_MESSAGE);
            }
        }
}
