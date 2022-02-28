package com.demo.exceptions;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class SinhVienExistedException extends RuntimeException{
    private static final long serialVersionUID = 1L;
    public SinhVienExistedException(){
          super("Sinh Vien existed!");
      }
      // build response trong đây
      public ResponseEntity<Object> buildResponse(String mes){
          Map<String, Object> response = new HashMap<>();
          response.put("status_code", HttpStatus.CONFLICT.value());
          response.put("message", mes);
          response.put("errors", "CONFLICT!");
          response.put("status", false);
          return ResponseEntity.status(HttpStatus.NOT_FOUND).body(response);
      }
}
