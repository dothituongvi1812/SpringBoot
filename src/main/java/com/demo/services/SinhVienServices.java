package com.demo.services;

import java.util.List;

import com.demo.entity.SinhVien;
import com.demo.exceptions.SinhVienNotFoundException;
import com.demo.respository.SinhVienRepository;

import org.springframework.stereotype.Service;

@Service
public class SinhVienServices {
    private SinhVienRepository sinhVienRepository;
    public SinhVienServices( SinhVienRepository sinhVienRepository){
        this.sinhVienRepository=sinhVienRepository;
    }

    public List<SinhVien> getAllSinhVien(){
        return sinhVienRepository.findAll();
    }
    public SinhVien addSinhVien(SinhVien sinhVien) throws Exception{
        if(sinhVienRepository.findById(sinhVien.getId()).isPresent()){
            throw new Exception("Sinh viên này đã tồn tại");
        }
        sinhVienRepository.save(sinhVien);
        return sinhVien;
    }
    public SinhVien getSinhVienById(String id){
       
       return sinhVienRepository.findById(id).orElseThrow(()->new SinhVienNotFoundException());
    }
    public SinhVien updateSinhVien(String id,SinhVien sinhVien){
       SinhVien sinhVien2=sinhVienRepository.getById(id);
       sinhVien2.setAddress(sinhVien.getAddress());
       sinhVien2.setAge(sinhVien.getAge());
       sinhVien2.setFirstName(sinhVien.getFirstName());
       sinhVien2.setLastName(sinhVien.getLastName());
        sinhVien2.setLopHoc(sinhVien.getLopHoc());

        sinhVienRepository.save(sinhVien2);

        return sinhVien2;


    }
    public void deleteSinhVien(String id){
        SinhVien sinhVien=sinhVienRepository.getById(id);
        sinhVienRepository.delete(sinhVien);
    }

}
