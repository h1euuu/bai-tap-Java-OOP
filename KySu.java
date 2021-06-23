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
public class KySu extends CanBo{
    String Major;

    public KySu() {
    }

    
   
    @Override
    public void ShowInfor(){
        super.ShowInfor();
        System.out.println("| nganh : "+Major+" |");
    }
    @Override
    public void InputInfor(){
        super.InputInfor();
        System.out.println("Nhap nganh :");
        Scanner scn = new Scanner(System.in);
        Major = scn.nextLine();    
    }
    public String getMajor() {
        return Major;
    }

    public void setMajor(String Major) {
        this.Major = Major;
    }
    
}
