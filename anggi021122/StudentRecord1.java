/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anggi02november2022;

/**
 *
 * @author Asus
 */
public class StudentRecord1 {
    public static void main(String[]args){
        StudentRecord student3 = new StudentRecord("Denis","Khatib",19);
        student3.setAge(19);
        student3.print("");
        StudentRecord student4 = new StudentRecord();
        student3.print("");
        System.out.println("jumlah siswa :"+student3.getStudentCount());
        
    }
}
