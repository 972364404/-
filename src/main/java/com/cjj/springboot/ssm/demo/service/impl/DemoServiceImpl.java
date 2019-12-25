package com.cjj.springboot.ssm.demo.service.impl;

import com.cjj.springboot.ssm.demo.dao.DemoDAO;
import com.cjj.springboot.ssm.demo.pojo.People;
import com.cjj.springboot.ssm.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DemoServiceImpl implements DemoService{
    @Autowired
    private DemoDAO demoDAO;
    @Override
    public List<People> getPeople() {
        return demoDAO.getPeople();
    }
}
