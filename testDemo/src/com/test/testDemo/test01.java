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
    	System.out.println("2222");
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
    	        	testDemo example = beans.get(i);//获取每一个Example对象
    	            String name = example.getsName();
    	            System.out.print("第"+i+"个=？"+name);
    	        }
		} catch (Exception e) {
			System.out.println(e);
		}
       
        
        
        
    }

}
