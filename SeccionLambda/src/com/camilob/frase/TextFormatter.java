package com.camilob.frase;

public class TextFormatter {

    public static String formatearString(String s){
        return s.replace(" ", "").replace(",", "").replace(".", "").toUpperCase();
    }

}
