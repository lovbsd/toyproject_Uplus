package com.uplus.domain.yamamoto.service;

import java.util.List;

import com.uplus.domain.yamamoto.dto.NamDTO;
import com.uplus.domain.yamamoto.mapper.NamMapper;

import org.springframework.stereotype.Service;

@Service
public class NamServiceImpl implements NamService {

    private final NamMapper namMapper;

    public NamServiceImpl(NamMapper namMapper) {
        this.namMapper = namMapper;
    }

    @Override
    public List<NamDTO> selectNam() {
        return namMapper.selectNam();
    }
}
