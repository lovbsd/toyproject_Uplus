package com.uplus.domain.admin.service;

import com.uplus.domain.admin.dto.MiniDTO;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Transactional
public interface MiniService {
    List<MiniDTO> selectMini(MiniDTO miniDTO);
}
