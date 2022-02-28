package com.demo.respository;

import java.util.Optional;

import com.demo.entity.LopHoc;

import org.springframework.data.jpa.repository.JpaRepository;

public interface LopHocRepository extends JpaRepository<LopHoc, String> {
    
}
