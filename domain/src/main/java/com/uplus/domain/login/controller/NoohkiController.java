package com.uplus.domain.login.controller;

import com.uplus.domain.login.service.NoohkiService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NoohkiController {

    private final NoohkiService noohkiService;

    public NoohkiController(NoohkiService noohkiService) {
        this.noohkiService = noohkiService;
    }

//    @GetMapping("/login/Noohki")
//    public List<NoohkiDTO> testhome() {
//
////        List<NoohkiDTO> list = noohkiService.selectList();
////        return list;
//    }
}
