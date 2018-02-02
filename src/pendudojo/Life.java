/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pendudojo;

/**
 *
 * @author Hadi ElMoussaoui
 */
class Life {
    
    public int vie = 0;
    public Life(int vie){
        System.out.println("Nombre de vies = " + vie);
        this.vie = vie;
    }
    
    public void lifekill(){
        this.vie -= 1;
    }
    
    public void showLife() {
        System.out.println("You get " + this.vie + " life left...");
    }
}
