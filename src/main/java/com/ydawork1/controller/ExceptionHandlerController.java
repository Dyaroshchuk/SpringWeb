package com.ydawork1.controller;

import com.ydawork1.controller.exceptions.UserAlreadyRegisteredException;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ExceptionHandlerController {

    @ExceptionHandler(Throwable.class)
    public ModelAndView handleAll() {
        ModelAndView m = new ModelAndView();
        m.setViewName("error");
        return m;
    }

    @ExceptionHandler(UserAlreadyRegisteredException.class)
    public ResponseEntity<String> alreadyRegistered() {
        return ResponseEntity.status(409).body("User already registered");
    }
}
