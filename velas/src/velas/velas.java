/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package velas;

import java.util.Scanner;
/**
 * AUTOR:
 * Alejandra Alza
 */
public class velas {
    
    public static void main(String[] args) {
        Scanner entrada = new  Scanner(System.in);
        int nvelas =0 ;
        int nmaximo = 0;
        int vapagada= 0;
        int velas[] = new int [100];
       
        System.out.println("Edad que cumple la persona: ");
        nvelas = entrada.nextInt();
       
        System.out.println(" Ingrese la altura de la vela: ");
       
        for(int j = 0; j < nvelas; j++){
       
        velas[j] = entrada.nextInt();
       
        if(velas[j] > nmaximo){
           
            nmaximo = velas[j];
           
            if(velas[j] == nmaximo){
               
                vapagada++;
            }
       
        }
         
        }
       System.out.println(" la longitud mas grande de las velas es : "+nmaximo);
        System.out.println(" se apagan : "+vapagada +"velas");
       
    }
   
}
