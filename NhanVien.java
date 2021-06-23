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
public class NhanVien extends CanBo{
    String work;

    public NhanVien() {
    }

    
    

    public String getWork() {
        return work;
    }
    @Override
    public void InputInfor(){
        super.InputInfor();
        Scanner scn = new Scanner(System.in);
        System.out.println("Nhap cong viec :");
        work = scn.nextLine();
    }
    @Override
    public void ShowInfor(){
        super.ShowInfor();
        System.out.println("| cong viec : "+work+" |");
    }
    public void setWork(String work) {
        this.work = work;
    }
    
}
