package com.uplus.domain.login.controller;

import com.uplus.domain.login.dto.NoohkiDTO;
import com.uplus.domain.login.service.NoohkiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class NoohkiController {
    private final NoohkiService noohkiService;

    @Autowired
    public NoohkiController(NoohkiService noohkiService) {
        this.noohkiService = noohkiService;
    }

    @GetMapping("/main/Noohki")
    public List<NoohkiDTO> testhome() {

        List<NoohkiDTO> list = noohkiService.selectList();
        return list;
    }
}
