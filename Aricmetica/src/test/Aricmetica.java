/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
import dominio.Operaciones;
import java.util.Scanner;
/**
 *
 * @author Alumno Mañana
 */
public class Aricmetica {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ent = new Scanner (System.in);
        System.out.println("Introduzca dos numeros para empezar a operar :)");
        System.out.println("Primer numero:");
        int prim = ent.nextInt();
        System.out.println("Segundo numero:");
        int sec = ent.nextInt();
        dominio.Operaciones.sumas(prim,sec);
        dominio.Operaciones.restas(prim,sec);
        dominio.Operaciones.multiplicacion(prim,sec);
        
    }
    
}
