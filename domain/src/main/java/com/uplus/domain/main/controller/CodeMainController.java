package com.uplus.domain.main.controller;

import com.uplus.domain.main.dto.CodeMainDTO;
import com.uplus.domain.main.service.CodeMainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CodeMainController {
    //meni
    private final CodeMainService codeMainService;
    //re re re
    @Autowired
    public CodeMainController(CodeMainService codeMainService){
        this.codeMainService = codeMainService;
    }
    @GetMapping("/main")
    public List<CodeMainDTO> mainHome() {

        List<CodeMainDTO> list = codeMainService.selectList();
        return list;
    }
}
