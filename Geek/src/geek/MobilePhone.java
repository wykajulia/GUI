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
public abstract class MobilePhone extends MobileDevice{
    
   float przekatnaEkranu;
   float czasPracyTelefonu;
    
 public  MobilePhone ( float przekatnaEkranu , float pojemnoscBaterii )
   {  
       super( pojemnoscBaterii );
       this.przekatnaEkranu = przekatnaEkranu;
        this.czasPracyTelefonu = czasPracy() ; 
   }
   
 public float czasPracy(){
       return przekatnaEkranu*pojemnoscBaterii;
   }
 
 public abstract float czasPracySmartDevice ();
 
}
