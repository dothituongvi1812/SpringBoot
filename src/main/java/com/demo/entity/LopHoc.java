package com.demo.entity;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name ="lophoc")
public class LopHoc {
    @Id
    private String maLop; 
    private String tenLop;
    private String siSo;
    @OneToMany(mappedBy = "lopHoc")
    private Set<SinhVien> sinhViens;
    public LopHoc(){

    }
    public LopHoc(String maLop, String tenLop, String siSo){
        this.maLop=maLop;
        this.tenLop=tenLop;
        this.siSo=siSo;
    }
    public void setMaLop(String maLop) {
        this.maLop = maLop;
    }
    public String getMaLop() {
        return maLop;
    }
    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }
    public String getTenLop() {
        return tenLop;
    }
    public void setSiSo(String siSo) {
        this.siSo = siSo;
    }
    public String getSiSo() {
        return siSo;
    }
    
    @Override
    public String toString() {
        
        return "LopHoc"+"[ maLop="+maLop+" tenLop= "+tenLop+" siSo= "+siSo+"]";
    }
}
