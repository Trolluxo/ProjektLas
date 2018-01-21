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
public class Ssaki extends Fauna 
    {
       String gatunek;
       String poceniemlekiem;
       String owlosienie;

       public Ssaki(String x,String y,String k)
            {
                this.gatunek = x;
                this.poceniemlekiem = y;
                this.owlosienie = k;
            }

        @Override
        public void show() 
            { 
                System.out.println("Materia: " + stanmaterii + System.lineSeparator() + "Królestwo: " + krolestwo + System.lineSeparator() +"Gatunek: " + gatunek + System.lineSeparator() + "Pocenie się mlekiem: " + poceniemlekiem + System.lineSeparator() + "Owłosienie: " + owlosienie + System.lineSeparator()); 
            }      

    }
