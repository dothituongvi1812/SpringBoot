package com.demo.services;

import com.demo.entity.LopHoc;
import com.demo.exceptions.LopHocNotFoundException;
import com.demo.respository.LopHocRepository;

import org.springframework.stereotype.Service;

@Service
public class LopHocServices {
    private LopHocRepository lopHocRepository;

    public LopHocServices(LopHocRepository lopHocRepository ){
        this.lopHocRepository=lopHocRepository;
    }
    public LopHoc addLopHoc(LopHoc lopHoc){
       return  lopHocRepository.save(lopHoc);
    }
    public LopHoc getLopHocById(String id){
        return lopHocRepository.findById(id).orElseThrow(()->new LopHocNotFoundException());
    }
}
