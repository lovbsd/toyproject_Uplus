package com.uplus.domain.login.service;

import com.uplus.domain.common.USER_ROLE;
import org.springframework.transaction.annotation.Transactional;

@Transactional

public interface NoohkiService {
    USER_ROLE finduser(String id, int password);

//    List<NoohkiDTO> selectList();
}
