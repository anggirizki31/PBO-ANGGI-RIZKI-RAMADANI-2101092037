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
public class InterfaceExample {
    public static void main(String[]args){
        Relation myInteger = new MyInteger();
        Relation myDouble = new MyDouble();
        boolean hasilInt = myInteger.isGreater(5, 7);
        boolean hasilDouble = myDouble.isGreater(5.7, 8.9);
    }
}
