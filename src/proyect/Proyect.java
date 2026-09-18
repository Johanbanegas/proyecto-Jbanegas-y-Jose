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

  /* Puse todas las variables aqui porque me estaba dando bastante error 
       entonces me toco buscar para ver porque me tiraba error y ahi vi que era mejor
       ponerlas es la class afuera del main y pasarla a static para que todas las funciones y
       arreglos pudieran usarlas sin problema. 
    
     - de ahi dividi en cada funcion cada parte. le agregue unas lineas a alumno, datos de padre
    y agregue datos de la madre y datos academicos. 
    
     - y tire una funcion para resultados tambien. 
    */

    static Scanner sc = new Scanner(System.in);
 
    static String[] nombre = new String[1];
    static String[] apellidos = new String[1];
    static String[] nombrePadre = new String[1];
    static String[] apellidosPadre = new String[1];
    static String[] nombreMadre = new String[1];
    static String[] apellidosMadre = new String[1];
    static String[] genero = new String[1];
    static String[] fechaNac = new String[1];
    static int[] edad = new int[1];
    static int[] edadPadre = new int[1];
    static int[] edadMadre = new int[1];
    static String[] grado = new String[1];
    static String[] correo = new String[1];
    static String[] celular = new String[1];
    static String[] direccion = new String[1];
    static String[] correoMadre = new String[1];
    static String[] celularMadre = new String[1];
    static String[] direccionMadre = new String[1];
    static int[] math = new int[1];
    static int[] ing = new int[1];
    static int[] comp = new int[1];
    static int[] esp = new int[1];
    static int[] ccss = new int[1];
    static int[] cn = new int[1];
    static double[] promedio = new double[1];

 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        boolean continuar = true;
        int seleccionMenu = 0;
        boolean datosIngresados = false;
        
        while (continuar){
           
             System.out.println("______________________________________________________");
              System.out.println("                     MENU PRINCIPAL                   ");
              System.out.println("______________________________________________________");
              System.out.println("");
              System.out.println("---------------------Seleccione una-------------------");
            System.out.println("");
        System.out.println("\t\t     1. Ingrese Los datos");
        System.out.println("\t\t     2. Resultado");
        System.out.println("\t\t     3. Salir");
            System.out.println("");
            System.out.println("---------------Ingrese su opcion escogida-------------");
            System.out.println("______________________________________________________");
            System.out.println("======================================================");
        seleccionMenu = sc.nextInt();
        sc.nextLine();//limpieza de buffer
        
        switch(seleccionMenu) {
        
            case 1:
                System.out.println("");
        System.out.println("-----------PLATAFORMA DE INGRESO DE DATOS-------------");
 
        for (int i = 0; i < 1; i++) {
            
            System.out.println("Alumno:" + (i + 1));
            System.out.println("------------------------------------------------------");
 
            DatosdeAlumnos(i);
            DatosdelPadre(i);
            DatosdelaMadre(i);
            DatosAcademicos(i);
            datosIngresados = true;
         
        }//finfor
           break;
           case 2:
          if (datosIngresados) {//me toco buscar y agregar la varaible datos ingresados y declararlo boolean para que pueda correr el caso 2.
                    MostrarResultados();
                } else {
                    System.out.println("Primero debe ingresar los datos (opcion 1).");
                }
        break;
        
           case 3:
                continuar = false;
                System.out.println("Saliendo del programa...");
                break;
        
        default:
        System.out.println("No esta la opcion.");
        
        }//fin de while
      
        }//finde switch menu
   
 
    }//findemain
 
    public static void DatosdeAlumnos(int i) {    // FUNCION: datos generales del alumno
 
     System.out.println("Ingrese el primer y segundo nombre del alumno");
        nombre[i] = sc.nextLine();
        System.out.println("Ingrese los apellidos del alumno");
        apellidos[i] = sc.nextLine();
        do{
        System.out.printf("Ingrese la edad de %s ", nombre[i].toUpperCase());
        edad[i] = sc.nextInt();
         if (edad[i] < 6 || edad[i] > 17) {
        System.out.println("ERROR.Debe estar entre 6 y 17 anios.");
    }
} while (edad[i] < 6 || edad[i] > 18);
        sc.nextLine();
        System.out.println("Ingrese el Genero M/F: ");
        genero[i] = sc.nextLine().toUpperCase();
        if (!genero[i].equals("M") && !genero[i].equals("F")) {
            System.out.println("Dato invalido,se le colocara el valor de no definido");
            genero[i]="N";
        }
        System.out.println("Ingrese la fecha de Nacimiento: ");
        fechaNac[i] = sc.nextLine();
        System.out.println("Ingrese el grado: ");
        grado[i] = sc.nextLine();
       
    }//fin DatosdeAlumnos

    public static void DatosdelPadre(int i) {   // FUNCION: datos del padre
 
        sc.nextLine();
        System.out.println("-----------DATOS DEL PADRE-----------");
        System.out.println("Ingrese el primer y segundo nombre del Padre");
        nombrePadre[i] = sc.nextLine();
        System.out.printf("Ingrese los apellidos de %s", nombrePadre[i]);
        apellidosPadre[i] = sc.nextLine();
        do {
            System.out.printf("Ingrese la edad de %s: ", nombrePadre[i].toUpperCase());
            edadPadre[i] = sc.nextInt();
            if (edadPadre[i] < 18) {
                System.out.println("Error la edad del padre debe ser mayor a 18.");
            }
        } while (edadPadre[i] < 18);
        sc.nextLine();
        System.out.println("Ingrese el correo del padre");
        correo[i] = sc.nextLine();
        System.out.println("Numero de telefono");
        celular[i] = sc.nextLine();
        System.out.println("Proporcione su direccion");
        direccion[i] = sc.nextLine();
 
    }//fin DatosdelPadre
 
    public static void DatosdelaMadre(int i) {   // FUNCION: datos de la madre
 
        sc.nextLine();
        System.out.println("-----------DATOS DE LA MADRE-----------");
        System.out.println("Ingrese el primer y segundo nombre de la Madre");
        nombreMadre[i] = sc.nextLine();
        System.out.printf("Ingrese los apellidos de %s", nombreMadre[i]);
        apellidosMadre[i] = sc.nextLine();
        do {
            System.out.printf("Ingrese la edad de %s: ", nombreMadre[i].toUpperCase());
            edadMadre[i] = sc.nextInt();
            if (edadMadre[i] < 18) {
                System.out.println("Error la edad de la Madre debe ser mayor a 18.");
            }
        } while (edadPadre[i] < 18);
        sc.nextLine();
        System.out.println("Ingrese el correo del Madre");
        correoMadre[i] = sc.nextLine();
        System.out.println("Numero de telefono");
        celularMadre[i] = sc.nextLine();
        System.out.println("Proporcione su direccion");
        direccionMadre[i] = sc.nextLine();
 
    }//fin DatosdelaMadre
 
    public static void DatosAcademicos(int i) {  // FUNCION: notas y promedio
 
        System.out.println("-----------------Datos Academicos--------");
        System.out.println("");
        System.out.println("Inserte su nota de:");
        do {
            System.out.println("Matematicas: ");
            math[i] = sc.nextInt();
            if (math[i] < 0 || math[i] > 100) {
                System.out.println("Su nota esta dentro del alcance permitido");
            }
        } while (math[i] < 0 || math[i] > 100);

        System.out.println("Inserte su nota de:");
        do {
            System.out.println("Ingles: ");
            ing[i] = sc.nextInt();
            if (ing[i] < 0 || ing[i] > 100) {
                System.out.println("Su nota esta dentro del alcance permitido");
            }
        } while (ing[i] < 0 || ing[i] > 100);

        System.out.println("Inserte su nota de:");
        do {
            System.out.println("Computacion: ");
            comp[i] = sc.nextInt();
            if (comp[i] < 0 || comp[i] > 100) {
                System.out.println("Su nota esta dentro del alcance permitido");
            }
        } while (comp[i] < 0 || comp[i] > 100);

        System.out.println("Inserte su nota de:");
        do {
            System.out.println("Espaniol: ");
            esp[i] = sc.nextInt();
            if (esp[i] < 0 || esp[i] > 100) {
                System.out.println("Su nota esta dentro del alcance permitido");
            }
        } while (esp[i] < 0 || esp[i] > 100);

        System.out.println("Inserte su nota de:");
        do {
            System.out.println("Ciencias Sociales: ");
            ccss[i] = sc.nextInt();
            if (ccss[i] < 0 || ccss[i] > 100) {
                System.out.println("Su nota esta dentro del alcance permitido");
            }
        } while (ccss[i] < 0 || ccss[i] > 100);

        System.out.println("Inserte su nota de:");
        do {
            System.out.println("Ciencias Naturales: ");
            cn[i] = sc.nextInt();
            if (cn[i] < 0 || cn[i] > 100) {
                System.out.println("Su nota esta dentro del alcance permitido");
            }
        } while (cn[i] < 0 || cn[i] > 100);

        promedio[i] = (math[i] + ing[i] + comp[i] + esp[i] + ccss[i] + cn[i]) / 6.0;
        sc.nextLine();
 
    }//fin DatosAcademicos
 
    public static void MostrarResultados() {
 
        System.out.println("---------------RESULTADOS---------------");  //FUNCION: impresion de resultados
        System.out.println("");
 
        for (int i = 0; i < 1; i++) {
 
            System.out.println("DATOS DEL ALUMNO" + (i + 1));
            System.out.println("--------------------------");
            System.out.printf("\nSu nombre es: %s %s ", nombre[i].toUpperCase(), apellidos[i].toUpperCase());
            System.out.println("Su genero es: " + genero[i]);
            System.out.println("\nSu Fecha de naciemiento es: " + fechaNac[i]);
            System.out.println("Actualmente posee una edad de: " + edad[i]);
            System.out.println("\nActualmente esta en el grado: " + grado[i]);
            System.out.println("-----------------------------------------");
            
            System.out.println("\n DATOS DEL PADRE");
            System.out.printf("Su nombre es: %s %s ", nombrePadre[i].toUpperCase(), apellidosPadre[i].toUpperCase());
            System.out.println("\nActualmente posee una edad de: " + edadPadre[i]);
            System.out.println("Su direccion es:" + direccion[i]);
            System.out.println("\nSu Numero de contacto es: : " + celular[i]);
            System.out.println("Su correo es:" + correo[i]);
            System.out.println("-----------------------------------------");
            
            System.out.println("\n DATOS DE LA MADRE");
            System.out.printf("Su nombre es: %s %s ", nombreMadre[i].toUpperCase(), apellidosMadre[i].toUpperCase());
            System.out.println("\nActualmente posee una edad de: " + edadMadre[i]);
            System.out.println("Su direccion es:" + direccionMadre[i]);
            System.out.println("\nSu Numero de contacto es: : " + celularMadre[i]);
            System.out.println("Su correo es:" + correoMadre[i]);
            System.out.println("");
            
           System.out.println("-----------------------------------------DATOS ACADEMICOS-----------------------------------------");
            System.out.println("Matematicas\tIngles\tComputacion\tEspaniol\tCiencias Sociales\tCiencias Naturales");
            System.out.printf("%d\t\t%d\t\t%d\t\t%d\t\t\t%d\t\t\t%d\n",
                    math[i], ing[i], comp[i], esp[i], ccss[i], cn[i]);

            System.out.println("--------------------------------------------------------------------------------------------------");
            System.out.printf("El promedio es: %.2f\n", promedio[i]);

            if (promedio[i] >= 70) {
                System.out.println("El alumno Aprobo");
            } else {
                System.out.println("El alumno Reprobo");
            }
            MostrarRendimiento(promedio[i]);
        }//findefor
 
         }//fin MostrarResultados
         
    public static void MostrarRendimiento(double promedio){
             if (promedio >= 90) {
                 System.out.println("Rendimiento academico: Excelente");
             } else {
                 if (promedio >= 70) {
                     System.out.println("Rendimiento academico: Bueno");
                 } else {
                     if (promedio >= 60) {
                         System.out.println("Rendimiento academico: Regular");
                     } else {
                         System.out.println("Rendimiento academico: Deficiente");
                     }//else
                 }//else
             }//else

             // 
             if (promedio >= 70) {
                 System.out.println("El alumno Aprobo");
             } else {
                 System.out.println("El alumno Reprobo");
             }//else
         }//finMostrarRendimineto
 
}//findeclass