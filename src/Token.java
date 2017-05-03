/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AlanJob
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public enum Token {
    MAIN ("main"),
    LET ("let"),
    IF ("if"),
    WHILE ("while"),
    ELSE ("else"),
    PRINT ("printf"),
    RETURN ("return"),

    PUNTO_COMA (";"),
    COMA (","),

    ABRE_LLAVE ("\\{"),
    CIERRA_LLAVE ("\\}"),
    ABRE_PARENTESIS ("\\("),
    CIERRA_PARENTESIS ("\\)"),

    IGUAL ("=="),
    DIFERENTE ("<>"),
    MAYOR_IGUAL (">="),
    MENOR_IGUAL ("<="),
    ASIGNACION ("="),
    MAYOR (">"),
    MENOR ("<"),

    SUMA ("\\+"),
    RESTA ("-"),
    MULTIPLICACION ("\\*"),
    DIVISION ("/"),
    MODULO ("%"),

    CADENA ("\"[^\"]+\""),
    NUMERO ("\\d+(\\.\\d+)?"),
    VARIABLE ("\\w+");    

    private final Pattern pattern;

    Token(String regex) {
        pattern = Pattern.compile("^" + regex);
    }

    int endOfMatch(String s) {
        Matcher m = pattern.matcher(s);

        if (m.find()) {
            return m.end();
        }

        return -1;
    }
}