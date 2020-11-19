/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119060.latihan62.livingthing;

/**
 *
 * @author asus
 */
public class PBOIF210119060Latihan62LivingThing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Human objHuman=new Human();
        objHuman.setNama("Rizki Adam Kurniawan");
        
        objHuman.walk(objHuman.getNama());
        objHuman.breath(objHuman.getNama());
        objHuman.eat(objHuman.getNama());
    }
    
}
