package com.uplus.domain.noohki.controller;

import java.util.List;

import com.uplus.domain.noohki.dto.NoohkiDTO;
import com.uplus.domain.noohki.service.NoohkiService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NoohkiController {
    // meni
    private final NoohkiService noohkiService;

    // re re re
    @Autowired
    public NoohkiController(NoohkiService noohkiService) {
        this.noohkiService = noohkiService;
    }

    @GetMapping("/main/Noohki")
    public List<NoohkiDTO> main() {

        List<NoohkiDTO> list = noohkiService.selectList();
        return list;
    }
}
