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
public class Latihan2 {
    public static void main( String[] args ){ 

    BufferedReader dataIn = new BufferedReader(new InputStreamReader( System.in) ); 
    String name = "";
    String alamat = "";
    String Jurusan ="";

    System.out.print("Nama    :\n"); 
    System.out.print("Alamat  :\n");
    System.out.print("Jurusan :\n");

    try{ 
        name = dataIn.readLine();
        alamat = dataIn.readLine();
        Jurusan = dataIn.readLine();
        }catch( IOException e ){ 
         System.out.println("Error!");        
    }
    System.out.println("Hello, " + name + " di " + alamat + " Selamat Datang Di " + Jurusan); 

    } 
}