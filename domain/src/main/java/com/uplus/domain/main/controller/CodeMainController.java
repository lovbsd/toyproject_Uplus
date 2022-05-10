package com.uplus.domain.main.controller;

import com.uplus.domain.main.service.CodeMainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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
    public String mainHome(Model model) {
/* return type List<CodeMainDTO>
        List<CodeMainDTO> list = codeMainService.selectList();
        return list;*/
       /* if(equals())
        Map<Integer, String> memberList = new HashMap<>(); // <회원번호, 회원이름>으로 구성된 가상의 멤버 리스트
        memberList.put(1, "킴오리");
        memberList.put(10, "킴엔탈");
        memberList.put(20, "리오리");
        memberList.put(200, "리엔탈");
*/
        /*model.addAttribute("memberList", memberList);*/
        return "index1";
    }
}
