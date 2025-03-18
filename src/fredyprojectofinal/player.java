/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fredyprojectofinal;

/**
 *
 * @author janet
 */
public class player {
    
    private int dinero;
    private int deuda;
    private int chips;

    public player(int dinero, int deuda, int chips) {
        this.dinero = dinero;
        this.deuda = deuda;
        this.chips = chips;
    }
    
    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    public int getDeuda() {
        return deuda;
    }

    public void setDeuda(int deuda) {
        this.deuda = deuda;
    }

    public int getChips() {
        return chips;
    }

    public void setChips(int chips) {
        this.chips = chips;
    }
    
    

    @Override
    public String toString() {
        return "Stats" + "Dinero: " + dinero + ", Deuda: " + deuda;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
