/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea3;

import static java.lang.System.exit;
import java.util.Scanner;

/**
 *
 * @author Bryan
 */
public class MenuPrincipal {
  Scanner entrada = new Scanner(System.in);
    public void MenuPrincipal(){
        Usuarios usuario = new Usuarios();
        Palindromas palindroma = new Palindromas();
        
        System.out.println("    Tarea 3");
        System.out.println("");
        System.out.println("   201503723");
        System.out.println("");
        System.out.println("1. Usuarios");
        System.out.println("2. Palabras Palíndromas");
        System.out.println("3. Salir");
        
        int opcion;
        opcion = entrada.nextInt();
        switch(opcion){
            case 1: 
                usuario.MenuUsuarios();
                break;
            case 2: 
                palindroma.Palindromas();
                break;
            case 3: exit(0);
            default: System.out.println("Opcion incorrecta");
                     break;
        
        
        
        }
    }
}
