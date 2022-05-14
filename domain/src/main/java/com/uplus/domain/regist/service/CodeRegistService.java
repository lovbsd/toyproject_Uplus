package com.uplus.domain.regist.service;


import com.uplus.domain.regist.dto.CodeRegistDTO;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Transactional
public interface CodeRegistService {
    List<CodeRegistDTO> selectList();
}
