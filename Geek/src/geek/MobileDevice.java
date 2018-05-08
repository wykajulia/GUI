/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geek;

/**
 *
 * @author wykaj
 */
public abstract class MobileDevice {
    float pojemnoscBaterii;
   final String producent ;
    public MobileDevice (float  pojemnoscBaterii )
    {
        this.pojemnoscBaterii = pojemnoscBaterii;
        producent = "Samsung";
    }
    
    public abstract  float czasPracy ();
    
}
