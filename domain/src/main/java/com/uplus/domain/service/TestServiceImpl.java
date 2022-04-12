package com.uplus.domain.service;

import com.uplus.domain.dto.TestDTO;
import com.uplus.domain.mapper.TestMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestServiceImpl implements TestService {

    private final TestMapper testMapper;

    public TestServiceImpl(TestMapper testMapper) {
        this.testMapper = testMapper;
    }

    @Override
    public List<TestDTO> selectList() {
        return testMapper.selectList();
    }
}
