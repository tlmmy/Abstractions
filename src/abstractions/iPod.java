/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractions;

/**
 *
 * @author L152student
 */
public class iPod extends MP3Player{
    
    @Override
    public void powerOn(){
        System.out.println("I am an iPod and I just turned on.");
    }
    
    @Override
    public void displaySong(String song){
        System.out.println("I am playing the song " + song + ".");
    }
}
