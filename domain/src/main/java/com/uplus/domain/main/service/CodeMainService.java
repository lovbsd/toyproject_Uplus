package com.uplus.domain.main.service;

import com.uplus.domain.common.USER_ROLE;

public interface CodeMainService {
    USER_ROLE finduser(String id, int password);
}
