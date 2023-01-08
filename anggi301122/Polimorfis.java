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
public class Polimorfis {
    public static void main(String[] args){
        person ref;
        student student= new Student();
        Employee employee=new Employee();
        
        ref = student;
        String name = ref.getName();
        System.out.println(name);
        //
        ref = Employee;
        String name1 = ref.getName();
        System.out.println(name1);
}
    
}
