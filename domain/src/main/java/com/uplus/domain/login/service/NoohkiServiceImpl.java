package com.uplus.domain.login.service;

import com.uplus.domain.common.USER_ROLE;
import com.uplus.domain.login.mapper.NoohkiMapper;
import org.springframework.stereotype.Service;

@Service
public class NoohkiServiceImpl implements NoohkiService {
    private final NoohkiMapper noohkiMapper;

    public NoohkiServiceImpl(NoohkiMapper noohkiMapper) {
        this.noohkiMapper = noohkiMapper;
    }
    @Override
    public USER_ROLE finduser(String id, int password) {
        return noohkiMapper.findByIdAndPassword(id,password);
    }

    /*@Override
    public List<NoohkiDTO> selectList() {
        *//*return noohkiMapper.selectList();*//*
    }*/
}
