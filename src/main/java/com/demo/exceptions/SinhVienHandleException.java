package com.demo.exceptions;



import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;



@ControllerAdvice
public class SinhVienHandleException  {
   @ResponseBody
   @ExceptionHandler(value = SinhVienNotFoundException.class)
 
    public ResponseEntity<Object> exception(SinhVienNotFoundException exception) {
        String message = exception.getMessage();
        return exception.buildResponse(message);
     }

   @ExceptionHandler(value = SinhVienExistedException.class)
   public ResponseEntity<Object> existedException( SinhVienExistedException exception) {
      String message = exception.getMessage();
      return exception.buildResponse(message);
   }

   @ExceptionHandler(value = LopHocNotFoundException.class)
    public ResponseEntity<Object> notFoundLopHocexception(LopHocNotFoundException exception) {
        String message = exception.getMessage();
        return exception.buildResponse(message);
     }

}
