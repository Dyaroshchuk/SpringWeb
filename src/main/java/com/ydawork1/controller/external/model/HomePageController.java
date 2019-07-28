package com.ydawork1.controller.external.model;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomePageController {

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String homePage() {
        return "home";
    }

    @RequestMapping(value = "/params", method = RequestMethod.GET)
    public ModelAndView paramExample(@RequestParam(required = false) String name, @RequestParam Integer age) {
        ModelAndView mw = new ModelAndView();
        mw.addObject("name", name);
        mw.addObject("age", age);
        mw.setViewName("params");
        return mw;
    }
}
