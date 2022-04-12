package com.uplus.domain.mapper;

import com.uplus.domain.dto.TestDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface TestMapper {
    List<TestDTO> selectList();
}
