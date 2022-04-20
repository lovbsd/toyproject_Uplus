package com.uplus.domain.regist.service;

import com.uplus.domain.regist.dto.CodeRegistDTO;
import com.uplus.domain.regist.mapper.CodeRegistMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CodeRegistServiceImpl implements CodeRegistService {

    private final CodeRegistMapper codeRegistMapper;

    public CodeRegistServiceImpl(CodeRegistMapper codeRegistMapper) {
        this.codeRegistMapper = codeRegistMapper;
    }

    @Override
    public List<CodeRegistDTO> selectList() {
        return codeRegistMapper.selectList();
    }
}
