/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Hi Hieu
 */
public class QLCB {

    /**
     *
     */
    public List<CanBo> canbo;

    public QLCB() {
        this.canbo = new ArrayList<>();
    }

    public void addOfficer(CanBo officer) {
        this.canbo.add(officer);
    }

    public List<CanBo> searchOfficerByName(String name) {
        return this.canbo.stream().filter(o -> o.getName().contains(name)).collect(Collectors.toList());
    }

    public void showListInforOfficer() {
        for (int i = 0; i < canbo.size(); i++) {
            System.out.println(canbo.get(i));
        }
    }

        
}
