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
public class person {
    protected String name;
    protected String address; 
    
    public person(){
        System.out.println("Inside person:Constructor");
        name = "";
        address = "";
    } 
    
    public person( String name, String address ){
        this.name = name;
        this.address = address;
    } 

    public String getName(){
    return name;
    }
    public String getAddress(){
    return address;
    }
    public void setName( String name ){
    this.name = name;
    }
    public void setAddress( String add ){
    this.address = add;
    } 
}

