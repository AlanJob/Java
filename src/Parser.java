
import java.util.LinkedList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AlanJob
 */
public class Parser {
    LinkedList cadena = new LinkedList();
    int i;
    int tam;
    public Parser(LinkedList cadena){
        this.cadena = cadena;
        this.i=0;
        this.tam=cadena.size();
    }
    
    public String check(){
        String resultado = "Error";
        String opcion;
        int i =0;
            if(cadena.get(i).toString()=="MAIN"){
                System.out.println("main");
                i++;
                if(cadena.get(i).toString()=="ABRE_PARENTESIS"){
                    System.out.println("parentesis(");
                    i++;
                    if(cadena.get(i).toString()=="CIERRA_PARENTESIS"){
                        System.out.println("parentesis)");
                        i++;
                        if(cadena.get(i).toString()=="ABRE_LLAVE"&&cadena.getLast().toString()=="CIERRA_LLAVE")
                            System.out.println("Dentro");
                            i++;
                            while(i<tam){
                            opcion = cadena.get(i).toString();
                            
                            switch (opcion){
                                
                                case "PRINT":
                                    System.out.println("PRINT");
                                    i++;
                                    if(cadena.get(i).toString()=="ABRE_PARENTESIS"){
                                        System.out.println("parentesis(");
                                        i++;
                                        if(cadena.get(i).toString()=="CADENA"){
                                            System.out.println("cadena");
                                            i++;
                                            if(cadena.get(i).toString()=="CIERRA_PARENTESIS"){
                                                System.out.println("parentesis)");
                                                i++;
                                                if(cadena.get(i).toString()=="PUNTO_COMA"){
                                                    System.out.println("punto y coma");
                                                    resultado = "Correcto";
                                                    i++;
                                                    break;
                         
                                                }else resultado = "error";break;
                                            }else resultado = "error";break;
                                        }else resultado = "error";break;
                                    }else resultado = "error";break;
                                    
                                case "RETURN":
                                    System.out.println("RETURN");
                                    i++;
                                    if(cadena.get(i).toString()=="NUMERO"){
                                        System.out.println("entero");
                                        i++;
                                        if(cadena.get(i).toString()=="PUNTO_COMA"){
                                            System.out.println("punto y coma");
                                            i++;
                                            resultado = "Correcto";
                                            break;
                                        }resultado = "error";break;
                                    }resultado = "error";break;  
                                    
                                case "CIERRA_LLAVE":
                                    System.out.println("Termina Main");
                                    resultado = "Correcto";
                                    i++;
                                    break;
                            }//FinSwitch
                            }//finWhile
                    }else resultado = "error";
                }else resultado = "error";
            }else resultado = "error";
        return resultado;
    }
}
