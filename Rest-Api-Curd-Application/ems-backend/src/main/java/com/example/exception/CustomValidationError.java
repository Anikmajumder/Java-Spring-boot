package com.example.exception;
import java.util.HashMap;
import java.util.Map;

import org.springframework.context.expression.MapAccessor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import jakarta.validation.ConstraintViolationException;
import jakarta.validation.Payload;

// @RestControllerAdvice
// public class CustomValidationError{
//     @ExceptionHandler(MethodArgumentNotValidException.class)
//     public ResponseEntity<Map<String, String>> handleValidationException(MethodArgumentNotValidException exception) {
//         final Map<String, String> errors = new HashMap<>();

//         for (ObjectError error : exception.getBindingResult().getAllErrors()) {
//             if (error instanceof FieldError fieldError) {
//                 errors.put(fieldError.getField(), fieldError.getDefaultMessage());
//             } else {
//                 errors.put(error.getObjectName(), error.getDefaultMessage());
//             }
//         }

   

//         return new ResponseEntity<>(errors, HttpStatus.BAD_REQUEST);
//     }
// }

@RestControllerAdvice
public class CustomValidationError extends ResponseEntityExceptionHandler{
   @Override
   protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatusCode status, WebRequest request) {
      Map<String, String> errors = new HashMap<>();
      ex.getBindingResult().getAllErrors().forEach((error) -> {

        String fieldName = ((FieldError) error).getField();
        String message = error.getDefaultMessage();
        errors.put(fieldName, message);
      });

      return new ResponseEntity<Object>(errors, HttpStatus.BAD_REQUEST);
   }
    
}
