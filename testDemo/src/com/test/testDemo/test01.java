package com.test.testDemo;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.test.mapper.testDemoMapper;
import com.test.model.testDemo;
import com.test.service.testDemoService;

public class test01 {
    
    private ApplicationContext ctx = null;
    
    public void a(){
	    Systen.out.println("1111");
    }
    @Before
    public void doBefore(){
        ctx = new ClassPathXmlApplicationContext("classpath:spring.xml");
    }
    
    @Test
    public void test() {
    	try {
    		 testDemoService ssmDemoService = ctx.getBean(testDemoService.class);  
    		 List<testDemo> beans = ssmDemoService.getAllRecords();
    		 System.out.println(beans.size());
    	        for(int i=0;i<beans.size();i++){
    	        	testDemo example = beans.get(i);//»ñÈ¡Ã¿Ò»¸öExample¶ÔÏó
    	            String name = example.getsName();
    	            System.out.print("µÚ"+i+"¸ö=£¿"+name);
    	        }
		} catch (Exception e) {
			System.out.println(e);
		}
       
        
        
        
    }

}
