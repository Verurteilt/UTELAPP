package com.utel.edu.mx.app;


public class Usuario  {

    private static Boolean LOGGED = false;
    private static String EMAIL = "";
    private static String MATRICULA = "";
    private static Usuario INSTANCE = new Usuario();

    private Usuario(){}

    public static Usuario getInstance() {
        return INSTANCE;
    }

    public static Boolean getLOGGED() {
        return LOGGED;
    }

    public static String getEMAIL() {
        return EMAIL;
    }

    public static String getMATRICULA() {
        return MATRICULA;
    }

    public static void setEMAIL(String EMAIL) {
        Usuario.EMAIL = EMAIL;
    }

    public static void setLOGGED(Boolean LOGGED) {
        Usuario.LOGGED = LOGGED;
    }

    public static void setMATRICULA(String MATRICULA) {
        Usuario.MATRICULA = MATRICULA;
    }

    public Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}
