package com.uplus.domain.main.controller;

import com.uplus.domain.common.USER_ROLE;
import com.uplus.domain.main.service.CodeMainService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class CodeMainController {
        @Value(value = "${my.secret}")
        private String mySecret;

    final static Logger logger = LoggerFactory.getLogger(CodeMainController.class);

    private final CodeMainService codeMainService;
    @Autowired
    public CodeMainController(CodeMainService codeMainService){
        this.codeMainService = codeMainService;
    }
    @GetMapping("/loginTest")
    public Model mainHome(Model model) {
        USER_ROLE userInfo = codeMainService.finduser("testname",mySecret);

        model.addAttribute("memberList", mySecret);
        logger.info("Logger Info START==========================================================");
        logger.info("userInfo :: >>>>>> ",userInfo);
        logger.info("model :: >>>>>> ",model);
        logger.info("Logger Info END==========================================================");
        return model;
    }
    @GetMapping("main/loginTest")
    public Model mainHomes(Model model) {

        USER_ROLE userInfo = codeMainService.finduser("testname",mySecret);

        model.addAttribute("memberList", userInfo);
        System.out.println(userInfo);
        return model;
    }
}
