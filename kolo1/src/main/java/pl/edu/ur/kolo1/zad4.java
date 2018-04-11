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
public class zad4 {
    private String imie;
    private String nazwisko;
    private int wiek;
    private int wzrost;
    private int waga;
  Scanner wej = new Scanner(System.in);

    private zad4(String imie, String nazwisko, int wiek, int wzrost,int waga) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        this.wzrost = wzrost;
        this.waga= waga;
    }
     void dane(){
        System.out.println("\nPodaj dane osoby: ");
        System.out.println("Imie: ");
        this.imie = wej.nextLine();
        System.out.println("Nazwisko: ");
        this.nazwisko = wej.nextLine();
          System.out.println("Wiek: ");
        this.wiek = wej.nextInt();
          System.out.println("wzrost: ");
        this.wzrost = wej.nextInt();
          System.out.println("waga: ");
        this.waga = wej.nextInt();
    }
    
    void wyswietlenie(){
        System.out.println("Imie: "+imie);
        System.out.println("Nazwisko: "+nazwisko);
        System.out.println("Wiek: "+wiek);
        System.out.println("wzrost: "+wzrost);
        System.out.println("waga: "+waga);
    }
}
