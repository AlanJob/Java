
import java.util.LinkedList;
import java.util.Scanner;
import java.util.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AlanJob
 */
public class Start {
static LinkedList cadena = new LinkedList();   
    public static void main(String s[]) {
        Scanner lee = new Scanner(System.in);
        Lexer lexer = new Lexer("C:/teste/font.txt");

        while (!lexer.isExausthed()) {
            cadena.add(lexer.currentToken());
            System.out.printf("%-18s %s\n", lexer.currentToken(), lexer.currentLexema());
            lexer.moveAhead();
        }

        if (lexer.isSuccessful()) {
        } else {
            System.out.println(lexer.errorMessage());
        }
        System.out.println("¿Desea revisar si los tokens pertenecen al lenguaje C? Presione enter");
        lee.hasNextLine();
        Parser parser = new Parser(cadena);
        System.out.println("--> "+parser.check());
        System.out.println("End");
        
    }
}