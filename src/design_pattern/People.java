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
public class People {
    String fullname;
    String gender;
    int age;
    String address;

    public People() {
        System.out.println("People is created");
    }

    public People(String fullname, String gender, int age, String address) {
        this.fullname = fullname;
        this.gender = gender;
        this.age = age;
        this.address = address;
        System.out.println("People is created ... many parameters");
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    public void moving() {
        System.out.println("People is moving...");
    }
}
