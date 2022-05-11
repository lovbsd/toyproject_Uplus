package com.uplus.domain.main.service;

import com.uplus.domain.common.USER_ROLE;
import com.uplus.domain.main.mapper.CodeMainMapper;
import org.springframework.stereotype.Service;

@Service
public class CodeMainServiceImpl implements CodeMainService {

    private final CodeMainMapper codeMainMapper;

    public CodeMainServiceImpl(CodeMainMapper codeMainMapper) {
        this.codeMainMapper = codeMainMapper;
    }

    @Override
    public USER_ROLE finduser(String name, int password) {
        return codeMainMapper.findByNameAndPassword(name,password);
    }
}
