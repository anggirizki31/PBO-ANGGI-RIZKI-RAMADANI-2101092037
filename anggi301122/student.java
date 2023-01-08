/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anggi30november2022;

/**
 *
 * @author Asus
 */
public class student extends person { 
    public student(){
        super ("Ali","Padang");
        super.Name="somename";
        super.Address="some address";
        System.out.println("Inside student:Constructor");
     } 
    
    public static void main( String[] args ){
        Student anna = new Student();
        System.out.println(anna.Name);
    } 
}
