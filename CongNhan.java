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
public class CongNhan extends CanBo{
    int tier;

    public CongNhan(){
     
    }

    
    

    @Override
    
    @SuppressWarnings("empty-statement")
    public void InputInfor(){
        super.InputInfor();
        Scanner scn = new Scanner(System.in);
        System.out.println("Nhap bac :");
        while(!setTier(Integer.parseInt(scn.nextLine())));
    }
    @Override
    public void ShowInfor(){
        super.ShowInfor();
        System.out.println("| bac : "+tier+" |");
    }
    public int getTier() {
        return tier;
    }

    public boolean setTier(int tier) {
        if(tier>=1&&tier<+10){
            this.tier = tier;
            return true;
        }else{
            System.out.println("Nhap lai ( 1 - 10)");
            return false;
        }
        
    }

    
    
    
    
}
