package com.uplus.domain.main.mapper;


import com.uplus.domain.main.dto.CodeMainDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface CodeMainMapper {
    List<CodeMainDTO> selectList();
}
