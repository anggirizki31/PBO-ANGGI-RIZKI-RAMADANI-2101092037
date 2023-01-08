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
public class StudentRecord {
    int a;
    private String name; 
    private String address; 
    private int age; 
    private double mathGrade; 
    private double englishGrade; 
    private double scienceGrade; 
    private double average; 
    private static int StudentCount;
    
    public StudentRecord(){
    this("Alif");
    //letak kode inisialisasi
    studentCount++; //menambah student
    }
    public StudentRecord(String temp){
    this.name = temp;
    studentCount++; //menambah student
    }
    public StudentRecord(String name, String address, int Age){
    this.name = name;
    this.address = address;
    this.age = age;
    studentCount++; //menambah student
    }
    public StudentRecord(double mGrade, double eGrade, double sGrade){
    mathGrade = mGrade;
    englishGrade = eGrade;
    scienceGrade = sGrade; studentCount++; //menambah student
    }

    public static int studentCount;
    
    public String getName(){
        return name;
    }
    
    public void setName (String name){
        this.name = name;
    }
    
    public String getAddress(){
        return address;
    }
    
    public void setAddress (String address){
        this.address = address;
    }
    
    public int getAge(){
        return age;
    }
    
    public void setAge (int age){
        this.age = age;
    }
    
    public double getMathGrade(){
        return mathGrade;
    }
    
    public void setMathGrade (double mathGrade){
        this.mathGrade = mathGrade;
    }
    
    public double getEnglishGrade(){
        return englishGrade;
    }
    
    public void setEnglishGrade (double englishGrade){
        this.englishGrade = englishGrade;
    }
    
    public double getScienceGrade(){
        return scienceGrade;
    }
    
    public void setScienceGrade (double scienceGrade){
        this.scienceGrade = scienceGrade;
    }
    
    public double getAverage(){
        average = (mathGrade + englishGrade + scienceGrade) / 3;
        return average;
    }
    
    public static int getStudentCount(){
        return studentCount;
    }
    public void print( String temp ){
    System.out.println("Name:" + name);
    System.out.println("Address:" + address);
    System.out.println("Age:" + age);
    }
    public void print(double mGrade, double eGrade, double sGrade) {
    System.out.println("Math Grade:" + mGrade);
    System.out.println("English Grade:" + eGrade);
    System.out.println("Science Grade:" + sGrade);
    }
    
    public double getMaximum(){
        double max;
        max = (mathGrade > englishGrade) ? mathGrade : englishGrade;
        max = (max > scienceGrade) ? max : scienceGrade;
        return max;
    }
}

