package com.uplus.domain.admin.service;

import com.uplus.domain.admin.dto.MiniDTO;
import com.uplus.domain.admin.mapper.MiniMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MiniServiceImpl implements MiniService {

    private final MiniMapper miniMapper;
//    public SqlSession sqlSession;

    public MiniServiceImpl(MiniMapper miniMapper) {
        this.miniMapper = miniMapper;
    }

    @Override
    public List<MiniDTO> selectMini(MiniDTO miniDTO) {
//        sqlSession.select("");
        return miniMapper.selectMini(miniDTO);
    } 
}

