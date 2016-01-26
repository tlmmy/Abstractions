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
public abstract class MP3Player implements ElectronicDevice{
    private double memoryUsed;
    private double memoryAvailable;
    
    public abstract void displaySong(String song);

    public double getMemoryUsed() {
        return memoryUsed;
    }

    public void setMemoryUsed(double memoryUsed) {
        this.memoryUsed = memoryUsed;
    }

    public double getMemoryAvailable() {
        return memoryAvailable;
    }

    public void setMemoryAvailable(double memoryAvailable) {
        this.memoryAvailable = memoryAvailable;
    }
    
    
}
