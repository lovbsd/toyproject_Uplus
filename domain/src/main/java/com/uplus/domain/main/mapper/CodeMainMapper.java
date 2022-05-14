package com.uplus.domain.main.mapper;


import com.uplus.domain.common.USER_ROLE;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.jpa.repository.JpaRepository;
@Mapper
public interface CodeMainMapper extends JpaRepository<USER_ROLE,String> {
    /*List<CodeMainDTO> selectList();*/
    USER_ROLE findByNameAndPassword(String id, int password);
    USER_ROLE findByIdAndPassword(String id, int password);
}
