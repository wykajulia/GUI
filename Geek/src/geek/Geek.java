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
public class Geek  {

    /**  int  imei, int liczbaRdzeni , float pojemnoscBaterii , int przekatnaEkranu
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      MobilePhone mobile1 = new SmartPhone(10,20, 3300 , 5);
      SmartPhone smart1 = new SmartPhone ( 15 ,5, 3500 , 10);
     
     System.out.println( mobile1.czasPracy());
      System.out.println(mobile1.czasPracySmartDevice() );
     System.out.println( smart1.czasPracy() );
     System.out.println( smart1.czasPracySmartDevice() );
    System.out.println(  smart1.getImei() );
    }
    
}
