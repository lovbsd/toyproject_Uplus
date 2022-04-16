package com.uplus.domain.login.mapper;

import java.util.List;

import com.uplus.domain.login.dto.NoohkiDTO;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface NoohkiMapper {
    List<NoohkiDTO> selectList();
}
