package com.uplus.domain.noohki.service;

import java.util.List;

import com.uplus.domain.noohki.dto.NoohkiDTO;
import com.uplus.domain.noohki.mapper.NoohkiMapper;

import org.springframework.stereotype.Service;

@Service
public class NoohkiServiceImpl implements NoohkiService {

    private final NoohkiMapper noohkiMapper;

    public NoohkiServiceImpl(NoohkiMapper noohkiMapper) {
        this.noohkiMapper = noohkiMapper;
    }

    @Override
    public List<NoohkiDTO> selectList() {
        return noohkiMapper.selectList();
    }
}
