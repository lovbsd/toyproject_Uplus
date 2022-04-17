package com.uplus.domain.admin.mapper;

import com.uplus.domain.admin.dto.MiniDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MiniMapper {
    List<MiniDTO> selectMini();
}
