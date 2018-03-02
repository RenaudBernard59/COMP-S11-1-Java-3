/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import packaheException.*;
/**
 *
 * @author renob
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int compteur = 0;
        try {
            //throw new PlusDeCarottes();
            for(compteur=0;compteur<=TropDeau.LIMITE;compteur++) {
                if(compteur>=TropDeau.LIMITE) {
                    throw new TropDeau();
                }
            }
        } catch (TropDeau ex) {
            System.out.println(ex.getMessage());
        }
         
        
        
        
        
        
    }
    
}
