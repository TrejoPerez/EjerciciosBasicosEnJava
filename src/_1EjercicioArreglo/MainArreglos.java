/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _1EjercicioArreglo;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author root
 */
public class MainArreglos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ObjArreglos obArreglo = new ObjArreglos();
        //obArreglo.comprobar_Arreglo(1);
        System.out.print("Ingresa un numero: ");
        Integer valor = sc.nextInt();
       
        obArreglo.buscarArreglo(valor);
        System.out.println(obArreglo.respuesta());
        
        
        
        
        
        
        
        
        
    }
}
