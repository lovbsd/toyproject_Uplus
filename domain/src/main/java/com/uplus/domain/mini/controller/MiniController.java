package com.uplus.domain.mini.controller;

import java.util.List;

import com.uplus.domain.mini.dto.MiniDTO;
import com.uplus.domain.mini.service.MiniService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MiniController {
    
     //정적 서비스
     private final MiniService miniService;
     
     @Autowired
     public MiniController(MiniService miniService){
         this.miniService = miniService;
     }

     @GetMapping("/mini")
     public List<MiniDTO> main() {
 
         List<MiniDTO> list = miniService.selectMini();
         return list;
     }
}
