package com.uplus.domain.controller;

import com.uplus.domain.dto.TestDTO;
import com.uplus.domain.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {
    //meni
    private final TestService testService;
    //re re
    @Autowired
    public TestController(TestService testService){
        this.testService = testService;
    }
    @GetMapping("/main")
    public List<TestDTO> main() {

        List<TestDTO> list = testService.selectList();
        return list;
    }
}
