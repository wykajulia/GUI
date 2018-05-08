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
public class SmartPhone extends MobilePhone {
    
   int liczbaRdzeni;
   private int imei;
   
   
   public SmartPhone (  int  imei, int liczbaRdzeni , float pojemnoscBaterii , int przekatnaEkranu)
   {    super (przekatnaEkranu, pojemnoscBaterii );
        this.imei = imei;
        this.liczbaRdzeni = liczbaRdzeni;
        
       
   }

   public String getImei()
   {
       return przetworzony ( imei );
   }
    
   private String przetworzony ( int zmienna )
   {
       return Integer.toString(zmienna);
   }         


    public float czasPracySmartDevice() {
        return czasPracyTelefonu * liczbaRdzeni;
    }
   
}
