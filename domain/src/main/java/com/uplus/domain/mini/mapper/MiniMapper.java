package com.uplus.domain.mini.mapper;

import java.util.List;

import com.uplus.domain.mini.dto.MiniDTO;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MiniMapper {
    List<MiniDTO> selectMini();
}
