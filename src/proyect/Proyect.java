/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyect;

import java.util.Scanner;

/**
 *
 * @author Xande
 */
public class Proyect {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] nombre=new String[2];
        String[] apellidos=new String[2];
        String[] nombrePadre=new String[2];
        String[] apellidosPadre=new String[2];
       int[] edad=new int[2];
       int[] edadPadre=new int[2];
       String[] grado=new String[2];
       String[] correo=new String[2];
       String[] celular=new String[2];
       String[] direccion=new String[2];
      Scanner sc=new Scanner(System.in);
 
    System.out.println("-----------PLATAFORMA DE INGRESO DE DATOS-----------");
        for (int i = 0; i < 2; i++) {
            System.out.println("Alumno:"+(i+1));
            System.out.println("--------------------------------------------");
        
        System.out.println("Ingrese el primer y segundo nombre del alumno");
        nombre[i]=sc.nextLine();
        System.out.println("Ingrese los apellidos del alumno");
        apellidos[i]=sc.nextLine();
        System.out.printf("Ingrese la edad de %s ",nombre[i].toUpperCase());
        edad[i]=sc.nextInt();
      
        System.out.println("");
 //Datos de los padres 
 sc.nextLine();
        System.out.println("-----------DATOS DEL PADRE-----------");
     System.out.println("Ingrese el primer y segundo nombre del Padre");
    nombrePadre[i]=sc.nextLine();
        System.out.printf("Ingrese los apellidos de %s",nombrePadre[i]);
        apellidosPadre[i]=sc.nextLine();
        System.out.printf("Ingrese la edad de %s ",nombrePadre[i].toUpperCase());
        edadPadre[i]=sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese el correo del padre");
        correo[i]=sc.nextLine();
        System.out.println("Numero de telefono");
        celular[i]=sc.nextLine();
        System.out.println("Proporcione su direccion");
        direccion[i]=sc.nextLine();
        }
        System.out.println("---------------RESULTADOS---------------");
        System.out.println("");
        for (int i = 0; i <2; i++) {
            
        
        System.out.println("DATOS DEL ALUMNO"+(i+1));
            System.out.println("--------------------------");
        System.out.printf("Su nombre es: %s %s ",nombre[i].toUpperCase(),apellidos[i].toUpperCase());
        System.out.println("\nActualmente posee una edad de: "+edad[i]);
        System.out.println("\n DATOS DEL PADRE");
            System.out.println("--------------------------");
         System.out.printf("Su nombre es: %s %s ",nombrePadre[i].toUpperCase(),apellidosPadre[i].toUpperCase());
        System.out.println("\nActualmente posee una edad de: "+edadPadre[i]);
        System.out.println("Su direccion es:"+direccion[i]);
        System.out.println("Su correo es:"+correo[i]);
            System.out.println("");
            System.out.println("--------------------------");
    }
    }
    
}