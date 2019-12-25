package com.cjj.springboot.ssm.demo.controller;

import com.cjj.springboot.ssm.demo.pojo.People;
import com.cjj.springboot.ssm.demo.service.DemoService;
import com.cjj.springboot.ssm.demo.service.impl.DemoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
public class DemoController {
@Autowired
    private DemoService demoService;
@RequestMapping("list.html")
    public void list(){
    List<People> list = demoService.getPeople();
    System.out.println(list);
}
}
