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
    	        	testDemo example = beans.get(i);//��ȡÿһ��Example����
    	            String name = example.getsName();
    	            System.out.print("��"+i+"��=��"+name);
    	        }
		} catch (Exception e) {
			System.out.println(e);
		}
       
        
        
        
    }

}
