/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea3;

import java.util.Scanner;

/**
 *
 * @author Bryan
 */
public class Palindromas {
    Scanner entrada = new Scanner(System.in);
    int longitudpalabra;
    public void Palindromas(){
        String palabra;
        System.out.println("    Palabras Palindromas");
        System.out.println("");
        System.out.println("Ingrese una palabra palindroma");
        palabra = entrada.nextLine();
        boolean comprobar = verificarPalindromas(palabra);
        if(comprobar==true){
            System.out.println("LA PALABRA ES PALINDROMA");
            System.out.println("");
        }else{
            System.out.println("LA PALABRA NO ES PALINDROMA");
            System.out.println("");
        }
        
    }
    
    public boolean verificarPalindromas(String palabra){
        longitudpalabra = palabra.length();
        String [] palabradescompuesta = new String[longitudpalabra];
        int i = 0;
        for(i = 0; i < longitudpalabra; i++){
        palabradescompuesta[i]=palabra.substring(i,i+1);
        }
        String [] palabravuelta = new String[longitudpalabra];
        String palabranueva ="";
        int j;
        for(j=longitudpalabra-1;j>=0;j--){
        palabranueva += palabradescompuesta[j];
        }
        if(palabranueva.equalsIgnoreCase(palabra)){   
            return true;
        }
        else{
            return false;
        }
    }
    
}
