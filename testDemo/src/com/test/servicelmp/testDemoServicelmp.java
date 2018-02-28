package com.test.servicelmp;


import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.test.mapper.testDemoMapper;
import com.test.model.testDemo;
import com.test.service.testDemoService;
/**
 * @author advance
 *    service层实现类方法
 */
@Service
public class testDemoServicelmp implements testDemoService {
    
    @Resource
    private testDemoMapper ssmDemoMapper;
    
    @Override
    public List<testDemo> getAllRecords() {
        // TODO Auto-generated method stub
        return ssmDemoMapper.getAllBeans();
    }

}