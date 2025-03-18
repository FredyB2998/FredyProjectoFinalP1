/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fredyprojectofinal;

import java.util.Random;

/**
 *
 * @author janet
 */
public class Metodos {
    
    public int slots(int bet){
        Random rand = new Random();
        
        int num1 = rand.nextInt(12);
        int num2 = rand.nextInt(12);
        int num3 = rand.nextInt(12);
        
        
        if (num1 == 12 && num2 == 12 && num3 == 12){
            
            return bet*12;
        
        }
        else if (num1 == num2 && num2 == num3 && num3 == num1){
            
            return bet*6;
            
        }
        else if(num1 == num2 || num2 == num3 || num3 == num1 ){
            
            return bet*3;
            
        }
        
         return 0;
    }
    
    
    public int horseRacing(int bet){
        
        return bet;
    }
    
    
    public int blackjack(int bet){
        
        return bet;
    }
    
    
    
}
