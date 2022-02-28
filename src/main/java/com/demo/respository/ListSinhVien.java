package com.demo.respository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.demo.entity.SinhVien;
import com.demo.exceptions.SinhVienNotFoundException;

public class ListSinhVien {
    private List<SinhVien> sinhViens;

    public ListSinhVien(){
        sinhViens=new ArrayList<>();
    }
    public boolean themSinhVien(SinhVien sv){
        boolean kt=false;
        kt=sinhViens.add(sv);

        return kt;
    }
    public Optional<SinhVien> timSinhVien(String mssv){
        Optional<SinhVien> sinhVien = sinhViens.stream().filter(sv -> sv.getId().equals(mssv)).findFirst();
        return sinhVien;
    }
    // Tìm đối tượng cần update
    // Tìm index của đối tượng đó
    public SinhVien updateSinhVien(String mssv, SinhVien sinhVien) throws Exception{
        Optional<SinhVien> sv1 = sinhViens.stream().filter(sv -> sv.getId().equals(mssv)).findFirst();
        
        if(!sv1.isPresent()){
         throw new SinhVienNotFoundException();
        }
        sv1.get().setLastName(sinhVien.getLastName());
        sv1.get().setFirstName(sinhVien.getFirstName());
        sv1.get().setAge(sinhVien.getAge());
        sv1.get().setAddress(sinhVien.getAddress());
        sinhViens.set(sinhViens.indexOf(sv1.get()),sv1.get());
        return sv1.get();
    }
   public void xoaSinhVien(String mssv) throws Exception{
    Optional<SinhVien> sv1 = sinhViens.stream().filter(sv -> sv.getId().equals(mssv)).findFirst();
    // ko có quăn lỗi
    // xóa 
    if(!sv1.isPresent()){
        throw new SinhVienNotFoundException();
    }
    sinhViens.remove(sv1.get());
   
   }
}
