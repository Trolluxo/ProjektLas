/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package las;

/**
 *
 * @author Student
 */
public class Kwiaty extends Flora implements Zycie
    {
            String gatunek;
            String kolorplatkow;
            String kolce;

            public Kwiaty(String x,String y,String k)
                {
                    this.gatunek = x;
                    this.kolorplatkow = y;
                    this.kolce = k;
                }

            @Override
           public void show() 
                { 
                    System.out.println("Materia: " + stanmaterii + System.lineSeparator() + "Królestwo: " + krolestwo + System.lineSeparator() +"Gatunek: " + gatunek + System.lineSeparator() + "Kolor płatków: " + kolorplatkow + System.lineSeparator() + "Kolce: " + kolce + System.lineSeparator()); 
                }      
    }

