package com.uplus.domain.regist.mapper;


import com.uplus.domain.regist.dto.CodeRegistDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CodeRegistMapper {
    List<CodeRegistDTO> selectList();
}
