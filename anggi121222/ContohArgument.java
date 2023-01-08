/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anggi12desember2022;

/**
 *
 * @author Asus
 */
public class ContohArgument {
    public static void main(String[]args){
        try{
            System.out.println("argument ke --> 0 adalah "+ args[0]);
        }catch(Exception ex){
            System.out.println("error index ke "+ex.getMessage()+ " tidak ada");
        }
    }
}
