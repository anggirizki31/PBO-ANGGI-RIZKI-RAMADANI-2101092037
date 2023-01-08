/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anggi5oktober2022;

/**
 *
 * @author USER
 */
import java.io.*;
public class latihan1 {
    
    public static void main( String[] args ){ 

    BufferedReader dataIn = new BufferedReader(new InputStreamReader( System.in) ); 
    int angkapertama=0;
    int angkakedua=0;
    int total;
    
         BufferedReader data = new BufferedReader(new InputStreamReader(System.in));
    try{ 
        System.out.print("angka1     :"); 
        angkapertama = Integer.parseInt(dataIn.readLine());
        
        System.out.print("\nangka2     :");
        angkakedua = Integer.parseInt(dataIn.readLine());
        
        }catch( IOException e )   
        {
             System.out.print("angka2  :\n");
     } 
    total=angkapertama+angkakedua;
    
    System.out.println("angka1 " + angkapertama + " + " + "angka2 " + angkakedua + " hasilnya " + total); 
    }
}
