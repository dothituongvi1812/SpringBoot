package com.demo.controllers;

import com.demo.entity.LopHoc;
import com.demo.services.LopHocServices;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
public class LopHocControllers {
    private LopHocServices lopHocServices;
    public LopHocControllers(LopHocServices lopHocServices){
        this.lopHocServices=lopHocServices;
    }
    @PostMapping(value="/lophocs")
    public LopHoc addLopHoc(@RequestBody LopHoc lopHoc) {
       return lopHocServices.addLopHoc(lopHoc);
    }
    @GetMapping(value="/lophocs/{id}")
    public LopHoc getLopHocById(@RequestParam String id) {
        return lopHocServices.getLopHocById(id);
    }
    
    
}
