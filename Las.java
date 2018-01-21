package las;

import java.util.*;

public class Las 
        
{
    public static void main(String[] args) 
    {
        Zycie las[] = new Zycie[100];
        Random r = new Random();
        int x;
        
        for(int i=0;i<=99;i++)
            {
                x = r.nextInt(6);
                switch(x)
                    {
                        case 0:las[i] = new Kwiaty("Stokrotka","Białe","Nie");break;
                        case 1:las[i] = new Kwiaty("Dzika róza","Różowe","Tak");break;
                        case 2:las[i] = new Kwiaty("Niezapominajka","Niebieskie","Nie");break;
                        case 3:las[i] = new Ssaki("Czlowiek","Nie","Włosy");break;
                        case 4:las[i] = new Ssaki("Dziobak","Tak","Futro");break;
                        case 5:las[i] = new Ssaki("Hipopotam","Nie","Brak");break;
                    } 
        
            }
        
        for(int i=0;i<=99;i++)
            {
                System.out.println("Organizm numer "+(i+1));
                las[i].show();
            }
        
        
    }
    
    
}

 