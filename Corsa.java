/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package corsa;
import java.util.ArrayList;
public class Corsa {

    
    public static void main(String[] args) {
        Corridore.Metri=100;
        Corridore.Arrivo=false;
        Corridore.OgniQuantoStampa=10;
        
        ArrayList<Corridore> c=new ArrayList<>();
        int corridori=10;
        
        for (int i = 0; i < corridori; i++) {
            c.add(new Corridore("Corridore "+i));
        }
        for (int i = 0; i < c.size(); i++) {
            c.get(i).start();
        }
        for (Corridore c1 : c) {
            try{ c1.join();}catch(InterruptedException e){}
        }
        
        Corridore.stampaClassifica();
    }
    
}
