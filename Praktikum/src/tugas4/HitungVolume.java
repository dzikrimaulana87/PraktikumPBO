/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas4;

/**
 *
 * @author dzikr
 */
public class HitungVolume {
    double result;
    
    public double volume(float s){
        result = Math.pow(s,3);
        
        return result;
        
    }
    
    public double volume(float p, float l, float t){
        
        result = p * l * t;
        return result;
    }
    
    public double luaspermukaan(float s){
        result = 6 * Math.pow(s, 3);
        return result;
    }
    
    public double luaspermukaan(float p, float l, float t){
        result = 2 * (p * l + p * t + l * t);
        return result;
    }
    
    
    
}
