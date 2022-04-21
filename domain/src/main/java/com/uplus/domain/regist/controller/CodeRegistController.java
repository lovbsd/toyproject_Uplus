package com.uplus.domain.regist.controller;

import com.uplus.domain.regist.dto.CodeRegistDTO;
import com.uplus.domain.regist.service.CodeRegistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CodeRegistController {

    private final CodeRegistService codeRegistService;

    @Autowired
    public CodeRegistController(CodeRegistService codeRegistService){
        this.codeRegistService = codeRegistService;
    }
    @GetMapping("/regist/hyun")
    public List<CodeRegistDTO> RegistHome() {

        List<CodeRegistDTO> list = codeRegistService.selectList();
        return list;
    }
}
