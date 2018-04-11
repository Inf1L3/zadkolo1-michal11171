/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.kolo1;

import java.util.Scanner;

/**
 *
 * @author student
 */
public class zad3 {
  private  void tab(){
        double x;
        int suma=0;
        int srednia=0;

        
    
   double[] tab = new double[10];
   for(int i=1;i<=10;i++)
   {
     System.out.println("Podaj"+i+"wyraz tablicy");
     Scanner odczyt1 = new Scanner(System.in);
 
     x = odczyt1.nextInt();
     tab[i]=x;
     
   }

   for(int j=1;j<=10;j++)
   {
       System.out.println(j+"-ty wyraz w tablicy to"+tab[j]);
        
       suma=(int) (tab[j]+suma);

       
   }
    srednia=suma/10;
    System.out.println("Srednia="+srednia);
   }
}

