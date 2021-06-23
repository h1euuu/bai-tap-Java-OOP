/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

import java.util.Scanner;

/**
 *
 * @author Hi Hieu
 */
public class CanBo {
    String name;
    int yearold;
    String gender;
    String address;

    public CanBo() {
    }

    
    
    public CanBo(String name, int yearold, String gender, String address) {
        this.name = name;
        this.yearold = yearold;
        this.gender = gender;
        this.address = address;
    }
    public void InputInfor(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Nhap ten :");
        name = scn.nextLine();
        System.out.println("Nhap tuoi :");
        yearold = scn.nextInt();
        System.out.println("Nhap gioi tinh :");
        scn.nextLine();
        System.out.println("Nhap dia chi :");
        address = scn.nextLine();
    }
    public void ShowInfor(){
        System.out.println("| ten : "+name+" | tuoi : "+yearold+" | gioi tinh : "+gender+" | dia chi : "+address+" |");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearold() {
        return yearold;
    }

    public void setYearold(int yearold) {
        this.yearold = yearold;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    
}
