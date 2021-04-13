/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package corsa;
import java.util.ArrayList;

/**
 *
 * @author michele2306
 */
public class Corridore extends Thread{
   private String nome;
   protected static int Metri=100;
   protected static int OgniQuantoStampa=10;
   protected static boolean Arrivo=false;
   public static ArrayList<String> lista=new ArrayList<>();

    public Corridore(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    
    @Override
    public void run() {
        for(int i=0; i<Metri;i++){
        if((i+1)%OgniQuantoStampa==0){
        System.out.println("il corridore "+nome+" ha fatto "+i+1+"m");
        }
        }
       AssegnazioneClass(super.getName()); 
    }
      
        public static synchronized void AssegnazioneClass(String nome){
        if(Arrivo==true){
        stampaArrivo(nome);
        }
        lista.add(nome);
        }
        
        public static void stampaArrivo(String nome){
        System.out.println(nome+" ha concluso la gara");
        }
        public static void stampaClassifica(){
        for(int i=0; i<lista.size();i++){
        System.out.println(i+1+" "+lista.get(i));
        }
        
        }
    }

   
    

