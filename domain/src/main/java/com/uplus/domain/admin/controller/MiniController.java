package com.uplus.domain.admin.controller;

import com.uplus.domain.admin.dto.MiniDTO;
import com.uplus.domain.admin.service.MiniService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MiniController {

    // 정적 서비스
    private final MiniService miniService;

    @Autowired
    public MiniController(MiniService miniService) {
        this.miniService = miniService;
    }

    // ab
    @GetMapping(value = "/admin/mini")
    public List<MiniDTO> minimetohed(Model model, MiniDTO miniDTO) {
        List<MiniDTO> list = miniService.selectMini(miniDTO);
        return list;
    }
}
