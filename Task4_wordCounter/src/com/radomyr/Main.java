package com.radomyr;

import java.io.BufferedReader;
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
        Map<String, Integer> m1 = new HashMap<String, Integer>();
        String url1 = "http://shakespeare.mit.edu/Poetry/sonnet.I.html";
        String str1= null;
        try {
            str1 = Controller.getText(url1);
        } catch (Exception e) {
            e.printStackTrace();
        }

        String [] words1 = str1.split(" ");
        for (String a : words1) {
            Integer freq = m1.get(a);
            m1.put(a, (freq == null) ? 1 : freq + 1);
        }

        Map<String, Integer> m2 = new HashMap<String, Integer>();
        String url2 = "http://shakespeare.mit.edu/Poetry/sonnet.II.html";
        String str2= null;
        try {
            str2 = Controller.getText(url2);
        } catch (Exception e) {
            e.printStackTrace();
        }

        String [] words2 = str2.split(" ");
        for (String a : words2) {
            Integer freq = m2.get(a);
            m2.put(a, (freq == null) ? 1 : freq + 1);
        }

        Map<String, Integer> m3 = new HashMap<String, Integer>();
        String url3 = "http://shakespeare.mit.edu/Poetry/sonnet.III.html";
        String str3= null;
        try {
            str3 = Controller.getText(url3);
        } catch (Exception e) {
            e.printStackTrace();
        }

        String [] words3 = str2.split(" ");
        for (String a : words3) {
            Integer freq = m3.get(a);
            m3.put(a, (freq == null) ? 1 : freq + 1);
        }
        System.out.println(url1);
        System.out.println(m1.size() + " distinct words:");
        System.out.println(m1);
        System.out.println(url2);
        System.out.println(m2.size() + " distinct words:");
        System.out.println(m2);
        System.out.println(url3);
        System.out.println(m3.size() + " distinct words:");
        System.out.println(m3);



        for (int i=0;i<=80;i++){
            HashMap<String, Integer> promizhna = new HashMap<String, Integer>();
            promizhna.put(url1,m1.get(words1[i]));
            model.observer.put(words1[i], promizhna);
        }

        //System.out.println(model.observer.get("own"));

        for (int i=0;i<=89;i++){
            if (model.observer.get(words2[i])==null) {
                HashMap<String, Integer> promizhna = new HashMap<String, Integer>();
                promizhna.put(url2,m2.get(words2[i]));
                model.observer.put(words2[i], promizhna);

            } else
            {
             model.observer.get(words2[i]).put(url2,m2.get(words2[i]));
            }
        }

        for (int i=0;i<=89;i++){
            if (model.observer.get(words3[i])==null) {
                HashMap<String, Integer> promizhna = new HashMap<String, Integer>();
                promizhna.put(url3,m3.get(words3[i]));
                model.observer.put(words3[i], promizhna);
            } else
            {
                model.observer.get(words3[i]).put(url3, m3.get(words3[i]));
            }
        }

        System.out.println(model.observer.get("thy"));
    }
}
