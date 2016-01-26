/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractions;

/**
 *
 * @author Tim Rogersxxx
 */
public class HarryPotter extends Wizard{
    
    @Override
    public void doMagic(){
        System.out.println("Harry Potter uses Expelliarmus!");
    }
    
    @Override
    public void speak(){
        System.out.println("Hi my name is Harry Potter.");
    }
    
}
