package com.taxi.model;

public class UrlForDispatcher {
    public static String getUrl(String action){
        switch (action){
            case ("eng"):{
                return "/jsp/login_page.jsp";
            }
            default:{
                return "/GetIndexPageServlet";
            }
        }
    }
}
