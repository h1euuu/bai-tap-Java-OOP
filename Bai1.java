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
public class Bai1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        QLCB quanly = new QLCB();
        while(true)
        {
            System.out.println("__--Chuong trinh quan ly can bo--__");
            System.out.println("1. Them moi can bo.");
            System.out.println("2. Tim kiem theo ho ten.");
            System.out.println("3. Hien thi danh sach can bo");
            System.out.println("4. Thoat chuong trinh.");
            String choose = scn.nextLine();
            switch(choose){
                case "1":
                    System.out.println("a. Them moi cong nhan.");
                    System.out.println("b. Them moi ky su.");
                    System.out.println("c. Them moi nhan vien.");
                    String nhap = scn.nextLine();
                    switch(nhap){
                        case "a":
                            CanBo congnhan = new CongNhan();
                            congnhan.InputInfor();  
                            quanly.addOfficer(congnhan);
                                                        break;
                        case "b":
                            CanBo kysu = new KySu();
                            kysu.InputInfor();
                            quanly.addOfficer(kysu);
                            break;
                        case "c":
                            CanBo nhanvien = new NhanVien();
                            nhanvien.InputInfor();
                            quanly.addOfficer(nhanvien);
                            break;
                        default:
                            break;
                    }
                    break;
                case "2":
                    System.out.print("Nhap ten can tim : ");
                    String name = scn.nextLine();
                    
                    
                    
                    break;
                case "3":
                    System.out.println("Danh sach can bo la:");
                    quanly.showListInforOfficer();
                    break;
                case "4":
                    System.out.println("Hen gap lai!");
                    return;
                default:
                    System.err.println("Vui long chon lai ( 0 - 4 )!");
                    break;
            }
        }
    }
    
}
