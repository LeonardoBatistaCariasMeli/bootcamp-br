package com.digitalhouse.bootcamp.aula2.exercicio2_6;

public class Utils {
    public static String rpad(String s, char c, int n){
        return null;
    }

    public static String ltrim(String s){
        boolean hasBlankSpace = hasBlankSpaceToTheLeft(s);
        String trimmed = null;
        if(hasBlankSpace){
            trimmed = s.substring(1, s.length());
        }

        return hasBlankSpace? trimmed : "A string informada nao era valida";
    }

    public static String rtrim(String s){
        boolean hasBlankSpace = hasBlankSpaceToTheRight(s);
        String trimmed = null;
        if(hasBlankSpace){
            trimmed = s.substring(0, s.length()-1);
        }

        return hasBlankSpace ? trimmed : "A string informada nao era valida";
    }

    public static String trim(String s){
        String trim = null;

        if(ltrim(s) != "A string informada nao era valida"){
            trim = ltrim(s);
        }

        if(trim != null && rtrim(trim) != "A string informada nao era valida"){
            trim = rtrim(trim);
        } if(trim == null && rtrim(s) != "A string informada nao era valida"){
            trim = rtrim(s);
        }

        if(trim == null){
            trim = "A string informada nao tinha espaco em branco em ambos os lados";
        }
        return trim;
    }

    public static void indexOfN(String s, char c, int n){

    }

    public static boolean hasBlankSpaceToTheLeft(String s){
        boolean hasBlankSpace = false;

        if(s.charAt(0) == ' '){
            hasBlankSpace = true;
        }
        return hasBlankSpace;
    }

    public static boolean hasBlankSpaceToTheRight(String s){
        boolean hasBlankSpace = false;

        if(s.charAt(s.length()-1) == ' '){
            hasBlankSpace = true;
        }
        return hasBlankSpace;
    }
}
