package com.test.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.test.model.testDemo;
import com.test.service.testDemoService;

@Controller
public class ssmDemoController {
    
    @Resource
    private testDemoService testDemoService;
    
    @RequestMapping("/login")
    public ModelAndView toIndex(){
        ModelAndView mav = new ModelAndView();
        
        List<testDemo> records = testDemoService.getAllRecords();
        
        mav.addObject("beans", records);
        
        mav.setViewName("index");
        
        return mav;
    }
    
}
