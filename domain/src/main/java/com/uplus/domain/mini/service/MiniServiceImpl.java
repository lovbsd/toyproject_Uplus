package com.uplus.domain.mini.service;

import com.uplus.domain.mini.dto.MiniDTO;
import com.uplus.domain.mini.mapper.MiniMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MiniServiceImpl implements MiniService {

    private final MiniMapper miniMapper;

    public MiniServiceImpl(MiniMapper miniMapper) {
        this.miniMapper = miniMapper;
    }

    @Override
    public List<MiniDTO> selectMini() {
        return miniMapper.selectMini();
    } 
}
