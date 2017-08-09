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
public class Usuarios {
    Scanner entrada = new Scanner(System.in);
    MenuPrincipal menu = new MenuPrincipal();
    
    public void MenuUsuarios(){
        System.out.println("    Menú de Usuarios");
        System.out.println("");
        System.out.println("1. Ingresar usuarios");
        System.out.println("2. Mostrar todos los usuarios");
        System.out.println("3. Mostrar un usuario personalizado");
        System.out.println("4. Menú Principal");
        System.out.println("5. Salir");
        int opcion;
        opcion = entrada.nextInt();
        
        switch(opcion){
            case 1:break;
            case 2:break;
            case 3:break;
            case 4: menu.MenuPrincipal();
                    break;
            case 5:exit(0);
                    break;
            default:System.out.println("Opcion Incorrecta");
    
    }
    
    }
    
}
