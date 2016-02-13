/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _1EjercicioArreglo;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author root
 */
public class ObjArreglos {
    Random rnd = new Random();  
    public ArrayList<Integer> arreglo =new ArrayList();
    ArrayList<Integer> arreglo1 =new ArrayList();
    private Integer ayuda =0;
    
    public ArrayList<Integer> llenar_Arreglo(){
        for(int i =0;i<10;i++){
            this.arreglo.add(rnd.nextInt(2));
        }
        return this.arreglo;
    }
    public Integer buscarArreglo(Integer n){
        llenar_Arreglo();
        for(int i =0;i<arreglo.size();i++){
            if(arreglo.get(i)!=n){
                arreglo1.add(arreglo.get(i)); 
                ayuda = ayuda +1;
            }
        }    
       return ayuda;
    }
    public String respuesta(){
        String r = "Elemento no encontrado";
        if(ayuda>0){
            r ="Elemnto encontrado y borrado";
            for(int i=0;i<arreglo1.size();i++){
               System.out.print(arreglo1.get(i));
            }
            System.out.println("");
        }
        return r;
    }
   
  
}
