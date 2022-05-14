package com.uplus.domain.login.mapper;

import com.uplus.domain.common.USER_ROLE;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface NoohkiMapper {

    USER_ROLE findByNameAndPassword(String id, int password);

    USER_ROLE findByIdAndPassword(String id, int password);
}
