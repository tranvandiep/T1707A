/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design_pattern;

/**
 *
 * @author Diep.Tran
 */
public class Student extends People{
    String rollNo;
    String email;

    public Student() {
        System.out.println("Student is created");
    }

    public Student(String rollNo, String email, String fullname, String gender, int age, String address) {
        super(fullname, gender, age, address);
        this.rollNo = rollNo;
        this.email = email;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void moving() {
        System.out.println("Student is moving...");
    }
    
    public void moving(String a) {
        System.out.println("Student is moving ..." + a);
    }
    
    public void showHello() {
        System.out.println("Em chao anh ah!!!");
    }
}
