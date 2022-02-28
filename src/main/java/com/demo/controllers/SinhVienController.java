package com.demo.controllers;

import java.util.List;


import com.demo.entity.SinhVien;

import com.demo.services.SinhVienServices;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.PutMapping;



// Đánh dấu đây là một Controller
// Nơi tiếp nhận các reqquest từ phía người dùng
@RestController
public class SinhVienController {
   
  private SinhVienServices sinhVienServices;
    SinhVienController(SinhVienServices sinhVienServices){
        this.sinhVienServices=sinhVienServices;   
    }
    // Đón nhận request GET
    @GetMapping("/sinhviens") 
    public  List<SinhVien> getAll() {
        return sinhVienServices.getAllSinhVien(); 
    }
  
    @PostMapping("/sinhviens")
    public SinhVien addSinhVien(@RequestBody  SinhVien sinhVien) throws Exception {
        
        return sinhVienServices.addSinhVien(sinhVien);
    }
    @GetMapping(value = "/sinhviens/{id}")
    public SinhVien getSinhVienById( @PathVariable String id) {

        return sinhVienServices.getSinhVienById(id);
    }
    
    @PutMapping(value="sinhviens/{id}")
    @ResponseStatus(code = HttpStatus.OK, reason = "OK")
    public SinhVien updateSinhVien(@PathVariable String id, @RequestBody SinhVien sinhVien)throws Exception {
       return sinhVienServices.updateSinhVien(id, sinhVien);
    }
    @DeleteMapping(value = "sinhviens/{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void xoaSinhVien(@PathVariable String id) throws Exception{
         sinhVienServices.deleteSinhVien(id);
    }

}
