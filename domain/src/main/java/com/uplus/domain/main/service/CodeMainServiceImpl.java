package com.uplus.domain.main.service;

import com.uplus.domain.common.USER_ROLE;
import com.uplus.domain.login.mapper.NoohkiMapper;
import com.uplus.domain.main.dto.CodeMainDTO;
import com.uplus.domain.main.mapper.CodeMainMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CodeMainServiceImpl implements CodeMainService {

    private final CodeMainMapper codeMainMapper;

    public CodeMainServiceImpl(CodeMainMapper codeMainMapper) {
        this.codeMainMapper = codeMainMapper;
    }

    @Override
    public USER_ROLE finduser(String id, int password) {
        return codeMainMapper.findByIdAndPassword(id,password);
    }
}
