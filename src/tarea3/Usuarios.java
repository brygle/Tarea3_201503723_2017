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
    String[] nombres = new String[5]; 
    
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
            case 1:
                ingresarusuarios();
                break;
            case 2:
                mostrarusuarios();
                break;
            case 3:
                usuariopersonalizado();
                break;
            case 4: menu.MenuPrincipal();
                    break;
            case 5:exit(0);
                    break;
            default:System.out.println("Opcion Incorrecta");
    
    }
    
    }
    
    public void ingresarusuarios(){
        int i, j;
        System.out.println("");
        for(i=0;i<5;i++){
            j=i+1;
            System.out.println("Ingrese el nombre del usuario No. "+ (j));
            String nombre;
            nombre = entrada.next();
            nombres[i] = nombre;
            System.out.println("");
            
        }
    MenuUsuarios();
    }
    public void mostrarusuarios(){
        int i,j;
        System.out.println("Mostrar todos los usuarios");
        System.out.println("");
        for(i=0;i<5;i++){
            j = i+1;
            System.out.println(j +". "+ nombres[i]);
        }
        System.out.println("");
        MenuUsuarios();
    }
    
    public void usuariopersonalizado(){
        System.out.println("Mostrar usuario personalido");
        System.out.println("");
        System.out.println("    Ingresar usuario");
        String nombre = entrada.next();
        System.out.println("");
        
        boolean validar=false;
        int i=0;
        while(validar==false){
            if(i==5){
            break;}
            if(nombre.equals(nombres[i])){
                validar=true;
            }else{
                validar=false;
            }
            i++;
            
        }
        
        if(validar==true){
            System.out.println("Usuario");
            System.out.println("");
            System.out.println(nombre);
        }else{
            System.out.println("Usuario");
            System.out.println("");
            System.out.println("ERROR!! No existe ningun usuario con esa coincidencia");
        }
        MenuUsuarios();
        
    }
    
}
