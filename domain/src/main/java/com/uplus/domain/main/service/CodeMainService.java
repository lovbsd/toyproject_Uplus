package com.uplus.domain.main.service;

import com.uplus.domain.common.USER_ROLE;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface CodeMainService {
    USER_ROLE finduser(String id, String password);
}
