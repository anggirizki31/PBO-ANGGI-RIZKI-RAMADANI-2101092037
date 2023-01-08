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
public class StudentRecordExample {
    public static void main (String[] args) {
        StudentRecord student1 = new StudentRecord();
        student1.a=10;
        student1.setName("Ali");
        student1.setAddress("Padang");
        student1.setAge(20);
        student1.setMathGrade(80);
        student1.setEnglishGrade(100);
        student1.setScienceGrade(90);
 
        System.out.println("Nama    :"+student1.getName());
        System.out.println("Alamat    :"+student1.getAddress());
        System.out.println("Umur    :"+student1.getAge());
        System.out.println("Matematika    :"+student1.getMathGrade());
        System.out.println("B inggris    :"+student1.getEnglishGrade());
        System.out.println("Pengetahuan    :"+student1.getScienceGrade());
        System.out.println("Rata Rata    :"+student1.getAverage());
        
        StudentRecord student2 = new StudentRecord();
        student2.setName("Anggi");
        student2.setAddress("Tapsel");
        student2.setAge(19);
        student2.setMathGrade(90);
        student2.setEnglishGrade(95);
        student2.setScienceGrade(98);
        student2.print("");
        student2.print(student2.getMathGrade(),student2.getEnglishGrade(),student2.getScienceGrade());
 
    }
}
