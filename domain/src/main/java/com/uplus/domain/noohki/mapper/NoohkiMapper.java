package com.uplus.domain.noohki.mapper;

import java.util.List;

import com.uplus.domain.noohki.dto.NoohkiDTO;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface NoohkiMapper {
    List<NoohkiDTO> selectList();
}
