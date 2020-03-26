package com.radomyr;

import java.util.HashMap;

public class View extends Controller {
    public static final String INPUT_MESSAGE = "Введіть слово для пошуку(наприклад \"thy\" або \"tender\"):";
    public static final String EMPTY_MESSAGE = "Такого слова тут немає, пробуйте ще раз";
    public static final String RESULT_1_MESSAGE = "За адресою ";
    public static final String RESULT_2_MESSAGE = " зустрічається ";
    public static final String RESULT_3_MESSAGE = " разів";
    public void printMsg(String string){
        System.out.println(string);
    }
    public void printMsg(HashMap hashMap){
        System.out.println(hashMap);
    }

}
